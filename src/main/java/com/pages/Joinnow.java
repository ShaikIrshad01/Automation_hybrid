package com.pages;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import net.bytebuddy.implementation.bytecode.Throw;

import org.testng.Assert;
public class Joinnow extends Base_Class {

	private static By Join_now_button = By.xpath("//div[@class='d-flex align-items-center nav-menu-list']/div/a[@title='JOIN NOW']");
	private static By Searchclub_text = By.xpath("//h1[contains(text(),'Search Club')]");
	private static By Joinnow_steps = By.xpath("//img[@id='imgProcessHeader']");
	private static By Country_dropdown = By.id("ctl00_MainContent_ucClubSearchInput1_cboSelCountry");
	private static By CityName_input  = By.xpath("//input[@id='txtCityName']");
	private static By ZipCode_input  = By.xpath("//input[@id='txtZipCode']");
	private static By club_count  = By.id("lblClubCount");
	private static By Find_buttob  = By.xpath("//input[@id='btnSearch']");
	private static By ByStateorprovince_dropdown = By.id("ctl00_MainContent_ucClubSearchInput1_cboStateStates");
	private static By club_result_total  = By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[1]");
	private static By club_list  = By.xpath("//div[@id='pnlClubList']");
	private static By club_list_rows  = By.xpath("//*[contains(@id, '_ItemRowContainer')]");
	private static By clb_address  = By.xpath("//div[@class='ItemRow']");
	private static By club_name  = By.xpath("//div[@class='ClubNameList col-xs-10']");
	
	private static By clbname1  = By.xpath("//span[@id='ctl00_MainContent_ClubDetailDeskTop_lbclubName']");
	private static By clubdetails  = By.xpath("//*[contains(@id, 'ctl00_MainContent_ClubDetailDeskTop_lb')]");
	private static By club_desktop_details  = By.xpath("//div[@id='trDeskTop']//div[@class='col-sm-8 hidden-xs padding-b-sm padding-b-md']");
	
	private static By club_image  = By.id("ctl00_MainContent_ClubDetailDeskTop_imgClub");
	private static By join_this_club  = By.xpath("//input[@name='ctl00$MainContent$ClubDetailDeskTop$btnJoin']");
	private static By clubnamelinks  = By.xpath("//a[contains(@id,'_lnkBtnClubID')]");
	
	private static By clubrate_button  = By.id("ctl00_MainContent_ClubDetailDeskTop_btnRate");
	private static By clubhour_button  = By.id("ctl00_MainContent_ClubDetailDeskTop_btnClubHour");
	private static By kidsclubhour_button  = By.id("ctl00_MainContent_ClubDetailDeskTop_btnKidHour");
	private static By classschedule_button  = By.id("ctl00_MainContent_ClubDetailDeskTop_btnClass");
	private static By joinclub_button  = By.id("ctl00_MainContent_ClubDetailDeskTop_btnJoin2");
	private static By club_rates_section  = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[2]/div[6]/div[1]/div[1]");
	private static By club_amenities_section  = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[2]/div[7]");
	private static By club_amenities_list  = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[2]/div[7]/div[1]/div[1]//ul");
	private static By steptwo_img  = By.id("ctl00_MainContent_imgProcessHeader");
	private static By selectadditionalfeatures_h  = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]");
	private static By yourhomeclub_h  = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/div[1]");
		
	private static By Additionalfeatures_b  = By.id("ctl00_MainContent_TabRates_header");
	private static By monthly_$_36_99  = By.id("ctl00_MainContent_TabRates_ctl00_tab");
	private static By monthly_$_46_99  = By.id("ctl00_MainContent_TabRates_ctl01_tab");
	private static By No_of_Persons_dropdown  = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ddlPersons");
	private static By No_of_Persons_dropdown_1  = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_ddlPersons");
	
	private static By initiation_fee  = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblInitiationFee");
	private static By initiation_fee_1  = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblInitiationFee");
	
	private static By billing_frequency  = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblFrequency");
	private static By billing_frequency_1  = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblFrequency");
	private static By addamenities=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]");
	private static By addamenities_1=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[6]/td[1]");

	private static By addamenities_rows=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[1]");
	
	private static By addamenities_rows_1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[1]");
	
	
	private static By yourdues=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[1]");

	private static By yourdues_1=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[10]/td[1]");
												
	private static By Prepay=By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblPrepayAmount");
	private static By Prepay_1=By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblPrepayAmount");
	private static By firstmonthdues=By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblMonthlyFee");
	private static By firstmonthdues_1=By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblMonthlyFee");
	
	private static By initial_term=By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblTerm");
	private static By initial_term_1=By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblTerm");
	
	private static By continue_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnPayment");
	private static By continue_button_1= By.id("ctl00_MainContent_TabRates_ctl01_ctl00_btnPayment");
	private static By back_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnBack");
	private static By back_button_1= By.id("ctl00_MainContent_TabRates_ctl01_ctl00_btnBack");
	
	
	private static By clubdetails_yourhome=By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]");
	private static By club_name_and_address_yourhome=By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/span");
	private static By club_phone_yourhome=By.id("ctl00_MainContent_lnkclubphone");
	private static By club_name_yourhome=By.id("ctl00_MainContent_lblClubName");
	private static By club_image_yourhome=By.id("ctl00_MainContent_imgClub");
	
	private static By club_access_yourhome=By.xpath("//div[contains(text(),'Club Access')]");
	private static By club_signature_yourhome=By.id("ctl00_MainContent_lblAccess");
	private static By club_classes_yourhome=By.xpath("//div[contains(text(),'Group Fitness Classes')]");
	private static By club_classes_text_yourhome=By.xpath("//div[contains(text(),'Group Fitness classes throughout the day, many at ')]");
	private static By footnotes= By.xpath("//table[@id='footnotes']");
	private static By disclaimers= By.xpath("//table[@id='disclaimers']");
	private static By link= By.id("lnkHealthCode");
	private static By canada_text= By.id("sigClubDisclaimer");
	
	private static By member_information_section= By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/fieldset[1]");
	private static By billing_information_section= By.id("ctl00_MainContent_pnlPayments");
	private static By initial_payment_amount_section= By.id("divMembershipPlan");
	private static By included_amenities_section= By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[9]");
	private static By your_home_club_section= By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]");
	private static By your_home_club_address= By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]");
	private static By Review_confirm_button= By.id("ctl00_MainContent_btnProceedPayment");
	private static By FName_error= By.id("ctl00_MainContent_vtxtFName");
	private static By LName_error= By.id("ctl00_MainContent_vtxtLName");
	private static By Phone_error= By.id("ctl00_MainContent_vtxtPhone");
	private static By Address_error= By.id("ctl00_MainContent_vtxtAddress");
	private static By Email_error= By.id("ctl00_MainContent_vtxtEmail");
	private static By ConfirmEmail_error= By.id("ctl00_MainContent_vtxtConfirmEmail");
	private static By City_error= By.id("ctl00_MainContent_vtxtCity");
	private static By Zip_error= By.id("ctl00_MainContent_vtxtZip");
	private static By State_DD= By.id("ctl00_MainContent_dListStates");
	
	private static By FName_p= By.id("ctl00_MainContent_txtFName");
	private static By LName_p= By.id("ctl00_MainContent_txtLName");
	private static By Phone_p= By.id("ctl00_MainContent_txtPhone");
	private static By Address_p= By.id("ctl00_MainContent_txtAddress");
	private static By Email_p= By.id("ctl00_MainContent_txtEmail");
	private static By ConfirmEmail_p= By.id("ctl00_MainContent_txtConfirmEmail");
	private static By City_p= By.id("ctl00_MainContent_txtCity");
	private static By Zip_p= By.id("ctl00_MainContent_txtZip");
//	private static By State_DD= By.id("ctl00_MainContent_dListStates");
	
	private static By Billinginfo_sameas_memberinfo=By.id("ctl00_MainContent_cBoxSameBilling");
	private static By redeemgiftcard=By.id("redeemgiftcard");
	private static By CreditCard=By.id("ctl00_MainContent_BillingInfoUserControl_optCreditCard");

	private static By Checking=By.id("ctl00_MainContent_BillingInfoUserControl_optChecking");
	private static By Savings=By.id("ctl00_MainContent_BillingInfoUserControl_optSavings");
	private static By CardNumber=By.id("ctl00_MainContent_BillingInfoUserControl_txtCardNumber");
	private static By exp_month=By.id("ctl00_MainContent_BillingInfoUserControl_cboMonth");
	private static By exp_year=By.id("ctl00_MainContent_BillingInfoUserControl_cboYear");
	
	
	
	public void Validate_joinnow_steps(String Value) throws Exception {
		
				if (Value.equalsIgnoreCase("Joinnow_steps")) {
					
					click(Join_now_button);

					Log.info("Join_now_button clicked successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
					
					Element_isdisplayed(Searchclub_text);
				
					Log.info(driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
					
					Element_isdisplayed(Joinnow_steps);
					ExtentTestManager.getTest().log(Status.PASS, "4 Join_now steps are displayed successfully");
					Log.info("4 Join_now steps are displayed successfully");
				}
		
			}
	
	
	public void Validate_joinnow_fields(String Value) throws Exception {
		
		if (Value.equalsIgnoreCase("Joinnow_fields")) {
			click(Join_now_button);
			ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
			Log.info("Join_now_button clicked successfully");
			
			Element_isdisplayed(Country_dropdown);
			Log.info("Country dropdown validation successful");
			ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
			
			Element_isdisplayed(CityName_input);
			ExtentTestManager.getTest().log(Status.PASS, "City Name input field is displayed successfully");
			Log.info("City Name input field is displayed successfully");

			Element_isdisplayed(ZipCode_input);
			ExtentTestManager.getTest().log(Status.PASS, "Zip code input field is displayed successfully");
			Log.info("Zip code input field is displayed successfully");

			Element_isdisplayed(ByStateorprovince_dropdown);
			ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
			Log.info("By State or province dropdown field  is displayed successfully");
			
			Element_isdisplayed(Find_buttob);
			ExtentTestManager.getTest().log(Status.PASS, "Find button field is displayed successfully");
			Log.info("Find button field is displayed successfully");

	}
		}
	
	
	public void Validate_country_values(String Value, String values) throws Exception
	{
		if (Value.equalsIgnoreCase("country_values")) 
		{
		click(Join_now_button);
		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown validation successful");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
		
//		String[] Country_Values = {"ALL","USA", "Canada"};
		String[] country_values=values.split(",");
//		for (String v : country_values) {
//			System.out.println(v.trim());
//		}
		
		 Select select = new Select(driver.findElement(Country_dropdown));  
		 int count=0;
		 List<WebElement> options = select.getOptions();  
		 
		 ArrayList<String> mylist = new ArrayList<String>();
		 
		 for(WebElement we:options)  
		 	{  
			 
			 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
		 	}
		 	String delim = ",";
	        String res = String.join(delim, mylist);
			 
		  for (int i=0; i<country_values.length; i++)
		  	{
			  
			  if(res.trim().toUpperCase().contains(country_values[i].trim().toUpperCase()))
			  	{
				  count++;
				  Log.info(country_values[i].trim()+" value matched");
				  ExtentTestManager.getTest().log(Status.PASS, country_values[i].trim()+" value matched");
				  
			  	}
			  else
			  {
				  
				  Log.error(country_values[i].trim()+" value not matched with the values in country dropdown list"); 
				  ExtentTestManager.getTest().log(Status.FAIL, country_values[i].trim()+" value not matched with the values in country dropdown list");
				  
				 
				  }
			  
		  		}	 
		
		   if (country_values.length == count &&  mylist.size()==country_values.length) 
		    {	
			  
			   	Log.info("All values matched successfully in the country dropdown Expected");
		        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown Expected");

		    } else 
		    {	
		    	Log.error("All values not matched successfully in the country dropdown. Expected dropdown list [ "+values +" ] Actual dropdown list [ "+res+" ]");
	        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the country dropdown. Expected dropdown list [ "+values +" ] Actual dropdown list [ "+res+" ]");
	        	throw new Exception("All values not matched successfully in the country dropdown");
		    }
		 } 
		Thread.sleep(100);
	}
	
	
	public void Validate_ByStateorprovince_values_ALL(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_ALL"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");

		Log.info("Join_now_button clicked successfully");
		Element_isdisplayed(Country_dropdown);

		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());

		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		Element_isdisplayed(ByStateorprovince_dropdown);

		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//		String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
		String[] State_values=dropdown_values.split(",");
		Thread.sleep(100);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
		 int count=0;
		 List<WebElement> options = select1.getOptions(); 
//		 for (String w : State_values) {
//			 System.out.print(w);
//		}
//		 for(WebElement we:options)  
//		 	{ 
//
//		  for (int i=0; i<State_values.length; i++)
//		  	{
//			  
//			  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//			  	{
//				  count++;
//			  
//
//			  Log.info(we.getText()+" value matched");
//			  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//			  	}
//			  
//		    }
		 
		  
		  ArrayList<String> mylist = new ArrayList<String>();
//		Boolean b=	 mylist.equals(State_values);
			 for(WebElement we:options)  
			 	{  
				 
				 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
			 	}
			 	String delim = ",";
		        String res = String.join(delim, mylist);
				 
			  for (int i=0; i<State_values.length; i++)
			  	{
				  
				  if(res.trim().toUpperCase().contains(State_values[i].trim().toUpperCase()))
				  	{
					  count++;
					  Log.info(State_values[i].trim()+" value matched");
					  ExtentTestManager.getTest().log(Status.PASS, State_values[i].trim()+" value matched");
				  	}
				  else {
					
					
						  Log.error(State_values[i].trim()+" value not matched with the values in state dropdown list");
						  ExtentTestManager.getTest().log(Status.FAIL, State_values[i].trim()+" value not matched with the values in state dropdown list");
					
				  }
				  
			    }	 
		  
//		 	} 
		   if (count == State_values.length && mylist.size()==State_values.length) 
		    {	
		        Log.info("All values matched successfully in the state dropdown");
		        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//		        Assert.assertTrue(true);
		     } else 
		    {	
		        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
//		        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
		        
		        throw new Exception("All values not matched successfully in the state dropdown");
		    }
		 } 
		Thread.sleep(100);
	}
	

	public void Validate_ByStateorprovince_values_Canada(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_CANADA"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		select.selectByValue(country.trim());
		 Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+" is selected successfully");
		 Thread.sleep(200);
		Element_isdisplayed(ByStateorprovince_dropdown);
	
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//		String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
		
		String[] State_values=dropdown_values.split(",");
		Thread.sleep(200);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
		 int count=0;
		 List<WebElement> options = select1.getOptions(); 
		 
		 
		 
		 
		  ArrayList<String> mylist = new ArrayList<String>();
//		Boolean b=	 mylist.equals(State_values);
		  Thread.sleep(200);
			 for(WebElement we:options)  
			 	{  
				
				 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
				
			 	}
			 	String delim = ",";
		        String res = String.join(delim, mylist);
				 
			  for (int i=0; i<State_values.length; i++)
			  	{
				  
				  if(res.trim().toUpperCase().contains(State_values[i].trim().toUpperCase()))
				  	{
					  count++;
					  Log.info(State_values[i].trim()+" value matched");
					  ExtentTestManager.getTest().log(Status.PASS, State_values[i].trim()+" value matched");
				  	}
				  else {
					
				  
						  Log.error(State_values[i].trim()+" value not matched with the values in state dropdown list");
						  ExtentTestManager.getTest().log(Status.FAIL, State_values[i].trim()+" value not matched with the values in state dropdown list");
		
				  }
				  
			    }	 
		  
//		 	} 
		   if (count == State_values.length && mylist.size()==State_values.length) 
		    {	
		        Log.info("All values matched successfully in the state dropdown");
		        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//		        Assert.assertTrue(true);
		     } else 
		    {	
		        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
		        throw new Exception("All values not matched successfully in the state dropdown");
		       
		    }
		 
		 
		 

//		 for(WebElement we:options)  
//		 	{ 
//
//		  for (int i=0; i<State_values.length; i++)
//		  	{
//			  
//			  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//			  	{
//				  Thread.sleep(100);
//				  count++;
//				  
//				  Log.info(we.getText()+" value matched");
//				  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//			  	}
//			  
//		    }
//		 
//		 	} 
//		   if (count == State_values.length) 
//		    {	
//			   	
//			   	Log.info("All values matched successfully in the By State province dropdown_CANADA");
//		        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the By State province dropdown_CANADA");
//		        Assert.assertTrue(true);
//		    } else 
//		    {	
//		    	
//		    	Log.error("All values not matched successfully in the By State province dropdown_CANADA");
//		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the By State province dropdown_CANADA");
//		        Assert.assertTrue(false, "All values not matched successfully in the By State province dropdown_CANADA");
//		    }
		 } 
		Thread.sleep(100);
	}
	
	public void Validate_ByStateorprovince_values_USA(String Value, String dropdown_values, String country) throws Exception
	{
		Thread.sleep(100);
		if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_USA"))
		{
		click(Join_now_button);
		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		select.selectByValue(country.trim());
		 Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+" is selected successfully");
		 
		String[] State_values=dropdown_values.split(",");
		Thread.sleep(100);
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//		String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
		
		Thread.sleep(200);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
		 int count=0;
		 List<WebElement> options = select1.getOptions(); 
//		 for (WebElement w : options) {
//			 System.out.print(w.getText()+",");
//		}
		 
		 
		 
		 
		  ArrayList<String> mylist = new ArrayList<String>();
//		Boolean b=	 mylist.equals(State_values);
			 for(WebElement we:options)  
			 	{  
				 
				 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
				 
			 	}
			 	String delim = ",";
		        String res = String.join(delim, mylist);
				 
			  for (int i=0; i<State_values.length; i++)
			  	{
				  
				  if(res.trim().toUpperCase().contains(State_values[i].trim().toUpperCase()))
				  	{
					  count++;
					  Log.info(State_values[i].trim()+" value matched");
					  ExtentTestManager.getTest().log(Status.PASS, State_values[i].trim()+" value matched");
				  	}
				  else {
					 
				  
					  
						  Log.error(State_values[i].trim()+" value not matched with the values in state dropdown list");
						  ExtentTestManager.getTest().log(Status.FAIL, State_values[i].trim()+" value not matched with the values in state dropdown list");
//						  throw new Exception(State_values[i].trim()+" value not matched with the values in state dropdown list");
						
				  }
				  
			    }	 
		  
//		 	} 
		   if (count == State_values.length && mylist.size()==State_values.length) 
		    {	
		        Log.info("All values matched successfully in the state dropdown");
		        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//		        Assert.assertTrue(true);
		     } else 
		    {	
		        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
//		        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
		        
		        throw new Exception("All values not matched successfully in the state dropdown");
		    }
		 
		 
		 
		 
//		 for(WebElement we:options)  
//		 	{ 
//
//		  for (int i=0; i<State_values.length; i++)
//		  	{
//			  
//			  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//			  	{
//				  count++;
//			  
//				  Log.info(we.getText()+" value matched");
//			  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//			  	}
//			  
//		    }
//		 
//		 	} 
//		   if (count == State_values.length) 
//		    {	
//			   
//			   	Log.info("All values matched successfully in the By State province dropdown_USA");
//		        ExtentTestManager.getTest().log(Status.PASS, "ll values matched successfully in the By State province dropdown_USA");
//		        Assert.assertTrue(true);
//		    } else 
//		    {	
//		    	
//		    	Log.error("All values not matched successfully in the By State province dropdown_USA");
//		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the By State province dropdown_USA");
//		        Assert.assertTrue(false, "All values not matched successfully in the By State province dropdown_USA");
//		    }
		 } 
		Thread.sleep(100);
	}
	

	public void Validate_ByStateorprovince_values(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_"+country))
		{
		click(Join_now_button);
		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		Thread.sleep(100);
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//		String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
		String[] State_values=dropdown_values.split(",");
		Thread.sleep(100);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
		 int count=0;
		 List<WebElement> options = select1.getOptions(); 
//		 for (WebElement w : options) {
//			 System.out.print(w.getText()+",");
//		}
		 for(WebElement we:options)  
		 	{ 

		  for (int i=0; i<State_values.length; i++)
		  	{
			  
			  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
			  	{
				  count++;
			  
				  Log.info(we.getText()+" value matched");
				  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
			  	}
			  
		    }
		 
		 	} 
		   if (count == State_values.length) 
		    {	
			   
			   Log.info("All values matched successfully in the country dropdown");
		        
			   ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the ByState province dropdown");
			   Assert.assertTrue(true);
		    } else 
		    {	
		    	
		    	Log.error("All values not matched successfully in the country dropdown");
//		        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the ByState province dropdown");
//		        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
		        throw new Exception("All values not matched successfully in the ByState province dropdown");
		    }
		 } 
		Thread.sleep(100);
	}

	
	public void Validate_listofclubs(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("Listofclubs"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());

		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(100);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results \n" +club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results \n"+club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results \n"+ (club_result_text));
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results \n" + club_result_text );
//			 Assert.assertEquals(dropdown_values.trim().toUpperCase(), club_result_text.toUpperCase());
//			 Assert.assertTrue(false, dropdown_values.trim()+" not contains in the results \n"+ club_result_text);
			 throw new Exception(dropdown_values.trim()+" not contains in the results \n"+ club_result_text);
		 }
		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
//		 int club_results_count=club_result_rows.size();
		 
		 int count=0;
		 for(WebElement we:club_result_rows)  
		 	{ 
			 
//			 Log.info(we.getText());
			 
			 String[] club_address=we.findElement(clb_address).getText().split(",");
			  if(club_address[1].contains(dropdown_values.trim()))
			  	{
				  count++;
			  	}
			  
		    }
		 
		 if (clb_count == count) 
		    {	
			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
			   Assert.assertTrue(true);
		     } 
		 else 
		      {	
			 	Log.info("All the clubs not displayed for the state: "+dropdown_values.trim());
			 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
		    	Assert.assertTrue(false, "All the clubs not displayed for the state: "+dropdown_values.trim());

		      }
		 
//		 
//		 	} 
//		   
		 }
		Thread.sleep(200);
	}
	
	public void Validate_clubs_name_address_photo_joinbutton(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("club_details"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results: "+club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results: "+club_result_text );
//			 Log.info(club_result_text);
//			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: " +club_result_text);
//			 Assert.assertTrue(false, dropdown_values.trim()+" not contains in the results");
			 throw new Exception(dropdown_values.trim()+" not contains in the results");
		 }
//		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
//		 List<WebElement > clbnameslinks=driver.findElements(clubnamelinks);
//		 int club_results_count=club_result_rows.size();
		//*[contains(@id, '_ItemRowContainer')][3]
		 int listSize = driver.findElements(club_list_rows).size();
//		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
				
			 if(i==1)	
				 System.out.println("By default first club is selected");

			 else {
				 
				 	By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
				 	Thread.sleep(200);
					 click(name_link);
				 	scrolltotop();
			 		}
			 Thread.sleep(200);
			 Element_isdisplayed(club_desktop_details);
			 WebElement cad =driver.findElement(club_desktop_details);
			 String club_address_desktop=cad.getText();	
			 Thread.sleep(200);
			 By locator= By.xpath("//*[contains(@id, '_ItemRowContainer')]["+i+"]");
			 Element_isdisplayed(locator);
			 MoveToElement(locator);
			 WebElement element = driver.findElement(locator);
			 String clb_text=element.getText();
			 
//			 club_result_rows.get(i);
				if(clb_text.equalsIgnoreCase(club_address_desktop))
				{
						Log.info("Club name followed by address and phone number is validated successfully: \n"+element.getText());
						ExtentTestManager.getTest().log(Status.PASS, "Club name followed by address and phone number is validated successfully: \n"+element.getText());
				  		Assert.assertTrue(true);
				}

				else {
						Log.error("Club name followed by address and phone number is not validated: \n"+element.getText());
//						ExtentTestManager.getTest().log(Status.FAIL, "Club name followed by address and phone number is not validated: \n"+element.getText());
//						Assert.assertTrue(false, "Club name followed by address and phone number is not validated: \n"+element.getText());
						throw new Exception( "Club name followed by address and phone number is not validated: \n"+element.getText());
				}
			 
		
				Element_isdisplayed(club_image);
				Log.info("Club image is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Club image is displayed successfully");
				
				Element_isdisplayed(join_this_club);
				Log.info("Join this club button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
			}
		 
		 if (clb_count == listSize) 
		    {	
			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
			   Assert.assertTrue(true);
		     } 
		 else 
		      {	
			 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
//			 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
//		    	Assert.assertTrue(false,"All the clubs not displayed for the state: "+dropdown_values.trim());
		    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());

		      }		   
		 }
		Thread.sleep(100);
	}
	

	public void Validate_clubs_buttons(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("clubs_buttons"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
//			 Assert.assertTrue(false, dropdown_values.trim()+" not contains in the results");
			 throw new Exception(dropdown_values.trim()+" not contains in the results");
		 }
//		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
//		 List<WebElement > clbnameslinks=driver.findElements(clubnamelinks);
//		 int club_results_count=club_result_rows.size();
		//*[contains(@id, '_ItemRowContainer')][3]
		 int listSize = driver.findElements(club_list_rows).size();
//		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
				
			 if(i==1)	
				 System.out.println("By default first club is selected");

			 else {
				 
				 	By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
				 	Thread.sleep(200);
					 click(name_link);
				 	scrolltotop();
			 		}
			 
			 Thread.sleep(200);
			 Element_isdisplayed(club_desktop_details);
			 WebElement cad =driver.findElement(club_desktop_details);
			 String club_address_desktop=cad.getText();	
			 Thread.sleep(200);
			 By locator= By.xpath("//*[contains(@id, '_ItemRowContainer')]["+i+"]");
			 Element_isdisplayed(locator);
			 MoveToElement(locator);
			 WebElement element = driver.findElement(locator);
			 String clb_text=element.getText();
			 
//			 club_result_rows.get(i);
				if(clb_text.equalsIgnoreCase(club_address_desktop))
				{
						Log.info("Club name followed by address and phone number is validated successfully: \n"+element.getText());
						ExtentTestManager.getTest().log(Status.PASS, "Club name followed by address and phone number is validated successfully: \n"+element.getText());
				  		Assert.assertTrue(true);
				}

				else {
						Log.error("Club name followed by address and phone number is not validated: \n"+element.getText());
//						ExtentTestManager.getTest().log(Status.FAIL, "Club name followed by address and phone number is not validated: \n"+element.getText());
//						Assert.assertTrue(false, "Club name followed by address and phone number is not validated: \n"+element.getText());
						throw new Exception("Club name followed by address and phone number is not validated: \n"+element.getText());
				}
			 
		
				Element_isdisplayed(club_image);
				Log.info("Club image is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Club image is displayed successfully");
				
				Element_isdisplayed(join_this_club);
				Log.info("Join this club button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
				
				Element_isdisplayed(clubrate_button);
				Log.info("Club rate button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Club rate button is displayed successfully");
				
				Element_isdisplayed(clubhour_button);
				Log.info("Club hour button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Club hour button is displayed successfully");
				
				Element_isdisplayed(kidsclubhour_button);
				Log.info("Kids club hour button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Kids club hour button is displayed successfully");
				
				Element_isdisplayed(classschedule_button);
				Log.info("Class schedule button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Class schedule button is displayed successfully");
				
				Element_isdisplayed(joinclub_button);
				Log.info("Join club button is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Join club button is displayed successfully");
				
			}
//		 if (clb_count == listSize) 
//		    {	
//			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//			   Assert.assertTrue(true);
//		     } 
//		 else 
//		      {	
//			 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////			 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
////		    	Assert.assertTrue(false, "All the clubs not displayed for the state: "+dropdown_values.trim());
//		    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//		      }	
	   
		 }
		Thread.sleep(100);
	}
	
	

	public void Validate_club_ratesandamenities(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("club_ratesandamenities"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
			 
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 	
				Element_isdisplayed(club_rates_section);
				String rates= driver.findElement(club_rates_section).getText().replace("\n", " ").trim();
				Log.info("Club rates section is displayed successfully \n"+rates);
				ExtentTestManager.getTest().log(Status.PASS, "Club rates section is displayed successfully \n"+rates);
				
				Element_isdisplayed(club_amenities_section);
				String amenities= driver.findElement(club_amenities_section).getText().replace("\n", " ");
				Log.info("Club amenities / features section is displayed successfully \n"+amenities);
				ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features section is displayed successfully \n"+amenities);
				MoveToElement(club_amenities_section);
		 
//		 if (clb_count == listSize) 
//		    {	
//			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//			   Assert.assertTrue(true);
//		     } 
//		 else 
//		      {	
//			 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////			 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
//			 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//		      }		   
		 }
		Thread.sleep(500);
	}
	
	
	

	public void Validate_club_rateplans(String Value, String dropdown_values, String country, String rates, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("club_rateplans"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
			 
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
//			 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						validate_rates_section(rates);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	validate_rates_section(rates);
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					validate_rates_section(rates);
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			

		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 	int count=0;
//		 	String[] rates_S = rates.split(",");
//				Element_isdisplayed(club_rates_section);
////				String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//				String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//				MoveToElement(club_rates_section);
//				for (String ratestext : rates_S)
//				{
//					
//					if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//						
//						count++;
//					}
//					else 
//					{
//						Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////						ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//						throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//					}
//					
//				}
//				if (count==rates_S.length)
//				{
//				Log.info("Club rates validated successfully \n"+ rates);
//				ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//				}
				
				
//		 if (clb_count == listSize) 
//		    {	
//			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//			   Assert.assertTrue(true);
//		        
//		     } 
//		 else 
//		      {	
//			 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////			 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////		    	Assert.assertTrue(false);
//			 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//		      }		   
		 }
		Thread.sleep(100);
	}
	
	


	public void Validate_club_Amenities(String Value, String dropdown_values, String country, String amenities, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("club_Amenities"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		Thread.sleep(200);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.info(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.info(club_result_text);
//			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
//			 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						validate_amenities_section(amenities);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	validate_amenities_section(amenities);
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					validate_amenities_section(amenities);
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			

		 
		 
		 
		 
		 
		 
//		 	int count=0;
//		 	
//				Element_isdisplayed(club_amenities_list);
//				Log.info("Club amenities / features are displayed successfully \n"+amenities);
//				ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features are displayed successfully \n"+amenities);
//
////				String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//				String features_section= driver.findElement(club_amenities_list).getText().replaceAll("\n+", " ").trim();
//				MoveToElement(club_rates_section);
//				System.out.println("Amenities:"+features_section);
//				String[] amenities_s = amenities.split(",");
//				for (String features : amenities_s)
//				{
//					
//					if(features_section.toUpperCase().contains(features.toUpperCase())) {
//						
//						count++;
//						Log.info("Club amenity: "+features+"   validation is successful");
//						ExtentTestManager.getTest().log(Status.PASS, "Club amenity: "+features+"   validation is successful");
//					
//					}
//					else 
//					{
//						Log.error("Club amenitites  validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
////						ExtentTestManager.getTest().log(Status.FAIL, "Club amenitites validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
//						throw new Exception("Club amenitites  validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
//					}
//					
//				}
//				if (count==amenities_s.length)
//				{
//				Log.info("Club amenitites validated successfully ");
//				ExtentTestManager.getTest().log(Status.PASS, "Club amenitites validated successfully");
//				}
//				
				
						
		 
//		 if (clb_count == listSize) 
//		    {	
//			 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//			   Assert.assertTrue(true);
//		     } 
//		 else 
//		      {	
//			 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////			 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
////		    	Assert.assertTrue(false);
//		    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//		      }		   
		 }
		Thread.sleep(500);
	}
	
	


	public void Validate_joinnow_steptwo(String Value, String dropdown_values, String country, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("Joinnow_steptwo"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
//			 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			
		 	
		 }
		Thread.sleep(1000);
	}
	
	
	public void clickOnjointhisclubbutton() throws Exception {
		Element_isdisplayed(join_this_club);
	 	Log.info("Join this club button is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
		MoveToElement(join_this_club);
		click(joinclub_button);
		String step_two_page_title="LA Fitness | Online Membership - Rate";
		if(driver.getTitle().toUpperCase().contains(step_two_page_title.toUpperCase()))
		{
		Log.info("User successfully navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
		ExtentTestManager.getTest().log(Status.PASS, "User successfully navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
		}
		else {
			Log.error("User not navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
//			ExtentTestManager.getTest().log(Status.FAIL, "User not navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());	
			throw new Exception("User not navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
		}
		Element_isdisplayed(steptwo_img);
		Log.info("Select a Membership Plan section displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Select a Membership Plan section displayed successfully");
	}

	
	public void validate_amenities_section(String amenities) throws Exception {
		
		int count=0;
	 	
		Element_isdisplayed(club_amenities_list);
		Log.info("Club amenities / features are displayed successfully \n"+amenities);
		ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features are displayed successfully \n"+amenities);

//		String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
		String features_section= driver.findElement(club_amenities_list).getText().replaceAll("\n+", " ").trim();
		MoveToElement(club_rates_section);
		System.out.println("Amenities:"+features_section);
		String[] amenities_s = amenities.split(",");
		for (String features : amenities_s)
		{
			
			if(features_section.toUpperCase().contains(features.toUpperCase())) {
				
				count++;
				Log.info("Club amenity: "+features+"   validation is successful");
				ExtentTestManager.getTest().log(Status.PASS, "Club amenity: "+features+"   validation is successful");
			
			}
			else 
			{
				Log.error("Club amenitites  validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
//				ExtentTestManager.getTest().log(Status.FAIL, "Club amenitites validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
				throw new Exception("Club amenitites  validation is not successful \n Expected: "+ features+" amenity is not present in \n Actual list: "+features_section);
			}
			
		}
		if (count==amenities_s.length)
		{
		Log.info("Club amenitites validated successfully ");
		ExtentTestManager.getTest().log(Status.PASS, "Club amenitites validated successfully");
		}
		

	}
	
	
	public void validate_rates_section(String rates) throws Exception {
		
		
		
		int count=0;
	 	String[] rates_S = rates.split(",");
			Element_isdisplayed(club_rates_section);
//			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
			MoveToElement(club_rates_section);
			for (String ratestext : rates_S)
			{
				
				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
					
					count++;
				}
				else 
				{
					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
				}
				
			}
			if (count==rates_S.length)
			{
			Log.info("Club rates validated successfully \n"+ rates);
			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
			}
		
	}
	

	
	
	public void Validate_selectadditionalfeatues_yourhomeclub(String Value, String dropdown_values, String country, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("selectadditionalfeatues_yourhomeclub"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
			 
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
//				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
//		 	Element_isdisplayed(join_this_club);
//		 	Log.info("Join this club button is displayed successfully");
//			ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
//			MoveToElement(join_this_club);
//			click(joinclub_button);
//			
//			String step_two_page_title="LA Fitness | Online Membership - Rate";
//			if(driver.getTitle().toUpperCase().contains(step_two_page_title.toUpperCase()))
//			{
//			Log.info("User successfully navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
//			ExtentTestManager.getTest().log(Status.PASS, "User successfully navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
//			}
//			else {
//				Log.error("User not navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());
//				ExtentTestManager.getTest().log(Status.FAIL, "User not navigated to the step two (Select a Membership Plan) page: "+driver.getTitle());	
//			}
//			Element_isdisplayed(steptwo_img);
//			Log.info("Select a Membership Plan section displayed successfully");
//			ExtentTestManager.getTest().log(Status.PASS, "Select a Membership Plan section displayed successfully");
//		 Element_isdisplayed(selectadditionalfeatures_h);
//			Log.info("Select additional features section is displayed successfully");
//			ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
//			
//			Element_isdisplayed(yourhomeclub_h);
//			Log.info("Your homeclub section is displayed successfully");
//			ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//			
			
		 }
		Thread.sleep(1000);
	}
	
		

	public void Validate_Additionalfeatures_monthlyrates(String Value, String dropdown_values, String country, String clubname, String Monthly_rates) throws Exception
	{
		if (Value.equalsIgnoreCase("Additionalfeatures_monthlyrates"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
//			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_AF_MR(Monthly_rates);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_AF_MR(Monthly_rates);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					validate_AF_MR(Monthly_rates);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	
	public	void validate_AF_MR(String Monthly_rates) throws Exception {

	 	Element_isdisplayed(Additionalfeatures_b);
	 	
	 	Log.info("Select additional features section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
		String monthlyratestext=driver.findElement(Additionalfeatures_b).getText().replaceAll("\n+", " ").trim();
		String[] monthlyrates=Monthly_rates.split(",");
//		 System.out.println("Rates :"+monthlyratestext);
		for (String m_rates : monthlyrates) 
		{
			if(monthlyratestext.toUpperCase().contains(m_rates.toUpperCase().trim())) {
				
				Log.info(m_rates+" validated successfully");
				ExtentTestManager.getTest().log(Status.PASS, m_rates+" validated successfully");
			}
			else
			{
				Log.error("Club rates validation failed. Expected [ "+ Monthly_rates +" ] Actual ["+monthlyratestext+" ]");
//				ExtentTestManager.getTest().log(Status.FAIL, m_rates+" not displayed");
				throw new Exception("Club rates validation failed. Expected [ "+ Monthly_rates +" ] Actual ["+monthlyratestext+" ]");
			}
			
			
		}
	}
	
	

	public void Validate_select_monthlyrates_$36_99_details(String Value, String dropdown_values, String country, String clubname, String plan_rates, String Monthly_rates, String Monthly_details) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$36_99_details"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_36_99(plan_rates,Monthly_rates, Monthly_details);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_36_99(plan_rates, Monthly_rates, Monthly_details);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					validate_Select_MR_36_99(plan_rates,Monthly_rates, Monthly_details);
//					validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	
	public void select_rates(String rates) throws Exception {
		
		Element_isdisplayed(monthly_$_36_99);
	 	Element_isdisplayed(monthly_$_46_99);
	 	if(driver.findElement(monthly_$_36_99).getText().contains(rates)) {
	 		Thread.sleep(200);
	 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
	 	}
	 	else if(driver.findElement(monthly_$_46_99).getText().contains(rates)) {
	 		Thread.sleep(200);
	 		if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
		}
	 	
	 	Log.info("Selected "+rates+" Monthly Rate successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Selected "+rates+" Monthly Rate successfully");
		
	}
	
	public	void validate_Select_MR_36_99(String plan_rates,String Monthly_rates, String Rates_details) throws Exception {
		
		select_rates(plan_rates.trim());
	 	
		Element_isdisplayed(No_of_Persons_dropdown);
		Log.info("Number of Persons dropdown displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
		String[] details=Rates_details.split(",");
		String dropdowninput= details[0].trim();
		String initiationfee_input= details[1].trim();
		String Billing_frequency_input= details[2].trim();
		String initial_term_input= details[3].trim();
		String Prepayment_input= details[4].trim();
		
		Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown));
//		1 for $36.99/month
		if(monthly_dropdown.getFirstSelectedOption().getText().equalsIgnoreCase(dropdowninput)){
			
			Log.info("By default Number of persons: "+monthly_dropdown.getFirstSelectedOption().getText()+" dropdown option is selected");
			ExtentTestManager.getTest().log(Status.PASS, "By default Number of persons: "+monthly_dropdown.getFirstSelectedOption().getText()+" dropdown option is selected");
			
		}
		else {
			throw new Exception("given input to validated by default selected option  is [ "+dropdowninput+" ] but actual selected option is [ "+monthly_dropdown.getFirstSelectedOption().getText()+" ]");
		}
		
		 List<WebElement> options = monthly_dropdown.getOptions(); 
		 for (WebElement webElement : options) {
			 
			Log.info("Number of persons dorpdown option: "+webElement.getText()+" is validated");
			ExtentTestManager.getTest().log(Status.PASS, "Number of persons dorpdown option: "+webElement.getText()+" is validated");
			 
		}
		 
		Log.info("Number of Persons dropdown validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown validated successfully");
		
		Element_isdisplayed(initiation_fee);
		String initiationfee=driver.findElement(initiation_fee).getText().trim();
		Assert.assertEquals(initiationfee_input.toUpperCase(), initiationfee.toUpperCase(), "Initiation is not matched with the given input");
		Log.info("Initiation fee "+ initiationfee +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Initiation fee "+ initiationfee +" is validated successfully");
		Element_isdisplayed(billing_frequency);
		String Billing_frequency=driver.findElement(billing_frequency).getText().trim();
		Assert.assertEquals(Billing_frequency_input.toUpperCase(), Billing_frequency.toUpperCase(), "Billing frequency is not matched with the given input");
		Log.info("Billing frequency "+ Billing_frequency +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Billing frequency "+ Billing_frequency +" is validated successfully");
		

		Element_isdisplayed(initial_term);
		String monthlyterm=driver.findElement(initial_term).getText().trim();
		Assert.assertEquals(initial_term_input.toUpperCase(), monthlyterm.toUpperCase(), "monthly term is not matched with the given input");
		Log.info("initial term  "+ monthlyterm +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "initial term  "+ monthlyterm +" is validated successfully");
		
		

		Element_isdisplayed(Prepay);
		String Prepayment=driver.findElement(Prepay).getText().trim();
		Assert.assertEquals(Prepayment_input.toUpperCase(), Prepayment.toUpperCase(), "Prepayment is not matched with the given input");
		Log.info("Prepayment "+ Prepayment +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Prepayment  "+ Prepayment +" is validated successfully");
		
		Element_isdisplayed(addamenities);
		Element_isdisplayed(addamenities_rows);
		String add_amenities=driver.findElement(addamenities).getText().trim();
		Assert.assertEquals("Add Amenities".toUpperCase(), add_amenities.toUpperCase(), "Add amenities is not matched with the given input");
		Log.info(add_amenities +" section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  add_amenities +" section is displayed successfully");

		
		Element_isdisplayed(yourdues);

		Element_isdisplayed(firstmonthdues);
		String yourDues=driver.findElement(yourdues).getText().trim();
		Assert.assertEquals("Your Dues2".toUpperCase(), yourDues.toUpperCase(), "Your Dues2 is not matched with the given input");
		Log.info(yourDues +"section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is displayed successfully");
				

	}

	public	void validate_Select_MR_46_99(String plan_rates,String Monthly_rates, String Rates_details) throws Exception {

//	 	Element_isdisplayed(monthly_$_46_99);
////	 	if(!driver.findElement(monthly_$_34_99).isSelected()) click(monthly_$_34_99);
//	 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
//	 	Log.info("Selected $46.99 Monthly Rate successfully");
//		ExtentTestManager.getTest().log(Status.PASS, "Selected $46.99 Monthly Rate successfully");
		
		select_rates(plan_rates);
		
		Element_isdisplayed(No_of_Persons_dropdown_1);
		Log.info("Number of Persons dropdown displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
		String[] details=Rates_details.split(",");
		String dropdowninput= details[0].trim();
		String initiationfee_input= details[1].trim();
		String Billing_frequency_input= details[2].trim();
		String initial_term_input= details[3].trim();
		String Prepayment_input= details[4].trim();
		
		Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown_1));
//		1 for $36.99/month
		if(monthly_dropdown.getFirstSelectedOption().getText().equalsIgnoreCase(dropdowninput)){
			
			Log.info("By default Number of persons: "+monthly_dropdown.getFirstSelectedOption().getText()+" dropdown option is selected");
			ExtentTestManager.getTest().log(Status.PASS, "By default Number of persons: "+monthly_dropdown.getFirstSelectedOption().getText()+" dropdown option is selected");
			
		}
		else {
			throw new Exception("given input to validated by default selected option  is [ "+dropdowninput+" ] but actual selected option is [ "+monthly_dropdown.getFirstSelectedOption().getText()+" ]");
		}
		
		 List<WebElement> options = monthly_dropdown.getOptions(); 
		 for (WebElement webElement : options) {
			 
			Log.info("Number of persons dorpdown option: "+webElement.getText()+" is validated");
			ExtentTestManager.getTest().log(Status.PASS, "Number of persons dorpdown option: "+webElement.getText()+" is validated");
			 
		}
		 
		Log.info("Number of Persons dropdown validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown validated successfully");
		
		Element_isdisplayed(initiation_fee_1);
		String initiationfee=driver.findElement(initiation_fee_1).getText().trim();
		Assert.assertEquals(initiationfee_input.toUpperCase(), initiationfee.toUpperCase(), "Initiation is not matched with the given input");
		Log.info("Initiation fee "+ initiationfee +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Initiation fee "+ initiationfee +" is validated successfully");
		Element_isdisplayed(billing_frequency_1);
		String Billing_frequency=driver.findElement(billing_frequency_1).getText().trim();
		Assert.assertEquals(Billing_frequency_input.toUpperCase(), Billing_frequency.toUpperCase(), "Billing frequency is not matched with the given input");
		Log.info("Billing frequency "+ Billing_frequency +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Billing frequency "+ Billing_frequency +" is validated successfully");
		

		Element_isdisplayed(initial_term_1);
		String monthlyterm=driver.findElement(initial_term_1).getText().trim();
		Assert.assertEquals(initial_term_input.toUpperCase(), monthlyterm.toUpperCase(), "monthly term is not matched with the given input");
		Log.info("initial term  "+ monthlyterm +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "initial term  "+ monthlyterm +" is validated successfully");
		
		

		Element_isdisplayed(Prepay_1);
		String Prepayment=driver.findElement(Prepay_1).getText().trim();
		Assert.assertEquals(Prepayment_input.toUpperCase(), Prepayment.toUpperCase(), "Prepayment is not matched with the given input");
		Log.info("Prepayment "+ Prepayment +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Prepayment  "+ Prepayment +" is validated successfully");
		
		Element_isdisplayed(addamenities_1);
		Element_isdisplayed(addamenities_rows_1);
		String add_amenities=driver.findElement(addamenities_1).getText().trim();
		Assert.assertEquals("Add Amenities".toUpperCase(), add_amenities.toUpperCase(), "Add amenities is not matched with the given input");
		Log.info(add_amenities +" section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  add_amenities +" section is displayed successfully");

		
		Element_isdisplayed(yourdues_1);

		Element_isdisplayed(firstmonthdues_1);
		String yourDues=driver.findElement(yourdues_1).getText().trim();
		Assert.assertEquals("Your Dues2".toUpperCase(), yourDues.toUpperCase(), "Your Dues2 is not matched with the given input");
		Log.info(yourDues +"section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is displayed successfully");
				

	}

	
	
	public	void validate_Select_MR_36_99_amenities(String plan_rates, String included_amenitities_input, String add_amenities_input) throws Exception {
	
		select_rates(plan_rates);
	
		Element_isdisplayed(addamenities);
		MoveToElement(addamenities);
		String add_amenities=driver.findElement(addamenities).getText();
		Assert.assertEquals("Add Amenities".toUpperCase(), add_amenities.toUpperCase(), "Add amenities is not matched with the given input");
		Log.info(add_amenities +" section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  add_amenities +" section is displayed successfully");

		//add amenities
		
		By add_amenities_td=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[1]");
		String add_amenities_s= driver.findElement(add_amenities_td).getText().replaceAll("\n+", " ").trim();
//		By am= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_0");
		 By add_ams  = By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl00_ctl00_ckbAddAmenity_')]");
		 
		List<WebElement> add_s=driver.findElements(add_ams);

		String[] add_amen=new String[add_s.size()];
		String[] add_ameni_input=add_amenities_input.split(",");
		int count=0;
		for (int i=0; i<add_s.size() ;i++) {
			
//			String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i+"']")).getText();
			String[] my_am=add_ameni_input[i].split("-");
			if(add_amenities_s.toUpperCase().contains(my_am[0].trim().toUpperCase()))
			{
																
						String s=driver.findElement(By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl00_ctl00_ckbAddAmenity_"+i+"')]")).getText();
			
						boolean  b=driver.findElement(By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAddAmenity_"+i)).isSelected();
						String[] am_b=add_ameni_input[i].trim().split("-");
						Boolean checked = null;
						if (am_b[1].trim().equalsIgnoreCase("checked")){
							 checked =true;
						}
						else if (am_b[1].trim().equalsIgnoreCase("unchecked")) {
							
							checked=false;
						}
						
			//			Boolean.parseBoolean(am_b[0].trim().replace("checked", "true"));
						if(am_b[0].trim().equalsIgnoreCase(s) && checked==b)
						{
						Log.info("Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						if(b==true)add_amen[i]=s+"- checked";
						else add_amen[i]=s+"- unchecked";
							
						count++;
						}
						else
						{
							Log.error("Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							ExtentTestManager.getTest().log(Status.FAIL, "Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							if(b==true)add_amen[i]=s+"- checked";
							else add_amen[i]=s+"- unchecked";
						}
			}
			else 
			{
				Log.error("Amenity [ "+add_ameni_input[i].trim()+" ] is not present in amenities list [ "+add_amenities_s+" ]");
				ExtentTestManager.getTest().log(Status.FAIL, "Amenity [ "+add_ameni_input[i].trim()+" ] is not present in amenities list [ "+add_amenities_s+" ]");
			}
			
		}
		
		if (count == add_s.size() && add_ameni_input.length == add_s.size()) 
		{
			Log.info("All values matched successfully in the amenities list");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the amenities list");

	    } else 
	    {	
	    	
		 	
	        String res = String.join( ",", add_ameni_input);
	    	Log.error("All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	throw new Exception("All values not matched successfully in the amenities list");
			
		}
		
		// included_amenities
		
		
		
		
//		By amenities= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity");
		By amenities= By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[1]");
		
		Element_isdisplayed(amenities);
		Log.info("Included Amenities section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,   "Included Amenities section is displayed successfully");
		click(amenities);
		By included_amenities=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[2]");
//		By continue_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnPayment");
		Element_isdisplayed(included_amenities);
		MoveToElement(yourdues);
		String amenities_s= driver.findElement(included_amenities).getText().replaceAll("\n+", " ").trim();
//		By am= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_0");
		 By ams  = By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_')]");
		List<WebElement> am_s=driver.findElements(ams);

		String[] amen=new String[am_s.size()];
		String[] amen_input=included_amenitities_input.split(",");
		int count1=0;
		for (int i=0; i<am_s.size() ;i++) {
			
//			String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i+"']")).getText();
			String[] my_am=amen_input[i].split("-");
			if(amenities_s.toUpperCase().contains(my_am[0].trim().toUpperCase()))
			{
				
						String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i+"']")).getText();
			
						boolean  b=driver.findElement(By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i)).isSelected();
						String[] am_b=amen_input[i].trim().split("-");
						Boolean checked = null;
						if (am_b[1].trim().equalsIgnoreCase("checked")){
							 checked =true;
						}
						else if (am_b[1].trim().equalsIgnoreCase("unchecked")) {
							
							checked=false;
						}
						
			//			Boolean.parseBoolean(am_b[0].trim().replace("checked", "true"));
						if(am_b[0].trim().equalsIgnoreCase(s) && checked==b)
						{
						Log.info("Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						if(b==true)amen[i]=s+"- checked";
						else amen[i]=s+"- unchecked";
							
						count1++;
						}
						else
						{
							Log.error("Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							ExtentTestManager.getTest().log(Status.FAIL, "Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							if(b==true)amen[i]=s+"- checked";
							else amen[i]=s+"- unchecked";
						}
			}
			else 
			{
				Log.error("Amenity [ "+amen_input[i].trim()+" ] is not present in amenities list [ "+amenities_s+" ]");
				ExtentTestManager.getTest().log(Status.FAIL, "Amenity [ "+amen_input[i].trim()+" ] is not present in amenities list [ "+amenities_s+" ]");
			}
			
		}
		
		if (count1 == am_s.size() && amen_input.length == am_s.size()) 
		{
			Log.info("All values matched successfully in the amenities list");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the amenities list");

	    } else 
	    {	
	    	
		 	
	        String res = String.join( ",", amen);
	    	Log.error("All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	throw new Exception("All values not matched successfully in the amenities list");
			
		}
Thread.sleep(200);
	}
	

	public	void validate_Select_MR_46_99_amenities( String plan_rates, String included_amenitities_input, String add_amenities_input) throws Exception {
	
	select_rates(plan_rates);
		
	
		Element_isdisplayed(addamenities_1);
		MoveToElement(addamenities_1);
		String add_amenities=driver.findElement(addamenities_1).getText();
		Assert.assertEquals("Add Amenities".toUpperCase(), add_amenities.toUpperCase(), "Add amenities is not matched with the given input");
		Log.info(add_amenities +" section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  add_amenities +" section is displayed successfully");
		


		
		//add amenities
		
		By add_amenities_td=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[1]");
		String add_amenities_s= driver.findElement(add_amenities_td).getText().replaceAll("\n+", " ").trim();
//		By am= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_0");
		 By add_ams  = By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl01_ctl00_ckbAddAmenity_')]");
		 
		List<WebElement> add_s=driver.findElements(add_ams);

		String[] add_amen=new String[add_s.size()];
		String[] add_ameni_input=add_amenities_input.split(",");
		int count=0;
		for (int i=0; i<add_s.size() ;i++) {
			
//			String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i+"']")).getText();
			String[] my_am=add_ameni_input[i].split("-");
			if(add_amenities_s.toUpperCase().contains(my_am[0].trim().toUpperCase()))
			{
																
						String s=driver.findElement(By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl01_ctl00_ckbAddAmenity_"+i+"')]")).getText();
			
						boolean  b=driver.findElement(By.id("ctl00_MainContent_TabRates_ctl01_ctl00_ckbAddAmenity_"+i)).isSelected();
						String[] am_b=add_ameni_input[i].trim().split("-");
						Boolean checked = null;
						if (am_b[1].trim().equalsIgnoreCase("checked")){
							 checked =true;
						}
						else if (am_b[1].trim().equalsIgnoreCase("unchecked")) {
							
							checked=false;
						}
						
			//			Boolean.parseBoolean(am_b[0].trim().replace("checked", "true"));
						if(am_b[0].trim().equalsIgnoreCase(s) && checked==b)
						{
						Log.info("Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						if(b==true)add_amen[i]=s+"- checked";
						else add_amen[i]=s+"- unchecked";
							
						count++;
						}
						else
						{
							Log.error("Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							ExtentTestManager.getTest().log(Status.FAIL, "Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							if(b==true)add_amen[i]=s+"- checked";
							else add_amen[i]=s+"- unchecked";
						}
			}
			else 
			{
				Log.error("Amenity [ "+add_ameni_input[i].trim()+" ] is not present in amenities list [ "+add_amenities_s+" ]");
				ExtentTestManager.getTest().log(Status.FAIL, "Amenity [ "+add_ameni_input[i].trim()+" ] is not present in amenities list [ "+add_amenities_s+" ]");
			}
			
		}
		
		if (count == add_s.size() && add_ameni_input.length == add_s.size()) 
		{
			Log.info("All values matched successfully in the amenities list");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the amenities list");

	    } else 
	    {	
	    	
		 	
	        String res = String.join( ",", add_ameni_input);
	    	Log.error("All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	throw new Exception("All values not matched successfully in the amenities list");
			
		}
		
		// included_amenities
		
		
		
		
//		By amenities= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity");
		By amenities= By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[1]");
		
		Element_isdisplayed(amenities);
		Log.info("Included Amenities section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,   "Included Amenities section is displayed successfully");
		click(amenities);
		By included_amenities=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[2]");
//		By continue_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnPayment");
		Element_isdisplayed(included_amenities);
		MoveToElement(yourdues_1);
		String amenities_s= driver.findElement(included_amenities).getText().replaceAll("\n+", " ").trim();
//		By am= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_0");
		 By ams  = By.xpath("//label[contains(@for,'ctl00_MainContent_TabRates_ctl01_ctl00_ckbAmenity_')]");
		List<WebElement> am_s=driver.findElements(ams);

		String[] amen=new String[am_s.size()];
		String[] amen_input=included_amenitities_input.split(",");
		int count1=0;
		for (int i=0; i<am_s.size() ;i++) {
			
//			String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl00_ctl00_ckbAmenity_"+i+"']")).getText();
			String[] my_am=amen_input[i].split("-");
			if(amenities_s.toUpperCase().contains(my_am[0].trim().toUpperCase()))
			{
				
						String s=driver.findElement(By.xpath("//label[@for='ctl00_MainContent_TabRates_ctl01_ctl00_ckbAmenity_"+i+"']")).getText();
			
						boolean  b=driver.findElement(By.id("ctl00_MainContent_TabRates_ctl01_ctl00_ckbAmenity_"+i)).isSelected();
						String[] am_b=amen_input[i].trim().split("-");
						Boolean checked = null;
						if (am_b[1].trim().equalsIgnoreCase("checked")){
							 checked =true;
						}
						else if (am_b[1].trim().equalsIgnoreCase("unchecked")) {
							
							checked=false;
						}
						
			//			Boolean.parseBoolean(am_b[0].trim().replace("checked", "true"));
						if(am_b[0].trim().equalsIgnoreCase(s) && checked==b)
						{
						Log.info("Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Amenity: "+s+" check box is checked: "+b+" and validated successfully");
						if(b==true)amen[i]=s+"- checked";
						else amen[i]=s+"- unchecked";
							
						count1++;
						}
						else
						{
							Log.error("Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							ExtentTestManager.getTest().log(Status.FAIL, "Amenity not validated successfully. expected [ "+am_b[0].trim()+ " check box is checked: "+checked+" ] Actual [ "+s+" check box is checked: "+b+" ]");
							if(b==true)amen[i]=s+"- checked";
							else amen[i]=s+"- unchecked";
						}
			}
			else 
			{
				Log.error("Amenity [ "+amen_input[i].trim()+" ] is not present in amenities list [ "+amenities_s+" ]");
				ExtentTestManager.getTest().log(Status.FAIL, "Amenity [ "+amen_input[i].trim()+" ] is not present in amenities list [ "+amenities_s+" ]");
			}
			
		}
		
		if (count1 == am_s.size() && amen_input.length == am_s.size()) 
		{
			Log.info("All values matched successfully in the amenities list");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the amenities list");

	    } else 
	    {	
	    	
		 	
	        String res = String.join( ",", amen);
	    	Log.error("All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the amenities list. Expected amenities list [ "+included_amenitities_input +" ] Actual dropdown list [ "+res+" ]");
        	throw new Exception("All values not matched successfully in the amenities list");
			
		}
Thread.sleep(500);
			

	}
	

	public void Validate_select_monthlyrates_$36_99_add_amenities_list(String Value, String dropdown_values, String country, String clubname, String plan_rates, String included_amenities, String add_amenities) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$36_99_add_amenities_list"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//						validate_Select_MR_34_99(Monthly_rates, Monthly_details);
						validate_Select_MR_36_99_amenities(plan_rates,included_amenities, add_amenities);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//						validate_Select_MR_34_99(Monthly_rates, Monthly_details);
						validate_Select_MR_36_99_amenities(plan_rates, included_amenities, add_amenities);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//					validate_Select_MR_34_99(Monthly_rates, Monthly_details);
					validate_Select_MR_36_99_amenities(plan_rates, included_amenities, add_amenities);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	
	

	public void Validate_select_monthlyrates_$46_99_add_amenities_list(String Value, String dropdown_values, String country, String clubname, String plan_rates, String included_amenities, String add_amenities) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$46_99_add_amenities_list"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//						validate_Select_MR_34_99(Monthly_rates, Monthly_details);
						validate_Select_MR_46_99_amenities(plan_rates, included_amenities, add_amenities);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//						validate_Select_MR_34_99(Monthly_rates, Monthly_details);
						validate_Select_MR_46_99_amenities(plan_rates, included_amenities, add_amenities);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
//					validate_Select_MR_34_99(Monthly_rates, Monthly_details);
					validate_Select_MR_46_99_amenities(plan_rates, included_amenities, add_amenities);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	
	
	public void Validate_select_monthlyrates_$36_99_yourdues_section(String Value, String dropdown_values, String country, String clubname, String plan_rates, String Monthly_rates, String all_yourdues) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$36_99_yourdues_section"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_36_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_36_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					validate_Select_MR_36_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//					validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}

	public	void validate_Select_MR_36_99_all_yourdues(String plan_rates,String Monthly_rates, String all_yourdues) throws Exception {

//	 	Element_isdisplayed(monthly_$_36_99);
//	 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
////	 	if(!driver.findElement(monthly_$_44_99).isSelected()) click(monthly_$_44_99);
//	 	Log.info("Selected $36.99 Monthly Rate successfully");
//		ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
		
		select_rates(plan_rates);
		
		String[] details=all_yourdues.split(",");
//		System.out.println(details.length);
		String firstmonth_input = null;
		String lastmonth_input= null;
		String total_payment_input= null;
		String annualfee_input= null;
		if(details.length==4){
		 firstmonth_input= details[0].trim();
		 lastmonth_input= details[1].trim();
		 total_payment_input= details[2].trim();
		 annualfee_input= details[3].trim();
//		String Prepayment_input= details[4].trim();
//		ctl00_MainContent_TabRates_ctl01_ctl00_lblMonthlyFee
		}
		else {
			Log.info("Invalid your dues input: "+all_yourdues);
			ExtentTestManager.getTest().log(Status.PASS,  "Invalid your dues input: "+all_yourdues);
			throw new Exception("Invalid your dues input");
		}
		Element_isdisplayed(yourdues);

//		Element_isdisplayed(firstmonthdues);
		String yourDues=driver.findElement(yourdues).getText();
		Assert.assertEquals("Your Dues2".toUpperCase(), yourDues.toUpperCase(), "Your Dues2 is not matched with the given input");
		Log.info(yourDues +"section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is displayed successfully");
		
		By firstmonth_due = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblMonthlyFee");
		
		MoveToElement(continue_button);
		Element_isdisplayed(firstmonth_due);
		String firstmonthdue=driver.findElement(firstmonth_due).getText().trim();
		Assert.assertEquals(firstmonth_input.toUpperCase(), firstmonthdue.toUpperCase(), "First month due is not matched with the given input");
		Log.info("First month due "+ firstmonthdue +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "First month due "+ firstmonthdue +" is validated successfully");
//		ctl00_MainContent_TabRates_ctl00_ctl00_lblMonthlyFee1
		By lastmonth_due = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblMonthlyFee1");
		Element_isdisplayed(lastmonth_due);
		String lastmonthdue=driver.findElement(lastmonth_due).getText().trim();
		Assert.assertEquals(lastmonth_input.toUpperCase(), lastmonthdue.toUpperCase(), "Last month due is not matched with the given input");
		Log.info("Last month due "+ lastmonthdue +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Last month due "+ lastmonthdue +" is validated successfully");
		
		By total_paymnt = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblTotalPayment");
		
		Element_isdisplayed(total_paymnt);
		String total_pay=driver.findElement(total_paymnt).getText().trim();
		Assert.assertEquals(total_payment_input.toUpperCase(), total_pay.toUpperCase(), "Total payment  is not matched with the given input");
		Log.info("Total payment "+ total_pay +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Total payment "+ total_pay +" is validated successfully");
		
		By annulfee = By.id("ctl00_MainContent_TabRates_ctl00_ctl00_lblAnnualFee");
		

		Element_isdisplayed(annulfee);
	
		String Annual_fee=driver.findElement(annulfee).getText().trim();
		Assert.assertEquals(annualfee_input.toUpperCase(), Annual_fee.toUpperCase(), "Annual fee is not matched with the given input");
		Log.info("Annual fee "+ Annual_fee +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Annual fee  "+ Annual_fee +" is validated successfully");
		

		Log.info(yourDues +" section is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is validated successfully");
		
		Thread.sleep(500);

	}
	

	public void Validate_select_monthlyrates_$46_99_yourdues_section(String Value, String dropdown_values, String country, String clubname,String plan_rates, String Monthly_rates, String all_yourdues) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$46_99_yourdues_section"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_46_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_46_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					validate_Select_MR_46_99_all_yourdues(plan_rates,Monthly_rates, all_yourdues);
//					validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}

	public	void validate_Select_MR_46_99_all_yourdues(String plan_rates,String Monthly_rates, String all_yourdues) throws Exception {

//	 	Element_isdisplayed(monthly_$_46_99);
////	 	if(!driver.findElement(monthly_$_34_99).isSelected()) click(monthly_$_34_99);
//	 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
//	 	Log.info("Selected $36.99 Monthly Rate successfully");
//		ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
		
		select_rates(plan_rates);
		
		String[] details=all_yourdues.split(",");
//		System.out.println(details.length);
		String firstmonth_input = null;
		String lastmonth_input= null;
		String total_payment_input= null;
		String annualfee_input= null;
		if(details.length==4){
		 firstmonth_input= details[0].trim();
		 lastmonth_input= details[1].trim();
		 total_payment_input= details[2].trim();
		 annualfee_input= details[3].trim();
//		String Prepayment_input= details[4].trim();
//		ctl00_MainContent_TabRates_ctl01_ctl00_lblMonthlyFee
		}
		else {
			Log.info("Invalid your dues input: "+all_yourdues);
			ExtentTestManager.getTest().log(Status.PASS,  "Invalid your dues input: "+all_yourdues);
			throw new Exception("Invalid your dues input");
		}
		Element_isdisplayed(yourdues_1);

//		Element_isdisplayed(firstmonthdues);
		String yourDues=driver.findElement(yourdues_1).getText();
		Assert.assertEquals("Your Dues2".toUpperCase(), yourDues.toUpperCase(), "Your Dues2 is not matched with the given input");
		Log.info(yourDues +"section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is displayed successfully");
		
		By firstmonth_due = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblMonthlyFee");
		
		MoveToElement(continue_button_1);
		Element_isdisplayed(firstmonth_due);
		String firstmonthdue=driver.findElement(firstmonth_due).getText().trim();
		Assert.assertEquals(firstmonth_input.toUpperCase(), firstmonthdue.toUpperCase(), "First month due is not matched with the given input");
		Log.info("First month due "+ firstmonthdue +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "First month due "+ firstmonthdue +" is validated successfully");
//		ctl00_MainContent_TabRates_ctl00_ctl00_lblMonthlyFee1
		By lastmonth_due = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblMonthlyFee1");
		Element_isdisplayed(lastmonth_due);
		String lastmonthdue=driver.findElement(lastmonth_due).getText().trim();
		Assert.assertEquals(lastmonth_input.toUpperCase(), lastmonthdue.toUpperCase(), "Last month due is not matched with the given input");
		Log.info("Last month due "+ lastmonthdue +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Last month due "+ lastmonthdue +" is validated successfully");
		
		By total_paymnt = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblTotalPayment");
		
		Element_isdisplayed(total_paymnt);
		String total_pay=driver.findElement(total_paymnt).getText().trim();
		Assert.assertEquals(total_payment_input.toUpperCase(), total_pay.toUpperCase(), "Total payment  is not matched with the given input");
		Log.info("Total payment "+ total_pay +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Total payment "+ total_pay +" is validated successfully");
		
		By annulfee = By.id("ctl00_MainContent_TabRates_ctl01_ctl00_lblAnnualFee");
		

		Element_isdisplayed(annulfee);
	
		String Annual_fee=driver.findElement(annulfee).getText().trim();
		Assert.assertEquals(annualfee_input.toUpperCase(), Annual_fee.toUpperCase(), "Annual fee is not matched with the given input");
		Log.info("Annual fee "+ Annual_fee +" is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Annual fee  "+ Annual_fee +" is validated successfully");
		

		Log.info(yourDues +" section is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS,  yourDues +" section is validated successfully");
		
		Thread.sleep(500);

	}
	
	
	public void Validate_select_monthlyrates_$46_99_details(String Value, String dropdown_values, String country, String clubname, String plan_rates, String Monthly_rates, String Monthly_details) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$46_99_details"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_46_99(plan_rates,Monthly_rates, Monthly_details);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						validate_Select_MR_46_99(plan_rates,Monthly_rates, Monthly_details);
//						validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					validate_Select_MR_46_99(plan_rates,Monthly_rates, Monthly_details);
//					validate_Select_MR_34_99_amenities(Monthly_rates, Monthly_details);
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	

	public void Validate_No_of_persons_dropdown_for_$36_99(String Value, String dropdown_values, String country, String clubname, String persons_dropdown_values, String plan_rates) throws Exception
	{
		if (Value.equalsIgnoreCase("No_of_persons_dropdown_for_$36_99"))
		{
		click(Join_now_button);
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		Log.info("Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown field is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
		 Select select = new Select(driver.findElement(Country_dropdown));
		 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
			 select.selectByValue(country.trim());
		 Thread.sleep(200);
		Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
		
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
		
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
		 select1.selectByValue(dropdown_values.trim());
		
		 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
		 Thread.sleep(200);
//		 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
		 String club_result_text= driver.findElement(club_result_total).getText();
		 
		 if(club_result_text.contains(dropdown_values.trim())) {
			 Log.info(dropdown_values.trim()+" contains in the results ");
			 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
			 Log.info(club_result_text);
			 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//			 Log.error(club_result_text);
//			 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//			 Assert.assertTrue(false);
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 int count=0;
		
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();	
		
			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
//					 System.out.println("By default first club"+clubname+" is selected");
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton();
						Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						No_of_persons_dropdown_for_$36_99(persons_dropdown_values,plan_rates);
//						
						count++;
						break;
						
				 		}
				 else {
					 	
//					 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//					 	Thread.sleep(200);
					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton();
					 	Element_isdisplayed(selectadditionalfeatures_h);
						Log.info("Select additional features section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
						
						Element_isdisplayed(yourhomeclub_h);
						Log.info("Your homeclub section is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
						No_of_persons_dropdown_for_$36_99(persons_dropdown_values, plan_rates);
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					No_of_persons_dropdown_for_$36_99(persons_dropdown_values,plan_rates);
//					
					count++;
					break;
			 }
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
		 
		 
		 
	
		 }
		Thread.sleep(1000);
	}
	
	
	
public void No_of_persons_dropdown_for_$36_99(String persons_dropdown_values, String plan_rates) throws Exception{
	
	
//		Element_isdisplayed(monthly_$_36_99);
//	 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
////	 	if(!driver.findElement(monthly_$_44_99).isSelected()) click(monthly_$_44_99);
//	 	Log.info("Selected $36.99 Monthly Rate successfully");
//		ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
	
		select_rates(plan_rates);
		
		Element_isdisplayed(No_of_Persons_dropdown);
		Log.info("Number of Persons dropdown displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
//		Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown));
		String[] values=persons_dropdown_values.split(",");

	
	 Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown));  
	 int count=0;
	 List<WebElement> options = monthly_dropdown.getOptions();  
	 
	 ArrayList<String> mylist = new ArrayList<String>();
	 
	 for(WebElement we:options)  
	 	{  
		 
		 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
	 	}
	 	String delim = ",";
        String res = String.join(delim, mylist);
		 
	  for (int i=0; i<values.length; i++)
	  	{
		  
		  if(res.trim().toUpperCase().contains(values[i].trim().toUpperCase()))
		  	{
			  count++;
			  Log.info(values[i].trim()+" value matched");
			  ExtentTestManager.getTest().log(Status.PASS, values[i].trim()+" value matched");
		  	}
		  else
		  {
			  
			  Log.error(values[i].trim()+" value not matched with the values in No of persons dropdown list"); 
			  ExtentTestManager.getTest().log(Status.FAIL, values[i].trim()+" value not matched with the values in No of persons dropdown list");
//			  Assert.assertTrue(false);
			 
			  }
		  
	  		}	 
	
	   if (values.length == count &&  mylist.size()==values.length) 
	    {	
		   	Log.info("All values matched successfully in the No of persons dropdown as Expected");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the No of persons dropdown as Expected");

	    } else 
	    {	
	    	Log.error("All values not matched successfully in the No of persons dropdown. Expected dropdown list [ "+ persons_dropdown_values +" ] Actual dropdown list [ "+res+" ]");
        	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the No of persons dropdown. Expected dropdown list [ "+ persons_dropdown_values +" ] Actual dropdown list [ "+res+" ]");
        	throw new Exception("All values not matched successfully in the No of persons dropdown");
	    }
	 
	Thread.sleep(500);
	
}
	

public void Validate_No_of_persons_dropdown_for_$46_99(String Value, String dropdown_values, String country, String clubname, String persons_dropdown_values, String plan_rates) throws Exception
{
	if (Value.equalsIgnoreCase("No_of_persons_dropdown_for_$46_99"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	Thread.sleep(200);
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
//	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//		 Log.error(club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//		 Assert.assertTrue(false);
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }
	 
	 int listSize = driver.findElements(club_list_rows).size();
	 int count=0;
	
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
	
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					No_of_persons_dropdown_for_$46_99(persons_dropdown_values,plan_rates);
//					
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					No_of_persons_dropdown_for_$46_99(persons_dropdown_values, plan_rates);
				 	count++;
				 	break;
			 		}
		 }
		 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				Element_isdisplayed(selectadditionalfeatures_h);
				Log.info("Select additional features section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
				
				Element_isdisplayed(yourhomeclub_h);
				Log.info("Your homeclub section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
				No_of_persons_dropdown_for_$46_99(persons_dropdown_values,plan_rates);
//				
				count++;
				break;
		 }
		
		 }
	   
	 if(count==0) {
			Log.error("Club name did not matched with any of the clubs in the results");
			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name did not matched with any of the clubs in the results");
		}
	 
	 
	 

	 }
	Thread.sleep(1000);
}



public void No_of_persons_dropdown_for_$46_99(String persons_dropdown_values, String plan_rates) throws Exception{


//	Element_isdisplayed(monthly_$_46_99);
//
// 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
// 	Log.info("Selected $46.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $46.99 Monthly Rate successfully");
	
	select_rates(plan_rates);
	
	Element_isdisplayed(No_of_Persons_dropdown_1);
	Log.info("Number of Persons dropdown displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
//	Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown));
	String[] values=persons_dropdown_values.split(",");


 Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown_1));  
 int count=0;
 List<WebElement> options = monthly_dropdown.getOptions();  
 
 ArrayList<String> mylist = new ArrayList<String>();
 
 for(WebElement we:options)  
 	{  
	 
	 if (!we.getText().isEmpty()) mylist.add(we.getText().trim());
 	}
 	String delim = ",";
    String res = String.join(delim, mylist);
	 
  for (int i=0; i<values.length; i++)
  	{
	  
	  if(res.trim().toUpperCase().contains(values[i].trim().toUpperCase()))
	  	{
		  count++;
		  Log.info(values[i].trim()+" value matched");
		  ExtentTestManager.getTest().log(Status.PASS, values[i].trim()+" value matched");
	  	}
	  else
	  {
		  
		  Log.error(values[i].trim()+" value not matched with the values in No of persons dropdown list"); 
		  ExtentTestManager.getTest().log(Status.FAIL, values[i].trim()+" value not matched with the values in No of persons dropdown list");
//		  Assert.assertTrue(false);
		 
		  }
	  
  		}	 

   if (values.length == count &&  mylist.size()==values.length) 
    {	
	   	Log.info("All values matched successfully in the No of persons dropdown as Expected");
        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the No of persons dropdown as Expected");

    } else 
    {	
    	Log.error("All values not matched successfully in the No of persons dropdown. Expected dropdown list [ "+persons_dropdown_values +" ] Actual dropdown list [ "+res+" ]");
    	ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the No of persons dropdown. Expected dropdown list [ "+persons_dropdown_values +" ] Actual dropdown list [ "+res+" ]");
    	throw new Exception("All values not matched successfully in the No of persons dropdown");
    }
 
Thread.sleep(500);

}



public void Validate_back_continue_buttons_underadditionalfeatures(String Value, String dropdown_values, String country, String clubname) throws Exception
{
	if (Value.equalsIgnoreCase("back_continue_buttons_underadditionalfeatures"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
//	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//		 Log.error(club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//		 Assert.assertTrue(false);
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }
	 
	 int listSize = driver.findElements(club_list_rows).size();
	 int count=0;
	
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
	
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					back_continue_buttons();
//					
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					back_continue_buttons();
				 	count++;
				 	break;
			 		}
		 }
		 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				Element_isdisplayed(selectadditionalfeatures_h);
				Log.info("Select additional features section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
				
				Element_isdisplayed(yourhomeclub_h);
				Log.info("Your homeclub section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
				back_continue_buttons();
//				
				count++;
				break;
		 }
		
		 }
	   
	 if(count==0) {
			Log.error("Club name did not matched with any of the clubs in the results");
			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name did not matched with any of the clubs in the results");
		}

	 }
	Thread.sleep(1000);
}


public void Validate_back_button_underadditionalfeatures(String Value, String dropdown_values, String country, String clubname, String previous_page_title ) throws Exception
{
	if (Value.equalsIgnoreCase("back_button_underadditionalfeatures"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
//	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//		 Log.error(club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//		 Assert.assertTrue(false);
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }
	 
	 int listSize = driver.findElements(club_list_rows).size();
	 int count=0;
	
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
	
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					Verify_back_button(previous_page_title);
//					
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					Verify_back_button(previous_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				Element_isdisplayed(selectadditionalfeatures_h);
				Log.info("Select additional features section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
				
				Element_isdisplayed(yourhomeclub_h);
				Log.info("Your homeclub section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
				Verify_back_button(previous_page_title);
//				
				count++;
				break;
		 }
		
		 }
	   
	 if(count==0) {
			Log.error("Club name did not matched with any of the clubs in the results");
			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name did not matched with any of the clubs in the results");
		}

	 }
	Thread.sleep(1000);
}


public void back_continue_buttons() throws Exception{


//	Element_isdisplayed(monthly_$_36_99);
//
// 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
// 	Log.info("Selected $36.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
	select_rates("36.99");
	
	Element_isdisplayed(back_button);
	Element_isdisplayed(continue_button);
	MoveToElement(back_button);
	
//	Element_isdisplayed(monthly_$_46_99);
//	MoveToElement(monthly_$_46_99);
// 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
// 	Log.info("Selected $46.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $46.99 Monthly Rate successfully");
	
	Thread.sleep(100);
	MoveToElement(monthly_$_46_99);
	Thread.sleep(100);
	select_rates("46.99");
	
	Element_isdisplayed(back_button_1);
	Element_isdisplayed(continue_button_1);
	MoveToElement(continue_button_1);
	
	Log.info("Back and continue buttons are displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Back and continue buttons are displayed successfully");

 
Thread.sleep(500);

}

	

public void Verify_back_button(String previous_page_title) throws Exception{

	select_rates("36.99");
//	Element_isdisplayed(monthly_$_36_99);
//
// 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
// 	Log.info("Selected $36.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
	
	Element_isdisplayed(back_button);
	MoveToElement(back_button);
	click(back_button);
	System.out.println(driver.getTitle());
	String previouspagetitle=driver.getTitle();
	Assert.assertEquals(previouspagetitle.toUpperCase().trim(), previous_page_title.toUpperCase().trim(), "User not navigated to previous step");
	Log.info("Back button validated successfully and navigated to previous page: "+previouspagetitle);
	ExtentTestManager.getTest().log(Status.PASS, "Back button validated successfully and navigated to previous page: "+previouspagetitle);
	
	
	
	
	
//	Element_isdisplayed(monthly_$_46_99);
//	MoveToElement(monthly_$_46_99);
// 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
// 	Log.info("Selected $46.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $46.99 Monthly Rate successfully");
//	Element_isdisplayed(back_button_1);
//	Element_isdisplayed(continue_button_1);
//	MoveToElement(continue_button_1);
	
//	Log.info("Back and continue buttons are displayed successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Back and continue buttons are displayed successfully");

 
Thread.sleep(500);

}

	

public void Validate_continue_button_underadditionalfeatures(String Value, String dropdown_values, String country, String clubname, String previous_page_title ) throws Exception
{
	if (Value.equalsIgnoreCase("continue_button_underadditionalfeatures"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
//	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results " );
//		 Log.error(club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, club_result_text );
//		 Assert.assertTrue(false);
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }
	 
	 int listSize = driver.findElements(club_list_rows).size();
	 int count=0;
	
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
	
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					Verify_continue_button(previous_page_title);
//					
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	Element_isdisplayed(selectadditionalfeatures_h);
					Log.info("Select additional features section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
					
					Element_isdisplayed(yourhomeclub_h);
					Log.info("Your homeclub section is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
					Verify_continue_button(previous_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				Element_isdisplayed(selectadditionalfeatures_h);
				Log.info("Select additional features section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
				
				Element_isdisplayed(yourhomeclub_h);
				Log.info("Your homeclub section is displayed successfully");
				ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
				Verify_continue_button(previous_page_title);
//				
				count++;
				break;
		 }
		
		 }
	   
	 if(count==0) {
			Log.error("Club name did not matched with any of the clubs in the results");
			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name did not matched with any of the clubs in the results");
		}

	 }
	Thread.sleep(1000);
}

		

public void Verify_continue_button(String next_page_title) throws Exception{

	select_rates("36.99");
//	Element_isdisplayed(monthly_$_36_99);
//
// 	if(!driver.findElement(monthly_$_36_99).isSelected()) click(monthly_$_36_99);
// 	Log.info("Selected $36.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $36.99 Monthly Rate successfully");
	
	Element_isdisplayed(continue_button);
	MoveToElement(continue_button);
	click(continue_button);
//	System.out.println(driver.getTitle());
	String pagetitle=driver.getTitle();
	Assert.assertEquals(pagetitle.toUpperCase().trim(), next_page_title.toUpperCase().trim(), "User not navigated to next step: "+next_page_title);
	Log.info("Continue button validated successfully and navigated to next page: "+pagetitle);
	ExtentTestManager.getTest().log(Status.PASS, "Continue button validated successfully and navigated to next page: "+pagetitle);
	
	
	
	
	
//	Element_isdisplayed(monthly_$_46_99);
//	MoveToElement(monthly_$_46_99);
// 	if(!driver.findElement(monthly_$_46_99).isSelected()) click(monthly_$_46_99);
// 	Log.info("Selected $46.99 Monthly Rate successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Selected $46.99 Monthly Rate successfully");
//	Element_isdisplayed(back_button_1);
//	Element_isdisplayed(continue_button_1);
//	MoveToElement(continue_button_1);
	
//	Log.info("Back and continue buttons are displayed successfully");
//	ExtentTestManager.getTest().log(Status.PASS, "Back and continue buttons are displayed successfully");

 
Thread.sleep(500);

}

	
public void Validate_club_details_under_yourhomeclubsection(String Value, String dropdown_values, String country, String clubname) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_club_details_under_yourhomeclubsection"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					club_details_under_homeclubsection(clubname);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	club_details_under_homeclubsection(clubname);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				club_details_under_homeclubsection(clubname);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}


public void club_details_under_homeclubsection(String clubname) throws Exception {
	
	
	
	
//	By club_access_signature_onlineeasystart_yourhome=By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[2]/div[3]");
	Element_isdisplayed(clubdetails_yourhome);
	String details= driver.findElement(clubdetails_yourhome).getText();
	Assert.assertEquals(driver.findElement(club_name_yourhome).getText().toUpperCase().trim(), clubname.toUpperCase().trim(), "club name ( "+clubname+" ) not validated successfully");
	List<WebElement> name_address =driver.findElements(club_name_and_address_yourhome);

	for (WebElement w : name_address) {
		Assert.assertTrue(w.isDisplayed(), w+" field not displayed");
	}
	
	Assert.assertTrue(driver.findElement(club_phone_yourhome).isDisplayed(), "club phone not displayed");
	
	Log.info("club details section  displayed successfully: "+details);
	ExtentTestManager.getTest().log(Status.PASS, "club details section displayed successfully: "+details);
	
	Assert.assertTrue(driver.findElement(club_image_yourhome).isDisplayed(), "club image not displayed");
	Log.info("club image displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "club image displayed successfully");
//	Assert.assertTrue(driver.findElement(club_access_signature_onlineeasystart_yourhome).isDisplayed(), "club access, signature and online easy start fields not displayed");
	Assert.assertTrue(driver.findElement(club_access_yourhome).isDisplayed(), "club access field not displayed");
	Assert.assertTrue(driver.findElement(club_signature_yourhome).isDisplayed(), "club Signature field not displayed");
	Assert.assertTrue(driver.findElement(club_classes_yourhome).isDisplayed(), "club group fitness classes field not displayed");
	Assert.assertTrue(driver.findElement(club_classes_text_yourhome).isDisplayed(), "club group fitness classes details not displayed");
	
	Log.info("club access, signature and online easy start fields displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "club access, signature and online easy start fields displayed successfully");
	
}
		
	
public void points_under_yourhomeclub(String points) throws Exception {
	
		
		Element_isdisplayed(footnotes);
		
		String details= driver.findElement(footnotes).getText();
//		Log.info("points under your home club displayed successfully: "+details);
//		ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
		Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "points under your home club not validated successfully");
		Log.info("points under your home club displayed successfully: "+details);
		ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
		
	}
	
	

public void additionalpoints_under_yourhomeclub(String points) throws Exception {

	
	Element_isdisplayed(disclaimers);
	
	String details= driver.findElement(disclaimers).getText().replace("\n", " ");
//	Log.info("Additional points / disclaimers under your home club displayed successfully: "+details);
//	ExtentTestManager.getTest().log(Status.PASS, "Additional points / disclaimers under your home club displayed successfully: "+details);
//	Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "Additional points / disclaimers under your home club not validated successfully");
	if(details.toUpperCase().trim().contains(points.toUpperCase().trim())) {
		Log.info("Additional points / disclaimers under your home club displayed successfully: "+points);
		ExtentTestManager.getTest().log(Status.PASS, "Additional points / disclaimers under your home club displayed successfully: "+points);
	}
	else {
		Log.error("Additional points / disclaimers under your home club not validated successfully: "+details);
//		ExtentTestManager.getTest().log(Status.FAIL, "Additional points / disclaimers under your home club not validated successfully: "+details);
		throw new Exception("Additional points / disclaimers under your home club not validated successfully: "+details);
	}
	
	

	
}


public void health_studio_registration_link_under_yourhomeclub(String linktext) throws Exception {

	
	Element_isdisplayed(link);
	
	String details= driver.findElement(link).getText().replace("\n", " ");
//	Log.info("Additional points / disclaimers under your home club displayed successfully: "+details);
//	ExtentTestManager.getTest().log(Status.PASS, "Additional points / disclaimers under your home club displayed successfully: "+details);
	Assert.assertEquals(details.toUpperCase().trim(), linktext.toUpperCase().trim(), "Health studio registration link under your home club not validated successfully");
	
		Log.info("Health studio registration link under your home club displayed successfully: "+details);
		ExtentTestManager.getTest().log(Status.PASS, "Health studio registration link under your home club displayed successfully: "+details);
	
	
	

	
}


public void Validate_points_under_yourhomeclub(String Value, String dropdown_values, String country, String clubname, String points) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_points_under_yourhomeclub"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					points_under_yourhomeclub(points);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	points_under_yourhomeclub(points);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				points_under_yourhomeclub(points);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	

public void Validate_additionalpoints_under_yourhomeclub(String Value, String dropdown_values, String country, String clubname, String points) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_additionalpoints_under_yourhomeclub"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					additionalpoints_under_yourhomeclub(points);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	additionalpoints_under_yourhomeclub(points);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				additionalpoints_under_yourhomeclub(points);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	
	

public void Validate_health_studio_registration_link_under_yourhomeclub(String Value, String dropdown_values, String country, String clubname, String linktext) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_health_studio_registration_link_under_yourhomeclub"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					health_studio_registration_link_under_yourhomeclub(linktext);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	health_studio_registration_link_under_yourhomeclub(linktext);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				health_studio_registration_link_under_yourhomeclub(linktext);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	
	

public void Validate_different_pricing_in_canadatext(String Value, String dropdown_values, String country, String clubname, String canada_Text, String City) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_different_pricing_in_canadatext"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	

	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
if(!country.isBlank()) {
	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
}
if(!dropdown_values.isBlank()) {
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 }
if(!City.isBlank()) {
	
	Element_isdisplayed(CityName_input);
	driver.findElement(CityName_input).sendKeys(City);
	Element_isdisplayed(Find_buttob);
	click(Find_buttob);
	 Thread.sleep(200);
}
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					different_pricing_in_canadatext(canada_Text);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	different_pricing_in_canadatext(canada_Text);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				different_pricing_in_canadatext(canada_Text);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	

public void different_pricing_in_canadatext(String canada_Text) throws Exception {

	
	Element_isdisplayed(canada_text);
	
	String details= driver.findElement(canada_text).getText();
//	Log.info("points under your home club displayed successfully: "+details);
//	ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
	Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), canada_Text.toUpperCase().trim(), "different pricing in canada text under your home club not validated successfully");
	Log.info("different pricing in canada text under your home club displayed successfully: "+details);
	ExtentTestManager.getTest().log(Status.PASS, "different pricing in canada text under your home club displayed successfully: "+details);
	
}
	

public void Validate_all_sections_under_membership_payment_information(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_sections_under_membership_payment_information"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					all_sections_under_membership_payment_information(next_page_title);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	all_sections_under_membership_payment_information(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				all_sections_under_membership_payment_information(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	


public void all_sections_under_membership_payment_information(String next_page_title) throws Exception {
	
	Verify_continue_button(next_page_title);

	
	Element_isdisplayed(member_information_section);
	Log.info("Member information section under Membership payment information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Member information section under Membership payment information displayed successfully");
	
	Element_isdisplayed(billing_information_section);
	Log.info("Billing information section under Membership payment information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Billing information section under Membership payment information displayed successfully");
	
	Element_isdisplayed(initial_payment_amount_section);
	Log.info("Initial Payment Amount section under Membership payment information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Initial Payment Amount section under Membership payment information displayed successfully");
	
	Element_isdisplayed(included_amenities_section);
	Log.info("Included amenities section under Membership payment information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Included amenities section under Membership payment information displayed successfully");
	
	Element_isdisplayed(your_home_club_section);
	Element_isdisplayed(your_home_club_address);
	Log.info("Your Home Club section under Membership payment information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Your Home Club section under Membership payment information displayed successfully");
	
//	String details= driver.findElement(footnotes).getText();
//	Log.info("points under your home club displayed successfully: "+details);
//	ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
//	Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "points under your home club not validated successfully");
	
	
}


public void Validate_all_fields_under_Member_information_section(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_fields_under_Member_information_section"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					all_fields_under_Member_information_section(dropdown_values,next_page_title);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	all_fields_under_Member_information_section(dropdown_values,next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				all_fields_under_Member_information_section(dropdown_values,next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	
	

public void all_fields_under_Member_information_section(String dropdown_values,String next_page_title) throws Exception {
	
	Verify_continue_button(next_page_title);

	
	Element_isdisplayed(FName_p);
	Log.info("First name field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "First name field under Member Information displayed successfully");
	
	Element_isdisplayed(LName_p);
	Log.info("Last name field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "List name field under Member Information displayed successfully");
	
	Element_isdisplayed(Phone_p);
	Log.info("Phone number field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Phone number field under Member Information displayed successfully");
	
	Element_isdisplayed(Address_p);
	Log.info("Address field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Address field under Member Information displayed successfully");
	
	Element_isdisplayed(Email_p );
	
	Log.info("Email field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Email field under Member Information displayed successfully");
	Element_isdisplayed(ConfirmEmail_p  );
	
	Log.info("Confirm Email field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Confirm Email field under Member Information displayed successfully");
	Element_isdisplayed(City_p );
	
	Log.info("City field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "City field under Member Information displayed successfully");
	
	Element_isdisplayed(Zip_p );
	Log.info("Zip code field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Zip code field under Member Information displayed successfully");
	
	
//	Select select = new Select(driver.findElement(Zip_p));
//	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase("NY"))
//		 select.selectByValue(country.trim());

	Element_isdisplayed(Review_confirm_button );
	click(Review_confirm_button);
	Log.info("Clicked on Review & confirm button");
	ExtentTestManager.getTest().log(Status.PASS, "Clicked on Review & confirm button");
	MoveToElement(FName_p);
	Thread.sleep(500);
	Element_isdisplayed(FName_error);
	Assert.assertEquals(driver.findElement(FName_error).getText().toUpperCase().trim(), "First Name is required".toUpperCase().trim(), "First Name error message is not displayed");
	Log.info("First Name field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "First Name field is validated as mandatory/required");
	
	Element_isdisplayed(LName_error);
	Assert.assertEquals(driver.findElement(LName_error ).getText().toUpperCase().trim(), "Last Name is required".toUpperCase().trim(), "Last Name error message is not displayed");
	Log.info("Last Name field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Last Name field is validated as mandatory/required");

	Element_isdisplayed(Phone_error);
	Assert.assertEquals(driver.findElement(Phone_error  ).getText().toUpperCase().trim(), "Cell Phone Number is required".toUpperCase().trim(), "Phone number error message is not displayed");
	Log.info("Phone number field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Phone number field is validated as mandatory/required");
	
	Element_isdisplayed(Email_error);
	Assert.assertEquals(driver.findElement(Email_error).getText().toUpperCase().trim(), "Email Address is required".toUpperCase().trim(), "Email error message is not displayed");
	Log.info("Email field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Email field is validated as mandatory/required");
	
	
	Element_isdisplayed(ConfirmEmail_error );
	Assert.assertEquals(driver.findElement(ConfirmEmail_error ).getText().toUpperCase().trim(), "Confirm Email Address is required".toUpperCase().trim(), "Confirm Email error message is not displayed");
	Log.info("Confirm Email field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Confirm Email field is validated as mandatory/required");
	

	Element_isdisplayed(Address_error );
	Assert.assertEquals(driver.findElement(Address_error).getText().toUpperCase().trim(), "Address is required".toUpperCase().trim(), "Address error message is not displayed");
	Log.info("Address field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Address field is validated as mandatory/required");
	

	Element_isdisplayed(City_error );
	Assert.assertEquals(driver.findElement(City_error).getText().toUpperCase().trim(), "City is required".toUpperCase().trim(), "City error message is not displayed");
	Log.info("City field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "City field is validated as mandatory/required");
	
	Select select = new Select(driver.findElement(State_DD));
//	System.out.println(driver.findElement(State_DD).isSelected());
	if(select.getFirstSelectedOption().getText().equalsIgnoreCase(dropdown_values.trim())){
		
		Log.info("State field under Member Information is by default selected: "+select.getFirstSelectedOption().getText());
		ExtentTestManager.getTest().log(Status.PASS, "State field under Member Information is by default selected: "+select.getFirstSelectedOption().getText());
	}
	else {
		Log.error("State code field under Member Information is not selected");
//		ExtentTestManager.getTest().log(Status.FAIL, "Zip code field under Member Information is not selected");
		throw new Exception("State code field under Member Information is not selected");
	}
	
	
	Element_isdisplayed(Zip_error);
	Assert.assertEquals(driver.findElement(Zip_error).getText().toUpperCase().trim(), "Zip Code is required".toUpperCase().trim(), "Zip Code error message is not displayed");
	Log.info("Zip code field is validated as mandatory/required");
	ExtentTestManager.getTest().log(Status.PASS, "Zip code field is validated as mandatory/required");
	
	
//	String details= driver.findElement(footnotes).getText();
//	Log.info("points under your home club displayed successfully: "+details);
//	ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
//	Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "points under your home club not validated successfully");
	
	
}

	
	


public void all_fields_under_Billing_information_section(String next_page_title) throws Exception {

Verify_continue_button(next_page_title);

Element_isdisplayed(Billinginfo_sameas_memberinfo);
if(driver.findElement(Billinginfo_sameas_memberinfo).isSelected()) {
	
	Log.info("Billing Information is the same as Member Information checkbox by default checked/selected");
ExtentTestManager.getTest().log(Status.PASS, "Billing Information is the same as Member Information checkbox by default checked/selected");
}
else {
	throw new Exception("Billing Information is the same as Member Information checkbox by default not checked/selected");
}
Element_isdisplayed(redeemgiftcard);

Log.info("Apply an LA Fitness Gift Card link displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Apply an LA Fitness Gift Card link displayed successfully");
Element_isdisplayed(CreditCard);
MoveToElement(CreditCard);
Log.info("CreditCard radio button is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "CreditCard radio button is displayed successfully");
if(driver.findElement(CreditCard).isSelected()) {
	
	Log.info("Credit Card radio button by default checked/selected");
ExtentTestManager.getTest().log(Status.PASS, "Credit Card radio button by default checked/selected");
}
else {
	throw new Exception("Credit Card radio button by default not checked/selected");
}


Element_isdisplayed(Checking);
Log.info("Checking radio button is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Checking radio button is displayed successfully");

Element_isdisplayed(Savings);
Log.info("Savings radio button is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Savings radio button is displayed successfully");


Element_isdisplayed(CardNumber);
Log.info("CardNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "CardNumber input field is displayed successfully");

Element_isdisplayed(exp_month);
Log.info("Expiration month dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration month dropdown field is displayed successfully");

Element_isdisplayed(exp_year);
Log.info("Expiration year dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration year dropdown field is displayed successfully");



//Select select = new Select(driver.findElement(Zip_p));
// if(!select.getFirstSelectedOption().getText().equalsIgnoreCase("NY"))
//	 select.selectByValue(country.trim());



//String details= driver.findElement(footnotes).getText();
//Log.info("points under your home club displayed successfully: "+details);
//ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
//Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "points under your home club not validated successfully");


}



public void Validate_all_fields_under_Billing_information_section(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_fields_under_Billing_information_section"))
	{
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	
	Element_isdisplayed(Country_dropdown);
	Log.info("Country dropdown field is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());
	 Thread.sleep(200);
	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	
	Element_isdisplayed(ByStateorprovince_dropdown);
	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
	
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown)); 
	 select1.selectByValue(dropdown_values.trim());
	
	 Log.info("By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "By state or province dropdown value: "+dropdown_values.trim()+" is selected successfully");
	 Thread.sleep(200);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results ");
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results " );
		 Log.info(club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results: "+club_result_text );
		 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();	
//		 System.out.println("["+clubname+"]"+"empty: "+clubname.isEmpty()+ "blank: "+clubname.isEmpty());
		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
//				 System.out.println("By default first club"+clubname+" is selected");
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton();
					all_fields_under_Billing_information_section(next_page_title);
					count++;
					break;
					
			 		}
			 else {
				 	
//				 	By name_link1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//				 	Thread.sleep(200);
				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton();
				 	all_fields_under_Billing_information_section(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				all_fields_under_Billing_information_section(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 	int count=0;
//	 	String[] rates_S = rates.split(",");
//			Element_isdisplayed(club_rates_section);
////			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
//			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
//			MoveToElement(club_rates_section);
//			for (String ratestext : rates_S)
//			{
//				
//				if(rates_section.toUpperCase().contains(ratestext.toUpperCase())) {
//					
//					count++;
//				}
//				else 
//				{
//					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
////					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
//					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//				}
//				
//			}
//			if (count==rates_S.length)
//			{
//			Log.info("Club rates validated successfully \n"+ rates);
//			ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
//			}
			
			
//	 if (clb_count == listSize) 
//	    {	
//		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
//	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
//		   Assert.assertTrue(true);
//	        
//	     } 
//	 else 
//	      {	
//		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
////		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
////	    	Assert.assertTrue(false);
//		 	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());
//
//	      }		   
	 }
	Thread.sleep(100);
}
	
	

	
	
	
//	
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
