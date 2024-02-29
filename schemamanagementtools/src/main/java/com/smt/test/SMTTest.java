package com.smt.test;

import com.smt.entities.Branch;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SMTTest {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Branch branch = null;

		try {
			emf = Persistence.createEntityManagerFactory("smtpu");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();

			branch = new Branch();
			branch.setBranchName("Ranpur");
			branch.setBankName("SBI");
			branch.setIfscCode("RTY56676");
			branch.setLocation("Ranpur");
			branch.setCity("Khurda");
			branch.setStatus("Active");
			branch.setManagerName("Itishree");

			em.persist(branch);

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
