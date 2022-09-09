package com.BasePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.internal.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static RemoteWebDriver driver = null;


	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public void setup() throws IOException, InterruptedException {

		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
//		String UserName = configloader().getProperty("UserName");
//		String Password = configloader().getProperty("Password");

		switch (Browser.toUpperCase()) {

		case "CHROME":

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			
			break;

		case "FIREFOX":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("The Driver is not defined");
			Log.info("The Driver is not defined");
			ExtentTestManager.getTest().log(Status.PASS, "The Driver is not defined");
		}
		Log.info(Browser+" browser launched successfully");
		ExtentTestManager.getTest().log(Status.PASS, Browser+" browser launched successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(Url);
		Log.info("Entered the application url successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Entered the application url successfully");
		Thread.sleep(1000);
		/*
		 * driver.navigate().refresh(); driver.findElement(L_email).sendKeys(UserName);
		 * driver.findElement(L_password).sendKeys(Password);
		 * driver.findElement(L_Submit).click();
		 */

	}
	
	

	public void setup(String mobile) throws Exception {

		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
//		String UserName = configloader().getProperty("UserName");
//		String Password = configloader().getProperty("Password");
try {
	
	switch (Browser.toUpperCase()) {

	case "CHROME":

		Map<String, String> mp=new HashMap<String, String>();
		mp.put("deviceName", mobile);
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("mobileEmulation", mp );
		driver = new ChromeDriver(options);
//		 = "iPhone SE"
		
		 
//		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(800, 800);
//		  
//		 driver.manage().window().setSize(d);
		
		break;

	case "FIREFOX":

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;

	default:
		System.err.println("The Driver is not defined");
		Log.info("The Driver is not defined");
		ExtentTestManager.getTest().log(Status.PASS, "The Driver is not defined");
	}
	Log.info(Browser+" browser launched successfully");
	ExtentTestManager.getTest().log(Status.PASS, Browser+" browser launched successfully");
	driver.manage().window().maximize();
	driver.get(Url);
	Log.info("Entered the application url successfully");
	ExtentTestManager.getTest().log(Status.PASS, "Entered the application url successfully");
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	Thread.sleep(1000);
	/*
	 * driver.navigate().refresh(); driver.findElement(L_email).sendKeys(UserName);
	 * driver.findElement(L_password).sendKeys(Password);
	 * driver.findElement(L_Submit).click();
	 */
	
} catch (Exception e) {
	
//	Log.error(e.toString());
	ExtentTestManager.getTest().log(Status.FAIL, e.toString() );
	throw new Exception(e.getMessage());

}
		

	}
	

	public void setup(int width, int height ) throws IOException, InterruptedException {

		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
//		String UserName = configloader().getProperty("UserName");
//		String Password = configloader().getProperty("Password");

		switch (Browser.toUpperCase()) {

		case "CHROME":
//
//			Map<String, String> mp=new HashMap<String, String>();
//			mp.put("deviceName", mobile);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
//			options.setExperimentalOption("mobileEmulation", mp );
			driver = new ChromeDriver(options);
//			 = "iPhone SE"
			
//			org.openqa.selenium.Dimension d = new org.openqa.selenium.Di
			org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension( width, height);
//			  
			 driver.manage().window().setSize(d);
			
			break;

		case "FIREFOX":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("The Driver is not defined");
			Log.info("The Driver is not defined");
			ExtentTestManager.getTest().log(Status.PASS, "The Driver is not defined");
		}
		Log.info(Browser+" browser launched successfully");
		ExtentTestManager.getTest().log(Status.PASS, Browser+" browser launched successfully");
//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(Url);
		Log.info("Entered the application url successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Entered the application url successfully");
		Thread.sleep(1000);
		/*
		 * driver.navigate().refresh(); driver.findElement(L_email).sendKeys(UserName);
		 * driver.findElement(L_password).sendKeys(Password);
		 * driver.findElement(L_Submit).click();
		 */

	}
	
	
	
	public void Element_isdisplayed(By element) throws Exception {
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			Assert.assertTrue(wait2.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed());
			
			
	
		} catch (Exception e) {
			String stackTrace = Throwables.getStackTraceAsString(e);
			Log.error( stackTrace);
			throw new Exception("Element: "+ element +" is not displayed");
			
		}
		catch (AssertionError e) {
			String stackTrace = Throwables.getStackTraceAsString(e);
			Log.error( stackTrace);
			throw new Exception("Element: "+ element +" is not displayed");
		}
		
Thread.sleep(200);
		
	}
	
	
	public boolean Element_isChecked(By element) throws Exception {
		boolean b=false;
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			wait2.until(ExpectedConditions.presenceOfElementLocated(element));
			 b= ((WebElement) wait2).isSelected();
	
		} catch (Exception e) {
			throw new Exception("Element: "+ element +" is not displayed");
		}
		
//		WebDriverWait wait2 = new WebDriverWait(driver, 30);
//		Assert.assertTrue(wait2.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed(), "Element: "+ element +" is not displayed");
//		Assert.assertTrue(driver.findElement(element).isDisplayed());
		return b;
		
	}
	
	public void MoveToElement(By element) throws InterruptedException {
		WebElement element1 = driver.findElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element1);
		actions.perform();
		Thread.sleep(500);
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


	
public ExpectedCondition<Boolean> Verify_staleelement(WebElement element) throws InterruptedException {
		
//		WebDriverWait wait2 = new WebDriverWait(driver, 30);
//	return	wait2.until(ExpectedConditions.stalenessOf(element));
	return ExpectedConditions.stalenessOf(element);
		
	}
	
	
	
	public static void input(By element, String Value) throws InterruptedException {

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);
		Thread.sleep(300);

	}

	public static void click(By element) throws InterruptedException {

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Thread.sleep(2000);

	}
	
	public void Wait_method(int w) throws InterruptedException {
		
		Thread.sleep(w);
	}

	public void select(String value, By element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}

	public void scrolltoelement(By element) throws InterruptedException {
		Thread.sleep(200);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		Thread.sleep(200);
	}
	
	public void scrolltotop() throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
	}
	public void scrolltoend() throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
	}
	
	public void scrolltomiddle() throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
	}

	
	
	public String convert_to_tel_number(String number) {
		String tel_number = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return tel_number;
	}
	
	public void keypress(int KeyEvent) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent);
	}

	public void keyrelease(int KeyEvent) throws Throwable {
		Robot r = new Robot();
		r.keyRelease(KeyEvent);
	}

	public void PopUp_Authentication() throws Throwable {

		Robot r = new Robot();
		//First Login
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		//Second Login
/*		Thread.sleep(15000);	
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
	
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
				
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		
	}
	public void KeyPress_AllProducts__WindowTypeTopDischarge() throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

	}

	public void KeyPress_AllProducts__CarrierWindowTypeAirconInverter() throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	
	
	


public static String convert_month_to_number(String month) {
	
	switch(month) {
    case "January":
    case "january":
    case "jan":
    case "Jan":
    	month = "01";
    break;

    case "febuary":
    case "feb":
    case "Febuary":
    case "Feb":
    	month = "02";
    break;

    case "march":
    case "mar":
    case "March":
    case "Mar":
    	month = "03";
    break;

    case "april":
    case "apr":
    case "April":
    case "Apr":
    	month = "04";
    break;

    case "may":
    case "May":
    	month = "05";
    break;

    case "june":
    case "jun":
    case "June":
    case "Jun":
    	month = "06";
    break;

    case "july":
    case "jul":
    case "July":
    case "Jul":
    	month = "07";
    break;

    case "august":
    case "aug":
    case "August":
    case "Aug":
    	month = "08";
    break;

    case "september":
    case "sep":
    case "sept":
    case "September":
    case "Sep":
    case "Sept":
    	month = "09";
    break;

    case "october":
    case "oct":
    case "October":
    case "Oct":
    	month = "10";
    break;

    case "november":
    case "nov":
    case "November":
    case "Nov":
    	month = "11";
    break;

    case "december":
    case "dec":
    case "December":
    case "Dec":
    	month = "12";
    break;
    }
	
	return month;
	
}


public String Get_todays_date_pus_1month(String dateformatter) {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateformatter);  
//	   LocalDateTime now = LocalDateTime.now();
	 LocalDate now = LocalDate.now().plusMonths(1);
	   String date=dtf.format(now);
	   return date;
}
	
	}


































