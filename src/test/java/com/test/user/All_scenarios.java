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
	com.pages.Employment Employment;
	com.pages.FreePass FreePass;
	@BeforeSuite
	public void reference() {
		Base_Class = new Base_Class();
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Home = new com.pages.Home();
		joinnow = new com.pages.Joinnow();
		Employment = new com.pages.Employment();
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
				

				ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into Application URL ");


				String Dropdown_values=testdata.get("Dropdown_values").toString();

				String Country =testdata.get("Country").toString();
				String Ratesoramenities =testdata.get("Rates/amenities").toString();
				String Club_name =testdata.get("Club_name").toString();
				
				String Add_amenities =testdata.get("Add_amenities").toString();
				String Included_amenities =testdata.get("Included_amenities").toString();
			
				String Amount_details =testdata.get("Amount_details").toString();
				String rates_details =testdata.get("Rates_details").toString();
				String plan_rates =testdata.get("Plan_rates").toString();
				
				
				
				
				String Text_input =testdata.get("Text_input").toString();
	
				
				String Number_of_Persons1 =testdata.get("Number_of_Persons1").toString();
				String Initiation_Fee =testdata.get("Initiation_Fee").toString();
				String Billing_Frequency =testdata.get("Billing_Frequency").toString();				
				String Initial_Term =testdata.get("Initial_Term").toString();
				String Prepayment =testdata.get("Prepayment").toString();
				String First_Month_Dues =testdata.get("First_Month_Dues").toString();
				String Last_Month_Dues =testdata.get("Last_Month_Dues").toString();
				String Total_initial_Payment =testdata.get("Total_initial_Payment").toString();	
				String Annual_Fee_Per_Person =testdata.get("Annual_Fee_Per_Person").toString();
				
				
				
			

				String additional_input =testdata.get("additional_input").toString();
				String input_data =testdata.get("input_data").toString();
				String input_data1 =testdata.get("input_data1").toString();
				String input_data2 =testdata.get("input_data2").toString();
				String input_data3 =testdata.get("input_data3").toString();
				String input_data4 =testdata.get("input_data4").toString();
				String Job_short_des =testdata.get("Job_short_des").toString();
				String Job_long_des =testdata.get("Job_long_des").toString();
				String F_Name =testdata.get("F_Name").toString();
				String L_Name =testdata.get("L_Name").toString();
				String Phone =testdata.get("Member_Phone").toString();
				String Email =testdata.get("Email").toString();
				String Address =testdata.get("Member_address").toString();
//				job_short_des
				String City =testdata.get("Member_City").toString();
				
				String Club_phone =testdata.get("Club_phone").toString();
				String Club_zip =testdata.get("Club_zip").toString();
				String Club_Address =testdata.get("Club_Address").toString();
				String Club_city =testdata.get("Club_city").toString();
//				
				String State =testdata.get("State").toString();
				String Zipcode =testdata.get("Member_Zipcode").toString();
				String Radius_travel_to_work =testdata.get("Radius_travel_to_work").toString();
				String How_hear_abt_us =testdata.get("How_hear_abt_us").toString();
				String Radiobtn18YearsOld =testdata.get("Radiobtn18YearsOld").toString();
				String Payment_type =testdata.get("Payment_type").toString();
				String Card_number  =testdata.get("Card_number").toString();
				
				String Ex_month =testdata.get("Ex_month").toString();
				String Ex_year  =testdata.get("Ex_year").toString();
				
				String Routing_number  =testdata.get("Routing_number").toString();
				String Account_number =testdata.get("Account_number").toString();
				String Card_name =testdata.get("Card_name").toString();
				
			
				
				
				
						
				switch (testdata.get("TextMessage").toString()) {
				
				
				// Career Opportunities / Employment Test cases
				
				
				
				case "About_dropdown":
					
					context.setAttribute("fileName", "About_dropdown");
					Home.Validate_About_dropdown(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "About_dropdown");
					driver.quit();
					
				case "Nav_to_Employment_page":
					
					context.setAttribute("fileName", "Nav_to_Employment_page");
					Home.Navigate_to_Emplyoment_page(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Nav_to_Employment_page");
					driver.quit();		
				
				case "Validate_play_pause_video":
					
					context.setAttribute("fileName", "Validate_play_pause_video");
					Employment.Validate_play_pause_video(testdata.get("TextMessage").toString(),Text_input, input_data);
					context.setAttribute("fileName", "Validate_play_pause_video");
					driver.quit();
					
				case "Validate_Club_and_corporate_positions":
					
					context.setAttribute("fileName", "Validate_Club_and_corporate_positions");
					Employment.Validate_Club_and_corporate_positions(testdata.get("TextMessage").toString(), Text_input, input_data, additional_input);
					context.setAttribute("fileName", "Validate_Club_and_corporate_positions");
					driver.quit();
					
				case "Career_opportunity_section":
					
					context.setAttribute("fileName", "Career_opportunity_section");
					Employment.Career_opportunity_section(testdata.get("TextMessage").toString(), Text_input, input_data);
					context.setAttribute("fileName", "Career_opportunity_section");
					driver.quit();
					
				case "Validate_Club_positions_section":
					
					context.setAttribute("fileName", "Validate_Club_positions_section");
					Employment.Validate_Club_positions_section(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2);
					context.setAttribute("fileName", "Validate_Club_positions_section");
					driver.quit();
					
				case "Validate_corporate_positions_section":
					
					context.setAttribute("fileName", "Validate_corporate_positions_section");
					Employment.Validate_Corporate_positions_section(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1 );
					context.setAttribute("fileName", "Validate_corporate_positions_section");
					driver.quit();
					
					
					
				case "Validate_details_of_Group_Fitness_position":
					
					context.setAttribute("fileName", "Validate_details_of_Group_Fitness_position");
					Employment.Validate_details_of_Group_Fitness_position(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Group_Fitness_position");
					driver.quit();
					
				case "Validate_details_of_Personal_Trainer_position":
					
					context.setAttribute("fileName", "Validate_details_of_Personal_Trainer_position");
					Employment.Validate_details_of_Personal_Trainer_position(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Personal_Trainer_position");
					driver.quit();
					
				case "Validate_details_of_Pilates_Teacher_position":
					
					context.setAttribute("fileName", "Validate_details_of_Pilates_Teacher_position");
					Employment.Validate_details_of_Pilates_Teacher_position(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Pilates_Teacher_position");
					driver.quit();
					
				case "Validate_details_of_Hiit_Coach_position":
					
					context.setAttribute("fileName", "Validate_details_of_Hiit_Coach_position");
					Employment.Validate_details_of_Hiit_Coach_position(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Hiit_Coach_position");
					driver.quit();
					
					
				case "Validate_moreinfo_popupwindow_of_GFP":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_GFP");
					Employment.Validate_moreinfo_popupwindow_of_Group_Fitness_position(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_GFP");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Personal_TP":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Personal_TP");
					Employment.Validate_moreinfo_popupwindow_of_Personal_TP(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Personal_TP");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Pilates_TP":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Pilates_TP");
					Employment.Validate_moreinfo_popupwindow_of_Pilates_TP(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Pilates_TP");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_HCP":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_HCP");
					Employment.Validate_moreinfo_popupwindow_of_HCP(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_HCP");
					driver.quit();
					
				case "Validate_details_of_Accounting":
					
					context.setAttribute("fileName", "Validate_details_of_Accounting");
					Employment.Validate_details_of_Accounting(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_Accounting");
					driver.quit();
					
				case "Validate_details_of_Finance_and_T":
					
					context.setAttribute("fileName", "Validate_details_of_Finance_and_T");
					Employment.Validate_details_of_Finance_and_T(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_Finance_and_T");
					driver.quit();
					
				case "Validate_details_of_HR":
					
					context.setAttribute("fileName", "Validate_details_of_HR");
					Employment.Validate_details_of_HR(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_HR");
					driver.quit();
					
				case "Validate_details_of_IT":
					
					context.setAttribute("fileName", "Validate_details_of_IT");
					Employment.Validate_details_of_IT(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_IT");
					driver.quit();
					
				case "Validate_details_of_Legal_and_A":
					
					context.setAttribute("fileName", "Validate_details_of_Legal_and_A");
					Employment.Validate_details_of_Legal_and_A(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_Legal_and_A");
					driver.quit();
					
				case "Validate_details_of_RealEstate_and_D":
					
					context.setAttribute("fileName", "Validate_details_of_RealEstate_and_D");
					Employment.Validate_details_of_RealEstate_and_D(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des );
					context.setAttribute("fileName", "Validate_details_of_RealEstate_and_D");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Accounting":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Accounting");
					Employment.Validate_moreinfo_popupwindow_of_Accounting(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des );
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Accounting");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Finance_and_T":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Finance_and_T");
					Employment.Validate_moreinfo_popupwindow_of_Finance_and_T(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Finance_and_T");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Human_R":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Human_R");
					Employment.Validate_moreinfo_popupwindow_of_Human_R(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Human_R");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_IT":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_IT");
					Employment.Validate_moreinfo_popupwindow_of_IT(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_IT");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_Legal_and_A":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Legal_and_A");
					Employment.Validate_moreinfo_popupwindow_of_Legal_and_A(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_Legal_and_A");
					driver.quit();
					
				case "Validate_moreinfo_popupwindow_of_RE_and_D":
					
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_RE_and_D");
					Employment.Validate_moreinfo_popupwindow_of_RE_and_D(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data2,input_data1,Job_short_des, Job_long_des);
					context.setAttribute("fileName", "Validate_moreinfo_popupwindow_of_RE_and_D");
					driver.quit();
					
				case "Validate_GF_applyhere_button":
					
					context.setAttribute("fileName", "Validate_GF_applyhere_button");
					Employment.Validate_GF_applyhere_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Validate_GF_applyhere_button");
					driver.quit();
					
				case "Validate_Pilates_T_applyhere_button":
					
					context.setAttribute("fileName", "Validate_Pilates_T_applyhere_button");
					Employment.Validate_Pilates_T_applyhere_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Validate_Pilates_T_applyhere_button");
					driver.quit();
					
				case "Validate_Personal_T_applyhere_button":
					
					context.setAttribute("fileName", "Validate_Personal_T_applyhere_button");
					Employment.Validate_Personal_T_applyhere_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Validate_Personal_T_applyhere_button");
					driver.quit();
					
				case "Validate_HIIT_C_applyhere_button":
					
					context.setAttribute("fileName", "Validate_HIIT_C_applyhere_button");
					Employment.Validate_HIIT_C_applyhere_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Validate_HIIT_C_applyhere_button");
					driver.quit();
					
					
				case "Validate_applyhere_button_followingpos_text":
					
					context.setAttribute("fileName", "Validate_applyhere_button_followingpos_text");
					Employment.Validate_applyhere_button_followingpos_text(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3);
					context.setAttribute("fileName", "Validate_applyhere_button_followingpos_text");
					driver.quit();
					
				case "Validate_details_of_General_Manager":
					
					context.setAttribute("fileName", "Validate_details_of_General_Manager");
					Employment.Validate_details_of_General_Manager(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_General_Manager");
					driver.quit();
					
				case "Validate_details_of_Operations_Manager":
					
					context.setAttribute("fileName", "Validate_details_of_Operations_Manager");
					Employment.Validate_details_of_Operations_Manager(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Operations_Manager");
					driver.quit();
					
				case "Validate_details_of_Personal_TD":
					
					context.setAttribute("fileName", "Validate_details_of_Personal_TD");
					Employment.Validate_details_of_Personal_TD(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Personal_TD");
					driver.quit();
					
				case "Validate_details_of_Membership_Counselor":
					
					context.setAttribute("fileName", "Validate_details_of_Membership_Counselor");
					Employment.Validate_details_of_Membership_Counselor(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Membership_Counselor");
					driver.quit();
					
				case "Validate_details_of_Personal_TMC":
					
					context.setAttribute("fileName", "Validate_details_of_Personal_TMC");
					Employment.Validate_details_of_Personal_TMC(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Personal_TMC");
					driver.quit();
					
				case "Validate_details_of_Club_Staff":
					
					context.setAttribute("fileName", "Validate_details_of_Club_Staff");
					Employment.Validate_details_of_Club_Staff(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Club_Staff");
					driver.quit();
					
				case "Validate_details_of_League_SD":
					
					context.setAttribute("fileName", "Validate_details_of_League_SD");
					Employment.Validate_details_of_League_SD(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_League_SD");
					driver.quit();
					
				case "Validate_details_of_Equipment_Tech":
					
					context.setAttribute("fileName", "Validate_details_of_Equipment_Tech");
					Employment.Validate_details_of_Equipment_Tech(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Equipment_Tech");
					driver.quit();
					
				case "Validate_details_of_HVAC_Building_M":
					
					context.setAttribute("fileName", "Validate_details_of_HVAC_Building_M");
					Employment.Validate_details_of_HVAC_Building_M(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_HVAC_Building_M");
					driver.quit();
					
				case "Validate_details_of_Pride_Janitor":
					
					context.setAttribute("fileName", "Validate_details_of_Pride_Janitor");
					Employment.Validate_details_of_Pride_Janitor(testdata.get("TextMessage").toString(),Text_input, input_data, additional_input, input_data1, input_data2, input_data3, input_data4, Job_short_des);
					context.setAttribute("fileName", "Validate_details_of_Pride_Janitor");
					driver.quit();
					
					
//				case "Group_Fitness_job":
//					
//					context.setAttribute("fileName", "Group_Fitness_job");
//					Employment.Group_Fitness_apply_here(testdata.get("TextMessage").toString(),How_hear_abt_us, F_Name, L_Name, Email  , Phone , Address , Zipcode  , City , State , Radius_travel_to_work, Radiobtn18YearsOld);
//					context.setAttribute("fileName", "Group_Fitness_job");
//					driver.quit();
					
				// Join Now Testcases
				
				case "Joinnow":
					
					context.setAttribute("fileName", "Joinnow");
					Home.Validate_joinnow_button(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow");
					driver.quit();
					
				

				case "Joinnow_searchclub_4steps":

					context.setAttribute("fileName", "Joinnow_searchclub_4steps");
					joinnow.Joinnow_searchclub_4steps(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow_searchclub_4steps");
					driver.quit();

				case "Joinnow_fields_buttons":
					
					context.setAttribute("fileName", "Joinnow_fields_buttons");
					joinnow.Validate_joinnow_fields_buttons(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Joinnow_fields_buttons");
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
					joinnow.Validate_club_ratesandamenities(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name);
					context.setAttribute("fileName", "club_ratesandamenities");
					driver.quit();
					
				case "club_rateplans":

					context.setAttribute("fileName", "club_rateplans");
					joinnow.Validate_club_rateplans(testdata.get("TextMessage").toString(), Dropdown_values, Country, Ratesoramenities, Club_name);
					context.setAttribute("fileName", "club_rateplans");
					driver.quit();
					
				case "club_Amenities":

					context.setAttribute("fileName", "club_Amenities");
					joinnow.Validate_club_Amenities(testdata.get("TextMessage").toString(), Dropdown_values, Country, Ratesoramenities, Club_name);
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
					joinnow.Validate_Additionalfeatures_monthlyrates(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Ratesoramenities);
					context.setAttribute("fileName", "Additionalfeatures_monthlyrates");
					driver.quit();
					
				case "monthlyrates_firstplan_details":

					context.setAttribute("fileName", "monthlyrates_firstplan_details");
					joinnow.Validate_select_monthlyrates_firstplan_details(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
					context.setAttribute("fileName", "monthlyrates_firstplan_details");
					driver.quit();
					
					
				case "monthlyrates_secondplan_details":

					context.setAttribute("fileName", "monthlyrates_secondplan_details");
					joinnow.Validate_select_monthlyrates_secondplan_details(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, plan_rates, Number_of_Persons1, Initiation_Fee, Billing_Frequency, Initial_Term, Prepayment);
					context.setAttribute("fileName", "monthlyrates_secondplan_details");
					driver.quit();
					
				case "monthlyrates_firstplan_add_amenities_list":

					context.setAttribute("fileName", "monthlyrates_firstplan_add_amenities_list");
					joinnow.Validate_select_monthlyrates_firstplan_add_amenities_list(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, Included_amenities, Add_amenities);
					context.setAttribute("fileName", "monthlyrates_firstplan_add_amenities_list");
					driver.quit();
					
				case "monthlyrates_secondplan_add_amenities_list":

					context.setAttribute("fileName", "monthlyrates_secondplan_add_amenities_list");
					joinnow.Validate_select_monthlyrates_secondplan_add_amenities_list(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, Included_amenities, Add_amenities);
					context.setAttribute("fileName", "monthlyrates_secondplan_add_amenities_list");
					driver.quit();
					
					
				case "monthlyrates_firstplan_yourdues_section":

					context.setAttribute("fileName", "monthlyrates_firstplan_yourdues_section");
					joinnow.Validate_select_monthlyrates_firstplan_yourdues_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name,plan_rates, First_Month_Dues ,Last_Month_Dues ,Total_initial_Payment ,Annual_Fee_Per_Person);
					context.setAttribute("fileName", "monthlyrates_firstplan_yourdues_section");
					driver.quit();
					
					
				case "monthlyrates_secondplan_yourdues_section":

					context.setAttribute("fileName", "monthlyrates_secondplan_yourdues_section");
					joinnow.Validate_select_monthlyrates_secondplan_yourdues_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, plan_rates, First_Month_Dues, Last_Month_Dues ,Total_initial_Payment ,Annual_Fee_Per_Person);
					context.setAttribute("fileName", "monthlyrates_secondplan_yourdues_section");
					driver.quit();
//				/*	
					
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
					joinnow.Validate_different_pricing_in_canadatext(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, City);
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
					
					
				case "Validate_all_fields_by_selecting_creditcard_radiobutton":

					context.setAttribute("fileName", "Validate_all_fields_by_selecting_creditcard_radiobutton");
					joinnow.Validate_all_fields_by_selecting_creditcard_radiobutton(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_fields_by_selecting_creditcard_radiobutton");
					driver.quit();
					
					
				case "Validate_all_fields_by_selecting_checking_radiobutton":

					context.setAttribute("fileName", "Validate_all_fields_by_selecting_checking_radiobutton");
					joinnow.Validate_all_fields_by_selecting_checking_radiobutton(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_fields_by_selecting_checking_radiobutton");
					driver.quit();
					
				case "Validate_all_fields_by_selecting_savings_radiobutton":

					context.setAttribute("fileName", "Validate_all_fields_by_selecting_savings_radiobutton");
					joinnow.Validate_all_fields_by_selecting_savings_radiobutton(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_all_fields_by_selecting_savings_radiobutton");
					driver.quit();
					
					
				case "Validate_use_same_information_for_monthly_billing_checkbox":

					context.setAttribute("fileName", "Validate_use_same_information_for_monthly_billing_checkbox");
					joinnow.Validate_use_same_information_for_monthly_billing_checkbox(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input);
					context.setAttribute("fileName", "Validate_use_same_information_for_monthly_billing_checkbox");
					driver.quit();
					
				case "Validate_initial_payment_amounts":

					context.setAttribute("fileName", "Validate_initial_payment_amounts");
					joinnow.Validate_initial_payment_amounts(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input,plan_rates, rates_details,Amount_details);
					context.setAttribute("fileName", "Validate_initial_payment_amounts");
					driver.quit();
					
					
				case "Validate_included_amenities_under_initial_payment_amount_section":

					context.setAttribute("fileName", "Validate_included_amenities_under_initial_payment_amount_section");
					joinnow.Validate_included_amenities_under_initial_payment_amount_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, Included_amenities);
					context.setAttribute("fileName", "Validate_included_amenities_under_initial_payment_amount_section");
					driver.quit();
					
				case "Validate_details_in_Your_home_club_section":

					context.setAttribute("fileName", "Validate_details_in_Your_home_club_section");
					joinnow.Validate_details_in_Your_home_club_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input,Address, additional_input,input_data, input_data1);
					context.setAttribute("fileName", "Validate_details_in_Your_home_club_section");
					driver.quit();
					
					
				case "Validate_back_and_Review_confirm_buttons":

					context.setAttribute("fileName", "Validate_back_and_Review_confirm_buttons");
					joinnow.Validate_back_and_Review_confirm_buttons(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates);
					context.setAttribute("fileName", "Validate_back_and_Review_confirm_buttons");
					driver.quit();
					
					
				case "Validate_back_button_in_step3":

					context.setAttribute("fileName", "Validate_back_button_in_step3");
					joinnow.Validate_back_button_in_step3(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates);
					context.setAttribute("fileName", "Validate_back_button_in_step3");
					driver.quit();
					
				case "Validate_review_and_confirm_button_by_fillingalldetails":

					context.setAttribute("fileName", "Validate_review_and_confirm_button_by_fillingalldetails");
					joinnow.Validate_review_and_confirm_button_by_fillingalldetails(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_review_and_confirm_button_by_fillingalldetails");
					driver.quit();
					
					
				case "Validate_all_sections_in_review_and_confirm_membership_page":

					context.setAttribute("fileName", "Validate_all_sections_in_review_and_confirm_membership_page");
					joinnow.Validate_all_sections_in_review_and_confirm_membership_page(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_all_sections_in_review_and_confirm_membership_page");
					driver.quit();
					
					
				case "Validate_user_details_in_review_page":

					context.setAttribute("fileName", "Validate_user_details_in_review_page");
					joinnow.Validate_user_details_in_review_page(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_user_details_in_review_page");
					driver.quit();
					
				case "Validate_user_fullname_under_billingsection":

					context.setAttribute("fileName", "Validate_user_fullname_under_billingsection");
					joinnow.Validate_user_fullname_under_billingsection(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_user_fullname_under_billingsection");
					driver.quit();
					
				case "Validate_user_payment_info":

					context.setAttribute("fileName", "Validate_user_payment_info");
					joinnow.Validate_user_payment_info(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, Card_name);
					context.setAttribute("fileName", "Validate_user_payment_info");
					driver.quit();
					
					
					
				case "Validate_user_fullname_under_monthlyduesbillingsection":

					context.setAttribute("fileName", "Validate_user_fullname_under_monthlyduesbillingsection");
					joinnow.Validate_user_fullname_under_monthlyduesbillingsection(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_user_fullname_under_monthlyduesbillingsection");
					driver.quit();
					
					
				case "Validate_user_monthly_dues_payment_info":

					context.setAttribute("fileName", "Validate_user_monthly_dues_payment_info");
					joinnow.Validate_user_monthly_dues_payment_info(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, Card_name, input_data);
					context.setAttribute("fileName", "Validate_user_monthly_dues_payment_info");
					driver.quit();
					
					
					
				case "Validate_Monthly_dues_amount":

					context.setAttribute("fileName", "Validate_Monthly_dues_amount");
					joinnow.Validate_Monthly_dues_amount(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_Monthly_dues_amount");
					driver.quit();
					
					
				case "Validate_initial_payment_amount_section":

					context.setAttribute("fileName", "Validate_initial_payment_amount_section");
					joinnow.Validate_initial_payment_amount_section(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, input_data, input_data1);
					context.setAttribute("fileName", "Validate_initial_payment_amount_section");
					driver.quit();
					
					
					
				case "Validate_Includeded_amenities_in_review_page":

					context.setAttribute("fileName", "Validate_Includeded_amenities_in_review_page");
					joinnow.Validate_Includeded_amenities_in_review_page(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, Included_amenities);
					context.setAttribute("fileName", "Validate_Includeded_amenities_in_review_page");
					driver.quit();
					
					
					
				case "Validate_all_yourhomeclub_section_review_page":

					context.setAttribute("fileName", "Validate_all_yourhomeclub_section_review_page");
					joinnow.Validate_all_yourhomeclub_section_review_page(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, input_data,additional_input, input_data1, Club_Address, Club_city, Club_zip, Club_phone);
					context.setAttribute("fileName", "Validate_all_yourhomeclub_section_review_page");
					driver.quit();
					
					
				case "Validate_Membership_agreement_in_review_page":

					context.setAttribute("fileName", "Validate_Membership_agreement_in_review_page");
					joinnow.Validate_Membership_agreement_in_review_page(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number, additional_input);
					context.setAttribute("fileName", "Validate_Membership_agreement_in_review_page");
					driver.quit();
					
					
				case "Validate_Previewagreement_and_Confirmandpay_buttons":

					context.setAttribute("fileName", "Validate_Previewagreement_and_Confirmandpay_buttons");
					joinnow.Validate_Previewagreement_and_Confirmandpay_buttons(testdata.get("TextMessage").toString(), Dropdown_values, Country, Club_name, Text_input, plan_rates, F_Name, L_Name, Phone,  Email,  Address,  City,  State,  Zipcode, Payment_type, Card_number,  Ex_month,  Ex_year, Routing_number , Account_number);
					context.setAttribute("fileName", "Validate_Previewagreement_and_Confirmandpay_buttons");
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
//					*/

					
					
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
