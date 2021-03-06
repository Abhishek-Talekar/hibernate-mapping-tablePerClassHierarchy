package com.tpch.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.ChequePayment;
import com.tpch.entities.DigitalPayment;
import com.tpch.entities.Payment;
import com.tpch.helper.SessionFactoryRegistry;

public class TPCHTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		boolean flag = false;
		Payment payment = null;
		ChequePayment chequePayment = null;
		DigitalPayment digitalPayment = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*
			 * 1.Added data to Payment entity class and Discriminator value is also got
			 * added
			 * 
			 */
			/*
			 * payment = new Payment(); payment.setAmount(2250);
			 * payment.setDescription("Loan EMI"); payment.setPaymentDate(new Date());
			 * 
			 * session.save(payment); System.out.println(payment);
			 */

			/*
			 * 2.Feteched super class data using its id and hibernate not using
			 * discriminator column
			 */
			/*
			 * payment = session.get(Payment.class, 1); System.out.println(payment);
			 */

			/*
			 * 3.Inserted data using chequePayment subclass and super class data is also got
			 * added so achieved polymorphic insertion
			 */
			/*
			 * chequePayment = new ChequePayment(); chequePayment.setAmount(4400);
			 * chequePayment.setDescription("Bike rent"); chequePayment.setPaymentDate(new
			 * Date()); chequePayment.setBankName("SBI Bank");
			 * chequePayment.setChequeDate(new Date()); chequePayment.setChequeNo(12345);
			 * chequePayment.setIfsc("SBIN12456");
			 * 
			 * session.save(chequePayment); System.out.println(chequePayment);
			 */

			/*
			 * 4.Fetched the subclass data and also got the super class payment data as it's
			 * creating where clause using discriminator column
			 */
			/*
			 * chequePayment = session.get(ChequePayment.class, 2);
			 * System.out.println(chequePayment);
			 */

			/*
			 * 5.Inserted data using digitalPayment subclass and super class data is also
			 * got added so achieved polymorphic insertion
			 */
			/*
			 * digitalPayment = new DigitalPayment(); digitalPayment.setAmount(5500);
			 * digitalPayment.setDescription("Donation to welfare");
			 * digitalPayment.setPaymentDate(new Date()); digitalPayment.setCreditedDate(new
			 * Date()); digitalPayment.setNote("Rular Education System donation");
			 * digitalPayment.setPartnerName("Google Pay");
			 * digitalPayment.setTransactionNumber(8912671);
			 * 
			 * session.save(digitalPayment); System.out.println(digitalPayment);
			 */

			/*
			 * 6.Fetched the subclass data and also got the super class payment data as it's
			 * creating where clause using discriminator column so achived polymorphic
			 * retrival
			 */
			/*
			 * digitalPayment = session.get(DigitalPayment.class, 3);
			 * System.out.println(digitalPayment);
			 */

//			7.Fetched subclass data using superclass where it is creating query only with super class id not relating with dicriminator value
			payment = session.get(Payment.class, 3);
			System.out.println(payment);

			flag = true;
		} finally {
			if (flag) {
				if (transaction != null) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFactoryRegistry.close();
		}
	}
}
