package org.edupoll.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	String id;
	String pass;
	String nick;
	Date joinDate;
	Integer userDetailIdx;
	
	
	public User() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public String getNick() {
		return nick;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public Integer getUserDetailIdx() {
		return userDetailIdx;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public void setUserDetailIdx(Integer userDetailIdx) {
		this.userDetailIdx = userDetailIdx;
	}
	public User(String id, String pass, String nick, Date joinDate, Integer userDetailIdx) {
		super();
		this.id = id;
		this.pass = pass;
		this.nick = nick;
		this.joinDate = joinDate;
		this.userDetailIdx = userDetailIdx;
	}
	@Override
	public String toString() {
		return "User []";
	}

	
	
	
}



/*
 * id varchar2(90) primary key, pass varchar2(90) not null, nick varchar2(90)
 * not null, join_date date default sysdate, user_detail_id varchar2(900)
 */