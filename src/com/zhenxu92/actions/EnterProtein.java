package com.zhenxu92.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class EnterProtein extends ActionSupport implements SessionAware {
	private int enteredProtein;
	private ProteinData proteinData;
	private Map<String, Object> session;
	@Override
	public String execute() throws Exception {
		// when you open a new page, there is no existing protein data,
		// so you start a new session, put the new instance in it, and
		// it starts to work by extracting the instance out and use its
		// data.
		
		// extract the instance of ProteinData of current session out
		// and use it.
		if (session.containsKey("proteinData")) {
			proteinData = (ProteinData) session.get("proteinData");
		}
		
		// business logic, use it to add protein data to the current one.
		// If the current protein data is null, create one.
		//
		// add current goal into current session object
		if (proteinData != null) {
			ProteinTrackingService proteinTrackingService = new ProteinTrackingService(proteinData);
			proteinTrackingService.addProtein(enteredProtein);
		// create a new one
		} else {
			proteinData = new ProteinData();
			proteinData.setTotal(0);
			proteinData.setGoal(300);
		}
		// after operations, put it in the current session, but when user 
		// close the browser, the session ends. Refresh won't have any efffect
		session.put("proteinData", proteinData);
		return SUCCESS;
	}
	
	public int getEnteredProtein() {
		return enteredProtein;
	}
	
	public void setEnteredProtein(int enteredProtein) {
		this.enteredProtein = enteredProtein;
	}
	
	public String getGoalText() {
		// look into properties
		return getText("goal.text");
	}
	
	public ProteinData getProteinData() {
		return proteinData;
	}
	
	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	
	public void resetTotal() {
		proteinData.setGoal(0);
	}
}
