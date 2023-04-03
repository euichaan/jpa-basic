package hellojpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); // 애플리케이션 로딩 시점에 딱 하나만 만든다

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			// Member member = new Member();
			// member.setId(2L);
			// member.setName("HelloB");
			Member findMember = em.find(Member.class, 1L); // JPA가 관리. 커밋 시점에 변경 여부 체크.-> update 쿼리
			findMember.setName("HelloJPA");

			List<Member> result = em.createQuery("select m from Member as m", Member.class)
				.setFirstResult(5)
				.setMaxResults(8)
				.getResultList();

			for (Member member : result) {
				System.out.println("member.getName() = " + member.getName());
			}

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();
	}
}
