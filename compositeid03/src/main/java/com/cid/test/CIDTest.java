package com.cid.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cid.entities.Account;
import com.cid.entities.AccountPK;

public class CIDTest {
	public static void main(String[] args) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Account account = null;

		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			AccountPK pk = new AccountPK();
			pk.setAccountNo("3245678");
			pk.setIfscCode("4f6");

			account = new Account();
			account = session.find(Account.class, pk);
			System.out.println(account);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}

	}

}
