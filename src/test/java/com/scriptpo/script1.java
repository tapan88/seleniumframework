package com.scriptpo;

import java.util.Set;

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
	     String usn=d.getconfigdata(System.getProperty("user.dir")+"\\Data.properties", "USERNAME");
	     String pswd=d.getconfigdata(System.getProperty("user.dir")+"\\Data.properties", "PASSWORD");
	     p.getlgntxt().click();
	     p.usernametxtbx().sendKeys(usn);
	   //  Set set=driver.getWindowHandles();
	   //  System.out.println(set);
	  	}

}
