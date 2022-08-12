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

public class All_scenarios extends Base_Class  {

	Base_Class Base_Class;
	com.pages.Home Home;
	com.pages.Joinnow joinnow;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	com.pages.FreePass FreePass;

	@BeforeSuite
	public void reference() {
		Base_Class = new Base_Class();
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Home = new com.pages.Home();
		joinnow = new com.pages.Joinnow();
		FreePass = new com.pages.FreePass();
	}
	
	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws Throwable {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {

				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().log(Status.PASS, "*** Test Suite " + testdata.get("TestScenario").toString() + " running Starting ***");
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				ExtentTestManager.getTest().log(Status.PASS, "*** Running test method " + testdata.get("TestScenario").toString() + "...");
				Base_Class.setup();
				
//				Base_Class.setup("iPhone SE");
//				Base_Class.setup(800,800);
				ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into Application URL ");


				String Dropdown_values=testdata.get("Dropdown_values").toString();

				String Country =testdata.get("Country").toString();
				String RatesorAmenities =testdata.get("Rates/Amenities").toString();
				String Club_name =testdata.get("Club_name").toString();
				String rates_details =testdata.get("Rates_details").toString();
				String Add_amenities =testdata.get("Add_amenities").toString();
				String Included_amenities =testdata.get("Included_amenities").toString();
				String Text_input =testdata.get("Text_input").toString();
				String City_name =testdata.get("City").toString();
				String plan_rates =testdata.get("Plan_rates").toString();
				
				switch (testdata.get("TextMessage").toString()) {
				
				case "Joinnow":
					
					context.setAttribute("fileName", "Joinnow");
					Home.Validate_joinnow_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow");
					driver.quit();
					
				

				case "Joinnow_steps":

					context.setAttribute("fileName", "Joinnow_steps");
					joinnow.Validate_joinnow_steps(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow_steps");
					driver.quit();

				case "Joinnow_fields":
					
					context.setAttribute("fileName", "Joinnow_fields");
					joinnow.Validate_joinnow_fields(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow_fields");
					driver.quit();

				case "country_values":

					context.setAttribute("fileName", "country_values");
					joinnow.Validate_country_values(testdata.get("TextMessage").toString(), Dropdown_values);
					context.setAttribute("fileName", "country_values");
					driver.quit();

				case "ByStateorprovince_dropdown_ALL":

					context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
					joinnow.Validate_ByStateorprovince_values_ALL(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "ByStateorprovince_dropdown_ALL");
					driver.quit();

				case "ByStateorprovince_dropdown_CANADA":

					context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
					joinnow.Validate_ByStateorprovince_values_Canada(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "ByStateorprovince_dropdown_CANADA");
					driver.quit();
					
				case "ByStateorprovince_dropdown_USA":

					context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
					joinnow.Validate_ByStateorprovince_values_USA(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "ByStateorprovince_dropdown_USA");
					driver.quit();
					
				case "Listofclubs":

					context.setAttribute("fileName", "Listofclubs");
					joinnow.Validate_listofclubs(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "Listofclubs");
					driver.quit();

				case "club_details":

					context.setAttribute("fileName", "club_details");
					joinnow.Validate_clubs_name_address_photo_joinbutton(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "club_details");
					driver.quit();
					
					
				case "clubs_buttons":

					context.setAttribute("fileName", "clubs_buttons");
					joinnow.Validate_clubs_buttons(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "clubs_buttons");
					driver.quit();
					
					
				case "club_ratesandamenities":

					context.setAttribute("fileName", "club_ratesandamenities");
					joinnow.Validate_club_ratesandamenities(testdata.get("TextMessage").toString(), Dropdown_values, Country);
					context.setAttribute("fileName", "club_ratesandamenities");
					driver.quit();
					
				case "club_rateplans":

					context.setAttribute("fileName", "club_rateplans");
					joinnow.Validate_club_rateplans(testdata.get("TextMessage").toString(), Dropdown_values, Country, RatesorAmenities, Club_name);
					context.setAttribute("fileName", "club_rateplans");
					driver.quit();
					
				case "club_Amenities":

					context.setAttribute("fileName", "club_Amenities");
					joinnow.Validate_club_Amenities(testdata.get("TextMessage").toString(), Dropdown_values, Country, RatesorAmenities, Club_name);
					context.setAttribute("fileName", "club_Amenities");
					driver.quit();

					
				case "Joinnow_steptwo":

					context.setAttribute("fileName", "Joinnow_steptwo");
					joinnow.Validate_joinnow_steptwo(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "Joinnow_steptwo");
					driver.quit();
					
				case "selectadditionalfeatues_yourhomeclub":

					context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
					joinnow.Validate_selectadditionalfeatues_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "selectadditionalfeatues_yourhomeclub");
					driver.quit();
					
				case "Additionalfeatures_monthlyrates":

					context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
					joinnow.Validate_Additionalfeatures_monthlyrates(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, RatesorAmenities);
					context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
					driver.quit();
					
				case "monthlyrates_$36_99_details":

					context.setAttribute("fileName", "monthlyrates_$36_99_details");
					joinnow.Validate_select_monthlyrates_$36_99_details(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, RatesorAmenities, rates_details);
					context.setAttribute("fileName", "monthlyrates_$36_99_details");
					driver.quit();
					
					
				case "monthlyrates_$46_99_details":

					context.setAttribute("fileName", "monthlyrates_$46_99_details");
					joinnow.Validate_select_monthlyrates_$46_99_details(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, plan_rates,RatesorAmenities, rates_details);
					context.setAttribute("fileName", "monthlyrates_$46_99_details");
					driver.quit();
					
				case "monthlyrates_$36_99_add_amenities_list":

					context.setAttribute("fileName", "monthlyrates_$36_99_add_amenities_list");
					joinnow.Validate_select_monthlyrates_$36_99_add_amenities_list(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, Included_amenities, Add_amenities);
					context.setAttribute("fileName", "monthlyrates_$36_99_add_amenities_list");
					driver.quit();
					
				case "monthlyrates_$46_99_add_amenities_list":

					context.setAttribute("fileName", "monthlyrates_$46_99_add_amenities_list");
					joinnow.Validate_select_monthlyrates_$46_99_add_amenities_list(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, Included_amenities, Add_amenities);
					context.setAttribute("fileName", "monthlyrates_$46_99_add_amenities_list");
					driver.quit();
					
					
				case "monthlyrates_$36_99_yourdues_section":

					context.setAttribute("fileName", "monthlyrates_$36_99_yourdues_section");
					joinnow.Validate_select_monthlyrates_$36_99_yourdues_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, RatesorAmenities, rates_details);
					context.setAttribute("fileName", "monthlyrates_$36_99_yourdues_section");
					driver.quit();
					
					
				case "monthlyrates_$46_99_yourdues_section":

					context.setAttribute("fileName", "monthlyrates_$46_99_yourdues_section");
					joinnow.Validate_select_monthlyrates_$46_99_yourdues_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, plan_rates,RatesorAmenities, rates_details);
					context.setAttribute("fileName", "monthlyrates_$46_99_yourdues_section");
					driver.quit();
					
					
				case "No_of_persons_dropdown_for_$36_99":

					context.setAttribute("fileName", "No_of_persons_dropdown_for_$36_99");
					joinnow.Validate_No_of_persons_dropdown_for_$36_99(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,Text_input, plan_rates );
					context.setAttribute("fileName", "No_of_persons_dropdown_for_$36_99");
					driver.quit();
					
					
				case "No_of_persons_dropdown_for_$46_99":

					context.setAttribute("fileName", "No_of_persons_dropdown_for_$46_99");
					joinnow.Validate_No_of_persons_dropdown_for_$46_99(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,Text_input, plan_rates );
					context.setAttribute("fileName", "No_of_persons_dropdown_for_$46_99");
					driver.quit();
					
					
					
				case "back_continue_buttons_underadditionalfeatures":

					context.setAttribute("fileName", "back_continue_buttons_underadditionalfeatures");
					joinnow.Validate_back_continue_buttons_underadditionalfeatures(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name );
					context.setAttribute("fileName", "back_continue_buttons_underadditionalfeatures");
					driver.quit();
					
				case "back_button_underadditionalfeatures":

					context.setAttribute("fileName", "back_button_underadditionalfeatures");
					joinnow.Validate_back_button_underadditionalfeatures(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input );
					context.setAttribute("fileName", "back_button_underadditionalfeatures");
					driver.quit();
					
					
				case "continue_button_underadditionalfeatures":

					context.setAttribute("fileName", "continue_button_underadditionalfeatures");
					joinnow.Validate_continue_button_underadditionalfeatures(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input );
					context.setAttribute("fileName", "continue_button_underadditionalfeatures");
					driver.quit();
					
					
				case "Validate_club_details_under_yourhomeclubsection":

					context.setAttribute("fileName", "Validate_club_details_under_yourhomeclubsection");
					joinnow.Validate_club_details_under_yourhomeclubsection(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "Validate_club_details_under_yourhomeclubsection");
					driver.quit();
					
					
				case "Validate_points_under_yourhomeclub":

					context.setAttribute("fileName", "Validate_points_under_yourhomeclub");
					joinnow.Validate_points_under_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_points_under_yourhomeclub");
					driver.quit();
					
					
				case "Validate_additionalpoints_under_yourhomeclub":

					context.setAttribute("fileName", "Validate_additionalpoints_under_yourhomeclub");
					joinnow.Validate_additionalpoints_under_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_additionalpoints_under_yourhomeclub");
					driver.quit();
					
					
				case "Validate_health_studio_registration_link_under_yourhomeclub":

					context.setAttribute("fileName", "Validate_health_studio_registration_link_under_yourhomeclub");
					joinnow.Validate_health_studio_registration_link_under_yourhomeclub(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_health_studio_registration_link_under_yourhomeclub");
					driver.quit();
					
					
				case "Validate_different_pricing_in_canadatext":

					context.setAttribute("fileName", "Validate_different_pricing_in_canadatext");
					joinnow.Validate_different_pricing_in_canadatext(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, City_name);
					context.setAttribute("fileName", "Validate_different_pricing_in_canadatext");
					driver.quit();
					
				case "Validate_all_sections_under_membership_payment_information":

					context.setAttribute("fileName", "Validate_all_sections_under_membership_payment_information");
					joinnow.Validate_all_sections_under_membership_payment_information(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_sections_under_membership_payment_information");
					driver.quit();
					
					
				case "Validate_all_fields_under_Member_information_section":

					context.setAttribute("fileName", "Validate_all_fields_under_Member_information_section");
					joinnow.Validate_all_fields_under_Member_information_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_fields_under_Member_information_section");
					driver.quit();
					
					
				case "Validate_all_fields_under_Billing_information_section":

					context.setAttribute("fileName", "Validate_all_fields_under_Billing_information_section");
					joinnow.Validate_all_fields_under_Billing_information_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_fields_under_Billing_information_section");
					driver.quit();
					
					
					
					// Freepass
				case "Free_Pass":

					context.setAttribute("fileName", "Free_Pass");
					Home.Validate_Freepass_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Free_Pass");
					driver.quit();
				
				case "Tryusforfree":

					context.setAttribute("fileName", "Tryusforfree");
					FreePass.Validate_Freepass_text(testdata.get("TextMessage").toString(),Text_input);
					context.setAttribute("fileName", "Tryusforfree");
					driver.quit();
					
				case "Enterurziporpostalcode_text":

					context.setAttribute("fileName", "Enterurziporpostalcode_text");
					FreePass.TC_LAF_Validate_Enterurziporpostalcode_text(testdata.get("TextMessage").toString(),Text_input);
					context.setAttribute("fileName", "Enterurziporpostalcode_text");
					driver.quit();
					
				case "Freepass_fields":

					context.setAttribute("fileName", "Freepass_fields");
					FreePass.TC_LAF_Validate_Freepass_Fields(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Freepass_fields");
					driver.quit();
					

				case "Freepass_Condtion_Text":

					context.setAttribute("fileName", "Freepass_Condtion_Text");
					FreePass.TC_LAF_Validate_Freepass_Condition_Text(testdata.get("TextMessage").toString(),Text_input);
					context.setAttribute("fileName", "Freepass_Condtion_Text");
					driver.quit();

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
			if (com.test.user.All_scenarios.driver!=null)driver.quit();
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
			if(completedata.get(i).get("Run").toString().equalsIgnoreCase("Yes")) 
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
