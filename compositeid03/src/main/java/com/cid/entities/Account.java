package com.cid.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Account implements Serializable {
	
	private AccountPK pk;
	private String accountHolderName;
	private String accountType;
	private double balance;

}
