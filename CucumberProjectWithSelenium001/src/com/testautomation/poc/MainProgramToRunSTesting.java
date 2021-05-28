package com.testautomation.poc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testautomation.poc.robots.TestRunRobot;
import com.testautomation.poc.robots.TestRunRobotforChrome;
import com.testautomation.poc.util.ScreenCaptureUtilityinPacCHR;

import junit.framework.Assert;

//Selenium Test class for login form of the application

public class MainProgramToRunSTesting {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadConfig();
		login();

		
	}
	
	private static void loadConfig() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public static void login() {
	TestRunRobot tstrrobo = new TestRunRobotforChrome();
	
	WebDriver driver = tstrrobo.getDriver();
		
	try {
		Thread.sleep(2000l);
	} catch (InterruptedException e2) {
	
	}
	
	}
}