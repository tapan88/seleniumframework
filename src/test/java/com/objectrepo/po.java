package com.objectrepo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

public class po 
{
	WebDriver driver=null;
	public po(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(id="Email")
private WebElement usrnmtxtbx;

@FindBy(id="ne")
private WebElement nxtbtn;
@FindBy(id="Passwd")
private WebElement pswbx;
@FindBy(id="signIn")
private WebElement sgnbtn;

public void gmaillgn(String username,String password)
{
	usrnmtxtbx.sendKeys(username);
	nxtbtn.click();
	pswbx.sendKeys(password);
	sgnbtn.click();
	
	
}

}
