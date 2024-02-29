package com.cid.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AccountPK implements Serializable {
	
	private String accountNo;
	private String ifscCode;

}
