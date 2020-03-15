package com.tpch.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Payment implements Serializable {
	protected int paymentId;
	protected String description;
	protected Date paymentDate;
	protected double amount;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", description=" + description + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}

}
