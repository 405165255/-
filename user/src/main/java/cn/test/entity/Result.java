package cn.test.entity;

import java.util.List;

public class Result {
	private int count;
	private List<User> userList;
	private String status;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Result [count=" + count + ", userList=" + userList + ", status=" + status + "]";
	}
	
	
}
