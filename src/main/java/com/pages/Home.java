package com.pages;

import java.awt.AWTException;
import com.Utility.Log;

//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
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
