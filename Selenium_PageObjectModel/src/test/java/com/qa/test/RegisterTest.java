package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.RegisterPage;

public class RegisterTest extends Baseclass {
	RegisterPage rp;
	public RegisterTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		rp=new RegisterPage();
		rp.Enterregistrationpage();
	}
	
	@Test
	public void RegisterPageTitleTest()
	{		
		String title=rp.VerifyRegisterPageTitle();
		Assert.assertEquals(title, "Register");
	}
	
	@Test
	public void Register()
	{
		rp.EnterDetails(prop.getProperty("Firstname"),prop.getProperty("Lastname"),"9876543210");
		rp.EnterDetails2("Italian");
		rp.EnterDetails3("C","India","India");
		rp.Calendar("1998", "June","15");
	}
	
	@Test
	public void submitRegisterTest()
	{
		rp.FinalDetails(prop.getProperty("firstpwd"), prop.getProperty("confirmpwd"));
	}
	
	@Test
	public void FileUploadTest()
	{
		rp.FileUpload();
	}
	
	@Test
	public void SubmitFormTest()
	{
		rp.SubmitForm();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
