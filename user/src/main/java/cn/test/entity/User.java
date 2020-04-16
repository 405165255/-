package cn.test.entity;

import java.math.BigInteger;
import java.util.Date;

public class User {
	private String id;
	private String name;
	private String username;
	private String password;
	private BigInteger phone;
	private boolean is_active;
	private String status;
	private String email;
	private String repeat_password;
	private Date create_time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public BigInteger getPhone() {
		return phone;
	}
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRepeat_password() {
		return repeat_password;
	}
	public void setRepeat_password(String repeat_password) {
		this.repeat_password = repeat_password;
	}
	
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "User [id ="+id+"name=" + name + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", is_active=" + is_active + ", status=" + status + ", email=" + email + "]";
	}
	
	
	
}
