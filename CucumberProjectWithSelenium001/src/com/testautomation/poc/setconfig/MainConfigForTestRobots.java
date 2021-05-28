package com.testautomation.poc.setconfig;

public class MainConfigForTestRobots {

	public MainConfigForTestRobots() {
		// TODO Auto-generated constructor stub
		
		 XMLConfiguration configCreate = new XMLConfiguration();
		    configCreate.setFileName("settings.xml");
		    configCreate.addProperty("somesetting", "somevalue");
		    configCreate.save();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
