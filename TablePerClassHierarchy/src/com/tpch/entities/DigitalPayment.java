package com.tpch.entities;

import java.util.Date;

import lombok.Data;

@Data
public class DigitalPayment extends Payment {
	protected int transactionNumber;
	protected String partnerName;
	protected String note;
	protected Date creditedDate;
}
