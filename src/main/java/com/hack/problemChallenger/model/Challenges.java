/**
 * 
 */
package com.hack.problemChallenger.model;


public class Challenges {
	
	private Integer cId;
	private String from_user;
	private String to_user;
	private String prob_code;
	private Boolean solved;
	
	
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
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
	public Boolean getSolved() {
		return solved;
	}
	public void setSolved(Boolean solved) {
		this.solved = solved;
	}
}
