package com.test.user;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.testng.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.google.common.base.Throwables;
import com.listeners.TestListener;

public class Responsive_scenarios extends Base_Class {

	Base_Class Base_Class;
	com.pages.Home Home;
	com.pages.Home_Mobile Home_mobile;
	com.pages.Joinnow_Mobile Joinnow_Mobile;
	com.pages.Joinnow joinnow;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;

	@BeforeSuite
	public void reference() {
		Base_Class = new Base_Class();
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Home_mobile = new com.pages.Home_Mobile();
		Joinnow_Mobile = new com.pages.Joinnow_Mobile();
		Home = new com.pages.Home();
		joinnow = new com.pages.Joinnow();
	}
	
	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws Throwable {

		try {

			if (testdata.get("Res_Run").toString().equalsIgnoreCase("Yes")) {
				
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().log(Status.PASS, "*** Running the tests in Responsive mode ***");
				Log.info("*** Running the tests in Responsive mode ***");
				ExtentTestManager.getTest().log(Status.PASS, "*** Test Suite " + testdata.get("TestScenario").toString() + " running Starting ***");
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				ExtentTestManager.getTest().log(Status.PASS, "*** Running test method " + testdata.get("TestScenario").toString() + "...");
//				Base_Class.setup();
//				String dimensions =testdata.get("Dimensions").toString();
				String device=testdata.get("Mobile_Device").toString();

				Boolean mobile=false;
//				Boolean dimension=false;
//				Boolean ipad=false;
				
//				if(!dimensions.isBlank()) {
//				String[] dim=dimensions.split(",");
//				int w=Integer.parseInt(dim[0].trim());
//				int h=Integer.parseInt(dim[1].trim());
//				height=h;
//				width=w;
//				Base_Class.setup(width,height);
//				dimension=true;
//				ExtentTestManager.getTest().log(Status.PASS, "Running as per the dimensions width : "+width + " height: "+height);
//				Log.info("Running as per the dimensions width : "+width + " height: "+height);
//				
//				}else
				
				if(!device.isBlank()){
				Base_Class.setup(device);
				mobile=true;
				
				ExtentTestManager.getTest().log(Status.PASS, "Running in the device : "+device);
				Log.info("Running in the device : "+device);
					
				}
				else {
					Base_Class.setup();
				}

				
				
				ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into Application URL ");


				String Dropdown_values=testdata.get("Dropdown_values").toString();

				String Country =testdata.get("Country").toString();
				String Ratesoramenities =testdata.get("Rates/amenities").toString();
				String Club_name =testdata.get("Club_name").toString();
				String rates_details =testdata.get("Rates_details").toString();
				String plan_rates =testdata.get("Plan_rates").toString();
				
				String Number_of_Persons1 =testdata.get("Number_of_Persons1").toString();
				String Initiation_Fee =testdata.get("Initiation_Fee").toString();
				String Billing_Frequency =testdata.get("Billing_Frequency").toString();				
				String Initial_Term =testdata.get("Initial_Term").toString();
				String Prepayment =testdata.get("Prepayment").toString();
				String First_Month_Dues =testdata.get("First_Month_Dues").toString();
				String Last_Month_Dues =testdata.get("Last_Month_Dues").toString();
				String Total_initial_Payment =testdata.get("Total_initial_Payment").toString();	
				String Annual_Fee_Per_Person =testdata.get("Annual_Fee_Per_Person").toString();
				
				
				switch (testdata.get("TextMessage").toString()) {
				
				case "Joinnow":
					if(mobile) {
					context.setAttribute("fileName", "Joinnow");
					Home_mobile.Validate_joinnow_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow");
					driver.quit();
					}
					
					
					else  {
						context.setAttribute("fileName", "Joinnow");
						Home.Validate_joinnow_button(testdata.get("TextMessage").toString());
						context.setAttribute("fileName", "Joinnow");
						driver.quit();
					}
					

				case "Joinnow_steps":
					if(mobile) {
						context.setAttribute("fileName", "Joinnow_steps");
						Joinnow_Mobile.Validate_joinnow_steps(testdata.get("TextMessage").toString());
						context.setAttribute("fileName", "Joinnow_steps");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "Joinnow_steps");
							joinnow.Validate_joinnow_steps(testdata.get("TextMessage").toString());
							context.setAttribute("fileName", "Joinnow_steps");
							driver.quit();
						}
					

				case "Joinnow_fields":
					
					if(mobile) {
						context.setAttribute("fileName", "Joinnow_fields");
						Joinnow_Mobile.Validate_joinnow_fields(testdata.get("TextMessage").toString());
						context.setAttribute("fileName", "Joinnow_fields");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "Joinnow_fields");
							joinnow.Validate_joinnow_fields(testdata.get("TextMessage").toString());
							context.setAttribute("fileName", "Joinnow_fields");
							driver.quit();
						}
					
					

				case "country_values":
					
					

					if(mobile) {
						context.setAttribute("fileName", "country_values");
						Joinnow_Mobile.Validate_country_values(testdata.get("TextMessage").toString(), Dropdown_values);
						context.setAttribute("fileName", "country_values");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "country_values");
							joinnow.Validate_country_values(testdata.get("TextMessage").toString(), Dropdown_values);
							context.setAttribute("fileName", "country_values");
							driver.quit();
						}

					

				case "ByStateorprovince_dropdown_ALL":

					
					if(mobile) {
						context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
						Joinnow_Mobile.Validate_ByStateorprovince_values_ALL(testdata.get("TextMessage").toString(), Dropdown_values, Country);
						context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
							joinnow.Validate_ByStateorprovince_values_ALL(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
							driver.quit();
						}

					

				case "ByStateorprovince_dropdown_CANADA":

					if(mobile) {
						context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
						Joinnow_Mobile.Validate_ByStateorprovince_values_Canada(testdata.get("TextMessage").toString(), Dropdown_values, Country);
						context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
							joinnow.Validate_ByStateorprovince_values_Canada(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
							driver.quit();
						}

					
				
					
				case "ByStateorprovince_dropdown_USA":

					
					if(mobile) {
						context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
						Joinnow_Mobile.Validate_ByStateorprovince_values_USA(testdata.get("TextMessage").toString(), Dropdown_values, Country);
						context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
							joinnow.Validate_ByStateorprovince_values_USA(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
							driver.quit();
						}
					
					
					
					
				case "Listofclubs":

					
					if(mobile) {
						context.setAttribute("fileName", "Listofclubs");
						Joinnow_Mobile.Validate_listofclubs(testdata.get("TextMessage").toString(), Dropdown_values, Country);
						context.setAttribute("fileName", "Listofclubs");
						driver.quit();
						}
						else {
							context.setAttribute("fileName", "Listofclubs");
							joinnow.Validate_listofclubs(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "Listofclubs");
							driver.quit();
						}
					
				

				case "club_details":

					if(mobile) {
						context.setAttribute("fileName", "club_details");
						Joinnow_Mobile.Validate_clubs_name_address_photo_joinbutton(testdata.get("TextMessage").toString(), Dropdown_values, Country, device);
						context.setAttribute("fileName", "club_details");
						driver.quit();
						}
						
						
						else {
							context.setAttribute("fileName", "club_details");
							joinnow.Validate_clubs_name_address_photo_joinbutton(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "club_details");
							driver.quit();
						}
					
					
					
				case "clubs_buttons":

					
					if(mobile) {
						context.setAttribute("fileName", "clubs_buttons");
						Joinnow_Mobile.Validate_clubs_buttons(testdata.get("TextMessage").toString(), Dropdown_values, Country, device);
						context.setAttribute("fileName", "clubs_buttons");
						driver.quit();
						}
					
						else {
							context.setAttribute("fileName", "clubs_buttons");
							joinnow.Validate_clubs_buttons(testdata.get("TextMessage").toString(), Dropdown_values, Country);
							context.setAttribute("fileName", "clubs_buttons");
							driver.quit();
						}
					
					
				
					
					
				case "club_ratesandamenities":
					
					if(mobile) {
						context.setAttribute("fileName", "club_ratesandamenities");
						Joinnow_Mobile.Validate_club_ratesandamenities(testdata.get("TextMessage").toString(), Dropdown_values, Country,Club_name, device);
						context.setAttribute("fileName", "club_ratesandamenities");
						driver.quit();
						}
					
						else {
							context.setAttribute("fileName", "club_ratesandamenities");
							joinnow.Validate_club_ratesandamenities(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
							context.setAttribute("fileName", "club_ratesandamenities");
							driver.quit();
						}
					
					
					
					
					
					
				case "club_rateplans":
					
					if(mobile) {
						context.setAttribute("fileName", "club_rateplans");
						Joinnow_Mobile.Validate_club_rateplans(testdata.get("TextMessage").toString(), Dropdown_values, Country,Ratesoramenities,Club_name, device);
						context.setAttribute("fileName", "club_rateplans");
						driver.quit();
						}
					
						else {
					
					context.setAttribute("fileName", "club_rateplans");
					joinnow.Validate_club_rateplans(testdata.get("TextMessage").toString(), Dropdown_values, Country, Ratesoramenities, Club_name);
					context.setAttribute("fileName", "club_rateplans");
					driver.quit();
					}
					
					
				case "club_Amenities":

					if(mobile) {
						context.setAttribute("fileName", "club_Amenities");
						Joinnow_Mobile.Validate_club_Amenities(testdata.get("TextMessage").toString(), Dropdown_values, Country,Ratesoramenities,Club_name, device);
						context.setAttribute("fileName", "club_Amenities");
						driver.quit();
						}
					
						else {
					
					context.setAttribute("fileName", "club_Amenities");
					joinnow.Validate_club_Amenities(testdata.get("TextMessage").toString(), Dropdown_values, Country, Ratesoramenities, Club_name);
					context.setAttribute("fileName", "club_Amenities");
					driver.quit();
						}
					
					
				case "Joinnow_steptwo":
					if(mobile) {
						context.setAttribute("fileName", "Joinnow_steptwo");
						Joinnow_Mobile.Validate_joinnow_steptwo(testdata.get("TextMessage").toString(), Dropdown_values, Country,Club_name, device);
						context.setAttribute("fileName", "Joinnow_steptwo");
						driver.quit();
						}
					
						else {
					context.setAttribute("fileName", "Joinnow_steptwo");
					joinnow.Validate_joinnow_steptwo(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "Joinnow_steptwo");
					driver.quit();
						}
					
				case "selectadditionalfeatues_yourhomeclub":
					if(mobile) {
						context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
						Joinnow_Mobile.Validate_selectadditionalfeatues_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country,Club_name, device);
						context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
						driver.quit();
						}
					
						else {
					context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
					joinnow.Validate_selectadditionalfeatues_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
					driver.quit();
						}
					
					
				case "Additionalfeatures_monthlyrates":

					if(mobile) {
						context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
						Joinnow_Mobile.Validate_Additionalfeatures_monthlyrates(testdata.get("TextMessage").toString(), Dropdown_values, Country,Club_name,Ratesoramenities, device);
						context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
						driver.quit();
						}
					
						else {
					
					context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
					joinnow.Validate_Additionalfeatures_monthlyrates(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Ratesoramenities);
					context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
					driver.quit();
					
						}
					
					
				case "monthlyrates_$36_99_details":

					if(mobile) {
						context.setAttribute("fileName", "monthlyrates_$36_99_details");
						Joinnow_Mobile.Validate_select_monthlyrates_$36_99_details(testdata.get("TextMessage").toString(), Dropdown_values, Country,Club_name, plan_rates,Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment, device);
						context.setAttribute("fileName", "monthlyrates_$36_99_details");
						driver.quit();
						}
					
						else {
					context.setAttribute("fileName", "monthlyrates_$36_99_details");
					joinnow.Validate_select_monthlyrates_$36_99_details(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
					context.setAttribute("fileName", "monthlyrates_$36_99_details");
					driver.quit();
						}
					

				default:
					driver.quit();
					break;

				}

				// EndTest
//				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.getTest().log(Status.PASS, "*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
				ExtentTestManager.getTest().log(Status.PASS, "Browser is closed");
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
				Log.info("Browser is closed");


			}

		} 
		catch (Exception e)
		{
			Thread.sleep(1000);
			ExtentTestManager.getTest().log(Status.FAIL, "*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			String stackTrace = Throwables.getStackTraceAsString(e);
			Log.error( stackTrace);
			
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				ExtentTestManager.getTest().log(Status.FAIL, e);
				} 
			catch (Exception e1) {
				System.out.println("File not found " + e1);
								}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

//			 Logout
			context.setAttribute("fileName", "Logout");
			if (com.test.user.Responsive_scenarios.driver!=null)driver.quit();
				
			ExtentTestManager.getTest().log(Status.PASS, "Browser is closed");
			Log.info("Browser is closed");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} 
		catch (AssertionError e) 
		{
			
			Thread.sleep(1000);
//			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			ExtentTestManager.getTest().log(Status.FAIL, "*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			String stackTrace = Throwables.getStackTraceAsString(e);
			Log.error( stackTrace);
		
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				ExtentTestManager.getTest().log(Status.FAIL, e);
				} 
			catch (Exception e1)
			{
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Browser is closed");
			Log.info("Browser is closed");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}
	}


	
	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		java.util.List<Map<String, String>> completedata1 = new ArrayList<Map<String,String>>();
		int j=0;

		for (int i = 0; i < completedata.size(); i++) {
			if(completedata.get(i).get("Res_Run").toString().equalsIgnoreCase("Yes")) 
			{
			completedata1.add(j, completedata.get(i));
			j++;
			}
		}
		
		objectarry = new Object[completedata1.size()][1];
		
		for (int i = 0; i < completedata1.size(); i++) {
			objectarry[i][0] = completedata1.get(i);
		}
		return objectarry;

	}

}
