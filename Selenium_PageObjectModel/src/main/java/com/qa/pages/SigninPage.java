package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class SigninPage extends Baseclass{

	//initializing the page objects
	public SigninPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//page factory or OR
	@FindBy(xpath="//*[@id=\"btn1\"]")
	WebElement clickSignin;
	
	@FindBy(xpath="//input[@ng-model=\"Email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@ng-model=\"Password\"]")
	WebElement password;
	
	//Actions to perform
	public void ClickSignin()
	{
		clickSignin.click();
	}
	public String GetTheTitle()
	{
	  return driver.getTitle();
	}

	public void login(String user,String pass)
	{
	 username.sendKeys(user);
	 password.sendKeys(pass);
	}
}
