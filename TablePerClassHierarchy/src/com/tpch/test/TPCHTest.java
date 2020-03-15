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
