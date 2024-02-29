package com.idg.test;

import java.time.LocalDate;

import com.idg.entities.Trip;
import com.idg.helper.EMFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class IdentityTest {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Trip trip = null;

		try {
			entityManagerFactory = EMFRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			trip = new Trip();
			trip.setSource("BBSR");
			trip.setDestination("HYD");
			trip.setTripName("dassara holidays");
			trip.setDays(15);
			trip.setStartDate(LocalDate.of(2023, 10, 10));
			trip.setEndDate(LocalDate.of(2023, 10, 25));
			trip.setTripCost(30000);

			entityManager.persist(trip);
			
			System.out.println("trip no : "+trip.getTripNo());
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
			EMFRegistry.closeEntityManagerFactory();
		}

	}
}
