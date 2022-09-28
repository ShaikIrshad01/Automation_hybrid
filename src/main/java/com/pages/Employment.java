package com.pages;

import com.BasePackage.Base_Class;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.Utility.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import org.testng.Assert;


public class Employment extends Base_Class {
	

	private static By About = By.xpath("//a[@class='drop-down-arrow']");
	private static By Carer_Opp = By.xpath("//div[@class='nav-drop-down']//a[contains(text(),'Career Opportunities')]");
	private static By Career_Opportunity_text = By.xpath("//h1[contains(text(),'Career Opportunity')]");
	private static By Employment_Application_text = By.xpath("//h1[contains(text(),'Employment Application')]");
	private static By video = By.xpath("//iframe[@class='embed-responsive-item ae-media ae-youtube']");
	private static By club_positions = By.id("LinkButtonClubJobAds");
	private static By corp_positions = By.id("LinkButtonCorpJobAds");
	private static By Group_Fitness_moreinfo = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][1]//a[@class='moreinfo']");
	private static By Personal_T_moreinfo = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][2]//a[@class='moreinfo']");
	private static By Pil_T_moreinfo = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][3]//a[@class='moreinfo']");
	private static By Hiit_c_moreinfo = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][4]//a[@class='moreinfo']");
	private static By Group_F_apply_here_button = By.id("ctl00_MainContent_JobAdsFeatured_ctl00_btnApplyFeatJob");
	private static By Personal_T_apply_here_button = By.id("ctl00_MainContent_JobAdsFeatured_ctl01_btnApplyFeatJob");
	private static By Pilates_T_apply_here_button = By.id("ctl00_MainContent_JobAdsFeatured_ctl02_btnApplyFeatJob");
	private static By Hiit_c_apply_here_button = By.id("ctl00_MainContent_JobAdsFeatured_ctl03_btnApplyFeatJob");
	private static By Group_Fitness_job_details = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][1]//div[@class='text-center']");
	private static By Personal_T_job_details = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][2]//div[@class='text-center']");
	private static By pilates_T_job_details = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][3]//div[@class='text-center']");
	private static By Hiit_c_job_details = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][4]//div[@class='text-center']");
	private static By Group_F_apply_here_image = By.id("ctl00_MainContent_JobAdsFeatured_ctl00_ImageJobAd");
	private static By Accounting_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl00_ImageJobAd");
	private static By F_and_T_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl01_ImageJobAd");
	private static By HS_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl02_ImageJobAd");
	private static By IT_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl03_ImageJobAd");
	private static By L_and_A_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl04_ImageJobAd");
	private static By RE_and_D_image = By.id("ctl00_MainContent_JobAdsCorporate_ctl05_ImageJobAd");
//	private static By Group_F_apply_here_image = By.id("ctl00_MainContent_JobAdsFeatured_ctl00_ImageJobAd");
	
	private static By Personal_T_apply_here_image = By.id("ctl00_MainContent_JobAdsFeatured_ctl01_ImageJobAd");
	private static By Pilates_T_apply_here_image = By.id("ctl00_MainContent_JobAdsFeatured_ctl02_ImageJobAd");
	private static By HIIT_C__apply_here_image = By.id("ctl00_MainContent_JobAdsFeatured_ctl03_ImageJobAd");
	private static By Grp_jobtitle= By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][1]//div[@class='jobTitle']");
	
	
	private static By per_T_jobtitle= By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][2]//div[@class='jobTitle']");
	private static By Pil_T_jobtitle= By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][3]//div[@class='jobTitle']");
	private static By Hiit_c_jobtitle= By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector'][4]//div[@class='jobTitle']");
	private static By moreinfo_list_club_pos= By.xpath("//div[@class='btnInfo text-center']//a[@class='moreinfo']");
	private static By moreinfo_list_corp_pos= By.xpath("//div[@class='row text-center']//a[@class='moreinfo']");
	
	private static By moreinfo_popup= By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[2]/div[1]/div[1]");
	private static By moreinfo_popup_close = By.id("btnclose");
	private static By moreinfo_popup_title = By.id("iTitle");
	private static By club_jobs_content = By.id("ctl00_MainContent_trClubPositionsDescVsCorpPositions");
	
	private static By corp_jobs_content = By.xpath("//td[contains(text(),'Corporate Positions are located in Irvine, Califor')]");
	private static By corp_jobs = By.className("laJobSelector");
	
	private static By moreinfo_popup_group_image = By.xpath("//div[@class='modal-content']//img[@id='ctl00_MainContent_JobAdsFeatured_ctl00_ImageURLPopup']");
	private static By club_jobs_list = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector']");												 
	private static By club_jobs_titles = By.xpath("//div[@class='col-md-3 col-sm-6 job-feature-selector']//div[@class='jobTitle']");
	private static By corp_jobs_title=By.xpath("//div[@class='laJobSelector']//strong");
	private static By moreinfo_link_Accounting=By.xpath("//div[@class='laJobSelector'][1]//a[@class='moreinfo']");
	private static By moreinfo_link_F_and_T=By.xpath("//div[@class='laJobSelector'][2]//a[@class='moreinfo']");
	private static By moreinfo_link_HR=By.xpath("//div[@class='laJobSelector'][3]//a[@class='moreinfo']");
	private static By moreinfo_link_IT=By.xpath("//div[@class='laJobSelector'][4]//a[@class='moreinfo']");
	private static By moreinfo_link_L_and_A=By.xpath("//div[@class='laJobSelector'][5]//a[@class='moreinfo']");
	private static By moreinfo_link_RE_and_D=By.xpath("//div[@class='laJobSelector'][6]//a[@class='moreinfo']");
	
	
	private static By Accounting_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][1]//strong");
	private static By F_and_T_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][2]//strong");
	private static By HR_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][3]//strong");
	private static By IT_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][4]//strong");
	private static By L_and_A_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][5]//strong");
	private static By RE_and_D_corp_jobs_title=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][6]//strong");
	private static By Accounting_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][1]//div[@class='col-xs-12']");
	private static By F_and_T_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][2]//div[@class='col-xs-12']");
	private static By HR_corp_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][3]//div[@class='col-xs-12']");
	private static By IT_corp_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][4]//div[@class='col-xs-12']");
	private static By L_and_A_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][5]//div[@class='col-xs-12']");
	private static By RE_and_D_short_des_corp_jobs=By.xpath("//div[@class='laJobHolder']//div[@class='laJobSelector'][6]//div[@class='col-xs-12']");
	
	private static By grp_fis_moreinfo_des = By.id("Modalbody");
	private static By employment_para = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]");
	private static By app_info = By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]");
	private static By HowDidYouHear_abt_us = By.id("ctl00_MainContent_ApplicantContactLocationInfo_cboHowDidYouHear");
	private static By RadioButtonList18YearsOld_yes = By.id("ctl00_MainContent_ApplicantContactLocationInfo_RadioButtonList18YearsOld_0");
	private static By RadioButtonList18YearsOld_No = By.id("ctl00_MainContent_ApplicantContactLocationInfo_RadioButtonList18YearsOld_1");
	private static By RadioButtonList18YearsOld_No_label = By.xpath("//label[@for='ctl00_MainContent_ApplicantContactLocationInfo_RadioButtonList18YearsOld_1']");
	private static By RadioButtonList18YearsOld_Yes_label = By.xpath("//label[@for='ctl00_MainContent_ApplicantContactLocationInfo_RadioButtonList18YearsOld_0']");
	
	private static By LabelAtLeast18Error = By.id("ctl00_MainContent_ApplicantContactLocationInfo_LabelAtLeast18Error");
	private static By firstname = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxFirstName");
	private static By lastname = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxLastName");
	private static By Email = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxEmail");
	private static By con_Email = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxConfirmEmail");
	private static By phone = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxPhone");
	private static By address = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxAddress");
	private static By zipcode = By.id("TextBoxZipCode");
	private static By City = By.id("ctl00_MainContent_ApplicantContactLocationInfo_TextBoxCity");
	
	private static By State = By.id("ctl00_MainContent_ApplicantContactLocationInfo_DropDownListState");
	private static By travel_radius_dropdown = By.id("ctl00_MainContent_ApplicantContactLocationInfo_DropDownListTravelRadius");
	private static By consenttoreceive_calls_texts = By.xpath("//span[contains(text(),'By providing your cell phone number, you consent t')]");
	private static By youtube_video_play = By.xpath("//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/iframe[1]");
	private static By career_description_p = By.xpath("//body[1]/form[1]/div[3]/div[2]/div[1]/div[3]");
														
	private static By Applyhere_button = By.id("ctl00_MainContent_ImageButtonApplyCorpJob");
	
	private static By Applyhere_button1 = By.xpath("//tbody/tr[4]/td[1]/button[1]");
	
	private static By following_pos_text = By.xpath("//tbody/tr[4]/td");
	
	
	
	
	Home home= new Home();
	//div[@id='Modalbody']//div[@class='col-md-8 col-md-pull-4']//span[@id='ctl00_MainContent_JobAdsFeatured_ctl00_LabelFullDescriptionPopup']

	public void Group_Fitness_apply_here(String Value, String How_hear_abt_us, String F_name, String L_name, String email  , String Phone , String Address ,String Zipcode  , String city , String state , String Radius_travel_to_work, String Radiobtn18YearsOld ) throws Exception {
		
		if (Value.equalsIgnoreCase("Group_Fitness_job")) 
		{
//			Element_isdisplayed(About);
//			Mouse_hover(About);
//			Element_isdisplayed(About);
//			click(Carer_Opp);
//			Thread.sleep(200);
//			String t=driver.getTitle();
//			Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Gym Jobs | Fitness Employment Opportunities".toUpperCase().trim(), "Emplyoment_page title not validated and not navigatd to Emplyoment_page");
//			ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
//			Log.info("Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
//			
//			Career_opportunity_section("Career_opportunity_section");
			
//			Validate_Club_positions_section("Validate_Club_positions_section");
			
			Element_isdisplayed(Group_F_apply_here_button);
			MoveToElement(Group_F_apply_here_button);
			
			Element_isdisplayed(Group_F_apply_here_image);
			
			 Log.info("Group fitness image/video is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness image/video is displayed successfully");
			  
			 Element_isdisplayed(Grp_jobtitle);
				String title=driver.findElement(Grp_jobtitle).getText().trim();
			 Log.info("Group fitness job title is displayed successfully: "+title);
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness job title is displayed successfully: "+title);
			 
			 Element_isdisplayed(Group_Fitness_job_details);
			 String details=driver.findElement(Group_Fitness_job_details).getText().trim();
			 Log.info("Group fitness job details displayed successfully: "+details);
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness job details displayed successfully: "+details);
			 
			 click(Group_Fitness_moreinfo);
			 Log.info("Successfully clicked on Group Fitness moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Group Fitness moreinfo link");
	
//			 moreinfo_popup_title();
			 
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 Log.info("full job description displayed successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full job description displayed successfully: "+desc);
			 
			 moreinfo_popup_window_image(1);
			 
			 Close_moreinfo_popup();
			 
			 click(Group_F_apply_here_button);
			 Log.info("Successfully clicked on Group Fitness apply here button");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Group Fitness apply here button");
			 
			 Element_isdisplayed(employment_para);
			 String para_text=driver.findElement(employment_para).getText();
			 Log.info(para_text+" paragraph successfully displayed under Employment Application ");
			 ExtentTestManager.getTest().log(Status.PASS, para_text+" paragraph successfully displayed under Employment Application");
			 
			 Element_isdisplayed(app_info);
			 String app_info_txt=driver.findElement(app_info).getText();
			 Log.info(app_info_txt+" text successfully displayed under Employment Application ");
			 ExtentTestManager.getTest().log(Status.PASS, app_info_txt+" text successfully displayed under Employment Application");
			 
			 select_dropdown(HowDidYouHear_abt_us, How_hear_abt_us.trim(), "How did you hear about us");
			 
			 Select_radio_button(RadioButtonList18YearsOld_yes, Radiobtn18YearsOld.trim(), "Are You at Least 18 Years Old?");
			 
//			 Select_radio_button(RadioButtonList18YearsOld_No, "No", "Are You at Least 18 Years Old?");
			 Element_isdisplayed(firstname);
			 Log.info("First name field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "First name field is displayed successfully");
			 
			 input(firstname, F_name);
			 Log.info("first name entered successfully: "+F_name);
			 ExtentTestManager.getTest().log(Status.PASS, "first name entered successfully: "+F_name);
			 
			 Element_isdisplayed(lastname);
			 Log.info("Last name field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Last name field is displayed successfully");
			 
			 input(lastname, L_name.trim());
			 Log.info("Last name entered successfully: "+L_name);
			 ExtentTestManager.getTest().log(Status.PASS, "Last name entered successfully: " +L_name);
			 
			 Element_isdisplayed(Email);
			 Log.info("Email field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Email field is displayed successfully");
			 
			 input(Email, email.trim());
			 Log.info("Email entered successfully: "+email.trim());
			 ExtentTestManager.getTest().log(Status.PASS, "Email entered successfully: "+email.trim());
			 
			 Element_isdisplayed(con_Email);
			 Log.info("Confirm Email field is displayed successfully: ");
			 ExtentTestManager.getTest().log(Status.PASS, "Confirm Email field is displayed successfully");
			 
			 input(con_Email, email.trim());
			 Log.info("Confirm Email entered successfully: "+email.trim());
			 ExtentTestManager.getTest().log(Status.PASS, "Confirm Email entered successfully: "+email.trim());
			 
			 Element_isdisplayed(phone);
			 Log.info("phone field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "phone field is displayed successfully");
			 
			 Element_isdisplayed(consenttoreceive_calls_texts);
			 
			 Log.info("Consent to receive calls and texts message is displayed successfully: ");
			 ExtentTestManager.getTest().log(Status.PASS, "Consent to receive calls and texts message is displayed successfully: ");
			 
			 input(phone, Phone);
			 Log.info("phone number entered successfully: "+Phone);
			 ExtentTestManager.getTest().log(Status.PASS, "phone number entered successfully: "+Phone);
			 
			 Element_isdisplayed(address);
			 Log.info("Address field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Address field is displayed successfully");
			 
			 input(address, Address);
			 Log.info("address entered successfully: "+Address);
			 ExtentTestManager.getTest().log(Status.PASS, "address entered successfully: "+Address);
			 
			 
			 Element_isdisplayed(zipcode);
			 Log.info("zipcode field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "zipcode field is displayed successfully");
			 
			 
			 input(zipcode, Zipcode);
			 Log.info("zipcode entered successfully: "+Zipcode);
			 ExtentTestManager.getTest().log(Status.PASS, "zipcode entered successfully: "+Zipcode);
			 
			 Thread.sleep(200);
			 driver.findElement(zipcode).sendKeys(Keys.TAB);
			 
			 Thread.sleep(200);
			 
			 Element_isdisplayed(City);
			 Log.info("City field is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "City field is displayed successfully");
			 
			 driver.findElement(City).clear();
			 
			 input(City, city);
			 Log.info("City entered successfully: "+city);
			 ExtentTestManager.getTest().log(Status.PASS, "City entered successfully: "+city);

		 
			 select_dropdown(State, state.trim(), "State");
			 
			 
			 select_dropdown(travel_radius_dropdown, Radius_travel_to_work.trim(), "Radius you will Travel to Work");
			 
			System.out.println("");
			 
			}
	}

	
	public void Career_opportunity_section(String Value, String Car_op_txt, String Para) throws Exception {
		if (Value.equalsIgnoreCase("Career_opportunity_section")) 
		{
		
		home.Navigate_to_Emplyoment_page("Nav_to_Employment_page");	
		Element_isdisplayed(Career_Opportunity_text);
		String text=driver.findElement(Career_Opportunity_text).getText();
		Assert.assertEquals(text.toUpperCase().trim(), Car_op_txt.toUpperCase().trim(), "Career opportunities text not validated");
		Log.info(text+" section successfully displayed in Career opportunities page and Career opportunities text validated ");
		ExtentTestManager.getTest().log(Status.PASS, text+" section successfully displayed in Career opportunities page and Career opportunities text  ");
		
		
		
		 Element_isdisplayed(youtube_video_play);
		 Log.info("Youtube video is successfully displayed under Career opportunities section");
		ExtentTestManager.getTest().log(Status.PASS, "Youtube video is successfully displayed under Career opportunities section");
		
		Element_isdisplayed(career_description_p);
		String career_description =driver.findElement(career_description_p).getText().replace("\n", " ").trim();
		Assert.assertEquals(career_description.toUpperCase().trim(), Para.toUpperCase().trim(), "Career description paragraph text not validated");
		 Log.info("Career description paragraph is successfully displayed and validated under Career opportunities section: "+career_description);
		ExtentTestManager.getTest().log(Status.PASS, "Career description paragraph is successfully displayed and validated under Career opportunities section: "+career_description);
	
		}
		}
	
	
	public void Employment_Application_section( ) throws Exception {
		
		Element_isdisplayed(Employment_Application_text);
		String text=driver.findElement(Employment_Application_text).getText();
		Log.info(text+" text successfully displayed in Career opportunities page ");
		 ExtentTestManager.getTest().log(Status.PASS, text+" text successfully displayed in Career opportunities page ");
		
	}
	
	public void Validate_play_pause_video(String Value, String Text_input, String input_data) throws Exception {

		if (Value.equalsIgnoreCase("Validate_play_pause_video")) 
		{
//			Element_isdisplayed(About);
//			ExtentTestManager.getTest().log(Status.PASS, "About dropdown displayed successful");
//			Log.info("About dropdown displayed successful");
//			Mouse_hover(About);
//			Element_isdisplayed(Carer_Opp);
//			ExtentTestManager.getTest().log(Status.PASS, "Career opportunities option is displayed successfully under About dropdown in homepage");
//			Log.info("Career opportunities option is displayed successfully under About dropdown in homepage");
//			
//			click(Carer_Opp);
//			ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Career opportunities option under About dropdown in homepage");
//			Log.info("Successfully clicked on Career opportunities option under About dropdown in homepage");
//			Thread.sleep(200);
//			String t=driver.getTitle();
//			Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Gym Jobs | Fitness Employment Opportunities".toUpperCase().trim(), "Emplyoment_page title not validated and not navigatd to Emplyoment_page");
//			ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
//			Log.info("Successfully navigated to Fitness Career Opportunities/Employment page: "+t);
			
			Career_opportunity_section("Career_opportunity_section",Text_input, input_data);
			
//			driver.findElement(youtube_video_play).click();
			
			click(youtube_video_play);
			ExtentTestManager.getTest().log(Status.PASS, "Youtube video started playing");
			Log.info("Youtube video started playing");
			
			TimeUnit.SECONDS.sleep(20);
//			driver.findElement(youtube_video_play).click();
			click(youtube_video_play);
			TimeUnit.SECONDS.sleep(5);
			
			ExtentTestManager.getTest().log(Status.PASS, "Youtube video paused");
			Log.info("Youtube video paused");
		
			
			
			
			
//			int size = driver.findElements(By.tagName("iframe")).size();
//			System.out.println(size);
//			driver.switchTo().frame((1));
			
//			driver.findElements(By.tagName("iframe"));
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(video));
//			driver.findElement(video).click();
	//click(video);
//			wait.until(ExpectedConditions.elementToBeClickable(video)).click();
			
		
		}
		
	}

	
	public void Validate_Club_and_corporate_positions(String Value, String Text_input, String input_data, String pos_txt) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_Club_and_corporate_positions")) 
		{
			Career_opportunity_section("Career_opportunity_section",Text_input, input_data);
			
			 String  Club_pos_txt ="";
			 String  Corp_pos_txt="";
			 String[] position_txt =pos_txt.split(",");
			 if(!(pos_txt.isBlank() && pos_txt.isEmpty()))
			{
				   Club_pos_txt =position_txt[0];
				   Corp_pos_txt=position_txt[1];
				 
			 }
//			 else {
//				throw new Exception("Input data not provided");
//			}

		
		
		
		Element_isdisplayed(Group_Fitness_job_details);
		click(Group_Fitness_job_details);
//		Element_isdisplayed(Group_F_apply_here_button);
//		MoveToElement(Group_F_apply_here_button);
		Element_isdisplayed(club_positions);
		Element_isdisplayed(corp_positions);
		String club_positions_txt=driver.findElement(club_positions).getText().trim();
		String corp_positions_txt=driver.findElement(corp_positions).getText().trim();
		assertEquals(club_positions_txt.toUpperCase(), Club_pos_txt.toUpperCase().trim(),"Club Positions text not validated");
		assertEquals(corp_positions_txt.toUpperCase(), Corp_pos_txt.toUpperCase().trim(),"Corporate Positions text not validated");
		ExtentTestManager.getTest().log(Status.PASS, "Club Positions and corporate positions sections are displayed and validated successfully");
		Log.info("Club Positions and corporate positions sections are displayed and validated successfully");
		
		}
	}
	
	public void Validate_Corporate_positions_section(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_corporate_positions_section")) 
		{

		Validate_Club_and_corporate_positions("Validate_Club_and_corporate_positions",Text_input, input_data, pos_txt);
		Element_isdisplayed(corp_positions);
		
		String corp_jobs_select_txt=driver.findElement(corp_positions).getAttribute("class");
		
		
		if(corp_jobs_select_txt.equalsIgnoreCase("a-unselected")) { 
		
			ExtentTestManager.getTest().log(Status.PASS, "By defaut corporate Positions is not selected");
			Log.info("By defaut corporate Positions is not selected");
			click(corp_positions);
			MoveToElement(Applyhere_button);
			ExtentTestManager.getTest().log(Status.PASS, "corporate Positions is selected");
			Log.info("corporate Positions is selected");
			Thread.sleep(200);
		}
		else if(corp_jobs_select_txt.equalsIgnoreCase("a-selected")){
			
			MoveToElement(Applyhere_button);
			ExtentTestManager.getTest().log(Status.PASS, "corporate Positions is by default selected");
			Log.info("corporate Positions is by default selected");
			
		}
		
		
		
		Element_isdisplayed(corp_jobs_content);
		String content=driver.findElement(corp_jobs_content).getText().trim();
		assertEquals(content.toUpperCase().trim(), corpcont_txt.toUpperCase().trim(), "corporate Positions description is not validated");
		ExtentTestManager.getTest().log(Status.PASS, "corporate Positions description is displayed and validated successfully: "+content);
		Log.info("corporate Positions selected and the description is displayed and validated successfully: "+content);
		
		Element_isdisplayed(Applyhere_button);
		validate_get_attribute_text(Applyhere_button, "Apply Here");
//		MoveToElement(Applyhere_button);
		ExtentTestManager.getTest().log(Status.PASS, "Apply here button is displayed successfully");
		Log.info("Apply here button is displayed successfully");
		
//		By corp_jobs_title=By.xpath("//div[@class='laJobSelector']//strong");
		
		List<WebElement> jobs=driver.findElements(corp_jobs_title);
		
		ExtentTestManager.getTest().log(Status.PASS, jobs.size()+" corporate Positions displayed");
		Log.info(jobs.size()+" corporate Positions displayed");
		
//		for (WebElement job : jobs) {
//			
//			String jobs_title=job.getText();
//			ExtentTestManager.getTest().log(Status.PASS, "Corporate Positions job "+jobs_title+" is displayed");
//			Log.info("Corporate Positions job "+jobs_title+" is displayed");
//		}	
		
		String[] job_count_ip=jobs_title_ip.split(",");
		String js=jobs_title_ip.trim();
		int js_count_op=0;
		 ArrayList<String> op_jobs = new ArrayList<String>();
		for (WebElement job : jobs) {
			String jobs_title=job.getText();
			if (js.toUpperCase().contains(jobs_title.toUpperCase().trim())) {
				ExtentTestManager.getTest().log(Status.PASS, "Corporate Positions team "+jobs_title+" is displayed and validated successfully");
				Log.info("Corporate Positions team "+jobs_title+" is displayed and validated successfully");
				js_count_op++;
				if (!job.getText().isEmpty()) op_jobs.add(job.getText().trim());
			}
			
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "Corporate Positions team "+jobs_title+" not displayed and not validated successfully");
				Log.error("Corporate Positions team "+jobs_title+" not displayed and not validated successfully");
				if (!job.getText().isEmpty()) op_jobs.add(job.getText().trim());
				throw new Exception("Corporate Positions team "+jobs_title+" not displayed and not validated successfully");
				
			}
			
		}	
		
		String delim = ",";
        String op_jobs_res = String.join(delim, op_jobs);
		
		if(jobs.size()==job_count_ip.length &&job_count_ip.length  ==js_count_op ) {
			ExtentTestManager.getTest().log(Status.PASS, "All Corporate Positions teams are displayed and validated successfully");
			Log.info("All Corporate Positions teams are displayed and validated successfully");
			
			
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "All Corporate Positions teams are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
			Log.error("All Corporate Positions teams are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
			throw new Exception("All Corporate Positions teams are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
		}
		
		
		
		
		
		
		}
		
	}
	

	public void Validate_Club_positions_section(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_Club_positions_section")) 
		{

		Validate_Club_and_corporate_positions("Validate_Club_and_corporate_positions",Text_input, input_data, pos_txt);
		
		Element_isdisplayed(club_positions);
		
		String clb_jobs_select_txt=driver.findElement(club_positions).getAttribute("class");
		MoveToElement(Group_F_apply_here_button);
		
//		By crop_jobs=By.id("LinkButtonCorpJobAds");
//		String corp_jobs_select_txt=driver.findElement(crop_jobs).getAttribute("class");
		
//		if(corp_jobs_select_txt.equalsIgnoreCase("a-unselected")) { 
//			
//			click(crop_jobs);
//			ExtentTestManager.getTest().log(Status.PASS, "corp Positions is selected");
//			Log.info("corp Positions is selected");
//		}
		
		if(clb_jobs_select_txt.equalsIgnoreCase("a-unselected")) { 
			
			click(club_positions);
			ExtentTestManager.getTest().log(Status.PASS, "Club Positions is selected");
			Log.info("Club Positions is selected");
		}
		else {
			ExtentTestManager.getTest().log(Status.PASS, "By defaut Club Positions is selected");
			Log.info("By defaut Club Positions is selected");
		}
		
		Element_isdisplayed(club_jobs_content);
		String content=driver.findElement(club_jobs_content).getText().trim().replace("\n", " ");
		assertEquals(content.toUpperCase().trim(), clb_pos_content.toUpperCase().trim(), "Club positons description is not validated");
		ExtentTestManager.getTest().log(Status.PASS, "Club Positions content is displayed: "+content);
		Log.info("Club Positions selected and the content is displayed: "+content);
		
		List<WebElement> jobs=driver.findElements(club_jobs_titles);
		ExtentTestManager.getTest().log(Status.PASS, jobs.size()+" Club Positions displayed");
		Log.info(jobs.size()+" Club Positions displayed");
		String[] job_count_ip=jobs_title_ip.split(",");
		String js=jobs_title_ip.trim();
		int js_count_op=0;
		 ArrayList<String> op_jobs = new ArrayList<String>();
		for (WebElement job : jobs) {
			String jobs_title=job.getText();
			if (js.toUpperCase().contains(jobs_title.toUpperCase().trim())) {
				ExtentTestManager.getTest().log(Status.PASS, "Club Positions job "+jobs_title+" is displayed and validated successfully");
				Log.info("Club Positions job "+jobs_title+" is displayed and validated successfully");
				js_count_op++;
				if (!job.getText().isEmpty()) op_jobs.add(job.getText().trim());
			}
			
			else {
				ExtentTestManager.getTest().log(Status.FAIL, "Club Positions job "+jobs_title+" not displayed and not validated successfully");
				Log.error("Club Positions job "+jobs_title+" not displayed and not validated successfully");
				if (!job.getText().isEmpty()) op_jobs.add(job.getText().trim());
				throw new Exception("Club Positions job "+jobs_title+" not displayed and not validated successfully");
				
			}
			
		}	
		
		String delim = ",";
        String op_jobs_res = String.join(delim, op_jobs);
		
		if(jobs.size()==job_count_ip.length &&job_count_ip.length  ==js_count_op ) {
			ExtentTestManager.getTest().log(Status.PASS, "All Club Positions are displayed and validated successfully");
			Log.info("All Club Positions are displayed and validated successfully");
			
			
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "All Club Positions are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
			Log.error("All Club Positions are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
			throw new Exception("All Club Positions are not displayed and not validated successfully: expected [ "+js+" ] actual [ "+op_jobs_res+" ]");
		}
		}
		
	}
	
	

	public void Validate_details_of_Group_Fitness_position(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip,  String clb_pos_content, String job_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Group_Fitness_position")) 
		{

			Validate_Club_positions_section("Validate_Club_positions_section", Text_input,  input_data,  pos_txt, jobs_title_ip,  clb_pos_content);
			
			 Element_isdisplayed(Group_F_apply_here_image);
			 Log.info("Group fitness image/video is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness image/video is displayed successfully");
			  
			 Element_isdisplayed(Grp_jobtitle);
			 String title=driver.findElement(Grp_jobtitle).getText().trim();
			 String[] job_count_ip=jobs_title_ip.split(",");
			 assertEquals(title.toUpperCase().trim(), job_count_ip[0].toUpperCase().trim(), "Club positons job title: "+title+" is not validated");
			 Log.info("Group fitness job title is displayed and validated successfully: "+title);
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness job title is displayed and validated successfully: "+title);
			 
			 Element_isdisplayed(Group_Fitness_job_details);
			 String details=driver.findElement(Group_Fitness_job_details).getText().replace(".", "").trim();
			 assertEquals(details.toUpperCase().trim(), job_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
			 Log.info("Group fitness job details displayed and validated successfully: "+details);
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness job details displayed and validated successfully: "+details);
			 
			 Element_isdisplayed(Group_Fitness_moreinfo);
			 Log.info("Group Fitness moreinfo link displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Group Fitness moreinfo link displayed Successfully");
			 
			 Element_isdisplayed(Group_F_apply_here_button);
			 validate_get_text(Group_F_apply_here_button, job_count_ip[0]+" Apply Here");
			 Log.info("Group Fitness apply here button displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Group Fitness apply here button displayed Successfully");
			
		}
		
	}
	

	public void Validate_details_of_Personal_Trainer_position(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String job_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Personal_Trainer_position")) 
		{

			Validate_Club_positions_section("Validate_Club_positions_section", Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content);
			
			 Element_isdisplayed(Personal_T_apply_here_image);
			 Log.info("Personal Trainer image is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Group fitness image is displayed successfully");
			  
			 Element_isdisplayed(per_T_jobtitle);
			 String title=driver.findElement(per_T_jobtitle).getText().trim();
			 String[] job_count_ip=jobs_title_ip.split(",");
			 assertEquals(title.toUpperCase().trim(), job_count_ip[1].toUpperCase().trim(), "Club positons job title: "+title+" is not validated");
				 
			 Log.info("Personal Trainers job title is displayed and validated successfully: "+title);
			 ExtentTestManager.getTest().log(Status.PASS, "Personal Trainer job title is displayed and validated successfully: "+title);
			 
			 Element_isdisplayed(Personal_T_job_details);
			 String details=driver.findElement(Personal_T_job_details).getText().replace(".", "").trim();
			 assertEquals(details.toUpperCase().trim(), job_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
			 Log.info("Personal Trainers job details displayedand validated successfully: "+details);
			 ExtentTestManager.getTest().log(Status.PASS, "Personal Trainers job details displayed and validated  successfully: "+details);
			 
			 Element_isdisplayed(Personal_T_moreinfo);
			 Log.info("Personal Trainers moreinfo link displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Personal Trainers moreinfo link displayed Successfully");
			 
			 Element_isdisplayed(Personal_T_apply_here_button);
			 validate_get_text(Personal_T_apply_here_button, job_count_ip[1]+" Apply Here");
			 Log.info("Personal Trainers apply here button displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Personal Trainers apply here button displayed Successfully");
			
		}
		
	}
	


	public void Validate_details_of_Pilates_Teacher_position(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String job_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Pilates_Teacher_position")) 
		{

			Validate_Club_positions_section("Validate_Club_positions_section", Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content);
			
			 Element_isdisplayed(Pilates_T_apply_here_image);
			 Log.info("Pilates Teacher image is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher image is displayed successfully");
			  
			 Element_isdisplayed(Pil_T_jobtitle);
				String title=driver.findElement(Pil_T_jobtitle).getText().trim();
				String[] job_count_ip=jobs_title_ip.split(",");
				 assertEquals(title.toUpperCase().trim(), job_count_ip[2].toUpperCase().trim(), "Club positons job title: "+title+" is not validated");
				 
			 Log.info("Pilates Teacher job title is displayed and validated successfully: "+title);
			 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher job title is displayed and validated successfully: "+title);
			 
			 Element_isdisplayed(pilates_T_job_details);
			 String details=driver.findElement(pilates_T_job_details).getText().replace(".", "").trim();
			 assertEquals(details.toUpperCase().trim(), job_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
			 Log.info("Pilates Teacher job details displayed and validated successfully: "+details);
			 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher job details displayed and validated successfully: "+details);
			 
			 Element_isdisplayed(Pil_T_moreinfo);
			 Log.info("Pilates Teacher moreinfo link displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher moreinfo link displayed Successfully");
			 
			 Element_isdisplayed(Pilates_T_apply_here_button);
			 validate_get_text(Pilates_T_apply_here_button, job_count_ip[2]+" Apply Here");
			 Log.info("Pilates Teacher apply here button displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher apply here button displayed Successfully");
			
		}
		
	}
	

	public void Validate_details_of_Hiit_Coach_position(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String Job_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Hiit_Coach_position")) 
		{

			Validate_Club_positions_section("Validate_Club_positions_section",  Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content);
			
			 Element_isdisplayed(HIIT_C__apply_here_image);
			 Log.info("Hiit coach  image is displayed successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Hiit coach image is displayed successfully");
			  
			 Element_isdisplayed(Hiit_c_jobtitle);
				String title=driver.findElement(Hiit_c_jobtitle).getText().trim();
				String[] job_count_ip=jobs_title_ip.split(",");
				assertEquals(title.toUpperCase().trim(), job_count_ip[3].toUpperCase().trim(), "Club positons job title: "+title+" is not validated");
				 
			 Log.info("Hiit coach job title is displayed and validated successfully: "+title);
			 ExtentTestManager.getTest().log(Status.PASS, "Hiit coach job title is displayed and validated successfully: "+title);
			 
			 Element_isdisplayed(Hiit_c_job_details);
			 String details=driver.findElement(Hiit_c_job_details).getText().replace(".", "").trim();
			 assertEquals(details.toUpperCase().trim(), Job_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
			 Log.info("Hiit coach job details displayed and validated successfully: "+details);
			 ExtentTestManager.getTest().log(Status.PASS, "Hiit coach job details displayed and validated successfully: "+details);
			 
			 Element_isdisplayed(Hiit_c_moreinfo);
			 Log.info("Hiit coach moreinfo link displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Hiit coach moreinfo link displayed Successfully");
			 
			 Element_isdisplayed(Hiit_c_apply_here_button);
			 validate_get_text(Hiit_c_apply_here_button, job_count_ip[3]+" Apply Here");
			 Log.info("Hiit coach apply here button displayed Successfully");
			 ExtentTestManager.getTest().log(Status.PASS, "Hiit coach apply here button displayed Successfully");
			
		}
		
	}
	

	
	public void Validate_moreinfo_popupwindow_of_Group_Fitness_position(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String Job_short_des, String Job_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_GFP")) 
		{
			Validate_details_of_Group_Fitness_position("Validate_details_of_Group_Fitness_position",  Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content, Job_short_des);
			 click(Group_Fitness_moreinfo);
			 Log.info("Successfully clicked on Group Fitness moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Group Fitness moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 0);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), Job_long_des.toUpperCase().trim(), tt[0]+" Job description is not validated");
			 Log.info("full job description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full job description displayed and validated successfully: "+desc);
			 
			 moreinfo_popup_window_image(1);
			 
			 Close_moreinfo_popup();
			 
		}
		
	}
		
	

	public void Validate_moreinfo_popupwindow_of_Personal_TP(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String Job_short_des, String Job_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Personal_TP")) 
		{
			Validate_details_of_Personal_Trainer_position("Validate_details_of_Personal_Trainer_position",  Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content,Job_short_des );
			 click(Personal_T_moreinfo);
			 Log.info("Successfully clicked on personal trainer moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on personal trainer moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip,1);
			 
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), Job_long_des.toUpperCase().trim(), tt[1]+" Job description is not validated");
			 Log.info("full job description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full job description displayed and validated successfully: "+desc);
			 
			 moreinfo_popup_window_image(2);
			 
			 Close_moreinfo_popup();
			 
		}
		
	}
		
	

	public void Validate_moreinfo_popupwindow_of_Pilates_TP(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String Job_short_des, String Job_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Pilates_TP")) 
		{
			Validate_details_of_Pilates_Teacher_position("Validate_details_of_Pilates_Teacher_position",  Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content, Job_short_des);
			 click(Pil_T_moreinfo);
			 Log.info("Successfully clicked on Pilates teacher moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Pilates teacher moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip  , 2);
			 
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), Job_long_des.toUpperCase().trim(), tt[2]+" Job description is not validated");
			 Log.info("full job description displayed successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full job description displayed successfully: "+desc);
			 
			 moreinfo_popup_window_image(3);
			 
			 Close_moreinfo_popup();
			 
		}
		
	}
		

	public void Validate_moreinfo_popupwindow_of_HCP(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String Job_short_des, String Job_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_HCP")) 
		{
			Validate_details_of_Hiit_Coach_position("Validate_details_of_Hiit_Coach_position",  Text_input,  input_data,  pos_txt,  jobs_title_ip,  clb_pos_content,  Job_short_des);
			 
			click(Hiit_c_moreinfo);
			 Log.info("Successfully clicked on Hiit coach moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Hiit coach moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip  , 3);
			 
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), Job_long_des.toUpperCase().trim(), tt[3]+" Job description is not validated");
			 Log.info("full job description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full job description displayed and validated successfully: "+desc);
			 
			 moreinfo_popup_window_image(4);
			 
			 Close_moreinfo_popup();
			 
		}
		
	}
		
	public void validate_get_text(By element, String text_ip) throws Exception {
		Element_isdisplayed(element);
		MoveToElement(element);
		String text=	driver.findElement(element).getText().toUpperCase().replace("\n", " ").trim();
		Assert.assertEquals(text, text_ip.toUpperCase().trim(), text_ip.trim()+" text not validated");
		Log.info(text_ip.trim()+" element text is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, text_ip.trim()+" element text is validated successfully");
		
	}
	
	
	public void validate_get_attribute_text(By element, String value_ip) throws Exception {
		Element_isdisplayed(element);
		MoveToElement(element);
		String text=	driver.findElement(element).getAttribute("value").toUpperCase().replace("\n", " ").trim();
		Assert.assertEquals(text, value_ip.toUpperCase().trim(), value_ip.trim()+" text not validated");
		Log.info(value_ip.trim()+" element is validated successfully");
		ExtentTestManager.getTest().log(Status.PASS, value_ip.trim()+" element is validated successfully");
		
	}
	
	
	public void Select_radio_button(By locator, String value, String radiobutton_name) throws Exception {
		
		Element_isdisplayed(locator);
		ExtentTestManager.getTest().log(Status.PASS, radiobutton_name+ "radio buttons displayed successfully" );
		Log.info(radiobutton_name+ "radio buttons displayed successfully");
		
	
		
	if(value.equalsIgnoreCase(driver.findElement(RadioButtonList18YearsOld_Yes_label).getText().trim()) && value.equalsIgnoreCase("yes")) {
//		String s=driver.findElement(locator).getText().trim();
		if(!driver.findElement(locator).isSelected()) click(locator);
		ExtentTestManager.getTest().log(Status.PASS, "Radio button "+value+" selected");
		Log.info("Radio button "+value+" selected");
	}
	else if (value.equalsIgnoreCase(driver.findElement(RadioButtonList18YearsOld_No_label).getText().trim()) && value.equalsIgnoreCase("No")) {
		
		if(!driver.findElement(locator).isSelected())click(locator);
		Thread.sleep(100);
		driver.switchTo().alert().accept();
		Thread.sleep(200);
		ExtentTestManager.getTest().log(Status.PASS, "Radio button "+value+" selected");
		Log.info("Radio button "+value+" selected");
		Element_isdisplayed(LabelAtLeast18Error);
		String err=driver.findElement(LabelAtLeast18Error).getText().trim();
		ExtentTestManager.getTest().log(Status.PASS, "error message: "+err+" displayed successfully");
		Log.info("error message: "+err+" displayed successfully");
	}
	
		
	}
	
	public void click_moreinfo_link(int moreinfo) {
		
		List<WebElement> moreinfo_links=driver.findElements(moreinfo_list_club_pos);

		moreinfo_links.get(moreinfo).click();
			
	}
	
	
	public void click_moreinfo_link_corp_pos(int moreinfo) {
		
		List<WebElement> moreinfo_links=driver.findElements(moreinfo_list_corp_pos);

		moreinfo_links.get(moreinfo).click();
			
	}
	
	public void Close_moreinfo_popup() throws Exception {
		
		//img[@id='ctl00_MainContent_JobAdsFeatured_ctl00_ImageURLPopup']
		Element_isdisplayed(moreinfo_popup_close);
		Log.info("Close button is displayed Successfully in popup window");
		ExtentTestManager.getTest().log(Status.PASS, "Close button is displayed Successfully in popup windo");
		Thread.sleep(100);
		click(moreinfo_popup_close);
		Thread.sleep(100);
		Log.info("Successfully clicked on close button in popup window");
		ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on close button in popup window");
		
	}

	public void moreinfo_popup_title(String jobs_title_ip, int i) throws Exception {
		
		Element_isdisplayed(moreinfo_popup_title);
		String title=driver.findElement(moreinfo_popup_title).getText();
		String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[i].toUpperCase().trim(), "Club positons job title: "+title+" is not validated"); 
		Log.info("Moreinfo pop up window is displayed and "+title+" title in popup window is displayed and validated successfully");
		 ExtentTestManager.getTest().log(Status.PASS,"Moreinfo pop up window is displayed and "+title+" title in popup window is displayed and validated successfully");
	}
	
	public void moreinfo_popup_window_image(int img) throws Exception {
		
		int j=img-1;
		By image=By.xpath("//div[@class='modal-content']//img[@id='ctl00_MainContent_JobAdsFeatured_ctl0"+j+"_ImageURLPopup']");
		Element_isdisplayed(image);
		Element_isdisplayed(moreinfo_popup_title);
		String title=driver.findElement(moreinfo_popup_title).getText();
		Log.info(title+" image in popup window is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS,title+" image in popup window is displayed successfully");
		
		
	}
	
	
	public void corp_moreinfo_popup_window_image(int img) throws Exception {
		
//		int j=img-1;
		By image=By.xpath("//div[@class='modal-content']//img[@id='ctl00_MainContent_JobAdsCorporate_ctl0"+img+"_ImageURLPopup']");
		Element_isdisplayed(image);
		Element_isdisplayed(moreinfo_popup_title);
		String title=driver.findElement(moreinfo_popup_title).getText();
		Log.info(title+" image in popup window is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS,title+" image in popup window is displayed successfully");
		
		
	}
	

	public void Validate_details_of_Accounting(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Accounting")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(Accounting_image);
		 Log.info("Accounting image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Accounting image is displayed successfully");
		  
		 Element_isdisplayed(Accounting_corp_jobs_title);
		 String title=driver.findElement(Accounting_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[0].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Accounting title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Accounting title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(Accounting_short_des_corp_jobs);
		 String details=driver.findElement(Accounting_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Accounting short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Accounting short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_Accounting);
		 Log.info("Accounting moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Accounting moreinfo link displayed Successfully");
		 
			
		}
		
	}
	


	public void Validate_details_of_Finance_and_T(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Finance_and_T")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(F_and_T_image);
		 Log.info("Finance and Treasury image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Finance and Treasury image is displayed successfully");
		  
		 Element_isdisplayed(F_and_T_corp_jobs_title);
		 String title=driver.findElement(F_and_T_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[1].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Finance and Treasury title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Finance and Treasury title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(F_and_T_short_des_corp_jobs);
		 String details=driver.findElement(F_and_T_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Finance and Treasury short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Finance and Treasury short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_F_and_T);
		 Log.info("Finance and Treasury moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Finance and Treasury moreinfo link displayed Successfully");
		 
			
		}
		
	}
	


	public void Validate_details_of_HR(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_HR")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(HS_image);
		 Log.info("Human Resources image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Human Resources image is displayed successfully");
		  
		 Element_isdisplayed(HR_corp_jobs_title);
		 String title=driver.findElement(HR_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[2].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Human Resources title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Human Resources title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(HR_corp_short_des_corp_jobs);
		 String details=driver.findElement(HR_corp_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Human Resources short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Human Resources short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_HR);
		 Log.info("Human Resources moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Human Resources moreinfo link displayed Successfully");
		 
			
		}
		
	}
	

	public void Validate_details_of_IT(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_IT")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(IT_image);
		 Log.info("Information Technology image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Information Technology image is displayed successfully");
		  
		 Element_isdisplayed(IT_corp_jobs_title);
		 String title=driver.findElement(IT_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[3].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Information Technology title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Information Technology title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(IT_corp_short_des_corp_jobs);
		 String details=driver.findElement(IT_corp_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Information Technology short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Information Technology short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_IT);
		 Log.info("Information Technology moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Information Technology moreinfo link displayed Successfully");
		 
			
		}
		
	}
	

	public void Validate_details_of_Legal_and_A(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_Legal_and_A")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(L_and_A_image);
		 Log.info("Legal and Administration image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Legal and Administration image is displayed successfully");
		  
		 Element_isdisplayed(L_and_A_corp_jobs_title);
		 String title=driver.findElement(L_and_A_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[4].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Legal and Administration title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Legal and Administration title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(L_and_A_short_des_corp_jobs);
		 String details=driver.findElement(L_and_A_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Legal and Administration short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Legal and Administration short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_L_and_A);
		 Log.info("Legal and Administration moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Legal and Administration moreinfo link displayed Successfully");
		 
			
		}
		
	}
	

	public void Validate_details_of_RealEstate_and_D(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_details_of_RealEstate_and_D")) 
		{

		Validate_Corporate_positions_section("Validate_corporate_positions_section",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip);
	
		 Element_isdisplayed(RE_and_D_image);
		 Log.info("Real Estate and Development image is displayed successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Real Estate and Development image is displayed successfully");
		  
		 Element_isdisplayed(RE_and_D_corp_jobs_title);
		 click(RE_and_D_corp_jobs_title);
		 String title=driver.findElement(RE_and_D_corp_jobs_title).getText().trim();
		 String[] job_count_ip=jobs_title_ip.split(",");
		 assertEquals(title.toUpperCase().trim(), job_count_ip[5].toUpperCase().trim(), "Club positons title: "+title+" is not validated");
		 Log.info("Real Estate and Development title is displayed and validated successfully: "+title);
		 ExtentTestManager.getTest().log(Status.PASS, "Real Estate and Development title is displayed and validated successfully: "+title);
		 
		 Element_isdisplayed(RE_and_D_short_des_corp_jobs);
		 MoveToElement(RE_and_D_short_des_corp_jobs);
		 String details=driver.findElement(RE_and_D_short_des_corp_jobs).getText().trim();
		 assertEquals(details.replace(".", "").toUpperCase().trim(), team_short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
		 Log.info("Real Estate and Development short description is displayed and validated successfully: "+details);
		 ExtentTestManager.getTest().log(Status.PASS, "Real Estate and Development short description displayed and validated successfully: "+details);
		 
		 Element_isdisplayed(moreinfo_link_RE_and_D);
//		 click(moreinfo_link_RE_and_D);
		 Log.info("Real Estate and Development moreinfo link displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Real Estate and Development moreinfo link displayed Successfully");
		 
			
		}
		
	}
	

	public void Validate_moreinfo_popupwindow_of_Accounting(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Accounting")) 
		{
			
			Validate_details_of_Accounting("Validate_details_of_Accounting",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			 
			MoveToElement(moreinfo_link_Accounting);
			click(moreinfo_link_Accounting);
			 Log.info("Successfully clicked on Accounting moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Accounting moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 0);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[0]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(0);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	


	public void Validate_moreinfo_popupwindow_of_Finance_and_T(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Finance_and_T")) 
		{
			
			Validate_details_of_Finance_and_T("Validate_details_of_Finance_and_T",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			 
			MoveToElement(moreinfo_link_F_and_T);
			click(moreinfo_link_F_and_T);
			 Log.info("Successfully clicked on Finance and Treasury moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Finance and Treasury moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 1);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[1]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(1);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	

	public void Validate_moreinfo_popupwindow_of_Human_R(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Human_R")) 
		{
			
			Validate_details_of_HR("Validate_details_of_HR",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			MoveToElement(moreinfo_link_HR);
			click(moreinfo_link_HR);
			 Log.info("Successfully clicked on Human Resources moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Human Resources moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 2);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[2]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(2);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	

	public void Validate_moreinfo_popupwindow_of_IT(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_IT")) 
		{
			
			Validate_details_of_IT("Validate_details_of_IT",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			 
			MoveToElement(moreinfo_link_IT);
			click(moreinfo_link_IT);
			 Log.info("Successfully clicked on Information Technology moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Information Technology moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 3);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[3]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(3);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	


	public void Validate_moreinfo_popupwindow_of_Legal_and_A(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_Legal_and_A")) 
		{
			
			Validate_details_of_Legal_and_A("Validate_details_of_Legal_and_A",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			 
			MoveToElement(moreinfo_link_L_and_A);
			 
			 click(moreinfo_link_L_and_A);
			 Log.info("Successfully clicked on Legal and Administration moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Legal and Administration moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 4);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[4]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(4);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	

	public void Validate_moreinfo_popupwindow_of_RE_and_D(String Value, String Text_input, String input_data, String pos_txt, String corpcont_txt, String jobs_title_ip, String team_short_des, String team_long_des) throws Exception {
		
		if(Value.equalsIgnoreCase("Validate_moreinfo_popupwindow_of_RE_and_D")) 
		{
			
			Validate_details_of_RealEstate_and_D("Validate_details_of_RealEstate_and_D",Text_input, input_data, pos_txt, corpcont_txt,  jobs_title_ip, team_short_des);
			
			By footer= By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/footer[1]/div[1]");
			
			MoveToElement(footer);
			
			click(moreinfo_link_RE_and_D);
			 Log.info("Successfully clicked on Real Estate and Development moreinfo link");
			 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Real Estate and Development moreinfo link");
	
			 moreinfo_popup_title(jobs_title_ip, 5);
			
			 Element_isdisplayed(grp_fis_moreinfo_des);
			 String desc=driver.findElement(grp_fis_moreinfo_des).getText().trim();
			 String[] tt=jobs_title_ip.split(",");
			 assertEquals(desc.toUpperCase().trim(), team_long_des.toUpperCase().trim(), tt[5]+" team description is not validated");
			 Log.info("full description displayed and validated successfully: "+desc);
			 ExtentTestManager.getTest().log(Status.PASS, "full description displayed and validated successfully: "+desc);
			 
			 corp_moreinfo_popup_window_image(5);
			 
			 Close_moreinfo_popup();
			 
		}
		
		
	}
	
public void Validate_GF_applyhere_button(String Value) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_GF_applyhere_button")) 
	{
		
		home.Navigate_to_Emplyoment_page("Nav_to_Employment_page");	
		
		 Element_isdisplayed(Group_F_apply_here_button);
		 MoveToElement(Group_F_apply_here_button);
		 validate_get_text(Group_F_apply_here_button, "Group Fitness Apply Here");
		 Log.info("Group Fitness apply here button displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Group Fitness apply here button displayed Successfully");
		 
		 click(Group_F_apply_here_button);
		 Log.info("Successfully clicked on Group Fitness apply here button displayed ");
		 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Group Fitness apply here button displayed ");
		 Thread.sleep(200);
		 String t=driver.getTitle();
		Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Submit Application".toUpperCase().trim(), "LA Fitness | Submit Application title not validated and not navigatd to Emplyoment_page");
		ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Submit Application page: "+t);
		Log.info("Successfully navigated to Submit Application page: "+t);
		
	}
	
}
	


public void Validate_Personal_T_applyhere_button(String Value) throws Exception {

if(Value.equalsIgnoreCase("Validate_Personal_T_applyhere_button")) 
{
	
	home.Navigate_to_Emplyoment_page("Nav_to_Employment_page");	
	
	 Element_isdisplayed(Personal_T_apply_here_button);
	 MoveToElement(Personal_T_apply_here_button);
	 validate_get_text(Personal_T_apply_here_button, "Personal Trainer Apply Here");
	 Log.info("Personal Trainer apply here button displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Trainer apply here button displayed Successfully");
	 
	 click(Personal_T_apply_here_button);
	 Log.info("Successfully clicked on Personal Trainer apply here button displayed ");
	 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Personal Trainer apply here button displayed ");
	 Thread.sleep(200);
	 String t=driver.getTitle();
	Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Submit Application".toUpperCase().trim(), "LA Fitness | Submit Application title not validated and not navigatd to Emplyoment_page");
	ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Submit Application page: "+t);
	Log.info("Successfully navigated to Submit Application page: "+t);
	
}



}



public void Validate_Pilates_T_applyhere_button(String Value) throws Exception {

if(Value.equalsIgnoreCase("Validate_Pilates_T_applyhere_button")) 
{
	
	home.Navigate_to_Emplyoment_page("Nav_to_Employment_page");	
	
	 Element_isdisplayed(Pilates_T_apply_here_button);
	 MoveToElement(Pilates_T_apply_here_button);
	 validate_get_text(Pilates_T_apply_here_button, "Pilates Teacher Apply Here");
	 Log.info("Pilates Teacher apply here button displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Pilates Teacher apply here button displayed Successfully");
	 
	 click(Pilates_T_apply_here_button);
	 Log.info("Successfully clicked on Pilates Teacher apply here button displayed ");
	 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on Pilates Teacher apply here button displayed ");
	 Thread.sleep(200);
	 String t=driver.getTitle();
	Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Submit Application".toUpperCase().trim(), "LA Fitness | Submit Application title not validated and not navigatd to Emplyoment_page");
	ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Submit Application page: "+t);
	Log.info("Successfully navigated to Submit Application page: "+t);
	
}



}



public void Validate_HIIT_C_applyhere_button(String Value) throws Exception {

if(Value.equalsIgnoreCase("Validate_HIIT_C_applyhere_button")) 
{
	
	home.Navigate_to_Emplyoment_page("Nav_to_Employment_page");	
	
	 Element_isdisplayed(Hiit_c_apply_here_button);
	 MoveToElement(Hiit_c_apply_here_button);
	 validate_get_text(Hiit_c_apply_here_button, "HIIT Coach Apply Here");
	 Log.info("HIIT Coach apply here button displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "HIIT Coach apply here button displayed Successfully");
	 
	 click(Hiit_c_apply_here_button);
	 Log.info("Successfully clicked on HIIT Coach apply here button displayed ");
	 ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on HIIT Coach apply here button displayed ");
	 Thread.sleep(200);
	 String t=driver.getTitle();
	Assert.assertEquals(t.toUpperCase().trim(), "LA Fitness | Submit Application".toUpperCase().trim(), "LA Fitness | Submit Application title not validated and not navigatd to Emplyoment_page");
	ExtentTestManager.getTest().log(Status.PASS, "Successfully navigated to Submit Application page: "+t);
	Log.info("Successfully navigated to Submit Application page: "+t);
	
}



}

public void Validate_applyhere_button_followingpos_text(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_applyhere_button_followingpos_text")) 
	{
	
		Validate_Club_positions_section("Validate_Club_positions_section", Text_input,  input_data,  pos_txt, jobs_title_ip,  clb_pos_content);
	
		 Element_isdisplayed(Applyhere_button1);
		 MoveToElement(Applyhere_button1);
		 
		 Element_isdisplayed(following_pos_text);

		 String[] s= driver.findElement(following_pos_text).getText().split("\n");
		 String text=	s[0].toUpperCase().trim();
			
		 Assert.assertEquals(text, text_ip.toUpperCase().trim(), text_ip.trim()+" text not validated");
		 Log.info(text_ip.trim()+" text is validated successfully");
		 ExtentTestManager.getTest().log(Status.PASS, text_ip.trim()+" text is validated successfully");
		 
		 validate_get_text(Applyhere_button1, "Apply Here");
		 Log.info("Apply here button displayed Successfully");
		 ExtentTestManager.getTest().log(Status.PASS, "Apply here button displayed Successfully");

	
	
	}
}


public void Validate_details_of_General_Manager(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_General_Manager")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][1]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	 
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl00_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("General_Manager job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "General_Manager job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][1]//strong[contains(text(),'General Manager')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("General_Manager title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "General_Manager title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][1]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("General_Manager short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "General_Manager short description displayed and validated successfully: "+details);
	 
//	
//	 By moreinfo = By.xpath("//div[@class='laJobSelector'][1]//a[@class='moreinfo']");
	 
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("General_Manager moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "General_Manager moreinfo link displayed Successfully");
	 
		
	}
	
}



public void Validate_details_of_Operations_Manager(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Operations_Manager")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	By moreinfo = By.xpath("//div[@class='laJobSelector'][2]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl01_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Operation Manager job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Operation Manager job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][2]//strong[contains(text(),'Operations Manager')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Operation Manager title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Operation Manager title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][2]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Operation Manager short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Operation Manager short description displayed and validated successfully: "+details);
	
	 Element_isdisplayed(moreinfo);
	 Log.info("Operation Manager moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Operation Manager moreinfo link displayed Successfully");
	 
		
	}
	
}


public void Validate_details_of_Personal_TD(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Personal_TD")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][3]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl02_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Personal Training Director job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Director job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][3]//strong[contains(text(),'Personal Training Director')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Personal Training Director title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Director title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][3]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Personal Training Director short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Director short description displayed and validated successfully: "+details);
	 

	 Element_isdisplayed(moreinfo);
	 Log.info("Personal Training Director moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Director moreinfo link displayed Successfully");
	 
		
	}
	
}



public void Validate_details_of_Membership_Counselor(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Membership_Counselor")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][4]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl03_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Membership Counselorjob image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Membership Counselor job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][4]//strong[contains(text(),'Membership Counselor')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Membership Counselor title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Membership Counselor title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][4]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Membership Counselor short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Membership Counselor short description displayed and validated successfully: "+details);
	 
	
	
	 
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("Membership Counselor moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Membership Counselor moreinfo link displayed Successfully");
	 
		
	}
	
}



public void Validate_details_of_Personal_TMC(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Personal_TMC")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][5]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl04_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Personal Training Membership Counselor job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Membership Counselor job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][5]//strong[contains(text(),'Personal Training Membership Counselor')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Personal Training Membership Counselor title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Membership Counselor title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][5]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Personal Training Membership Counselor short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Membership Counselor short description displayed and validated successfully: "+details);

	 Element_isdisplayed(moreinfo);
	 Log.info("Personal Training Membership Counselor moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Personal Training Membership Counselor moreinfo link displayed Successfully");
	 
		
	}
	
}



public void Validate_details_of_Club_Staff(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Club_Staff")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][6]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl05_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Club Staff job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Club Staff job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][6]//strong[contains(text(),'Club Staff')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Club Staff title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Club Staff title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][6]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Club Staff short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Club Staff short description displayed and validated successfully: "+details);

	 Element_isdisplayed(moreinfo);
	 Log.info("Club Staff moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Club Staff moreinfo link displayed Successfully");
	 
		
	}
	
}




public void Validate_details_of_League_SD(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_League_SD")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	

	 By moreinfo = By.xpath("//div[@class='laJobSelector'][7]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl06_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("League Sports Director job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "League Sports Director job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][7]//strong[contains(text(),'League Sports Director')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("League Sports Director title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "League Sports Director title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][7]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("League Sports Director short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "League Sports Director short description displayed and validated successfully: "+details);
	 
	

	 
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("League Sports Director moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "League Sports Director moreinfo link displayed Successfully");
	 
		
	}
	
}




public void Validate_details_of_Equipment_Tech(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Equipment_Tech")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][8]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl07_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Equipment Tech job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Equipment Tech job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][8]//strong[contains(text(),'Equipment Tech')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Equipment Tech title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Equipment Tech title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][8]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Equipment Tech short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Equipment Tech short description displayed and validated successfully: "+details);
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("Equipment Tech moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Equipment Tech moreinfo link displayed Successfully");
	 
		
	}
	
}


public void Validate_details_of_HVAC_Building_M(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_HVAC_Building_M")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][9]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl08_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("HVAC/Building Maintenance job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "HVAC/Building Maintenance job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][9]//strong[contains(text(),'HVAC/Building Maintenance')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("HVAC/Building Maintenance title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "HVAC/Building Maintenance title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][9]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("HVAC/Building Maintenance short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "HVAC/Building Maintenance short description displayed and validated successfully: "+details);
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("HVAC/Building Maintenance moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "HVAC/Building Maintenance moreinfo link displayed Successfully");
	 
		
	}
	
}



public void Validate_details_of_Pride_Janitor(String Value, String Text_input, String input_data, String pos_txt, String jobs_title_ip, String clb_pos_content, String text_ip, String jb_title, String short_des) throws Exception {
	
	if(Value.equalsIgnoreCase("Validate_details_of_Pride_Janitor")) 
	{

	Validate_applyhere_button_followingpos_text("Validate_applyhere_button_followingpos_text",Text_input, input_data, pos_txt, jobs_title_ip,  clb_pos_content, text_ip);
	
	
	 By moreinfo = By.xpath("//div[@class='laJobSelector'][10]//a[@class='moreinfo']");
	 Element_isdisplayed(moreinfo);
	 MoveToElement(moreinfo);
	
	 By image = By.id("ctl00_MainContent_JobAdsClub_ctl09_ImageJobAd");
	 Element_isdisplayed(image);
	 Log.info("Club Pride/Janitor job image is displayed successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Club Pride/Janitor job image is displayed successfully");
	 
	 By GM = By.xpath("//div[@class='laJobSelector'][10]//strong[contains(text(),'Club Pride/Janitor')]");
	 
	 
	 Element_isdisplayed(GM);
	 String title=driver.findElement(GM).getText().trim();
//	 String[] job_count_ip=jobs_title_ip.split(",");
	 assertEquals(title.toUpperCase().trim(), jb_title.toUpperCase().trim(), "Club positons title: "+title+" is not validated");
	 Log.info("Club Pride/Janitor title is displayed and validated successfully: "+title);
	 ExtentTestManager.getTest().log(Status.PASS, "Club Pride/Janitor title is displayed and validated successfully: "+title);
	 
	
	 
	 By jb_des = By.xpath("//div[@class='laJobSelector'][10]//div[@class='col-xs-12']");
	 
	 Element_isdisplayed(jb_des);
	 String details=driver.findElement(jb_des).getText().trim();
	 assertEquals(details.replace(".", "").toUpperCase().trim(), short_des.toUpperCase().replace(".", "").trim(), title+" short description is not validated");
	 Log.info("Club Pride/Janitor short description is displayed and validated successfully: "+details);
	 ExtentTestManager.getTest().log(Status.PASS, "Club Pride/Janitor short description displayed and validated successfully: "+details);
	 
	 Element_isdisplayed(moreinfo);
	 Log.info("Club Pride/Janitor moreinfo link displayed Successfully");
	 ExtentTestManager.getTest().log(Status.PASS, "Club Pride/Janitor moreinfo link displayed Successfully");
	 
		
	}
	
}





}
