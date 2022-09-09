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
	private static By Join_now_button_m = By.xpath("//div[@class='w-100 join-now']//a[@title='JOIN NOW']");
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
	private static By club_rates_section  = By.xpath("//body[1]/form[1]/div[3]/div[2]/div[4]/div[6]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]");
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
	private static By back_buttonl3= By.id("ctl00_MainContent_btnBackToPlan");
	
	private static By FName_error= By.id("ctl00_MainContent_vtxtFName");
	private static By LName_error= By.id("ctl00_MainContent_vtxtLName");
	private static By Phone_error= By.id("ctl00_MainContent_vtxtPhone");
	private static By Address_error= By.id("ctl00_MainContent_vtxtAddress");
	private static By Email_error= By.id("ctl00_MainContent_vtxtEmail");
	private static By invalid_Email_error= By.id("ctl00_MainContent_vvtxtEmail");
	private static By ConfirmEmail_error= By.id("ctl00_MainContent_vtxtConfirmEmail");
	private static By invalid_ConfirmEmail_error= By.id("ctl00_MainContent_vvtxtConfirmEmail");
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
	private static By invalid_CardNumber=By.xpath("//span[contains(text(),'Invalid credit card number')]");
	private static By CardNumber_required=By.xpath("//span[contains(text(),'Card number is required')]");
	
												
	private static By exp_month=By.id("ctl00_MainContent_BillingInfoUserControl_cboMonth");
	private static By invalid_ex_month=By.xpath("//span[contains(text(),'Card Expiration Month is required')]");
	private static By invalid_exp_year=By.xpath("//span[contains(text(),'Card Expiration Year is required')]");
	private static By invalid_exp_month=By.xpath("//span[contains(text(),'Please provide a valid Expiration Date')]");
	
	private static By exp_year=By.id("ctl00_MainContent_BillingInfoUserControl_cboYear");
	
	private static By RoutingNumber=By.id("ctl00_MainContent_BillingInfoUserControl_txtRoutingNumber");
	private static By AccountNumber=By.id("ctl00_MainContent_BillingInfoUserControl_txtAccountNumber");
	
	
	private static By InitMessag = By.id("ctl00_MainContent_lblInitMessage");
	private static By recurring_dues = By.xpath("//div[contains(text(),'Recurring Dues')]");


	private static By recurring_dues_price = By.id("ctl00_MainContent_lblRecurring");
	private static By annualfeeperpersion1 = By.id("ctl00_MainContent_divLowDuesFee_Name");
	private static By annualfeeperpersion1_price = By.id("ctl00_MainContent_lblLowDuesFeeAmount");
	private static By initiation_fee_p = By.xpath("//div[contains(text(),'Initiation Fee')]");
	private static By initiationFee_price = By.id("ctl00_MainContent_lblInitiationFee");
	private static By prepaid_dues_first_month  = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]");
	private static By prepaid_dues_first_month_price = By.id("ctl00_MainContent_lblTotalPrePaidDues");

	private static By tax_for_initiation_prepaid_dues = By.id("ctl00_MainContent_lblTaxRate");
	private static By tax_for_initiation_prepaid_dues_price = By.id("ctl00_MainContent_lblTaxAmount");
	private static By total_amount_due_today = By.xpath("//div[contains(text(),'Total Amount Due Today:')]");
	private static By total_amount_due_today_price = By.id("ctl00_MainContent_lblTotalAmount");
	private static By Member_info = By.id("divMemberInfo");
	private static By Billing_info = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]");
	private static By Payment_info = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[1]/div[2]/div[3]");
	private static By Monthlydues_billing_info = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]");
	private static By Monthlydues_payment_info = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[1]/div[3]/div[1]/div[3]");
	private static By initial_payment_amount  = By.id("divMembershipPlan");
//	private static By Member_information = By.id("divMemberInfo");
	private static By Your_home_club = By.id("divYourHomeClub");
	private static By inc_amenities = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[9]");
	private static By mem_agreement = By.id("divAgreement");
	private static By menu = By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/nav[1]/div[4]/div[3]/a[2]/img[1]");
	
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
//	
		 
		  
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
		Thread.sleep(200);
		Element_isdisplayed(ByStateorprovince_dropdown);
		Log.info("By State or province dropdown field  is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "By State or province dropdown field  is displayed successfully");
//		String[] State_values = {"","AB","AZ","CA","CT","DE","FL","GA","IL","IN","MA","MD","MI","MN","NC","NJ","NY","ON","OR","PA","RI","TX","VA","WA"};
		
		Thread.sleep(200);
		 Select select1 = new Select(driver.findElement(ByStateorprovince_dropdown));  
		 int count=0;
		 List<WebElement> options = select1.getOptions(); 
	 
		 
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
		        
		        throw new Exception("All values not matched successfully in the state dropdown");
		    }
		 
		 

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
		    } else 
		    {	
		    	
		    	Log.error("All values not matched successfully in the country dropdown");
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
			 throw new Exception(dropdown_values.trim()+" not contains in the results \n"+ club_result_text);
		 }
		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
		 
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
		     } 
		 else 
		      {	
			 	Log.info("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			 	
		    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);

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
		if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
		else click(Join_now_button_m);
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

		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
		 int listSize=club_result_rows.size();
		 
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
		Thread.sleep(100);
	}
	

	
	
	public void Validate_clubs_buttons(String Value, String dropdown_values, String country) throws Exception
	{
		if (Value.equalsIgnoreCase("clubs_buttons"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
		
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
	
	

	public void Validate_club_ratesandamenities(String Value, String dropdown_values, String country, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("club_ratesandamenities"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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

		 List<WebElement > club_result_rows=driver.findElements(club_list_rows);
		 
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
		     } 
		 else 
		      {	
			 	Log.info("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);
			 	
		    	throw new Exception("All the clubs not displayed for the state: "+dropdown_values.trim() +"Expected count :" +clb_count + " Acutal validated count: "+ count);

		      }
		 
		 
		 
		 int listSize = driver.findElements(club_list_rows).size();
		 
		 int count1=0;
			
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
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						ratesandamenities();
						count1++;
						break;
						
				 		}
				 else {

					 	MoveToElement(name_link);
						click(name_link);
						Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
					 	scrolltotop();
					 	ratesandamenities();
					 	count1++;
					 	break;
				 		}
			 }
			 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					ratesandamenities();
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
	
	public void ratesandamenities() throws Exception {
		
		Element_isdisplayed(club_rates_section);
		MoveToElement(club_rates_section);
		String rates= driver.findElement(club_rates_section).getText().replace("\n", " ").trim();
		Log.info("Club rates section is displayed successfully \n"+rates);
		ExtentTestManager.getTest().log(Status.PASS, "Club rates section is displayed successfully \n"+rates);
		
		Element_isdisplayed(club_amenities_section);
		String amenities= driver.findElement(club_amenities_section).getText().replace("\n", " ");
		Log.info("Club amenities / features section is displayed successfully \n"+amenities);
		ExtentTestManager.getTest().log(Status.PASS, "Club amenities / features section is displayed successfully \n"+amenities);
		MoveToElement(club_amenities_section);
	}
	
	
	public void Validate_club_rateplans(String Value, String dropdown_values, String country, String rates, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("club_rateplans"))
		{
		if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
		else click(Join_now_button_m);
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

			 if (club_name_text.equalsIgnoreCase(clubname.trim()))
			 {
				 if(i==1)	
				 		{
					 	Log.info("club "+clubname+" is selected");
						ExtentTestManager.getTest().log(Status.PASS, "club "+clubname+" is selected");
						validate_rates_section(rates);
						count++;
						break;
						
				 		}
				 else {

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
			
		 
	   
		 }
		Thread.sleep(100);
	}
	
	
	public void Validate_club_Amenities(String Value, String dropdown_values, String country, String amenities, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("club_Amenities"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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
			

		 
		 
	   
		 }
		Thread.sleep(500);
	}
	

	public void Validate_joinnow_steptwo(String Value, String dropdown_values, String country, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("Joinnow_steptwo"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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
//			
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
		Thread.sleep(200);
		click(joinclub_button);
		Thread.sleep(200);
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
		
		
		
//		int count=0;
//	 	String rates_S = rates.trim();
			Element_isdisplayed(club_rates_section);
//			String rates_section= driver.findElement(club_rates_section).getText().replace("\n+", " ").trim().replaceAll("\\s+", " ");
			String rates_section= driver.findElement(club_rates_section).getText().replaceAll("\n+", " ").trim();
			MoveToElement(club_rates_section);
			
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
	

	
	
	public void Validate_selectadditionalfeatues_yourhomeclub(String Value, String dropdown_values, String country, String clubname) throws Exception
	{
		if (Value.equalsIgnoreCase("selectadditionalfeatues_yourhomeclub"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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
//	
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
						
						additionalfeatues_yourhomeclub_sections();
						
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
					 	
					 	additionalfeatues_yourhomeclub_sections();
					 	
					 	count++;
					 	break;
				 		}
			 }
			 else if(clubname == null || clubname.isEmpty() ||clubname.isBlank())
			 {
				 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
					ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
					clickOnjointhisclubbutton();
				
					additionalfeatues_yourhomeclub_sections();
				
					count++;
					break;
			 }
			
			
			 }
		   
		 if(count==0) {
				Log.error("Club name did not matched with any of the clubs in the results");
//				ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
				throw new Exception("Club name did not matched with any of the clubs in the results");
			}
//		 	
			
		 }
		Thread.sleep(1000);
	}
	
	public void additionalfeatues_yourhomeclub_sections() throws Exception {
		
		Element_isdisplayed(selectadditionalfeatures_h);
		Log.info("Select additional features section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Select additional features section is displayed successfully");
		
		Element_isdisplayed(yourhomeclub_h);
		Log.info("Your homeclub section is displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Your homeclub section is displayed successfully");
	}	

	public void Validate_Additionalfeatures_monthlyrates(String Value, String dropdown_values, String country, String clubname, String Monthly_rates) throws Exception
	{
		if (Value.equalsIgnoreCase("Additionalfeatures_monthlyrates"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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
	
	

	public void Validate_select_monthlyrates_$36_99_details(String Value, String dropdown_values, String country, String clubname, String plan_rates, String Number_of_Persons1, String Initiation_Fee, String Billing_Frequency, String Initial_Term, String Prepayment ) throws Exception
	{
		if (Value.equalsIgnoreCase("monthlyrates_$36_99_details"))
		{
			if (driver.findElement(Join_now_button).isDisplayed()) click(Join_now_button);
			else click(Join_now_button_m);
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
						validate_Select_MR_36_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
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
						validate_Select_MR_36_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
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
					validate_Select_MR_36_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
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
	 	if(!driver.findElement(monthly_$_36_99).isSelected()) { click(monthly_$_36_99);
	 	
	 	Log.info("Selected "+rates+" Monthly Rate successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Selected "+rates+" Monthly Rate successfully");
	 	}
	 	}
	 	else if(driver.findElement(monthly_$_46_99).getText().contains(rates)) {
	 		Thread.sleep(200);
	 		if(!driver.findElement(monthly_$_46_99).isSelected()) { click(monthly_$_46_99);
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
	
		String dropdowninput= Number_of_Persons1.trim();
		String initiationfee_input= Initiation_Fee.trim();
		String Billing_frequency_input= Billing_Frequency.trim();
		String initial_term_input= Initial_Term.trim();
		String Prepayment_input= Prepayment1.trim();
		
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

	public	void validate_Select_MR_46_99(String plan_rates,   String Number_of_Persons1, String Initiation_Fee, String Billing_Frequency, String Initial_Term, String Prepayment1) throws Exception {

		
		select_rates(plan_rates);
		
		Element_isdisplayed(No_of_Persons_dropdown_1);
		Log.info("Number of Persons dropdown displayed successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Number of Persons dropdown displayed successfully");
//		String[] details=Rates_details.split(",");
		String dropdowninput= Number_of_Persons1.trim();
		String initiationfee_input= Initiation_Fee.trim();
		String Billing_frequency_input=Billing_Frequency.trim();
		String initial_term_input= Initial_Term.trim();
		String Prepayment_input= Prepayment1.trim();
		
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
	
	
	public void Validate_select_monthlyrates_$36_99_yourdues_section(String Value, String dropdown_values, String country, String clubname, String plan_rates, String First_Month_Dues, String Last_Month_Dues, String Total_initial_Payment, String Annual_Fee_Per_Person) throws Exception
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
						validate_Select_MR_36_99_all_yourdues(plan_rates, First_Month_Dues ,Last_Month_Dues ,Total_initial_Payment ,Annual_Fee_Per_Person );
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
						validate_Select_MR_36_99_all_yourdues(plan_rates, First_Month_Dues ,Last_Month_Dues ,Total_initial_Payment ,Annual_Fee_Per_Person );
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
					validate_Select_MR_36_99_all_yourdues(plan_rates, First_Month_Dues ,Last_Month_Dues ,Total_initial_Payment ,Annual_Fee_Per_Person );
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

	public	void validate_Select_MR_36_99_all_yourdues(String plan_rates , String First_Month_Dues ,String Last_Month_Dues ,String Total_initial_Payment ,String Annual_Fee_Per_Person ) throws Exception {


		select_rates(plan_rates);
		
//		String[] details=all_yourdues.split(",");
//		System.out.println(details.length);
		String firstmonth_input = null;
		String lastmonth_input= null;
		String total_payment_input= null;
		String annualfee_input= null;
//		if(details.length==4){
		 firstmonth_input= First_Month_Dues.trim();
		 lastmonth_input= Last_Month_Dues.trim();
		 total_payment_input= Total_initial_Payment.trim();
		 annualfee_input= Annual_Fee_Per_Person.trim();
//
//		}
//		else {
//			Log.info("Invalid your dues input: "+all_yourdues);
//			ExtentTestManager.getTest().log(Status.PASS,  "Invalid your dues input: "+all_yourdues);
//			throw new Exception("Invalid your dues input");
//		}
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
	
	
	public void Validate_select_monthlyrates_$46_99_details(String Value, String dropdown_values, String country, String clubname, String plan_rates,String Number_of_Persons1, String Initiation_Fee, String Billing_Frequency, String Initial_Term, String Prepayment ) throws Exception
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
						validate_Select_MR_46_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
						
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
						validate_Select_MR_46_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
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
					validate_Select_MR_46_99(plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
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


	select_rates("38.99");
	
	Element_isdisplayed(back_button);
	Element_isdisplayed(continue_button);
	MoveToElement(back_button);
	

	Thread.sleep(100);
	MoveToElement(monthly_$_46_99);
	Thread.sleep(200);
	select_rates("48.99");
	Thread.sleep(200);
	Element_isdisplayed(back_button_1);
	Element_isdisplayed(continue_button_1);
	MoveToElement(continue_button_1);
	
	Log.info("Back and continue buttons are displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Back and continue buttons are displayed successfully");

 
Thread.sleep(500);

}

	

public void Verify_back_button(String previous_page_title) throws Exception{

	select_rates("38.99");

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
	Thread.sleep(200);
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
					Verify_continue_button(previous_page_title,"38.99");
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
					Verify_continue_button(previous_page_title, "38.99");
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
				Verify_continue_button(previous_page_title,"38.99");
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

		

public void Verify_continue_button(String next_page_title, String rates) throws Exception{

	select_rates(rates);

	if(driver.findElement(continue_button).isDisplayed()) {
//	Element_isdisplayed(continue_button);
	MoveToElement(continue_button);
	click(continue_button);
	}
	else {
		Element_isdisplayed(continue_button_1);
		MoveToElement(continue_button_1);
		click(continue_button_1);
	}
	Thread.sleep(200);
	String pagetitle=driver.getTitle();
	Assert.assertEquals(pagetitle.toUpperCase().trim(), next_page_title.toUpperCase().trim(), "User not navigated to next step: "+next_page_title);
	Log.info("Continue button validated successfully and navigated to next page: "+pagetitle);
	ExtentTestManager.getTest().log(Status.PASS, "Continue button validated successfully and navigated to next page: "+pagetitle);
	
	
	
	
	

 
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

		Assert.assertEquals(details.replace("\n", " ").toUpperCase().trim(), points.toUpperCase().trim(), "points under your home club not validated successfully");
		Log.info("points under your home club displayed successfully: "+details);
		ExtentTestManager.getTest().log(Status.PASS, "points under your home club displayed successfully: "+details);
		
	}
	
	

public void additionalpoints_under_yourhomeclub(String points) throws Exception {

	
	Element_isdisplayed(disclaimers);
	
	String details= driver.findElement(disclaimers).getText().replace("\n", " ");
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
		

	 
	 
	   
	 }
	Thread.sleep(100);
}
	

public void different_pricing_in_canadatext(String canada_Text) throws Exception {

	
	Element_isdisplayed(canada_text);
	
	String details= driver.findElement(canada_text).getText();

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
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	


public void all_sections_under_membership_payment_information(String next_page_title) throws Exception {
	
	Verify_continue_button(next_page_title, "38.99");

	
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
		
	   
	 }
	Thread.sleep(100);
}
	
	

public void all_fields_under_Member_information_section(String dropdown_values,String next_page_title) throws Exception {
	
	Verify_continue_button(next_page_title, "38.99");

	
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
Element_isdisplayed(State_DD );
	
	Log.info("State field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "State field under Member Information displayed successfully");

	Element_isdisplayed(Zip_p );
	Log.info("Zip code field under Member Information displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Zip code field under Member Information displayed successfully");
	


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
	

	
}

	
	


public void all_fields_under_Billing_information_section(String next_page_title) throws Exception {

Verify_continue_button(next_page_title,"38.99");

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




}


public void selecting_creditcard_radiobutton(String next_page_title) throws Exception {

Verify_continue_button(next_page_title, "38.99");

Element_isdisplayed(Billinginfo_sameas_memberinfo);
Element_isdisplayed(CreditCard);
MoveToElement(CreditCard);
if(!driver.findElement(CreditCard).isSelected()) click(CreditCard);
Log.info("Credit Card radio button selected");
ExtentTestManager.getTest().log(Status.PASS, "Credit Card radio button selected");


Element_isdisplayed(CardNumber);
Log.info("CardNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "CardNumber input field is displayed successfully");

Element_isdisplayed(exp_month);
Log.info("Expiration month dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration month dropdown field is displayed successfully");

Element_isdisplayed(exp_year);
Log.info("Expiration year dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration year dropdown field is displayed successfully");


}



public void selecting_checking_radiobutton(String next_page_title) throws Exception {

Verify_continue_button(next_page_title,"38.99");

Element_isdisplayed(Billinginfo_sameas_memberinfo);
Element_isdisplayed(Checking);
MoveToElement(Checking);
if(!driver.findElement(Checking).isSelected()) click(Checking);
Log.info("Checking radio button selected");
ExtentTestManager.getTest().log(Status.PASS, "Checking radio button selected");


Element_isdisplayed(RoutingNumber);
Log.info("RoutingNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "RoutingNumber input field is displayed successfully");


Element_isdisplayed(AccountNumber);
Log.info("AccountNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "AccountNumber input field is displayed successfully");



}


public void selecting_savings_radiobutton(String next_page_title) throws Exception {

Verify_continue_button(next_page_title, "38.99");

Element_isdisplayed(Billinginfo_sameas_memberinfo);
Element_isdisplayed(Savings);
MoveToElement(Savings);
if(!driver.findElement(Savings).isSelected()) click(Savings);
Log.info("Savings radio button selected");
ExtentTestManager.getTest().log(Status.PASS, "Savings radio button selected");


Element_isdisplayed(RoutingNumber);
Log.info("RoutingNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "RoutingNumber input field is displayed successfully");


Element_isdisplayed(AccountNumber);
Log.info("AccountNumber input field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "AccountNumber input field is displayed successfully");



}



public void use_same_information_for_monthly_billing_checkbox(String next_page_title) throws Exception {

Verify_continue_button(next_page_title,"38.99" );
By divBillingSame = By.id("ctl00_MainContent_divBillingSameEFT");
By use_same_information_for_monthly_billing = By.id("ctl00_MainContent_cBoxSameMonthlyPayment");

Element_isdisplayed(divBillingSame);
String BillingSame= driver.findElement(divBillingSame).getText();
Assert.assertEquals(BillingSame.toUpperCase().trim(),"Use same information for monthly billing (EFT)".toUpperCase().trim(), "'Use same information for monthly billing (EFT)' check box text not validated");
Element_isdisplayed(use_same_information_for_monthly_billing);
MoveToElement(use_same_information_for_monthly_billing);
if(driver.findElement(use_same_information_for_monthly_billing).isSelected()) {
	
	Log.info("Use same information for monthly billing (EFT) check box is by default selected/checked");
	ExtentTestManager.getTest().log(Status.PASS, "Use same information for monthly billing (EFT) check box is by default selected/checked");
}
else {
	Log.error("Use same information for monthly billing (EFT) check box is by default not selected/checked");
	throw new Exception("Use same information for monthly billing (EFT) check box is by default not selected/checked");
}

Thread.sleep(100);


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
		

	 
	 
	 
	 
	 
	 
	 
   
	 }
	Thread.sleep(100);
}
	
	

public void Validate_all_fields_by_selecting_creditcard_radiobutton(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_fields_by_selecting_creditcard_radiobutton"))
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
					selecting_creditcard_radiobutton(next_page_title);
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
				 	selecting_creditcard_radiobutton(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				selecting_creditcard_radiobutton(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	 
	 
	 
	 
   
	 }
	Thread.sleep(100);
}
	
	

public void Validate_all_fields_by_selecting_checking_radiobutton(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_fields_by_selecting_checking_radiobutton"))
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
					selecting_checking_radiobutton(next_page_title);
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
				 	selecting_checking_radiobutton(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				selecting_checking_radiobutton(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	   
	 }
	Thread.sleep(100);
}
	

public void Validate_all_fields_by_selecting_savings_radiobutton(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_fields_by_selecting_savings_radiobutton"))
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
					selecting_savings_radiobutton(next_page_title);
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
				 	selecting_savings_radiobutton(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				selecting_savings_radiobutton(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	   
	 }
	Thread.sleep(100);
}
	

public void Validate_use_same_information_for_monthly_billing_checkbox(String Value, String dropdown_values, String country, String clubname, String next_page_title) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_use_same_information_for_monthly_billing_checkbox"))
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
					use_same_information_for_monthly_billing_checkbox(next_page_title);
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
				 	use_same_information_for_monthly_billing_checkbox(next_page_title);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				use_same_information_for_monthly_billing_checkbox(next_page_title);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	


public void initial_payment_amount(String next_page_title, String rates, String messag_input, String input_data ) throws Exception {

Verify_continue_button(next_page_title, rates);




Element_isdisplayed(InitMessag);
String messag= driver.findElement(InitMessag).getText();
Assert.assertEquals(messag.toUpperCase().trim(), messag_input.toUpperCase().trim(), " init message text not validated");
Log.info("init message text validated successfully: "+messag);
ExtentTestManager.getTest().log(Status.PASS, "init message text validated successfully: "+messag);

String[] data=input_data.split(",");
String[] recurring_duest=data[0].split("--");
Element_isdisplayed(recurring_dues);
String recurring_duestxt= driver.findElement(recurring_dues).getText();
Assert.assertEquals(recurring_duestxt.toUpperCase().trim(), recurring_duest[0].toUpperCase().trim(), "recurring dues text not validated");
Log.info("recurring dues text validated successfully: "+recurring_duestxt);
ExtentTestManager.getTest().log(Status.PASS, "recurring dues text validated successfully: "+recurring_duestxt);

Element_isdisplayed(recurring_dues_price);
String recurring_dues_pr= driver.findElement(recurring_dues_price).getText();
Assert.assertEquals(recurring_dues_pr.toUpperCase().trim(), recurring_duest[1].toUpperCase().trim(), "recurring dues price not validated");
Log.info("recurring dues price validated successfully: "+recurring_dues_pr);
ExtentTestManager.getTest().log(Status.PASS, "recurring dues price validated successfully: "+recurring_dues_pr);


String[] annualfeeperpersion1_txt=data[1].split("--");
Element_isdisplayed(annualfeeperpersion1);
String annualfeeperpersion1txt= driver.findElement(annualfeeperpersion1).getText();
Assert.assertEquals(annualfeeperpersion1txt.toUpperCase().trim(), annualfeeperpersion1_txt[0].toUpperCase().trim(), "annual fee per persion1 text not validated");
Log.info("annual fee per persion1 text validated successfully: "+annualfeeperpersion1txt);
ExtentTestManager.getTest().log(Status.PASS, "annual fee per persion1 text validated successfully: "+annualfeeperpersion1txt);


Element_isdisplayed(annualfeeperpersion1_price);
String annualfeeperpersion1_pr= driver.findElement(annualfeeperpersion1_price).getText();
Assert.assertEquals(annualfeeperpersion1_pr.toUpperCase().trim(), annualfeeperpersion1_txt[1].toUpperCase().trim(), "annual fee per persion1 price not validated");
Log.info("annual fee per persion1 price validated successfully: "+annualfeeperpersion1_pr);
ExtentTestManager.getTest().log(Status.PASS, "annual fee per persion1 price validated successfully: "+annualfeeperpersion1_pr);


String[] initiation_fee_txt=data[2].split("--");
Element_isdisplayed(initiation_fee_p);
String initiation_feetxt= driver.findElement(initiation_fee_p).getText();
Assert.assertEquals(initiation_feetxt.toUpperCase().trim(), initiation_fee_txt[0].toUpperCase().trim(), "initiation fee text not validated");
Log.info("initiation fee text validated successfully: "+initiation_feetxt);
ExtentTestManager.getTest().log(Status.PASS, "initiation fee text validated successfully: "+initiation_feetxt);

Element_isdisplayed(initiationFee_price);
String initiation_fee_pr= driver.findElement(initiationFee_price).getText();
Assert.assertEquals(initiation_fee_pr.toUpperCase().trim(), initiation_fee_txt[1].toUpperCase().trim(), "initiation fee price not validated");
Log.info("initiation fee price validated successfully: "+initiation_fee_pr);
ExtentTestManager.getTest().log(Status.PASS, "initiation fee price validated successfully: "+initiation_fee_pr);


String[] prepaid_dues_first_month_txt=data[3].split("--");
Element_isdisplayed(prepaid_dues_first_month);
String prepaid_dues_first_monthtxt= driver.findElement(prepaid_dues_first_month).getText();
Assert.assertEquals(prepaid_dues_first_monthtxt.toUpperCase().trim(), prepaid_dues_first_month_txt[0].toUpperCase().trim(), "prepaid dues first month text not validated");
Log.info("prepaid dues first month text validated successfully: "+prepaid_dues_first_monthtxt);
ExtentTestManager.getTest().log(Status.PASS, "prepaid dues first month text validated successfully: "+prepaid_dues_first_monthtxt);


Element_isdisplayed(prepaid_dues_first_month_price);
String prepaid_dues_first_month_pr= driver.findElement(prepaid_dues_first_month_price).getText();
Assert.assertEquals(prepaid_dues_first_month_pr.toUpperCase().trim(), prepaid_dues_first_month_txt[1].toUpperCase().trim(), "prepaid dues first month price not validated");
Log.info("prepaid dues first month price validated successfully: "+prepaid_dues_first_month_pr);
ExtentTestManager.getTest().log(Status.PASS, "prepaid dues first month price validated successfully: "+prepaid_dues_first_month_pr);


String[] tax_for_initiation_prepaid_dues_txt=data[4].split("--");
Element_isdisplayed(tax_for_initiation_prepaid_dues);
String tax_for_initiation_prepaid_duetxt= driver.findElement(tax_for_initiation_prepaid_dues).getText();
Assert.assertEquals(tax_for_initiation_prepaid_duetxt.toUpperCase().trim(), tax_for_initiation_prepaid_dues_txt[0].toUpperCase().trim(),"tax for initiation prepaid dues text not validated");
Log.info("tax for initiation prepaid dues text validated successfully: "+tax_for_initiation_prepaid_duetxt);
ExtentTestManager.getTest().log(Status.PASS, "tax for initiation prepaid dues text validated successfully: "+tax_for_initiation_prepaid_duetxt);

Element_isdisplayed(tax_for_initiation_prepaid_dues_price);
String tax_for_initiation_prepaid_dues_pr= driver.findElement(tax_for_initiation_prepaid_dues_price).getText();
Assert.assertEquals(tax_for_initiation_prepaid_dues_pr.toUpperCase().trim(), tax_for_initiation_prepaid_dues_txt[1].toUpperCase().trim(),"tax for initiation prepaid dues price not validated");
Log.info("tax for initiation prepaid dues price validated successfully: "+tax_for_initiation_prepaid_dues_pr);
ExtentTestManager.getTest().log(Status.PASS, "tax for initiation prepaid dues price validated successfully: "+tax_for_initiation_prepaid_dues_pr);

String[] total_amount_due_today_txt=data[5].split("--");
Element_isdisplayed(total_amount_due_today);
String total_amount_due_todaytxt= driver.findElement(total_amount_due_today).getText();
Assert.assertEquals(total_amount_due_todaytxt.toUpperCase().trim(), total_amount_due_today_txt[0].toUpperCase().trim(),"total amount due today text not validated");
Log.info("total amount due today text validated successfully: "+total_amount_due_todaytxt);
ExtentTestManager.getTest().log(Status.PASS, "total amount due today text validated successfully: "+total_amount_due_todaytxt);


Element_isdisplayed(total_amount_due_today_price);
String total_amount_due_today_pr= driver.findElement(total_amount_due_today_price).getText();
Assert.assertEquals(total_amount_due_today_pr.toUpperCase().trim(), total_amount_due_today_txt[1].toUpperCase().trim(),"total amount due today price not validated");
Log.info("total amount due today price validated successfully: "+total_amount_due_today_pr);
ExtentTestManager.getTest().log(Status.PASS, "total amount due today price validated successfully: "+total_amount_due_today_pr);

Thread.sleep(100);


}



public void Validate_initial_payment_amounts(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates, String messag_input, String input_data) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_initial_payment_amounts"))
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
					initial_payment_amount( next_page_title,  rates,  messag_input,  input_data );
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
				 	initial_payment_amount( next_page_title,  rates,  messag_input,  input_data );
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				initial_payment_amount( next_page_title,  rates,  messag_input,  input_data );
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		


	   
	 }
	Thread.sleep(100);
}
	


public void included_amenities_under_initial_payment_amount(String next_page_title, String Amenities_included) throws Exception {

Verify_continue_button(next_page_title,"38.99" );
By included_am = By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[9]/div[1]");
By amenities = By.id("ctl00_MainContent_lblIncludedAmenities");

Element_isdisplayed(included_am);
click(included_am);
Element_isdisplayed(included_amenities_section);
MoveToElement(amenities);
Log.info("Included amenities section under Membership payment information displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Included amenities section under Membership payment information displayed successfully");
String amenities_txt= driver.findElement(amenities).getText();
Assert.assertEquals(amenities_txt.replace("\n", ", ").toUpperCase().trim(), Amenities_included.toUpperCase().trim(), "Included amenities not validated");
Log.info("Included amenities under initial payment amount section validated successfully: "+amenities_txt);
ExtentTestManager.getTest().log(Status.PASS, "Included amenities under initial payment amount section validated successfully: "+amenities_txt);

Thread.sleep(100);


}


public void Validate_included_amenities_under_initial_payment_amount_section(String Value, String dropdown_values, String country, String clubname, String next_page_title, String Amenities_included) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_included_amenities_under_initial_payment_amount_section"))
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
					included_amenities_under_initial_payment_amount( next_page_title,  Amenities_included);
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
				 	included_amenities_under_initial_payment_amount( next_page_title,  Amenities_included);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				included_amenities_under_initial_payment_amount( next_page_title,  Amenities_included);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		 

	 }
	Thread.sleep(100);
}
	


public void Your_home_club_section( String next_page_title, String club_address, String club_text, String input, String input1) throws Exception {

Verify_continue_button(next_page_title,"38.99" );
//By included_am = By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[9]/div[1]");
By clb_name = By.id("ctl00_MainContent_lblClubName");
By clb_address = By.id("ctl00_MainContent_lblClubAddress");
By clb_city = By.id("ctl00_MainContent_lblClubCity");
By clb_state = By.id("ctl00_MainContent_lblClubState");
By clb_zip = By.id("ctl00_MainContent_lblClubZip");
By clb_phone = By.id("ctl00_MainContent_lblClubPhone");

By clb_access = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]");
By clb_sig_access = By.id("ctl00_MainContent_lblAccess");
By clb_class = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[1]");

By cld_add_charge_txt = By.xpath("//div[contains(text(),'Group Fitness classes throughout the day, many at ')]");
By clb_Annual_fee_txt = By.xpath("//span[contains(text(),'1/ The indicated Annual Fee, per person, will be b')]");

String[] club_data= club_address.split(",");

Element_isdisplayed(clb_name);
Element_isdisplayed(clb_Annual_fee_txt);
MoveToElement(clb_Annual_fee_txt);
String clb_name_txt= driver.findElement(clb_name).getText().replace("\n", " ");
Assert.assertEquals(clb_name_txt.toUpperCase().trim(), club_data[0].toUpperCase().trim(), "club name not validated");
Log.info("club name validated successfully: "+clb_name_txt);
ExtentTestManager.getTest().log(Status.PASS, "club name validated successfully: "+clb_name_txt);

Element_isdisplayed(clb_address);
String clb_address_txt= driver.findElement(clb_address).getText().replace("\n", " ");
Assert.assertEquals(clb_address_txt.toUpperCase().trim(), club_data[1].toUpperCase().trim(), "club address not validated");
Log.info("club address validated successfully: "+clb_address_txt);
ExtentTestManager.getTest().log(Status.PASS, "club address validated successfully: "+clb_address_txt);

Element_isdisplayed(clb_city);
String clb_city_txt= driver.findElement(clb_city).getText().replace("\n", " ");
Assert.assertEquals(clb_city_txt.toUpperCase().trim(), club_data[2].toUpperCase().trim(), "club city not validated");
Log.info("club city validated successfully: "+clb_city_txt);
ExtentTestManager.getTest().log(Status.PASS, "club city validated successfully: "+clb_city_txt);

Element_isdisplayed(clb_state);
String clb_state_txt= driver.findElement(clb_state).getText().replace("\n", " ");
Assert.assertEquals(clb_state_txt.toUpperCase().trim(), club_data[3].toUpperCase().trim(), "club state not validated");
Log.info("club state validated successfully: "+clb_state_txt);
ExtentTestManager.getTest().log(Status.PASS, "club state validated successfully: "+clb_state_txt);

Element_isdisplayed(clb_zip);
String clb_zip_txt= driver.findElement(clb_zip).getText().replace("\n", " ");
Assert.assertEquals(clb_zip_txt.toUpperCase().trim(), club_data[4].toUpperCase().trim(), "club zipcode not validated");
Log.info("club zipcode validated successfully: "+clb_zip_txt);
ExtentTestManager.getTest().log(Status.PASS, "club zipcode validated successfully: "+clb_zip_txt);

Element_isdisplayed(clb_phone);
String clb_phone_txt= driver.findElement(clb_phone).getText().replace("\n", " ");
Assert.assertEquals(clb_phone_txt.toUpperCase().trim(), club_data[5].toUpperCase().trim(), "club phone not validated");
Log.info("club phone validated successfully: "+clb_phone_txt);
ExtentTestManager.getTest().log(Status.PASS, "club phone validated successfully: "+clb_phone_txt);

String[] club_data1= club_text.split(",");

Element_isdisplayed(clb_access);
String clb_access_txt= driver.findElement(clb_access).getText().replace("\n", " ");
Assert.assertEquals(clb_access_txt.toUpperCase().trim(), club_data1[0].toUpperCase().trim(), "club access text not validated");
Log.info("club access text validated successfully: "+clb_access_txt);
ExtentTestManager.getTest().log(Status.PASS, "club access text validated successfully: "+clb_phone_txt);

Element_isdisplayed(clb_sig_access);
String clb_sig_access_txt= driver.findElement(clb_sig_access).getText().replace("\n", " ");
Assert.assertEquals(clb_sig_access_txt.toUpperCase().trim(), club_data1[1].toUpperCase().trim(), "club signature access text not validated");
Log.info("club signature access text validated successfully: "+clb_sig_access_txt);
ExtentTestManager.getTest().log(Status.PASS, "club signature access text validated successfully: "+clb_sig_access_txt);

Element_isdisplayed(clb_class);
String clb_class_txt= driver.findElement(clb_class).getText().replace("\n", " ");
Assert.assertEquals(clb_class_txt.toUpperCase().trim(), club_data1[2].toUpperCase().trim(), "club Fitness group class text not validated");
Log.info("club Fitness group class text validated successfully: "+clb_class_txt);
ExtentTestManager.getTest().log(Status.PASS, "club Fitness group class text validated successfully: "+clb_class_txt);

Element_isdisplayed(cld_add_charge_txt);
String cld_add_charge= driver.findElement(cld_add_charge_txt).getText().replace("\n", " ");
Assert.assertEquals(cld_add_charge.toUpperCase().trim(), input1.toUpperCase().trim(), "club additional charge text not validated");
Log.info("club additional charge text validated successfully: "+cld_add_charge);
ExtentTestManager.getTest().log(Status.PASS, "club additional charge text validated successfully: "+cld_add_charge);

Element_isdisplayed(clb_Annual_fee_txt);
String clb_Annual_fee= driver.findElement(clb_Annual_fee_txt).getText().replace("\n", " ");
Assert.assertEquals(clb_Annual_fee.toUpperCase().trim(), input.toUpperCase().trim(), "club annual fee text not validated");
Log.info("club annual fee text validated successfully: "+clb_Annual_fee);
ExtentTestManager.getTest().log(Status.PASS, "club annual fee text validated successfully: "+clb_Annual_fee);

Thread.sleep(100);


}




public void Validate_details_in_Your_home_club_section(String Value, String dropdown_values, String country, String clubname, String next_page_title,String club_address, String club_text, String input, String input1) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_details_in_Your_home_club_section"))
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
					Your_home_club_section(  next_page_title,  club_address,  club_text,  input, input1);
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
				 	Your_home_club_section(  next_page_title,  club_address,  club_text,  input, input1);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				Your_home_club_section(  next_page_title,  club_address,  club_text,  input, input1);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 

	   
	 }
	Thread.sleep(100);
}
	


public void back_and_Review_confirm_buttons(String next_page_title,String rates) throws Exception {

Verify_continue_button(next_page_title,rates );


Element_isdisplayed(back_buttonl3);
MoveToElement(back_buttonl3);
Log.info("Back button displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Back button displayed successfully");

Element_isdisplayed(Review_confirm_button);
Log.info("Review and confirm  button displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Review and confirm button displayed successfully");


Thread.sleep(100);


}



public void Validate_back_and_Review_confirm_buttons(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_back_and_Review_confirm_buttons"))
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
					back_and_Review_confirm_buttons( next_page_title, rates);
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
				 	back_and_Review_confirm_buttons( next_page_title, rates);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				back_and_Review_confirm_buttons( next_page_title, rates);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	

public void back_buttonl3(String page_title,String rates) throws Exception {

Verify_continue_button("LA Fitness | Online Membership - Membership & Payment Information",rates );

Element_isdisplayed(back_buttonl3);
MoveToElement(back_buttonl3);
Log.info("Back button displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Back button displayed successfully");
click(back_buttonl3);
Thread.sleep(200);
String title=driver.getTitle();

//Assert.assertEquals(title.toUpperCase().trim(), next_page_title.toUpperCase().trim(), "Step 2 title not validated");
if (title.toUpperCase().contains(page_title.toUpperCase().trim())) {
	Log.info("Clicked on back button and user navigated to previous page: "+title);
	ExtentTestManager.getTest().log(Status.PASS, "Clicked on back button and user navigated to previous page: "+title);
}
else {
	Log.error("clicked on back button but previous page title not validated: "+title);
//	ExtentTestManager.getTest().log(Status.FAIL, "clicked on back button but previous page title not validated: "+title);
	throw new Exception("clicked on back button but previous page title not validated: "+title);
}

Thread.sleep(100);


}


public void Validate_back_button_in_step3(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_back_button_in_step3"))
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
					back_buttonl3( next_page_title, rates);
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
				 	back_buttonl3( next_page_title, rates);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				back_buttonl3( next_page_title, rates);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	   
	 }
	Thread.sleep(100);
}
	

public void review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step(String next_page_title,String rates, String F_name, String L_name,  String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number ) throws Exception {

Verify_continue_button("LA Fitness | Online Membership - Membership & Payment Information",rates );

input(FName_p, F_name);
Log.info("First name field under Member Information displayed successfully and entered the first name: "+F_name);
ExtentTestManager.getTest().log(Status.PASS, "First name field under Member Information displayed successfully and entered the first name: "+F_name);
error(By.xpath("//strong[contains(text(),'First Name is required')]"));

input(LName_p,L_name);
Log.info("Last name field under Member Information displayed successfully and entered the last name: "+L_name);
ExtentTestManager.getTest().log(Status.PASS, "Last name field under Member Information displayed successfully and entered the last name: "+L_name);
error(By.xpath("//strong[contains(text(),'Last Name is required')]"));
//Element_isdisplayed(Phone_p);
click(Phone_p);
//driver.findElement(Phone_p).sendKeys(phone);
input(Phone_p, phone);

Log.info("Phone number field under Member Information displayed successfully and entered the cell phone number: "+phone);
ExtentTestManager.getTest().log(Status.PASS, "Phone number field under Member Information displayed successfully and entered the cell phone number: "+phone);
error(By.xpath("//strong[contains(text(),'Cell Phone Number is required')]"));
error(By.xpath("//strong[contains(text(),'Invalid Cell Phone Number')]"));

input(Email_p ,Email);

Log.info("Email field under Member Information displayed successfully and entered the Email address: "+Email);
ExtentTestManager.getTest().log(Status.PASS, "Email field under Member Information displayed successfully and entered the Email address: "+Email);

error(invalid_Email_error);
error(By.xpath("//strong[contains(text(),'Email Address is required')]"));
Thread.sleep(100);
error(By.xpath("//strong[contains(text(),'Invalid Email Address')]"));
error(By.xpath("//strong[contains(text(),'The Email Addresses entered do not match.')]"));

input(ConfirmEmail_p, Email  );

Log.info("Confirm Email field under Member Information displayed successfully and entered the Confirm Email address: "+Email);
ExtentTestManager.getTest().log(Status.PASS, "Confirm Email field under Member Information displayed successfully and entered the Confirm Email address: "+Email);

error(invalid_ConfirmEmail_error);
error(By.xpath("//strong[contains(text(),'Confirm Email Address is required')]"));

input(Address_p, address);
Log.info("Address field under Member Information displayed successfully and entered the address: "+address);
ExtentTestManager.getTest().log(Status.PASS, "Address field under Member Information displayed successfully and entered the address: "+address);
error(By.xpath("//strong[contains(text(),'Address is required')]"));

input(City_p , city);

Log.info("City field under Member Information displayed successfully and entered the city: "+city);
ExtentTestManager.getTest().log(Status.PASS, "City field under Member Information displayed successfully and entered the city: "+city);
error(By.xpath("//strong[contains(text(),'City is required')]"));

Element_isdisplayed(State_DD);

Select select = new Select(driver.findElement(State_DD));
select.selectByVisibleText(state.trim());

input(Zip_p , zipcode);
Log.info("Zipcode field under Member Information displayed successfully and entered the zipcode: "+zipcode);
ExtentTestManager.getTest().log(Status.PASS, "Zipcode field under Member Information displayed successfully and entered the zipcode: "+zipcode);
error(By.xpath("//strong[contains(text(),'Invalid Zip Code')]"));
error(By.xpath("//strong[contains(text(),'Zip Code is required')]"));

Element_isdisplayed(billing_information_section);

if("Credit card".equalsIgnoreCase(payment_type))
{
Element_isdisplayed(CreditCard);
MoveToElement(CreditCard);
if(!driver.findElement(CreditCard).isSelected()) click(CreditCard);
Log.info("Credit Card radio button selected");
ExtentTestManager.getTest().log(Status.PASS, "Credit Card radio button selected");


input(CardNumber, card_number);
Log.info("CardNumber input field is displayed successfully and entered the card number: "+card_number);
ExtentTestManager.getTest().log(Status.PASS, "CardNumber input field is displayed successfully and entered the card number: "+card_number);
//click(billing_information_section);


//error(invalid_CardNumber);
//error(CardNumber_required);

Element_isdisplayed(exp_month);
Log.info("Expiration month dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration month dropdown field is displayed successfully");
Select select2 = new Select(driver.findElement(exp_month));
select2.selectByVisibleText(ex_month.trim());
Log.info("Expiration month selected: "+ex_month);
ExtentTestManager.getTest().log(Status.PASS, "Expiration month selected: "+ex_month);

//error(invalid_ex_month);
 


Element_isdisplayed(exp_year);
Log.info("Expiration year dropdown field is displayed successfully");
ExtentTestManager.getTest().log(Status.PASS, "Expiration year dropdown field is displayed successfully");
Select select1 = new Select(driver.findElement(exp_year));
select1.selectByVisibleText(ex_year.trim());

Log.info("Expiration year selected: "+ex_year);
ExtentTestManager.getTest().log(Status.PASS, "Expiration year selected: "+ex_year);

//error(invalid_exp_year);
//error(invalid_exp_month);
// 

}

else if ("Checking".equalsIgnoreCase(payment_type))
{
	
	Element_isdisplayed(Checking);
	MoveToElement(Checking);
	if(!driver.findElement(Checking).isSelected()) click(Checking);
	Log.info("Checking radio button selected");
	ExtentTestManager.getTest().log(Status.PASS, "Checking radio button selected");


	input(RoutingNumber, Routing_Number);
	Log.info("RoutingNumber input field is displayed successfully and entered Routing Number: "+Routing_Number);
	ExtentTestManager.getTest().log(Status.PASS, "RoutingNumber input field is displayed successfully and entered Routing Number: "+Routing_Number);


	input(AccountNumber, Account_Number);
	Log.info("AccountNumber input field is displayed successfully and entered the Account Number: "+Account_Number);
	ExtentTestManager.getTest().log(Status.PASS, "AccountNumber input field is displayed successfully and entered the Account Number: "+Account_Number);
	
	
}else if ("Savings".equalsIgnoreCase(payment_type)) {
	
	Element_isdisplayed(Savings);
	MoveToElement(Savings);
	if(!driver.findElement(Savings).isSelected()) click(Savings);
	Log.info("Savings radio button selected");
	ExtentTestManager.getTest().log(Status.PASS, "Savings radio button selected");


	input(RoutingNumber, Routing_Number);
	Log.info("RoutingNumber input field is displayed successfully and entered Routing Number: "+Routing_Number);
	ExtentTestManager.getTest().log(Status.PASS, "RoutingNumber input field is displayed successfully and entered Routing Number: "+Routing_Number);


	input(AccountNumber, Account_Number);
	Log.info("AccountNumber input field is displayed successfully and entered the Account Number: "+Account_Number);
	ExtentTestManager.getTest().log(Status.PASS, "AccountNumber input field is displayed successfully and entered the Account Number: "+Account_Number);
	
}

else {
	Log.info("Payment type not matched");
//	ExtentTestManager.getTest().log(Status.PASS, "Payment type not matched");
	throw new Exception("Payment type not matched");	
}
click(Review_confirm_button);
Log.info("Clicked on Review & confirm button");
ExtentTestManager.getTest().log(Status.PASS, "Clicked on Review & confirm button");
Thread.sleep(200);

String title=driver.getTitle();

if(title.equalsIgnoreCase("LA Fitness | Online Membership - Membership & Payment Information")) {
	
	
	error(By.xpath("//strong[contains(text(),'First Name is required')]"));
	error(By.xpath("//strong[contains(text(),'Last Name is required')]"));
	error(By.xpath("//strong[contains(text(),'Cell Phone Number is required')]"));
	error(By.xpath("//strong[contains(text(),'Invalid Cell Phone Number')]"));
	error(By.xpath("//strong[contains(text(),'Email Address is required')]"));
	error(By.xpath("//strong[contains(text(),'Invalid Email Address')]"));
	error(By.xpath("//strong[contains(text(),'Confirm Email Address is required')]"));
	error(By.xpath("//strong[contains(text(),'Address is required')]"));
	error(By.xpath("//strong[contains(text(),'City is required')]"));
	error(By.xpath("//strong[contains(text(),'Zip Code is required')]"));
	error(By.xpath("//strong[contains(text(),'Invalid Zip Code')]"));
	error(invalid_ex_month);
	error(invalid_exp_year);
	error(invalid_exp_month);
//	error(invalid_exp_month);
	error(invalid_CardNumber);
	error(CardNumber_required);
}

Assert.assertEquals(title.toUpperCase().trim(), next_page_title.toUpperCase().trim(), "Step 4 title not validated");
Log.info("Successfully navigated to "+title+" page");
ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to "+title+" page");



//By dd=By.id("ctl00_MainContent_MembershipReviewInfo1_txtIAgree");
//String Fullname=F_name+" "+L_name;
//input(dd, Fullname);

//captcha();
Thread.sleep(500);
}



public void Validate_review_and_confirm_button_by_fillingalldetails(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_review_and_confirm_button_by_fillingalldetails"))
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
//	 String firstname="";
//	 String lastname="";
//	 if(!Full_name.isEmpty()) {
//		 String[] name=Full_name.split(",");
//		 firstname=name[0].trim();
//		 lastname=name[1].trim();
//	 }
	 
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	

public void error(By error) throws Exception {
	Thread.sleep(100);
	if(driver.findElement(error).isDisplayed()) {
		MoveToElement(error);
		click(error);
		String error1=driver.findElement(error).getText();
		Log.info(error1);

		throw new Exception(error1);
	}
}


public void captcha() throws Exception {
	
//	By dd=By.id("ctl00_MainContent_MembershipReviewInfo1_txtIAgree");
//	String Fullname=F_name+" "+L_name;
//	input(dd, Fullname);
	
	Thread.sleep(100);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	        By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

	wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

	Thread.sleep(100);
	driver.switchTo().defaultContent();
	By d=By.id("ctl00_MainContent_MembershipReviewInfo1_imgSubmit");
	click(d);

}



public void all_sections_in_review_and_confirm_membership_page() throws Exception {
	
	
//	String clb_address_txt= driver.findElement(clb_address).getText().replace("\n", " ");
//	Assert.assertEquals(clb_address_txt.toUpperCase().trim(), club_data[1].toUpperCase().trim(), "club address not validated");
	Element_isdisplayed(Member_info);
	Log.info("Member Information Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Member Information Edit section displayed successfully");
	
	Element_isdisplayed(Billing_info);
	Log.info("Billing Information Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Billing Information Edit section displayed successfully");
	
	Element_isdisplayed(Payment_info);
	Log.info("Payment Information Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Payment Information Edit section displayed successfully");
	
	Element_isdisplayed(Monthlydues_billing_info);
	Log.info("Monthly dues billing Information Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Monthly dues billing Information Edit section displayed successfully");
	
	Element_isdisplayed(Monthlydues_payment_info);
	Log.info("Monthly dues Payment Information Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Monthly dues Payment Information Edit section displayed successfully");
	
	Element_isdisplayed(initial_payment_amount);
	Log.info("Initial payment amount Edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Initial payment amount Edit section displayed successfully");
	
	Element_isdisplayed(inc_amenities);
	Log.info("Included amenities section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Included amenities section displayed successfully");
	

	Element_isdisplayed(Your_home_club);
	Log.info("Your_home_club edit section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Your_home_club edit section displayed successfully");
	
	Element_isdisplayed(mem_agreement);
	Log.info("Membership agreement section displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Membership agreement section displayed successfully");

} 


public void Validate_all_sections_in_review_and_confirm_membership_page(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_sections_in_review_and_confirm_membership_page"))
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
//	 String firstname="";
//	 String lastname="";
//	 if(!Full_name.isEmpty()) {
//		 String[] name=Full_name.split(",");
//		 firstname=name[0].trim();
//		 lastname=name[1].trim();
//	 }
	 
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					all_sections_in_review_and_confirm_membership_page();
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	all_sections_in_review_and_confirm_membership_page();
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				all_sections_in_review_and_confirm_membership_page();
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	


public void user_details_in_review_page(String userfname,String userlname, String useremail, String usermobile, String useraddress, String usercity, String userstate, String userzip) throws Exception {
	
	
	By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
	By email=By.id("ctl00_MainContent_MembershipReviewInfo1_lblEmail");
	By mobile=By.id("ctl00_MainContent_MembershipReviewInfo1_lblHomePhone");
	By address=By.id("ctl00_MainContent_MembershipReviewInfo1_lblAddress1");
	By city_state_zip=By.id("ctl00_MainContent_MembershipReviewInfo1_lblCityEtc");
	
//	By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
//	By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
	
	String username=userfname.trim()+" "+userlname.trim();
	
	Element_isdisplayed(Member_info);
	Element_isdisplayed(fullname);
	String name= driver.findElement(fullname).getText().replace("\n", " ");
	Assert.assertEquals(name.toUpperCase().trim(), username.toUpperCase().trim(), "Member name not validated");
	Log.info("Member name validated successfully: "+name);
	ExtentTestManager.getTest().log(Status.PASS, "Member name validated successfully: "+name);

	Element_isdisplayed(email);
	String email_u= driver.findElement(email).getText().replace("\n", " ");
	Assert.assertEquals(email_u.toUpperCase().trim(), useremail.toUpperCase().trim(), "Member email not validated");
	Log.info("Member email validated successfully: "+email_u);
	ExtentTestManager.getTest().log(Status.PASS, "Member email validated successfully: "+email_u);
	
	Element_isdisplayed(mobile);
	String mobile_u= driver.findElement(mobile).getText().replaceAll("[^0-9]", "");
	Assert.assertEquals(mobile_u.toUpperCase().trim(), usermobile.toUpperCase().trim(), "Member mobile not validated");
	Log.info("Member mobile validated successfully: "+mobile_u);
	ExtentTestManager.getTest().log(Status.PASS, "Member mobile validated successfully: "+mobile_u);
	
	Element_isdisplayed(address);
	String address_u= driver.findElement(address).getText().replace("\n", " ");
	Assert.assertEquals(address_u.toUpperCase().trim(), useraddress.toUpperCase().trim(), "Member address not validated");
	Log.info("Member address validated successfully: "+address_u);
	ExtentTestManager.getTest().log(Status.PASS, "Member address validated successfully: "+address_u);
	
	String user_city_state_zip=usercity.trim()+", "+userstate.trim()+" "+userzip.trim();
	
	Element_isdisplayed(city_state_zip);
	String city_state_zip_u= driver.findElement(city_state_zip).getText().replace("\n", " ");
	Assert.assertEquals(city_state_zip_u.toUpperCase().trim(), user_city_state_zip.toUpperCase().trim(), "Member city/state/zip not validated");
	
	Log.info("Member city validated successfully: "+usercity);
	ExtentTestManager.getTest().log(Status.PASS, "Member city validated successfully: "+usercity);
	Log.info("Member state validated successfully: "+userstate);
	ExtentTestManager.getTest().log(Status.PASS, "Member state validated successfully: "+userstate);
	Log.info("Member zipcode validated successfully: "+userzip);
	ExtentTestManager.getTest().log(Status.PASS, "Member zipcode validated successfully: "+userzip);
	

} 



public void Validate_user_details_in_review_page(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_user_details_in_review_page"))
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
//	 String firstname="";
//	 String lastname="";
//	 if(!Full_name.isEmpty()) {
//		 String[] name=Full_name.split(",");
//		 firstname=name[0].trim();
//		 lastname=name[1].trim();
//	 }
	 
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					user_details_in_review_page(F_name, L_name, Email, phone, address, city, state, zipcode);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	user_details_in_review_page(F_name, L_name, Email, phone, address, city, state, zipcode);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				user_details_in_review_page(F_name, L_name, Email, phone, address, city, state, zipcode);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	


public void user_fullname_under_billingsection(String userfname,String userlname) throws Exception {


By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblBillingName1");
//By email=By.id("ctl00_MainContent_MembershipReviewInfo1_lblEmail");
//By mobile=By.id("ctl00_MainContent_MembershipReviewInfo1_lblHomePhone");
//By address=By.id("ctl00_MainContent_MembershipReviewInfo1_lblAddress1");
//By city_state_zip=By.id("ctl00_MainContent_MembershipReviewInfo1_lblCityEtc");

//By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
//By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");

String username=userfname.trim()+" "+userlname.trim();

Element_isdisplayed(Billing_info);
Element_isdisplayed(fullname);
String name= driver.findElement(fullname).getText().replace("\n", " ");
Assert.assertEquals(name.toUpperCase().trim(), username.toUpperCase().trim(), "Member full name not validated under Billing Information section");
Log.info("Member full name validated successfully under Billing Information section: "+name);
ExtentTestManager.getTest().log(Status.PASS, "Member full name validated successfully under Billing Information section: "+name);





} 


public void Validate_user_fullname_under_billingsection(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_user_fullname_under_billingsection"))
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
//	 String firstname="";
//	 String lastname="";
//	 if(!Full_name.isEmpty()) {
//		 String[] name=Full_name.split(",");
//		 firstname=name[0].trim();
//		 lastname=name[1].trim();
//	 }
	 
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					user_fullname_under_billingsection(F_name, L_name);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	user_fullname_under_billingsection(F_name, L_name);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				user_fullname_under_billingsection(F_name, L_name);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}
	


public void payment_info(String card_name,String card_number, String exp_month, String exp_year) throws Exception {


By cardname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInitiationPaymentType");
By cardnumber=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInitiationAccount");
By expiration_date=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInitiationAccountMisc");

String masked_cardno="XXXXXXXXXX"+card_number.substring(12, 16);;



Element_isdisplayed(Payment_info);
Element_isdisplayed(cardname);
String cardname_txt= driver.findElement(cardname).getText().replace("\n", " ");
Assert.assertEquals(cardname_txt.toUpperCase().trim(), card_name.toUpperCase().trim(), "Member card name not validated");
Log.info("Member card name validated successfully under Billing Information section: "+cardname_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card name validated successfully under Billing Information section: "+cardname_txt);


Element_isdisplayed(cardnumber);
String cardnumber_txt= driver.findElement(cardnumber).getText().replace("\n", " ");
Assert.assertEquals(cardnumber_txt.toUpperCase().trim(), masked_cardno.toUpperCase().trim(), "Member card number not validated");
Log.info("Member card number validated successfully under Billing Information section: "+cardnumber_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card number validated successfully under Billing Information section: "+cardnumber_txt);

String month_number=convert_month_to_number(exp_month.trim());
String expiration_date_input=month_number+"/"+exp_year.trim();

Element_isdisplayed(expiration_date);
String expiration_date_txt= driver.findElement(expiration_date).getText().replace("\n", " ");
Assert.assertEquals(expiration_date_txt.toUpperCase().trim(), expiration_date_input.toUpperCase().trim(), "Member card expiration date not validated under payment information section");
Log.info("Member card expiration date validated successfully under payment information section: "+expiration_date_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card expiration date validated successfully under payment information section: "+expiration_date_txt);


} 


public void Validate_user_payment_info(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number, String cardname) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_user_payment_info"))
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
//	 String firstname="";
//	 String lastname="";
//	 if(!Full_name.isEmpty()) {
//		 String[] name=Full_name.split(",");
//		 firstname=name[0].trim();
//		 lastname=name[1].trim();
//	 }
	 
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					payment_info( cardname, card_number,  ex_month,  ex_year);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	payment_info( cardname, card_number,  ex_month,  ex_year);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				payment_info( cardname, card_number,  ex_month,  ex_year);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		

	 
	 
	 
	 
	   
	 }
	Thread.sleep(100);
}


public void user_fullname_under_monthlyduesbillingsection(String userfname,String userlname) throws Exception {


By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblBillingName2");


String username=userfname.trim()+" "+userlname.trim();

Element_isdisplayed(Monthlydues_billing_info);
Element_isdisplayed(fullname);
String name= driver.findElement(fullname).getText().replace("\n", " ");
Assert.assertEquals(name.toUpperCase().trim(), username.toUpperCase().trim(), "Member full name not validated under Monthly dues billing information section");
Log.info("Member full name validated successfully under Monthly dues Billing Information section: "+name);
ExtentTestManager.getTest().log(Status.PASS, "Member full name validated successfully under Monthly dues billing information section: "+name);





} 



public void Validate_user_fullname_under_monthlyduesbillingsection(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_user_fullname_under_monthlyduesbillingsection"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					user_fullname_under_monthlyduesbillingsection(F_name, L_name);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	user_fullname_under_monthlyduesbillingsection(F_name, L_name);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				user_fullname_under_monthlyduesbillingsection(F_name, L_name);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	



public void monthly_dues_payment_info(String card_name,String card_number, String exp_month, String exp_year, String Monthly_info_message) throws Exception {


By cardname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMonthlyPaymentType");
By cardnumber=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMonthlyAccount");
By expiration_date=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMonthlyAccountMisc");

By monthly_info=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInfo");
By monthly_msg=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMonthlyMessage");

String masked_cardno="XXXXXXXXXX"+card_number.substring(12, 16);;


Element_isdisplayed(Payment_info);
Element_isdisplayed(cardname);
String cardname_txt= driver.findElement(cardname).getText().replace("\n", " ");
Assert.assertEquals(cardname_txt.toUpperCase().trim(), card_name.toUpperCase().trim(), "Member card name not validated under Monthly Dues Payment Information section");
Log.info("Member card name validated successfully under Monthly Dues Payment Information section: "+cardname_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card name validated successfully under Monthly Dues Payment Information section: "+cardname_txt);


Element_isdisplayed(cardnumber);
String cardnumber_txt= driver.findElement(cardnumber).getText().replace("\n", " ");
Assert.assertEquals(cardnumber_txt.toUpperCase().trim(), masked_cardno.toUpperCase().trim(), "Member card number not validated under Monthly Dues Payment Information section");
Log.info("Member card number validated successfully under Monthly Dues Payment Information section: "+cardnumber_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card number validated successfully under Monthly Dues Payment Information section: "+cardnumber_txt);

String month_number=convert_month_to_number(exp_month.trim());
String expiration_date_input=month_number+"/"+exp_year.trim();

Element_isdisplayed(expiration_date);
String expiration_date_txt= driver.findElement(expiration_date).getText().replace("\n", " ");
Assert.assertEquals(expiration_date_txt.toUpperCase().trim(), expiration_date_input.toUpperCase().trim(), "Member card expiration date not validated under Monthly Dues payment information section");
Log.info("Member card expiration date validated successfully under Monthly Dues Payment Information section: "+expiration_date_txt);
ExtentTestManager.getTest().log(Status.PASS, "Member card expiration date validated successfully under Monthly Dues Payment Information section: "+expiration_date_txt);

MoveToElement(monthly_msg);
String[] monthly_text=Monthly_info_message.split("--");

Element_isdisplayed(monthly_info);
String monthly_info_txt= driver.findElement(monthly_info).getText().replace("\n", " ");
Assert.assertEquals(monthly_info_txt.toUpperCase().trim(), monthly_text[0].toUpperCase().trim(), "Monthly dues info not validated under Monthly Dues Payment Information section");
Log.info("Monthly dues info validated successfully under Monthly Dues Payment Information section: "+monthly_info_txt);
ExtentTestManager.getTest().log(Status.PASS, "Monthly dues info validated successfully under Monthly Dues Payment Information section: "+monthly_info_txt);

String todays_date=Get_todays_date_pus_1month("M/d/YYYY");
Element_isdisplayed(monthly_msg);
String monthly_msg_t= driver.findElement(monthly_msg).getText().replace("\n", " ");
Assert.assertEquals(monthly_msg_t.toUpperCase().trim(), monthly_text[1].toUpperCase().trim().replace("M/DD/YYYY", todays_date), "Monthly dues message not validated under Monthly Dues Payment Information section");
Log.info("Monthly dues message validated successfully under Monthly Dues Payment Information section: "+monthly_msg_t);
ExtentTestManager.getTest().log(Status.PASS, "Monthly dues message validated successfully under Monthly Dues Payment Information section: "+monthly_msg_t);

} 



public void Validate_user_monthly_dues_payment_info(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number, String cardname, String Monthly_info_message) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_user_monthly_dues_payment_info"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					
					monthly_dues_payment_info( cardname, card_number,  ex_month,  ex_year, Monthly_info_message);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	monthly_dues_payment_info( cardname, card_number,  ex_month,  ex_year, Monthly_info_message);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				monthly_dues_payment_info( cardname, card_number,  ex_month,  ex_year, Monthly_info_message);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
 
	   
	 }
	Thread.sleep(100);
}





public void Monthly_dues_amount(String Monthly_dues_amount_input) throws Exception {


By Monthly_dues_amount=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMonthlyAmount");


Element_isdisplayed(Monthly_dues_amount);
MoveToElement(Monthly_dues_amount);
String Monthly_dues_amount_txt= driver.findElement(Monthly_dues_amount).getText().replace("$", "");
Assert.assertEquals(Monthly_dues_amount_txt.toUpperCase().trim(), Monthly_dues_amount_input.toUpperCase().trim(), "Monthly dues amount not validated ");
Log.info("Monthly dues amount validated successfully: "+Monthly_dues_amount_txt);
ExtentTestManager.getTest().log(Status.PASS, "Monthly dues amount validated successfully: "+Monthly_dues_amount_txt);



//if(Monthly_dues_amount_txt.toUpperCase().trim().contains(Monthly_dues_amount_input.toUpperCase().trim())) {
//	Log.info("Monthly dues amount validated successfully: "+Monthly_dues_amount_txt);
//ExtentTestManager.getTest().log(Status.PASS, "Monthly dues amount validated successfully: "+Monthly_dues_amount_txt);
//}
//
//else {
//
//	Log.info("Monthly dues amount not validated Expected [ "+Monthly_dues_amount_input+" ] but Actual/found [ "+Monthly_dues_amount_txt.replace("$", "")+" ]");
//	throw new Exception("Monthly dues amount not validated Expected [ "+Monthly_dues_amount_input+" ] but Actual/found [ "+Monthly_dues_amount_txt+" ]");
//}

//Assert.assertEquals(Monthly_dues_amount_txt.toUpperCase().trim(), Monthly_dues_amount_input.toUpperCase().trim(), "Monthly dues amount not validated ");






} 



public void Validate_Monthly_dues_amount(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_Monthly_dues_amount"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					Monthly_dues_amount(rates);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	Monthly_dues_amount(rates);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				Monthly_dues_amount(rates);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	



public void initial_payment_amount_section(String initial_pay_msg_input,String initial_pay_amt_inputdata) throws Exception 
{


By initial_pay_msg=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInitMessage");
By recurring_dues=By.id("ctl00_MainContent_MembershipReviewInfo1_lblRecurring");
By annual_fee_per_person=By.id("ctl00_MainContent_MembershipReviewInfo1_lblLowDuesFeeAmount");

By initiation_fee=By.id("ctl00_MainContent_MembershipReviewInfo1_lblInitiationFee");
By prepaid_dues=By.id("ctl00_MainContent_MembershipReviewInfo1_lblTotalPrePaidDues");

By tax_for_dues=By.id("ctl00_MainContent_MembershipReviewInfo1_lblTaxAmount");
By total_due_amount_today=By.id("ctl00_MainContent_MembershipReviewInfo1_lblTotalAmount");


Element_isdisplayed(initial_payment_amount_section);
Element_isdisplayed(initial_pay_msg);
String initial_pay_msg_txt= driver.findElement(initial_pay_msg).getText().replace("\n", " ");
Assert.assertEquals(initial_pay_msg_txt.toUpperCase().trim(), initial_pay_msg_input.toUpperCase().trim(), "Initial payment amount section message not validated");
Log.info("Initial payment amount section message validated successfully : "+initial_pay_msg_txt);
ExtentTestManager.getTest().log(Status.PASS, "Initial payment amount section message validated successfully : "+initial_pay_msg_txt);

String[] initial_pay_amt_data = initial_pay_amt_inputdata.split(",");
String recurring_dues_input=initial_pay_amt_data[0] ;
String annual_fee_per_person_input=initial_pay_amt_data[1] ;
String initiation_fee_input=initial_pay_amt_data[2] ;
String prepaid_dues_input=initial_pay_amt_data[3] ;
String tax_for_dues_input=initial_pay_amt_data[4] ;
String total_due_amount_today_input=initial_pay_amt_data[5] ;

Element_isdisplayed(recurring_dues);
String recurring_dues_txt= driver.findElement(recurring_dues).getText().replace("\n", " ");
Assert.assertEquals(recurring_dues_txt.toUpperCase().trim(), recurring_dues_input.toUpperCase().trim(), "Recurring dues amount not validated under initial payment amount section");
Log.info("Recurring dues amount validated successfully under initial payment amount section: "+recurring_dues_txt);
ExtentTestManager.getTest().log(Status.PASS, "Recurring dues amount validated successfully under initial payment amount section: "+recurring_dues_txt);

Element_isdisplayed(annual_fee_per_person);
String annual_fee_per_person_txt= driver.findElement(annual_fee_per_person).getText().replace("\n", " ");
Assert.assertEquals(annual_fee_per_person_txt.toUpperCase().trim(), annual_fee_per_person_input.toUpperCase().trim(), "Annual fee per person not validated under initial payment amount section");
Log.info("Annual fee per person validated successfully under initial payment amount section: "+annual_fee_per_person_txt);
ExtentTestManager.getTest().log(Status.PASS, "Annual fee per person validated successfully under initial payment amount section: "+annual_fee_per_person_txt);

Element_isdisplayed(initiation_fee);
String initiation_fee_txt= driver.findElement(initiation_fee).getText().replace("\n", " ");
Assert.assertEquals(initiation_fee_txt.toUpperCase().trim(), initiation_fee_input.toUpperCase().trim(), "Initiation fee not validated under initial payment amount section");
Log.info("Initiation fee validated successfully under initial payment amount section: "+initiation_fee_txt);
ExtentTestManager.getTest().log(Status.PASS, "Initiation fee validated successfully under initial payment amount section: "+initiation_fee_txt);

Element_isdisplayed(prepaid_dues);
String prepaid_dues_txt= driver.findElement(prepaid_dues).getText().replace("\n", " ");
Assert.assertEquals(prepaid_dues_txt.toUpperCase().trim(), prepaid_dues_input.toUpperCase().trim(), "Prepaid dues not validated under initial payment amount section");
Log.info("Prepaid dues validated successfully under initial payment amount section: "+prepaid_dues_txt);
ExtentTestManager.getTest().log(Status.PASS, "Prepaid dues validated successfully under initial payment amount section: "+prepaid_dues_txt);

Element_isdisplayed(tax_for_dues);
String tax_for_dues_txt= driver.findElement(tax_for_dues).getText().replace("\n", " ");
Assert.assertEquals(tax_for_dues_txt.toUpperCase().trim(), tax_for_dues_input.toUpperCase().trim(), "Tax for dues not validated under initial payment amount section");
Log.info("Tax for dues validated successfully under initial payment amount section: "+tax_for_dues_txt);
ExtentTestManager.getTest().log(Status.PASS, "Tax for dues validated successfully under initial payment amount section: "+tax_for_dues_txt);

Element_isdisplayed(total_due_amount_today);
String total_due_amount_today_txt= driver.findElement(total_due_amount_today).getText().replace("\n", " ");
Assert.assertEquals(total_due_amount_today_txt.toUpperCase().trim(), total_due_amount_today_input.toUpperCase().trim(), "Total due amount today not validated under initial payment amount section");
Log.info("Total due amount today validated successfully under initial payment amount section: "+total_due_amount_today_txt);
ExtentTestManager.getTest().log(Status.PASS, "Total due amount today validated successfully under initial payment amount section: "+total_due_amount_today_txt);



} 




public void Validate_initial_payment_amount_section(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number, String initial_pay_msg_input,String initial_pay_amt_inputdata) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_initial_payment_amount_section"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					initial_payment_amount_section(initial_pay_msg_input, initial_pay_amt_inputdata);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	initial_payment_amount_section(initial_pay_msg_input, initial_pay_amt_inputdata);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				initial_payment_amount_section(initial_pay_msg_input, initial_pay_amt_inputdata);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	


public void Includeded_amenities_in_review_page(String Amenities_included) throws Exception {
	
	By included_am=By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[9]/div[1]");
	By amenities=By.id("ctl00_MainContent_MembershipReviewInfo1_lblIncludedAmenities");
	
	Element_isdisplayed(included_am);
	click(included_am);
	Element_isdisplayed(amenities);
	MoveToElement(inc_amenities);
	Log.info("Included amenities section in Review and confirm membership page displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Included amenities section in  Review and confirm membership page displayed successfully");
	String amenities_txt= driver.findElement(amenities).getText();
	Assert.assertEquals(amenities_txt.replace("\n", ", ").toUpperCase().trim(), Amenities_included.toUpperCase().trim(), "Included amenities not validated");
	Log.info("Included amenities in Review and confirm membership page validated successfully: "+amenities_txt);
	ExtentTestManager.getTest().log(Status.PASS, "Included amenities in Review and confirm membership page validated successfully: "+amenities_txt);
	Thread.sleep(200);
	

	
	
	
	
}



public void Validate_Includeded_amenities_in_review_page(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number, String Amenities_included) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_Includeded_amenities_in_review_page"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					Includeded_amenities_in_review_page( Amenities_included);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	Includeded_amenities_in_review_page( Amenities_included);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				Includeded_amenities_in_review_page( Amenities_included);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	




public void all_yourhomeclub_section_review_page(String clubname,String clb_address, String clubcity, String clubstate, String clubzip, String clubphone, String clubaccess, String club_f_classes, String Dues_fees_note_txt) throws Exception {
	
	
	By club_name=By.id("ctl00_MainContent_MembershipReviewInfo1_lblClub");
	By club_address=By.id("ctl00_MainContent_MembershipReviewInfo1_lblClubAddress1");
	By clb_details=By.id("ctl00_MainContent_MembershipReviewInfo1_lblClubAddress2");
	By clb_access=By.id("dClubAccess");
	By grp_fitness=By.id("dGroupFitness");
	By fees_details= By.id("ctl00_MainContent_MembershipReviewInfo1_divLowDuesFee_Note");
	
//	By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
//	By fullname=By.id("ctl00_MainContent_MembershipReviewInfo1_lblMemberName");
	
//	String username=userfname.trim()+" "+userlname.trim();
	
	Element_isdisplayed(fees_details);
	MoveToElement(fees_details);
	Element_isdisplayed(club_name);
	String[] club_name_txt= driver.findElement(club_name).getText().replace("\n", " ").split(",");
	Assert.assertEquals(club_name_txt[0].toUpperCase().trim(), clubname.toUpperCase().trim(), "Club name not validated under your home club section");
	Log.info("Club name successfully validated under your home club section: "+clubname);
	ExtentTestManager.getTest().log(Status.PASS, "Club name successfully validated under your home club section: "+clubname);

	Element_isdisplayed(club_address);
	String club_address_txt= driver.findElement(club_address).getText().replace("\n", " ");
	Assert.assertEquals(club_address_txt.toUpperCase().trim(), clb_address.toUpperCase().trim(), "Club address not validated under your home club section");
	Log.info("Club address successfully validated under your home club section: "+club_address_txt);
	ExtentTestManager.getTest().log(Status.PASS, "Club address successfully validated under your home club section: "+club_address_txt);
	
	String club_details=clubcity.trim()+", "+clubstate.trim()+" "+clubzip.trim()+". Phone: "+convert_to_tel_number(clubphone);

	
	Element_isdisplayed(clb_details);
	String clb_details_txt= driver.findElement(clb_details).getText().replace("\n", " ");
	Assert.assertEquals(clb_details_txt.toUpperCase().trim(), club_details.toUpperCase().trim(), "Club address2 not validated under your home club section");
	Log.info("Club address successfully validated under your home club section: "+clb_details_txt);
	ExtentTestManager.getTest().log(Status.PASS, "Club address successfully validated under your home club section: "+clb_details_txt);
	
	Element_isdisplayed(clb_access);
	String clb_access_txt= driver.findElement(clb_access).getText().replace("\n", " ");
	Assert.assertEquals(clb_access_txt.toUpperCase().trim(), clubaccess.toUpperCase().trim(), "Club access details not validated under your home club section");
	Log.info("Club access details successfully validated under your home club section: "+clb_access_txt);
	ExtentTestManager.getTest().log(Status.PASS, "Club access details successfully validated under your home club section: "+clb_access_txt);
	
//	String user_city_state_zip=usercity.trim()+", "+userstate.trim()+" "+userzip.trim();
	
	Element_isdisplayed(grp_fitness);
	String grp_fitness_txt= driver.findElement(grp_fitness).getText().replace("\n", " ");
	Assert.assertEquals(grp_fitness_txt.toUpperCase().trim(), club_f_classes.toUpperCase().trim(), "Club group fitness classes details not validated under your home club section");
	
	Log.info("Club group fitness classes details successfully validated under your home club section: "+grp_fitness_txt);
	ExtentTestManager.getTest().log(Status.PASS, "Club group fitness classes details successfully validated under your home club section: "+grp_fitness_txt);
	
	
	Element_isdisplayed(fees_details);
	String dues_fee_note= driver.findElement(fees_details).getText().replace("\n", " ");
	Assert.assertEquals(dues_fee_note.toUpperCase().trim(), Dues_fees_note_txt.toUpperCase().trim(), "Club dues note not validated under your home club section");
	
	Log.info("Club dues note successfully validated under your home club section: "+dues_fee_note);
	ExtentTestManager.getTest().log(Status.PASS, "Club dues note successfully validated under your home club section: "+dues_fee_note);
	
} 





public void Validate_all_yourhomeclub_section_review_page(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number,String clubaccess, String club_f_classes, String Dues_fees_note_txt , String Club_Address, String Club_city, String Club_zip, String Club_phone) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_all_yourhomeclub_section_review_page"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					all_yourhomeclub_section_review_page( clubname, Club_Address,  Club_city,   state,   Club_zip,   Club_phone,   clubaccess,   club_f_classes,   Dues_fees_note_txt);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	all_yourhomeclub_section_review_page( clubname, Club_Address,  Club_city,   state,   Club_zip,   Club_phone,   clubaccess,   club_f_classes,   Dues_fees_note_txt);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				all_yourhomeclub_section_review_page( clubname, Club_Address,  Club_city,   state,   Club_zip,   Club_phone,   clubaccess,   club_f_classes,   Dues_fees_note_txt);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	



public void Membership_agreement(String aggr_text, String F_name, String L_name, String email) throws Exception {
	

	By input_txt=By.id("ctl00_MainContent_MembershipReviewInfo1_txtIAgree");
	By agg=By.xpath("//body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[3]/p[1]/strong[1]");
	By input_txt1=By.id("ctl00_MainContent_MembershipReviewInfo1_pnlCMSConfirmEmail");
	
	String fullname= F_name.trim()+" "+L_name.trim();
	WebElement w= driver.findElement(input_txt);
	w.sendKeys(fullname);
	Thread.sleep(100);
	String s=w.getAttribute("value");
	String text1 = driver.findElement(agg).getText().replace("  hereby", s+" hereby");
	String text2 =driver.findElement(input_txt1).getText().replace("\n", " ");
	String text=text1+" "+text2;
	String aggrement = aggr_text.replace("  hereby", fullname+" hereby");
	
	
	if (!text2.toUpperCase().trim().contains(email.toUpperCase().trim())) {
		
		if (!aggrement.toUpperCase().trim().contains(email.toUpperCase().trim())) {
			throw new Exception("Email is not validated in input Membership Agreement "+aggrement);
		}
		throw new Exception("Email is not validated in Membership Agreement "+text2);
		
		
	}
	if (!text1.toUpperCase().trim().contains(fullname.toUpperCase().trim())) {
		
		if (!aggrement.toUpperCase().trim().contains(fullname.toUpperCase().trim())) {
			throw new Exception("Member name is not validated in input Membership Agreement "+aggrement);
		}
		throw new Exception("Member name is not validated in Membership Agreement "+text1);
	}
	

	
	Assert.assertEquals(text.toUpperCase().trim(), aggrement.toUpperCase().trim(), "Membership Agreement is not validated in review page");
	Log.info("Membership Agreement successfully validated in review page: "+text);
	ExtentTestManager.getTest().log(Status.PASS, "Membership Agreement successfully validated in review page: "+text);

	
}




public void Validate_Membership_agreement_in_review_page(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number, String Aggrement_text) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_Membership_agreement_in_review_page"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					Membership_agreement( Aggrement_text, F_name, L_name, Email);
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	Membership_agreement( Aggrement_text, F_name, L_name, Email);
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				Membership_agreement( Aggrement_text, F_name, L_name, Email);
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
	 }
	Thread.sleep(100);
}
	




public void Previewagreement_and_Confirmandpay_buttons() throws Exception {
	
	
	By Preview_agreement_button = By.id("imgAgreement");
	By Confirm_pay_button=By.id("ctl00_MainContent_MembershipReviewInfo1_imgSubmit");
	
	 
	Element_isdisplayed(Preview_agreement_button);

	MoveToElement(Preview_agreement_button);
	Log.info("Preview agreement button is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Preview agreement button is displayed successfully");
	
	Element_isdisplayed(Confirm_pay_button);
	Log.info("Confirm and pay button is displayed successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Confirm and pay button is displayed successfully");
	
	Thread.sleep(200);
	
	
}


public void Validate_Previewagreement_and_Confirmandpay_buttons(String Value, String dropdown_values, String country, String clubname, String next_page_title,String rates,String F_name,String L_name , String phone,  String Email,  String address,  String city,  String state,  String zipcode, String payment_type, String card_number,  String ex_month,  String ex_year, String Routing_Number , String Account_Number) throws Exception
{
	if (Value.equalsIgnoreCase("Validate_Previewagreement_and_Confirmandpay_buttons"))
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
					review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates, F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
					Previewagreement_and_Confirmandpay_buttons();
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
				 	review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,   phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				 	Previewagreement_and_Confirmandpay_buttons();
				 	count++;
				 	break;
			 		}
		 }
		 else if( clubname == null || clubname.isEmpty() ||clubname.isBlank())
		 {
			 	Log.info("Club name not provided. By default first club "+club_name_text+" is selected");
				ExtentTestManager.getTest().log(Status.PASS, "Club name not provided. By default first club "+club_name_text+" is selected");
				clickOnjointhisclubbutton();
				review_and_confirm_button_by_filling_all_details_and_navigate_to_next_step( next_page_title, rates,  F_name,L_name,  phone,  Email,  address,  city,  state,  zipcode, payment_type, card_number,  ex_month,  ex_year, Routing_Number , Account_Number );
				Previewagreement_and_Confirmandpay_buttons();
				count++;
				break;
		 }
		
		
		 }
	   
	 if(count==0) {
			Log.error("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
//			ExtentTestManager.getTest().log(Status.FAIL, "Club name did not matched with any of the clubs in the results");
			throw new Exception("Club name: "+clubname.trim()+" did not matched with any of the clubs in the results");
		}
		
	   
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
