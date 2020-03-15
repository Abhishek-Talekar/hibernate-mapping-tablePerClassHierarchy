package com.tpch.entities;

import java.util.Date;

import lombok.Data;

@Data
public class ChequePayment extends Payment{
	protected int chequeNo;
	protected String bankName;
	protected Date chequeDate;
	protected String ifsc;
}
