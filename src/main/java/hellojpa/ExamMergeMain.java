package hellojpa;

public class ExamMergeMain {

	/*
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

	public static void main(String[] args) {
		Member member = createMember(1L, "회원1");
		member.setName("회원명변경"); //준영속 상태이므로 수정 사항을 데이터베이스에 반영할 수 없다.
		mergeMember(member);
	}

	private static Member createMember(Long id, String username) {
		//==영속성 컨텍스트1 시작==//
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction tx1 = em1.getTransaction();
		tx1.begin();

		Member member = new Member();
		member.setId(id);
		member.setName(username);

		em1.persist(member);
		tx1.commit();

		em1.close(); //영속성 컨텍스트1 종료
					 //member 엔티티는 준영속 상태가 된다.
		//==영속성 컨텍스트1 종료==//
		return member;
	}

	private static void mergeMember(Member member) {
		//==영속성 컨텍스트2 시작==//
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();

		tx2.begin();
		Member mergeMember = em2.merge(member);
		// member = em2.merge(member); 준영속 엔티티 참조하던 변수를 영속 엔티티를 참조하도록 변경하는 것이 안전
		tx2.commit();

		//준영속 상태
		System.out.println("member.getName() = " + member.getName());

		//영속 상태
		System.out.println("mergeMember.getName() = " + mergeMember.getName());

		System.out.println("em2 contains member = " + em2.contains(member));
		System.out.println("em2 contains mergeMember = " + em2.contains(mergeMember));

		em2.close();
		//==영속성 컨텍스트2 종료==//
	}
	 */
}
