package com.genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.scriptpo.script1;

public class samplelisnr implements ITestListener
{
	WebDriver driver;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) 
	{    Date d=new Date();
		//Browser b=new Browser();
		//TakesScreenshot ts=(TakesScreenshot)driver;
		EventFiringWebDriver wd=new EventFiringWebDriver(Browser.driver);
		File srcimg=wd.getScreenshotAs(OutputType.FILE);
		File dstFile=new File(System.getProperty("user.dir")+"\\screenshots\\test.png"+result.getMethod().getMethodName());
		try {
			FileUtils.copyFile(srcimg, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
