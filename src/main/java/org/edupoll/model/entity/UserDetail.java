package org.edupoll.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//맨처음에 숫자를 50개를 가지고 옴. 그 상태에서 가지고 있는 숫자를 계속 사용하다가
	//없어지면 다시한번 숫자를 가지고 옴. 50개씩 캐시형태로 불러다 씀.
	// 시퀀스를 만들때 INCREMENT by 50; 개씩 가지고 오게 유도해야됨(db에서)
	//create sequence user 
	Integer idx;

	String address;
	Date birthday;
	String avatarId;
	String description;

	public UserDetail() {
		super();
	}

	public UserDetail(Integer idx, String address, Date birthday, String avatarId, String description) {
		super();
		this.idx = idx;
		this.address = address;
		this.birthday = birthday;
		this.avatarId = avatarId;
		this.description = description;
	}

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAvatarId() {
		return avatarId;
	}

	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserDetail [idx=" + idx + ", address=" + address + ", birthday=" + birthday + ", avatarId=" + avatarId
				+ ", description=" + description + "]";
	}

}
