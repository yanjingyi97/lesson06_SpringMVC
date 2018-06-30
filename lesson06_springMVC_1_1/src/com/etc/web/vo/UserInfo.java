package com.etc.web.vo;

import java.util.Date;
import java.util.List;

public class UserInfo {

	private String uname;
	private String password;
	private Date birthday;
	private Integer sex;
	private String[] likes;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String[] getLikes() {
		return likes;
	}
	public void setLikes(String[] likes) {
		this.likes = likes;
	}
	
	
	
	
}
