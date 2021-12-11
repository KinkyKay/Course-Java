package com.company.cleanCodeSOLIDTDD.singleResponsibilityPrinciple;

public class Owner {
	private String ownerId;
	public String newBusses;

	public Owner() {

	}

	public String buyNewBuses() {
		return newBusses + "logic about new buses";
	}

	public String getNewBusses() {
		return newBusses;
	}

	public void setNewBusses(String newBusses) {
		this.newBusses = newBusses;
	}
}
