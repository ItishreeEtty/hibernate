package com.idg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5463427097606051404L;
	@Id
	@Column(name = "trip_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tripNo;
	private String source;
	private String destination;
	@Column(name = "trip_nm")
	private String tripName;
	private int days;
	@Column(name = "start_dt")
	private LocalDate startDate;
	@Column(name = "end_dt")
	private LocalDate endDate;
	@Column(name = "trip_cost")
	private double tripCost;

	public int getTripNo() {
		return tripNo;
	}

	public void setTripNo(int tripNo) {
		this.tripNo = tripNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getTripCost() {
		return tripCost;
	}

	public void setTripCost(double tripCost) {
		this.tripCost = tripCost;
	}

}
