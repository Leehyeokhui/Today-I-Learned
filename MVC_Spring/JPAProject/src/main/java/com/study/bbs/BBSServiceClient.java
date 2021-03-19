package com.study.bbs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BBSServiceClient {

	public static void main(String[] args) {
		// persistence.xml <persistence-unit name="JPAProject">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			// Transaction 시작
			tx.begin();

			BBS bbs = new BBS();
			bbs.setWname("홍길동");
			bbs.setTitle("jpa 제목2");
			bbs.setContent("jpa 내용2");
			bbs.setPasswd("1234");

			// 등록
			em.persist(bbs);

			// 글목록 조회
			String jpql = "select b from BBS b order by b.bbsno desc";
			List<BBS> list = em.createQuery(jpql, BBS.class).getResultList();
			for (BBS bs : list) {
				System.out.println("--->" + bs.toString());
			}

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();
	}

}
