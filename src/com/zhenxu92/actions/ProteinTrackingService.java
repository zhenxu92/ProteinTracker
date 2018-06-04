package com.zhenxu92.actions;

public class ProteinTrackingService {
	
	private ProteinData proteinData;

	public ProteinTrackingService(ProteinData proteinData) {
		this.setProteinData(proteinData);
		// TODO Auto-generated constructor stub
	}

	public void addProtein(int enteredProtein) {
		proteinData.setTotal(proteinData.getTotal() + enteredProtein);
	}

	public ProteinData getProteinData() {
		return proteinData;
	}

	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}
}
