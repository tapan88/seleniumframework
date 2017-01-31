package com.objectrepo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class LoginPage_verify 
{
	WebDriver driver=null;
	public LoginPage_verify(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(xpath="//a[contains(text(),'Log In')]")
private WebElement logintext;
public WebElement getlgntxt()
{
	return logintext;
}
@FindBy(id="user_email")
private WebElement usernametxtbx;
public WebElement usernametxtbx()
{
	return usernametxtbx;
}


}
