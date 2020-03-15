package com.tpch.entities;

import java.util.Date;

import lombok.Data;

@Data
public class DigitalPayment extends Payment {
	protected int transactionNumber;
	protected String partnerName;
	protected String note;
	protected Date creditedDate;
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCreditedDate() {
		return creditedDate;
	}
	public void setCreditedDate(Date creditedDate) {
		this.creditedDate = creditedDate;
	}
	@Override
	public String toString() {
		return "DigitalPayment [transactionNumber=" + transactionNumber + ", partnerName=" + partnerName + ", note="
				+ note + ", creditedDate=" + creditedDate + "]";
	}
	
}
