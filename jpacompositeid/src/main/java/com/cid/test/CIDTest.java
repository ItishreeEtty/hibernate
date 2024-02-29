package com.cid.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cid.entities.Person;
import com.cid.entities.PersonPK;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CIDTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Person person = null;
		try {
			emf = Persistence.createEntityManagerFactory("cidpu");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();
			
			PersonPK id = new PersonPK();
			id.setFirstName("SOMU");
			id.setLastName("PRADHAN");
			person = em.find(Person.class, id);
			System.out.println(person);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}
