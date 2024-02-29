package com.cid.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Embeddable
public class PersonPK implements Serializable {
	@Column(name = "first_nm")
	private String firstName;
	@Column(name = "last_nm")
	private String lastName;

}