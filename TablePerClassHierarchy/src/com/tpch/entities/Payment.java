package com.tpch.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Payment implements Serializable{
	protected int paymentId;
	protected String description;
	protected Date paymentDate;
	protected double amount;
}
