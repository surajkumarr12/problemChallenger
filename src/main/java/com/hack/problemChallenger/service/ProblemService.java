package com.hack.problemChallenger.service;

import java.util.Map;

import com.hack.problemChallenger.model.Users;

public interface ProblemService {
	
	public  Map<String,String> acceptProblem(Users user, String prob_code);
	public  Map<String,String> rejectProblem(Users user, String prob_code);
	public  Map<String,String> getSolvedProblems(Users user);

}
