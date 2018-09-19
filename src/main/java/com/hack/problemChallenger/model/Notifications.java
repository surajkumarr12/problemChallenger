package com.hack.problemChallenger.model;

public class Notifications {
	
	private Integer nId;
	private String from_user;
	private String to_user;
	private String prob_code;
	private String status;
	
	
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getFrom_user() {
		return from_user;
	}
	public void setFrom_user(String from_user) {
		this.from_user = from_user;
	}
	public String getTo_user() {
		return to_user;
	}
	public void setTo_user(String to_user) {
		this.to_user = to_user;
	}
	public String getProb_code() {
		return prob_code;
	}
	public void setProb_code(String prob_code) {
		this.prob_code = prob_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
