package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@TableGenerator(
	name = "MEMBER_SEQ_GENERATOR",
	table = "MY_SEQUENCES", // 매핑할 데이터베이스 시퀀스 이름
	pkColumnName = "MEMBER_SEQ", allocationSize = 1
)
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
	private Long id;

	@Column(name = "name", nullable = false, length = 10)
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
