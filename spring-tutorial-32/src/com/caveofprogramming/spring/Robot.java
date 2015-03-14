package com.caveofprogramming.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private String id = "Default robot";
	private String speech = "hello";
	
	public void speak(){
		System.out.println(id + ": " + speech);
	}
	
	@Autowired
	public void setId(String id) {
		this.id = id;
	}
	
	@Autowired
	public void setSpeech(String speech) {
		this.speech = speech;
	}
}
