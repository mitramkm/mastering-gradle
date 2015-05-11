package ch9;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userid;
	private String name;
	private String email;
	
	
	public User(){}
	
	public User(String userId, String name, String email) {
		super();
		this.userid = userId;
		this.name = name;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userid;
	}
	public void setUserId(String userId) {
		this.userid = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userid + ", name=" + name + ", email=" + email
				+ "]";
	}

}
