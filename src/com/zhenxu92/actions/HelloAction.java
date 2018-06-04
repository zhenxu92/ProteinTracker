package com.zhenxu92.actions;

import com.opensymphony.xwork2.Action;

import org.apache.struts2.convention.annotation.Result;
public class HelloAction implements Action {

	private String greeting;

	@Override
	@org.apache.struts2.convention.annotation.Action(value="hi", 
	results={@Result(name="success", location="enter-protein", type="redirect")})
	public String execute() throws Exception {
		setGreeting("Hello Struts 2");
		return "success";
	}
	
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
