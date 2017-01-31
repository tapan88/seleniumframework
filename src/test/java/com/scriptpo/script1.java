package com.scriptpo;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genric.Browser;
import com.genric.Datareading;
import com.objectrepo.LoginPage_verify;

@Listeners(com.genric.samplelisnr.class)
public class script1 extends Browser
{
	@Test
	public void logintest() throws Throwable
	{
		 Datareading d=new  Datareading ();
	     loadurl();
	     LoginPage_verify p=new LoginPage_verify(driver);
	     String usn=d.getconfigdata("C:\\liqvidautomation\\framework\\Data.properties", "USERNAME");
	     String pswd=d.getconfigdata("C:\\liqvidautomation\\framework\\Data.properties", "PASSWORD");
	     p.getlgntxt().click();
	     
	}

}
