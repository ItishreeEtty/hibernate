package com.cid.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person")
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Person {
	@EmbeddedId
	private PersonPK id;
	private int age;
	private String gender;
	@Column(name = "mobile_no")
	private String mobileNo;

}
