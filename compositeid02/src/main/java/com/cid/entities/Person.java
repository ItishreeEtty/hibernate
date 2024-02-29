package com.cid.entities;

import java.util.Objects;

public class Person {
	private PersonPK id;
	private int age;
	private String gender;
	private String mobileNo;

	public PersonPK getId() {
		return id;
	}

	public void setId(PersonPK id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, mobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(mobileNo, other.mobileNo);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", gender=" + gender + ", mobileNo=" + mobileNo + "]";
	}

}
