package org.edupoll.model.dto; // Data Transfer Object 데이터를 옮겨 담을 용도

public class LoginRequestData {
	String loginId;
	String loginPass;

	public LoginRequestData() {
		super();
	}

	public LoginRequestData(String loginId, String loginPass) {
		super();
		this.loginId = loginId;
		this.loginPass = loginPass;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

}
