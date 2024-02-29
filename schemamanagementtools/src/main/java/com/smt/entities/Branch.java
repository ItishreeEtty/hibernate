package com.smt.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "branch")
public class Branch implements Serializable {
	@Id
	@Column(name = "branch_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchNo;
	@Column(name = "branch_nm")
	private String branchName;
	@Column(name = "bank_nm")
	private String bankName;
	@Column(name = "ifsc_code")
	private String ifscCode;
	private String location;
	private String city;
	private String status;
	@Column(name = "manager_nm")
	private String managerName;

}
