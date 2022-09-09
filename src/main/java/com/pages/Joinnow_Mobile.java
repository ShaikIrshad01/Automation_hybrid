package com.pages;


import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import com.Utility.Log;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import org.testng.Assert;
public class Joinnow_Mobile extends Base_Class {

	private static By menu = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/nav[1]/div[4]/div[3]/a[2]/img[1]");
	private static By Join_now_button = By.xpath("//div[@class='w-100 join-now']//a[@title='JOIN NOW']");

	private static By about = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[14]/footer[1]/div[3]/div[1]/div[2]/ul[1]/li[6]/a[1]");
	private static By steps_tab = By.xpath("//img[@id='imgProcessHeader']");
	private static By Searchclub_text = By.xpath("//h1[contains(text(),'Search Club')]");
	private static By Country_dropdown = By.id("ctl00_MainContent_ucClubSearchInput1_cboSelCountry");
	private static By CityName_input = By.id("txtCityName");
	private static By ZipCode_input = By.id("txtZipCode");
	private static By ByStateorprovince_dropdown = By.id("ctl00_MainContent_ucClubSearchInput1_cboStateStates");
	private static By Find_buttob = By.id("btnSearch");
	private static By club_count  = By.id("lblClubCount");
	private static By club_result_total  = By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[1]");
	private static By club_list_rows  = By.xpath("//div[@class='ClubAddress col-xs-12']");
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
	private static By club_rates_section  = By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]");
	private static By club_amenities_section  = By.xpath("//div[@id='ctl00_MainContent_Repeater1_ctl00_ClubDetailTemplateInner_clubAmenity_amenities']");
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
	private static By addamenities_1=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/b[1]");

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
	
	By continue_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnPayment");
	By continue_button_1= By.id("ctl00_MainContent_TabRates_ctl01_ctl00_btnPayment");
	By back_button= By.id("ctl00_MainContent_TabRates_ctl00_ctl00_btnBack");
	By back_button_1= By.id("ctl00_MainContent_TabRates_ctl01_ctl00_btnBack");
	
	
	com.pages.Joinnow joinnow = new com.pages.Joinnow();
	
	
	
	public void Validate_joinnow_steps(String Value) throws Exception {
		
		if (Value.equalsIgnoreCase("Joinnow_steps")) {
			click(menu);
			Thread.sleep(200);
//			Element_isdisplayed(menu);
			Element_isdisplayed(Join_now_button);
			click(Join_now_button);

			Log.info("Join_now_button clicked successfully");
			ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
			
			Element_isdisplayed(Searchclub_text);
		
			Log.info(driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
			ExtentTestManager.getTest().log(Status.PASS, driver.findElement(Searchclub_text).getText()+" text is displayed successfully");
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			boolean b=wait2.until(ExpectedConditions.presenceOfElementLocated(steps_tab)).isDisplayed();
//			Element_isdisplayed(steps_tab);
			if(b) {
			ExtentTestManager.getTest().log(Status.PASS, "4 Join_now steps are displayed successfully");
			Log.info("4 Join_now steps are displayed successfully");
			}
			else {
				ExtentTestManager.getTest().log(Status.PASS, "4 Join_now steps are not displayed");
				Log.info("4 Join_now steps are not displayed");
			}
		}

	}
	
	
public void Validate_joinnow_fields(String Value) throws Exception {
	
	if (Value.equalsIgnoreCase("Joinnow_fields")) {
		click(menu);
		Thread.sleep(200);
//		Element_isdisplayed(menu);
		Element_isdisplayed(Join_now_button);
		click(Join_now_button);

		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		
	
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
		
		click(menu);
		Thread.sleep(200);
//		Element_isdisplayed(menu);
		Element_isdisplayed(Join_now_button);
		click(Join_now_button);

		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown validation successful");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");
	
//	String[] Country_Values = {"ALL","USA", "Canada"};
	String[] country_values=values.split(",");

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
//			  Assert.assertTrue(false);
			 
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
		click(menu);
		Thread.sleep(200);
//		Element_isdisplayed(menu);
		Element_isdisplayed(Join_now_button);
		click(Join_now_button);

		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown validation successful");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());

	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	Element_isdisplayed(ByStateorprovince_dropdown);

	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//	String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
	String[] State_values=dropdown_values.split(",");
	Thread.sleep(100);
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
	 int count=0;
	 List<WebElement> options = select1.getOptions(); 
//	 for (String w : State_values) {
//		 System.out.print(w);
//	}
//	 for(WebElement we:options)  
//	 	{ 
//
//	  for (int i=0; i<State_values.length; i++)
//	  	{
//		  
//		  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//		  	{
//			  count++;
//		  
//
//		  Log.info(we.getText()+" value matched");
//		  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//		  	}
//		  
//	    }
	 
	  
	  ArrayList<String> mylist = new ArrayList<String>();
//	Boolean b=	 mylist.equals(State_values);
		 for(WebElement we:options)  
		 	{  
			 Thread.sleep(100);
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
	  
//	 	} 
	   if (count == State_values.length && mylist.size()==State_values.length) 
	    {	
	        Log.info("All values matched successfully in the state dropdown");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//	        Assert.assertTrue(true);
	     } else 
	    {	
	        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
	        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
//	        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
	        
	        throw new Exception("All values not matched successfully in the state dropdown");
	    }
	 } 
	Thread.sleep(100);
}


public void Validate_ByStateorprovince_values_Canada(String Value, String dropdown_values, String country) throws Exception
{
	if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_CANADA"))
	{
		click(menu);
		Thread.sleep(200);
//		Element_isdisplayed(menu);
		Element_isdisplayed(Join_now_button);
		click(Join_now_button);

		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown validation successful");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());

	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	Element_isdisplayed(ByStateorprovince_dropdown);

	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//	String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
	String[] State_values=dropdown_values.split(",");
	Thread.sleep(100);
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
	 int count=0;
	 
	 List<WebElement> options = select1.getOptions(); 
//	 for (String w : State_values) {
//		 System.out.print(w);
//	}
//	 for(WebElement we:options)  
//	 	{ 
//
//	  for (int i=0; i<State_values.length; i++)
//	  	{
//		  
//		  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//		  	{
//			  count++;
//		  
//
//		  Log.info(we.getText()+" value matched");
//		  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//		  	}
//		  
//	    }
	 
	  
	  ArrayList<String> mylist = new ArrayList<String>();
//	Boolean b=	 mylist.equals(State_values);
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
	  
//	 	} 
	   if (count == State_values.length && mylist.size()==State_values.length) 
	    {	
	        Log.info("All values matched successfully in the state dropdown");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//	        Assert.assertTrue(true);
	     } else 
	    {	
	        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
	        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
//	        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
	        
	        throw new Exception("All values not matched successfully in the state dropdown");
	    }
	 } 
	Thread.sleep(100);
}


public void Validate_ByStateorprovince_values_USA(String Value, String dropdown_values, String country) throws Exception
{
	if (Value.equalsIgnoreCase("ByStateorprovince_dropdown_USA"))
	{
		click(menu);
		Thread.sleep(200);
//		Element_isdisplayed(menu);
		Element_isdisplayed(Join_now_button);
		click(Join_now_button);

		Log.info("Join_now_button clicked successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
		
		Element_isdisplayed(Country_dropdown);
		Log.info("Country dropdown validation successful");
		ExtentTestManager.getTest().log(Status.PASS, "Country dropdown field is displayed successfully");

	 Select select = new Select(driver.findElement(Country_dropdown));
	 if(!select.getFirstSelectedOption().getText().equalsIgnoreCase(country.trim()))
		 select.selectByValue(country.trim());

	Log.info("Country dropdown value: "+country.trim()+" is selected successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Country dropdown value: "+country.trim()+"is selected successfully");
	Element_isdisplayed(ByStateorprovince_dropdown);

	Log.info("By State or province dropdown field  is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//	String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
	String[] State_values=dropdown_values.split(",");
	Thread.sleep(100);
	 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
	 int count=0;
	 List<WebElement> options = select1.getOptions(); 
//	 for (String w : State_values) {
//		 System.out.print(w);
//	}
//	 for(WebElement we:options)  
//	 	{ 
//
//	  for (int i=0; i<State_values.length; i++)
//	  	{
//		  
//		  if(we.getText().equalsIgnoreCase(State_values[i].trim()))
//		  	{
//			  count++;
//		  
//
//		  Log.info(we.getText()+" value matched");
//		  ExtentTestManager.getTest().log(Status.PASS, we.getText()+" value matched");
//		  	}
//		  
//	    }
	 
	  
	  ArrayList<String> mylist = new ArrayList<String>();
//	Boolean b=	 mylist.equals(State_values);
		 for(WebElement we:options)  
		 	{  
			 Thread.sleep(100);
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
	  
//	 	} 
	   if (count == State_values.length && mylist.size()==State_values.length) 
	    {	
	        Log.info("All values matched successfully in the state dropdown");
	        ExtentTestManager.getTest().log(Status.PASS, "All values matched successfully in the country dropdown");
//	        Assert.assertTrue(true);
	     } else 
	    {	
	        Log.error("All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
	        ExtentTestManager.getTest().log(Status.FAIL, "All values not matched successfully in the state dropdown. Expected dropdown list [ "+dropdown_values +" ] Actual dropdown list [ "+res+" ]");
//	        Assert.assertTrue(false, "All values not matched successfully in the ByState province dropdown");
	        
	        throw new Exception("All values not matched successfully in the state dropdown");
	    }
	 } 
	Thread.sleep(100);
}


public void Validate_listofclubs(String Value, String dropdown_values, String country) throws Exception
{
	if (Value.equalsIgnoreCase("Listofclubs"))
	{
	click(menu);
	Thread.sleep(200);
	Element_isdisplayed(Join_now_button);
	click(Join_now_button);
	ExtentTestManager.getTest().log(Status.PASS, "Join_now_button clicked successfully");
	Log.info("Join_now_button clicked successfully");
	Thread.sleep(200);
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
	 Thread.sleep(500);
	 int clb_count= Integer.parseInt(driver.findElement(club_count).getText().trim());
	 String club_result_text= driver.findElement(club_result_total).getText();
	 if(club_result_text.contains(dropdown_values.trim())) {
		 Log.info(dropdown_values.trim()+" contains in the results \n" +club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results \n"+club_result_text );
//		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results \n"+ (club_result_text));
//		 ExtentTestManager.getTest().log(Status.FAIL, dropdown_values.trim()+" not contains in the results \n" + club_result_text );
//		 Assert.assertEquals(dropdown_values.trim().toUpperCase(), club_result_text.toUpperCase());
//		 Assert.assertTrue(false, dropdown_values.trim()+" not contains in the results \n"+ club_result_text);
		 throw new Exception(dropdown_values.trim()+" not contains in the results \n"+ club_result_text);
	 }
	 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
//	 int club_results_count=club_result_rows.size();
	 Thread.sleep(200);
	 int count=0;
	 for(WebElement we:club_result_rows)  
	 	{ 
		 
//		 Log.info(we.getText());
		 
		 String[] club_address=we.findElement(clb_address).getText().split(",");
		  if(club_address[1].contains(dropdown_values.trim()))
		  	{
			  count++;
		  	}
		  
	    }
	 scrolltomiddle();
	 if (clb_count == count) 
	    {	
		 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
	        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());

	     } 
	 else 
	      {	
		 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim());
		 	ExtentTestManager.getTest().log(Status.FAIL, "All the clubs not displayed for the state: "+dropdown_values.trim());
	    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());

	      }
	
//	 
//	 	} 
//	   
	 }
	Thread.sleep(200);
}



public void Validate_clubs_name_address_photo_joinbutton(String Value, String dropdown_values, String country, String device) throws Exception
{
	if (Value.equalsIgnoreCase("club_details"))
	{
		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
			click(menu);
			Thread.sleep(200);
			joinnow.Validate_clubs_name_address_photo_joinbutton(Value,dropdown_values, country );
		}
		else {
				click(menu);
				Thread.sleep(200);
				Element_isdisplayed(Join_now_button);
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
			//		 Log.info(club_result_text);
			//		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
					 Assert.assertTrue(true);
				 }
				 else
				 {
					 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
					 throw new Exception(dropdown_values.trim()+" not contains in the results");
				 }
			
			//	
				 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
				 int listSize = driver.findElements(club_list_rows).size();
				 int count=0;
				 for(WebElement we:club_result_rows)  
				 	{ 
					 
//					 Log.info(we.getText());
					 
					 String[] club_address=we.findElement(clb_address).getText().split(",");
					  if(club_address[1].contains(dropdown_values.trim()))
					  	{
						  count++;
					  	}
					  
				    }
				
				 for(int i=1; i<=listSize; i++)  
				 	{
					 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
					 By club_address=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[2]/div[1]");
					 int j=i-1;
					 By clb_img= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_imgClub");
					 By m_jointhisclub_button= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin");
					 
					 
					 if(i==1)	{
						 System.out.println("By default first club is selected");
			//			 clubs_name_address_photo_joinbutton(name_link, club_address, clb_img, m_jointhisclub_button);
					 			}
			
					 else {
						 	Thread.sleep(200);
						 	Element_isdisplayed(name_link);
						 	 click(name_link);
						 	Thread.sleep(200);
			//			 	 clubs_name_address_photo_joinbutton(name_link, club_address, clb_img, m_jointhisclub_button);
			
					 		}
					 
					 String club_name_text=driver.findElement(name_link).getText();
					 MoveToElement(m_jointhisclub_button);
					 Element_isdisplayed(club_address);
					 Thread.sleep(200);
					 
					 WebElement d =driver.findElement(club_address);
					 Log.info("Club name followed by address and phone number is validated successfully: \n"+club_name_text+"\n"+d.getText());
					 ExtentTestManager.getTest().log(Status.PASS, "Club name followed by address and phone number is validated successfully: \n"+club_name_text+"\n"+d.getText());
					 
					
					 Element_isdisplayed(clb_img);
					Log.info("Club image is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Club image is displayed successfully");
					
					Element_isdisplayed(m_jointhisclub_button);
					Log.info("Join this club button is displayed successfully");
					ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
					 
					 
					 
				 	}
					 if (clb_count == count) 
					    {	
						 	Log.info("All the clubs successfully displayed for the state: "+dropdown_values.trim());
					        ExtentTestManager.getTest().log(Status.PASS, "All the clubs successfully displayed for the state: "+dropdown_values.trim());
					     } 
					 else 
					      {	
						 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			
					    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			
					      }		   
		}
	 }
	Thread.sleep(100);
}



public void Validate_clubs_buttons(String Value, String dropdown_values, String country, String device) throws Exception
{
	if (Value.equalsIgnoreCase("clubs_buttons"))
	{
		

		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
			click(menu);
			Thread.sleep(200);
			joinnow.Validate_clubs_buttons(Value,dropdown_values, country );
		}
		else {	
					click(menu);
					Thread.sleep(200);
					Element_isdisplayed(Join_now_button);
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
				//		 Log.info(club_result_text);
				//		 ExtentTestManager.getTest().log(Status.PASS, club_result_text );
						 Assert.assertTrue(true);
					 }
					 else
					 {
						 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
						 throw new Exception(dropdown_values.trim()+" not contains in the results");
					 }
				
				//	
					 int listSize = driver.findElements(club_list_rows).size();
				//	 int count=0;
					
					 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
					 int count=0;
					 for(WebElement we:club_result_rows)  
					 	{ 
						 
//						 Log.info(we.getText());
						 
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
					     } 
					 else 
					      {	
						 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			
					    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			
					      }
					 
					 for(int i=1; i<=listSize; i++)  
					 	{
						 
						 
						 
						 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
						 By club_address=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[2]/div[1]");
						 int j=i-1;
						 By clb_img= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_imgClub");
						 By m_jointhisclub_button= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin");
						 By clubrate_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnRate");
						 By clubhour_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnClubHour");
						 By kidsclubhour_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnKidHour");
						 By classschedule_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnClass");
						 By joinclub_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin2");
				//		 By m_jointhisclub_button= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin");
						 	 
						 
						 if(i==1)	{
							 System.out.println("By default first club is selected");
				//			 clubs_name_address_photo_joinbutton(name_link, club_address, clb_img, m_jointhisclub_button);
						 			}
				
						 else {
							 	Thread.sleep(200);
							 	Element_isdisplayed(name_link);
							 	 click(name_link);
							 	Thread.sleep(200);
				//			 	 clubs_name_address_photo_joinbutton(name_link, club_address, clb_img, m_jointhisclub_button);
				
						 		}
						 
						 String club_name_text=driver.findElement(name_link).getText();
						 MoveToElement(m_jointhisclub_button);
						 Element_isdisplayed(club_address);
						 Thread.sleep(200);
						 
						 WebElement d =driver.findElement(club_address);
						 Log.info("Club name followed by address and phone number is validated successfully: \n"+club_name_text+"\n"+d.getText());
						 ExtentTestManager.getTest().log(Status.PASS, "Club name followed by address and phone number is validated successfully: \n"+club_name_text+"\n"+d.getText());
						 
						
						 Element_isdisplayed(clb_img);
						Log.info("Club image is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Club image is displayed successfully");
						
						Element_isdisplayed(m_jointhisclub_button);
						Log.info("Join this club button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
						 
						
						
						Element_isdisplayed(clubrate_btn);
						
						MoveToElement(clubrate_btn);
						
						Log.info("Club rate button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Club rate button is displayed successfully");
						
						Element_isdisplayed(clubhour_btn);
						Log.info("Club hour button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Club hour button is displayed successfully");
						
						Element_isdisplayed(kidsclubhour_btn);
						Log.info("Kids club hour button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Kids club hour button is displayed successfully");
						
						Element_isdisplayed(classschedule_btn);
						Log.info("Class schedule button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Class schedule button is displayed successfully");
						
						Element_isdisplayed(joinclub_btn);
						Log.info("Join club button is displayed successfully");
						ExtentTestManager.getTest().log(Status.PASS, "Join club button is displayed successfully");
						 
						 
					 	}
							   
						
					 }
	Thread.sleep(100);
}

}


public void Validate_club_ratesandamenities(String Value, String dropdown_values, String country,String clubname, String device) throws Exception
	{
		if (Value.equalsIgnoreCase("club_ratesandamenities"))
		{


			if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
				click(menu);
				Thread.sleep(200);
				joinnow.Validate_club_ratesandamenities(Value,dropdown_values, country, clubname );
			}
			else {	
						click(menu);
						Thread.sleep(200);
						Element_isdisplayed(Join_now_button);
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
							 Assert.assertTrue(true);
						 }
						 else
						 {
							 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);
							 throw new Exception(dropdown_values.trim()+" not contains in the results");
						 }

						
						 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
						 int count=0;
						 for(WebElement we:club_result_rows)  
						 	{ 
							 
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
						     } 
						 else 
						      {	
							 	Log.error("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
				
						    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
				
						      }	
						 int listSize = driver.findElements(club_list_rows).size();
						 int count1=0;
						 for(int i=1; i<=listSize; i++)  
						 	{
								
							 int j=i-1;
							 
							 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
							By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
							 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
							
							 Thread.sleep(200);
							 Element_isdisplayed(name_link);
							 String club_name_text=driver.findElement(name_link).getText();
							 
				if (club_name_text.equalsIgnoreCase(clubname.trim()))
				 {
					 if(i==1)	
					 		{
						 	Log.info("club "+clubname+" is selected");
							ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
							
							ratesandamenities(club_rates_section, club_amenities_section );
							
							count1++;
							break;
							
					 		}
					 else {

						 	MoveToElement(name_link);
							click(name_link);
							Log.info("club "+clubname+" is selected");
							ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						 	scrolltotop();
						 	
						 	ratesandamenities(club_rates_section1, club_amenities_section1 );
						 	
						 	count1++;
						 	break;
					 		}
				 }
				 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
				 {
					 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
						
						ratesandamenities(club_rates_section, club_amenities_section );
						
						count1++;
						break;
				 }
				
				
				 }
			   
			 if(count1==0) {
					Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

					throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
				}
			 }
							 
						   
							
						 
		Thread.sleep(500);
	}
	}



public void ratesandamenities(By Rates_s, By amenities_s) throws Exception {
	
	Element_isdisplayed(Rates_s);
	MoveToElement(Rates_s);
	String rates= driver.findElement(Rates_s).getText().replace("\n", " ").trim();
	Log.info("Club rates section is displayed successfully \n"+rates);
	ExtentTestManager.getTest().log(Status.PASS, "Club rates section is displayed successfully \n"+rates);
	
	Element_isdisplayed(amenities_s);
	String amenities= driver.findElement(amenities_s).getText().replace("\n", " ");
	Log.info("Club amenities / features section is displayed successfully \n"+amenities);
	ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features section is displayed successfully \n"+amenities);
	MoveToElement(amenities_s);
}


	public void Validate_club_rateplans(String Value, String dropdown_values, String country, String rates, String clubname, String device) throws Exception
	{
		if (Value.equalsIgnoreCase("club_rateplans"))
		{

		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
				click(menu);
				Thread.sleep(200);
				joinnow.Validate_club_rateplans(Value,dropdown_values, country, rates, clubname );
		}
		else 
		{	
			
		click(menu);
		Thread.sleep(200);
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
			
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
//			 int j=i-1;
			 
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//			By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
			 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
			
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();
			 	

			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						validate_rates_section(rates, club_rates_section);
						count++;
						break;
						
				 		}
				 else {

					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	validate_rates_section(rates, club_rates_section1);
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					validate_rates_section(rates, club_rates_section);
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			
		 
		}
		 }
		Thread.sleep(100);
	}
		
	
	public void validate_rates_section(String rates, By rates_s) throws Exception {
		
		
			Element_isdisplayed(rates_s);
			MoveToElement(rates_s);
//			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
			String rates_section= driver.findElement(rates_s).getText().replaceAll("\n+", " ").trim();
			
				if(rates_section.toUpperCase().contains(rates.trim().toUpperCase())) {
				
					Log.info("Club rates validated successfully \n"+ rates);
					ExtentTestManager.getTest().log(Status.PASS, "Club rates validated successfully \n"+rates);
				}
				
				else 
				{
					Log.error("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
//					ExtentTestManager.getTest().log(Status.FAIL, "Club rates not validated successfully \n Expected: "+ rates+"\n Actual: "+rates_section);
					throw new Exception("Club rates not validated successfully \n Expected: [ "+ rates+" ] \n Actual: [ "+rates_section+" ]");
				}
				
		
	}

	public void validate_amenities_section(String amenities, By amen_s) throws Exception {
		
		int count=0;
	 	
		Element_isdisplayed(amen_s);
		Log.info("Club amenities / features are displayed successfully \n"+amenities);
		ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features are displayed successfully \n"+amenities);

//		String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
		String features_section= driver.findElement(amen_s).getText().replaceAll("\n+", " ").trim();
		MoveToElement(amen_s);
//		System.out.println("Amenities:"+features_section);
		String[] amenities_s = amenities.split(",");
		for (String features : amenities_s)
		{
			
			if(features_section.toUpperCase().trim().contains(features.toUpperCase().trim())) {
				
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
	


	public void Validate_club_Amenities(String Value, String dropdown_values, String country,  String amenities, String clubname, String device) throws Exception
	{
		if (Value.equalsIgnoreCase("club_Amenities"))
		{

		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
				click(menu);
				Thread.sleep(200);
				joinnow.Validate_club_Amenities(Value,dropdown_values, country, amenities, clubname );
		}
		else 
		{	
			
		click(menu);
		Thread.sleep(200);
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
			
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 int j=i-1;
			 
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
			By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
//			 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
			
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();
			 	

			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						validate_amenities_section(amenities, club_amenities_section1);
						count++;
						break;
						
				 		}
				 else {

					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	validate_amenities_section(amenities, club_amenities_section1);
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					validate_amenities_section(amenities, club_amenities_section1);
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			
		 
		}
		 }
		Thread.sleep(100);
	}
		

	public void clickOnjointhisclubbutton(By club_button) throws Exception {
		Element_isdisplayed(club_button);
	 	Log.info("Join this club button is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Join this club button is displayed successfully");
		MoveToElement(club_button);
		Thread.sleep(200);
		click(club_button);
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
//		Element_isdisplayed(steptwo_img);
//		Log.info("Select a Membership Plan section displayed successfully");
//		ExtentTestManager.getTest().log(Status.PASS, "Select a Membership Plan section displayed successfully");
	}



	public void Validate_joinnow_steptwo(String Value, String dropdown_values, String country,  String clubname, String device) throws Exception
	{
		if (Value.equalsIgnoreCase("Joinnow_steptwo"))
		{

		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
				click(menu);
				Thread.sleep(200);
				joinnow.Validate_joinnow_steptwo(Value,dropdown_values, country, clubname );
		}
		else 
		{	
			
		click(menu);
		Thread.sleep(200);
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
			
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 int j=i-1;
			 
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//			By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
//			 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
			 By joinclub_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin2");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();
			 	

			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton(joinclub_btn);
						count++;
						break;
						
				 		}
				 else {

					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton(joinclub_btn);
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton(joinclub_btn);
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			
		 
		}
		 }
		Thread.sleep(100);
	}
		


	public void Validate_selectadditionalfeatues_yourhomeclub(String Value, String dropdown_values, String country,  String clubname, String device) throws Exception
	{
		if (Value.equalsIgnoreCase("selectadditionalfeatues_yourhomeclub"))
		{

		if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
				click(menu);
				Thread.sleep(200);
				joinnow.Validate_selectadditionalfeatues_yourhomeclub(Value,dropdown_values, country, clubname );
		}
		else 
		{	
			
		click(menu);
		Thread.sleep(200);
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
			
		 }
		 else
		 {
			 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
			 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
		 }

		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count=0;
			
		 for(int i=1; i<=listSize; i++)  
		 	{
			
			 int j=i-1;
			 
			 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//			By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
//			 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
			 By joinclub_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin2");
			 Thread.sleep(200);
			 Element_isdisplayed(name_link);
			 String club_name_text=driver.findElement(name_link).getText();
			 	

			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						clickOnjointhisclubbutton(joinclub_btn);
						additionalfeatues_yourhomeclub_sections();
						count++;
						break;
						
				 		}
				 else {

					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	clickOnjointhisclubbutton(joinclub_btn);
					 	additionalfeatues_yourhomeclub_sections();
					 	count++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton(joinclub_btn);
					additionalfeatues_yourhomeclub_sections();
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

				throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
			}
			
		 
		}
		 }
		Thread.sleep(100);
	}
	
	
public void additionalfeatues_yourhomeclub_sections() throws Exception {
	
	Element_isdisplayed(selectadditionalfeatures_h);
	MoveToElement(selectadditionalfeatures_h);
	Log.info("Select additional features section is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
	
	Element_isdisplayed(yourhomeclub_h);
	MoveToElement(yourhomeclub_h);
	Log.info("Your homeclub section is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
}


public	void validate_AF_MR(String Monthly_rates) throws Exception {

 	Element_isdisplayed(Additionalfeatures_b);
 	
 	Log.info("Select additional features section is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
	String monthlyratestext=driver.findElement(Additionalfeatures_b).getText().replaceAll("\n+", " ").trim();
	String[] monthlyrates=Monthly_rates.split(",");
//	 System.out.println("Rates :"+monthlyratestext);
	
	for (String m_rates : monthlyrates) 
	{
		if(monthlyratestext.toUpperCase().contains(m_rates.toUpperCase().trim())) {
			
			Log.info(m_rates+" validated successfully");
			ExtentTestManager.getTest().log(Status.PASS, m_rates+" validated successfully");
		}
		else
		{
			Log.error("Club rates validation failed. Expected [ "+ Monthly_rates +" ] Actual ["+monthlyratestext+" ]");
//			ExtentTestManager.getTest().log(Status.FAIL, m_rates+" not displayed");
			throw new Exception("Club rates validation failed. Expected [ "+ Monthly_rates +" ] Actual ["+monthlyratestext+" ]");
		}
		
		
	}
}


public void Validate_Additionalfeatures_monthlyrates(String Value, String dropdown_values, String country,  String clubname, String Monthly_rates, String device) throws Exception
{
	if (Value.equalsIgnoreCase("Additionalfeatures_monthlyrates"))
	{

	if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
			click(menu);
			Thread.sleep(200);
			joinnow.Validate_Additionalfeatures_monthlyrates(Value,dropdown_values, country, clubname , Monthly_rates);
	}
	else 
	{	
		
	click(menu);
	Thread.sleep(200);
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
		
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 int j=i-1;
		 
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//		By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
//		 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
		 By joinclub_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin2");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();
		 	

		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton(joinclub_btn);
					additionalfeatues_yourhomeclub_sections();
					validate_AF_MR(Monthly_rates);
					count++;
					break;
					
			 		}
			 else {

				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton(joinclub_btn);
				 	additionalfeatues_yourhomeclub_sections();
				 	validate_AF_MR(Monthly_rates);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton(joinclub_btn);
				additionalfeatues_yourhomeclub_sections();
				validate_AF_MR(Monthly_rates);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	 
	}
	 }
	Thread.sleep(100);
}



public void Validate_select_monthlyrates_$36_99_details(String Value, String dropdown_values, String country,  String clubname,  String plan_rates,  String Number_of_Persons1, String Initiation_Fee, String Billing_Frequency, String Initial_Term, String Prepayment, String device) throws Exception
{
	if (Value.equalsIgnoreCase("monthlyrates_$36_99_details"))
	{

	if(device.toUpperCase().trim().contains("iPad".toUpperCase())) {
			click(menu);
			Thread.sleep(200);
			joinnow.Validate_select_monthlyrates_$36_99_details(Value,dropdown_values, country, clubname , plan_rates,Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
	}
	else 
	{	
		
	click(menu);
	Thread.sleep(200);
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
		
	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text); 
		 throw new Exception(dropdown_values.trim()+" not contains in the results: "+club_result_text);
	 }

	 int listSize = driver.findElements(club_list_rows).size();
	 
	 int count=0;
		
	 for(int i=1; i<=listSize; i++)  
	 	{
		
		 int j=i-1;
		 
		 By name_link=By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[1]/div[1]/div[1]/a[1]");
//		By club_amenities_section1=By.xpath("//ul[@id='ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_clubAmenity_luClubAmenities']");
//		 By club_rates_section1=By.xpath("//body/form[@id='form1']/div[3]/div[2]/div[4]/div[6]/div[1]/div[1]/div[2]/div["+i+"]/div[2]/div[6]/div[1]/div[1]/div[2]");
		 By joinclub_btn= By.id("ctl00_MainContent_Repeater1_ctl0"+j+"_ClubDetailTemplateInner_btnJoin2");
		 Thread.sleep(200);
		 Element_isdisplayed(name_link);
		 String club_name_text=driver.findElement(name_link).getText();
		 	

		 if (club_name_text.equalsIgnoreCase(clubname.trim()))
		 {
			 if(i==1)	
			 		{
				 	Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					clickOnjointhisclubbutton(joinclub_btn);
					additionalfeatues_yourhomeclub_sections();
					validate_Select_MR_36_99(plan_rates,Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
					count++;
					break;
					
			 		}
			 else {

				 	MoveToElement(name_link);
					click(name_link);
					Log.info("club "+clubname+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
				 	scrolltotop();
				 	clickOnjointhisclubbutton(joinclub_btn);
				 	additionalfeatues_yourhomeclub_sections();
				 	validate_Select_MR_36_99(plan_rates,Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton(joinclub_btn);
				additionalfeatues_yourhomeclub_sections();
				validate_Select_MR_36_99(plan_rates,Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");

			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	 
	}
	 }
	Thread.sleep(100);
}



public void select_rates(String rates) throws Exception {
	
	Element_isdisplayed(monthly_$_36_99);
 	Element_isdisplayed(monthly_$_46_99);
 	if(driver.findElement(monthly_$_36_99).getText().contains(rates)) {
 		Thread.sleep(200);
 	if(!driver.findElement(monthly_$_36_99).isSelected()) { 
 		
 		MoveToElement(monthly_$_36_99);
 		click(monthly_$_36_99);
 	
 	Log.info("Selected "+rates+" Monthly Rate successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Selected "+rates+" Monthly Rate successfully");
 	}
 	}
 	else if(driver.findElement(monthly_$_46_99).getText().contains(rates)) {
 		Thread.sleep(200);
 		
 		if(!driver.findElement(monthly_$_46_99).isSelected()) {
 			MoveToElement(monthly_$_46_99);
 			click(monthly_$_46_99);
 		Log.info("Selected "+rates+" Monthly Rate successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Selected "+rates+" Monthly Rate successfully");
	}}
 	else {
		throw new Exception(" Rate plan :"+rates+" not matched");
	}
	
}


public	void validate_Select_MR_36_99(String plan_rates, String Number_of_Persons1, String Initiation_Fee, String Billing_Frequency, String Initial_Term, String Prepayment1) throws Exception {
	
	select_rates(plan_rates.trim());
 	
	Element_isdisplayed(No_of_Persons_dropdown);
	Log.info("Number of Persons dropdown displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
//	String[] details=Rates_details.split(",");
	String dropdowninput= Number_of_Persons1.trim();
	String initiationfee_input= Initiation_Fee.trim();
	String Billing_frequency_input= Billing_Frequency.trim();
	String initial_term_input= Initial_Term.trim();
	String Prepayment_input= Prepayment1.trim();
	
	Select monthly_dropdown = new Select(driver.findElement(No_of_Persons_dropdown));
//	1 for $36.99/month
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




}
