package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider;
import pages.LearnAutomationLoginPage;

public class LearnAutomationLoginTest extends BaseClass {

	

	@Test(priority = 1,dataProvider = "loginDetails1", dataProviderClass = CustomDataProvider.class)
	public void loginApplication(String uname, String pass) {
		LearnAutomationLoginPage login = new LearnAutomationLoginPage(driver);
		login.loginApplication(uname, pass);
		login.verificationCourseTitle();
		login.logoutAplication();

	}
//	@Test(priority = 2)
//	public void verfiyCourseDetails() {
//
//		login.verificationCourseTitle();
//	}
//	@Test(priority = 3)
//	public void logoutApplication() {
//		login.logoutAplication();
//	}

}
