package com.pages;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
 

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import com.Utility.Log;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import net.bytebuddy.description.annotation.AnnotationList.Empty;

import org.testng.Assert;

public class FreePass extends Base_Class
{
	
	private static By FreePass_top_button = By.xpath("//div[@class='d-flex align-items-center nav-menu-list']/div/a[@title='FREE PASS']");
	
	private static By Text_tryus = By.xpath("//h1[text()='TRY US ']");
	private static By Text_tryusforfree = By.xpath("//h1[text()='TRY US ']/span[text()='FOR FREE']");
	
	private static By Text_Tryusforfree = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[1]");
	
	private static By Text_3= By.xpath("//span[@id='ctl00_MainContent_FreePass_lblPassTypeDaysCount']");
	private static By Text_day = By.xpath("//h1[text()=' DAY ']");
	private static By Text_guestpass= By.xpath("//h1[text()=' DAY ']/span");
	
	private static By Text_free3daystrial= By.xpath("//h1[@id='ctl00_MainContent_FreePass_trialHeader']");
	private static By Text_Enterurziporpostalcode= By.xpath("//div[@id='ctl00_MainContent_FreePass_divZipCodeLbl']");
	private static By Text_Enterzip = By.xpath("//div[@id='ctl00_MainContent_FreePass_divZipCodeLbl']");
	
	private static By Zipcode_input = By.xpath("//input[@id='ctl00_MainContent_FreePass_txtSelectClubZip']");
	
	private static By Firstname_input = By.xpath("//input[@id='ctl00_MainContent_FreePass_txtFirstName']");
	
	private static By Lastname_input = By.xpath("//input[@id='ctl00_MainContent_FreePass_txtLastName']");
	
	private static By Cellphone_input = By.xpath("//input[@id='ctl00_MainContent_FreePass_txtPhone']");
	
	private static By Email_input = By.xpath("//input[@id='ctl00_MainContent_FreePass_txtEmail']");
	
	private static By Findclub_button = By.xpath("//input[@id='ctl00_MainContent_FreePass_bntChangeClub']");
	
	private static By Condition_text= By.xpath("//label[@for='terms']");
	
	private static By checckbox = By.xpath("//input[@id='terms']");
	
	private static By Tc_link = By.xpath("//u/strong[text()='Terms and Conditions']");
	
	private static By PrivacyPolicy_link = By.xpath("//u/strong[text()='Privacy Policies']");

	private static By Next_button = By.xpath("//input[@id='ctl00_MainContent_FreePass_btnSubmit']");
	
	private static By Clublist_count = By.xpath("//div[@class='col-xs-9 text-left']");
	

	
	
	public void Validate_Freepass_text(String Value,String Tryusforfree_input) throws Exception {
		
				if (Value.equalsIgnoreCase("Tryusforfree")) {
					
					click(FreePass_top_button);

					Log.info("Freepass_button clicked successfully");
					ExtentTestManager.getTest().log(Status.PASS, "FreePass_button clicked successfully");
					Element_isdisplayed(Text_Tryusforfree);
					String[] inputdata = Tryusforfree_input.split(",");
					
					String text = driver.findElement(Text_Tryusforfree).getText().replace("\n", " ").trim();
					
					Assert.assertEquals(text.toUpperCase(),inputdata[0].trim().toUpperCase(),"Try Us for Free input text doesnot matched");
					
					Log.info("Try us for free text displayed and validated successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Try us for free text displayed and validated successfully");
					
					
					Element_isdisplayed(Text_free3daystrial);
					String Gymtrial_Text = driver.findElement(Text_free3daystrial).getText();
					
					Assert.assertEquals(Gymtrial_Text.toUpperCase(),inputdata[1].trim().toUpperCase(),"FREE 3 DAY GYM TRIAL input text doesnot matched");
					
					Log.info("FREE 3 DAY GYM TRIAL text displayed and validated successfully");
					ExtentTestManager.getTest().log(Status.PASS, "FREE 3 DAY GYM TRIAL text displayed and validated successfully");
					
					
					/*Element_isdisplayed(Searchclub_text);
				
					Log.info(driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
					
					Element_isdisplayed(Joinnow_steps);
					ExtentTestManager.getTest().log(Status.PASS, "4 Join_now steps are displayed successfully");
					Log.info("4 Join_now steps are displayed successfully");*/
					
				}
		
	}	

	public void TC_LAF_Validate_Enterurziporpostalcode_text(String Value,String EnterZiporPostal) throws Exception {
		
		if (Value.equalsIgnoreCase("Enterurziporpostalcode_text")) {
			
			click(FreePass_top_button);

			Log.info("Freepass_button clicked successfully");
			ExtentTestManager.getTest().log(Status.PASS, "FreePass_button clicked successfully");
			Element_isdisplayed(Text_Enterurziporpostalcode);
			
			String ziporpostalcode_Text = driver.findElement(Text_Enterurziporpostalcode).getText();
			MoveToElement(Text_Enterurziporpostalcode);
			Assert.assertEquals(ziporpostalcode_Text.toUpperCase(),EnterZiporPostal.toUpperCase(), "Freepass EnterZiporPostal text validated Failed");
		
			Log.info("Freepass condition text validated successfully");
			ExtentTestManager.getTest().log(Status.PASS, "Freepass EnterZiporPostal text validated successfully");
			

			Thread.sleep(500);
		}

	}	

	
	
public void TC_LAF_Validate_Freepass_Fields(String Value) throws Exception {
	
	if (Value.equalsIgnoreCase("Freepass_fields")) {
		
		click(FreePass_top_button);
		
		ExtentTestManager.getTest().log(Status.PASS, "Freepass_button clicked successfully");
		Log.info("Freepass_button clicked successfully");
		
		Element_isdisplayed(Firstname_input);
		ExtentTestManager.getTest().log(Status.PASS, "Firstname_input field is displayed successfully");
		Log.info("Firstname_input field is displayed successfully");
		
		Element_isdisplayed(Lastname_input);
		ExtentTestManager.getTest().log(Status.PASS, "Lastname_input field is displayed successfully");
		Log.info("Lastname_input field is displayed successfully");
		
		Element_isdisplayed(Zipcode_input);
		ExtentTestManager.getTest().log(Status.PASS, "Zipcode_input field is displayed successfully");
		Log.info("Zipcode_input field is displayed successfully");
		
		Element_isdisplayed(Cellphone_input);
		ExtentTestManager.getTest().log(Status.PASS, "Cellphone_input field is displayed successfully");
		Log.info("Cellphone_input field is displayed successfully");
		
		Element_isdisplayed(Email_input);
		ExtentTestManager.getTest().log(Status.PASS, "Email_input field is displayed successfully");
		Log.info("Email_input field is displayed successfully");
		
		Element_isdisplayed(Findclub_button);
		ExtentTestManager.getTest().log(Status.PASS, "Findclub_button field is displayed successfully");
		Log.info("Findclub_button field is displayed successfully");
		
	}
}

public void TC_LAF_Validate_Freepass_Condition_Text(String Value,String Freepass_Condition) throws Exception {
	
	if (Value.equalsIgnoreCase("Freepass_Condtion_Text")) {
		
		click(FreePass_top_button);

		Log.info("Freepass_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "FreePass_button clicked successfully");
		Element_isdisplayed(Condition_text);
		
		String Condi_Text = driver.findElement(Condition_text).getText();
		MoveToElement(Condition_text);
		Assert.assertEquals(Condi_Text.toUpperCase(),Freepass_Condition.toUpperCase(), "Freepass condition text validated Failed");
		
		Log.info("Freepass condition text validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Freepass condition text validated successfully");
		

	
	}

}	

}

