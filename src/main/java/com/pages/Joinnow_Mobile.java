package com.pages;


import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import com.Utility.Log;

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


public void Validate_clubs_name_address_photo_joinbutton(String Value, String dropdown_values, String country) throws Exception
{
	if (Value.equalsIgnoreCase("club_details"))
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
		 Log.info(dropdown_values.trim()+" contains in the results: "+club_result_text);
		 ExtentTestManager.getTest().log(Status.PASS, dropdown_values.trim()+" contains in the results: "+club_result_text );

	 }
	 else
	 {
		 Log.error(dropdown_values.trim()+" not contains in the results: "+club_result_text);

		 throw new Exception(dropdown_values.trim()+" not contains in the results");
	 }

	 int listSize = driver.findElements(club_list_rows).size();
//	 int count=0;
	
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
		 
//		 club_result_rows.get(i);
			if(clb_text.equalsIgnoreCase(club_address_desktop))
			{
					Log.info("Club name followed by address and phone number is validated successfully: \n"+element.getText());
					ExtentTestManager.getTest().log(Status.PASS, "Club name followed by address and phone number is validated successfully: \n"+element.getText());
			  		Assert.assertTrue(true);
			}

			else {
					Log.error("Club name followed by address and phone number is not validated: \n"+element.getText());
//					ExtentTestManager.getTest().log(Status.FAIL, "Club name followed by address and phone number is not validated: \n"+element.getText());
//					Assert.assertTrue(false, "Club name followed by address and phone number is not validated: \n"+element.getText());
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
//		 	ExtentTestManager.getTest().log(Status.PASS, "All the clubs not displayed for the state: "+dropdown_values.trim());
//	    	Assert.assertTrue(false,"All the clubs not displayed for the state: "+dropdown_values.trim());
	    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim());

	      }		   
	 }
	Thread.sleep(100);
}







}
