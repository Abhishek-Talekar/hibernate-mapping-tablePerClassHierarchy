package com.tpch.entities;

import java.util.Date;

import lombok.Data;

@Data
public class ChequePayment extends Payment{
	protected int chequeNo;
	protected String bankName;
	protected Date chequeDate;
	protected String ifsc;
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Date getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", bankName=" + bankName + ", chequeDate=" + chequeDate
				+ ", ifsc=" + ifsc + "]";
	}
	
}
