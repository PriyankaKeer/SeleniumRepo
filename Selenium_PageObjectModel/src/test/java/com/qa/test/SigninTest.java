package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.SigninPage;


public class SigninTest extends Baseclass{
	SigninPage sp;
	public SigninTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		sp=new SigninPage();
		sp.ClickSignin();
	}
	
	@Test
	public void LoginPageTitleTest()
	{		
		String title=sp.GetTheTitle();
		Assert.assertEquals(title, "SignIn");
	}
	
	@Test
	public void LoginPageTest()
	{
		sp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
