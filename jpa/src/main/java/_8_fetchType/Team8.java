package _8_fetchType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author min
 * @설명 양방향 매핑관계를 표현하기 위한 객체
 * 			회원 : 팀 / N : 1 
 */
@Entity
public class Team8 {
	@Id @GeneratedValue
	@Column(name = "TEAM_ID")
	private Long id;
	
	private String name;

	// OneToMany 에서 mappedBy의 name 값은 Many쪽의 변수명을 입력해주어야 한다.
	@OneToMany(mappedBy = "team")
	private List<Member8> members = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Member8> getMembers() {
		return members;
	}

	public void setMembers(List<Member8> members) {
		this.members = members;
	}
}
