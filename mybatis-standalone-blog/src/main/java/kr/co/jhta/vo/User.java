package kr.co.jhta.vo;

import java.util.Date;

public class User {
	
	private String id;
	private String name;
	private String password;
	private String email;
	private Date createDate;
	
	public User() {}

	public User(String id, String name, String password, String email, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.createDate = createDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	

}
