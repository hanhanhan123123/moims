package org.edupoll.model.dto;

import java.text.SimpleDateFormat;

import org.edupoll.model.entity.User;

public class UserResponseData {
	String id;
	String pass;
	String nick;
	String joinDay;
	String joinTime;

	public UserResponseData(User user) {
		this.id = user.getId();
		SimpleDateFormat dayFmt = new SimpleDateFormat("yyyy-MM-dd");
		this.joinDay = dayFmt.format(user.getJoinDate());
		long diff = System.currentTimeMillis() - user.getJoinDate().getTime();
		this.joinTime = diff / (1000L * 60 * 60 * 24) + "일 전";
		this.nick = user.getNick();
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

	public void setJoinDay(String joinDay) {
		this.joinDay = joinDay;
	}

	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}

}
