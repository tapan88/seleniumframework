package com.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class Browser 
{
	
	public static WebDriver driver;
	@BeforeMethod
	public static WebDriver getbrowser() throws Throwable
	{
		if(Datareading.getconfigdata("C:\\liqvidautomation\\framework\\Data.properties","BROWSER").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
			System.out.println("Firefox Browser is set");
			driver = new FirefoxDriver();
		}
		else if(Datareading.getconfigdata("C:\\liqvidautomation\\framework\\Data.properties","BROWSER").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\liqvidautomation\\framework\\resource\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		return driver;
		
	}
	
	public void loadurl() throws Throwable
	{
		Datareading d=new Datareading();
		String url=d.getconfigdata("C:\\liqvidautomation\\framework\\Data.properties", "URL");
		driver.get(url);
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}

}
