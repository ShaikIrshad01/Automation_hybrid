package com.pages;

import java.awt.AWTException;
import com.Utility.Log;

//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import org.testng.Assert;
public class Home extends Base_Class {

	private static By Join_now_button = By.xpath("//div[@class='d-flex align-items-center nav-menu-list']/div/a[@title='JOIN NOW']");

	private static By about = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[14]/footer[1]/div[3]/div[1]/div[2]/ul[1]/li[6]/a[1]");

	private static By LAF_logo=By.xpath("//body/form[@id='aspnetForm']/div[3]/div[1]/nav[1]/div[3]/div[1]/a[1]/img[1]");
	
	private static By FreePass_top_button = By.xpath("//div[@class='d-flex align-items-center nav-menu-list']/div/a[@title='FREE PASS']");
	private static By FreePass_mid = By.xpath("//div[@class='btn free-pass']/a[@title='FREE PASS']");
	private static By FreePass_bottom = By.xpath("//div[@class=' col-lg-2 d-flex justify-content-around flex-column pass-join']/div/a[@title='FREE PASS']");
	private static By About = By.xpath("//a[@class='drop-down-arrow']");
	private static By Carer_Opp = By.xpath("//div[@class='nav-drop-down']//a[contains(text(),'Career Opportunities')]");
	//Verify 'JOIN NOW' button
	
	public void Validate_joinnow_button(String Value) throws Exception {
		
				if (Value.equalsIgnoreCase("Joinnow")) {
		
					Element_isdisplayed(Join_now_button);
				
					ExtentTestManager.getTest().log(Status.PASS, "Join_now_button validation successful");
					Log.info("Join_now_button validation successful");
			
		
				}

			}
	
	

	public void Validate_Freepass_button(String Value) throws Exception {
		
		if (Value.equalsIgnoreCase("Free_pass")) {

			Element_isdisplayed(FreePass_top_button);
		
			ExtentTestManager.getTest().log(Status.PASS, "FreePass_top_button validation successful");
			Log.info("FreePass_top_button validation successful");

		}
	
	}
	
	
	public void Validate_About_dropdown(String Value) throws Exception {
		
		if (Value.equalsIgnoreCase("About_dropdown")) {
			
			Element_isdisplayed(About);
		
			ExtentTestManager.getTest().log(Status.PASS, "About dropdown displayed successful");
			Log.info("About dropdown displayed successful");
			Mouse_hover(About);
			Element_isdisplayed(Carer_Opp);
			ExtentTestManager.getTest().log(Status.PASS, "Career opportunities option is displayed successfully under About dropdown in homepage");
			Log.info("Career opportunities option is displayed successfully under About dropdown in homepage");
			
			Thread.sleep(200);
		}

	}	

	public void Navigate_to_Emplyoment_page(String Value) throws Exception {
		if (Value.equalsIgnoreCase("Nav_to_Employment_page")) {
		Element_isdisplayed(About);
		ExtentTestManager.getTest().log(Status.PASS, "About dropdown displayed successful");
		Log.info("About dropdown displayed successful");
		Mouse_hover(About);
		Element_isdisplayed(Carer_Opp);
		ExtentTestManager.getTest().log(Status.PASS, "Career opportunities option is displayed successfully under About dropdown in homepage");
		Log.info("Career opportunities option is displayed successfully under About dropdown in homepage");
		
		click(Carer_Opp);
		ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Career opportunities option under About dropdown in homepage");
		Log.info("Successfully clicked on Career opportunities option under About dropdown in homepage");
		Thread.sleep(200);
		String t=driver.getTitle();
		Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Gym Jobs | Fitness Employment Opportunities".toUpperCase().trim(), "Emplyoment_page title not validated and not navigatd to Emplyoment_page");
		ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
		Log.info("Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
		
//		Employment e= new Employment();
//		e.play_video();
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void Main_login(String Value,String Email, String Password) throws InterruptedException, AWTException {
//
//		if (Value.equalsIgnoreCase("Login")) {
//
//			login_popup(Email,Password);
//
//		}
//
//	}
//
//	public void login_popup(String Emails, String Passwords) throws AWTException, InterruptedException {
//
//		click(ProfileButton);
//		Thread.sleep(100);
//		click(LoginOption);
//		Thread.sleep(1000);
//		input(Email, Emails);
//		input(Password, Passwords);
//		ExtentTestManager.getTest().log(Status.PASS, "User Login Credentials entered Successfully");
//		click(LoginButton);
//		Thread.sleep(1000);
//		ExtentTestManager.getTest().log(Status.PASS, "Login Successful");
//
//	}

}
