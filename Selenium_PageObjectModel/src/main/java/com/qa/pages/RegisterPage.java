package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.Baseclass;

public class RegisterPage extends Baseclass {

	public RegisterPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//page factory or OR
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	WebElement logo;
	
	@FindBy(xpath="//*[@ng-model=\"FirstName\"]")
	WebElement First;
	
	@FindBy(xpath="//*[@ng-model=\"LastName\"]")
	WebElement Last;
	
	@FindBy(xpath="//*[@ng-model=\"Phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"checkbox1\"]")
	WebElement Hobbies;
	
	@FindBy(xpath="//*[@value=\"Male\"]")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"msdd\"]")
	WebElement combobox;
	
	@FindBy(xpath="//*[@id=\"Skills\"]")
	WebElement skills;
	
	@FindBy(xpath="//*[@id=\"countries\"]")
	WebElement country;
	
	@FindBy(xpath="//select[@id=\"yearbox\"]")
	WebElement year;
	
	@FindBy(xpath="//select[@ng-model=\"monthbox\"]")
	WebElement month;
	
	@FindBy(xpath="//select[@id=\"daybox\"]")
	WebElement date;
	
	@FindBy(xpath="//*[@role=\"combobox\"]")
	WebElement SelectCountry;
	
	@FindBy(xpath="//*[@id=\"firstpassword\"]")
	WebElement firstpwd;
	
	@FindBy(xpath="//*[@ng-model=\"CPassword\"]")
	WebElement confirmpwd;
	
	@FindBy(xpath="//*[@id=\"imagesrc\"]")
	WebElement chooseFile;
	
	@FindBy(xpath="//*[@id=\"submitbtn\"]")
	WebElement submitbutton;
	
	
	//Actions to perform
	public void Enterregistrationpage()
	{
		logo.click();
	}
	public String VerifyRegisterPageTitle()
	{
		return driver.getTitle();
	}
	public void EnterDetails(String first,String last,String phn)
	{
		First.sendKeys(first);
		Last.sendKeys(last);
		phone.sendKeys(phn);
		gender.click();
		Hobbies.click();
	}
	
	public void EnterDetails2(String x)
	{
		combobox.click();
        driver.findElement(By.xpath("//*[@class=\"ng-scope\"]//a[text()='"+x+"']")).click();
	}
	public void EnterDetails3(String skill,String coun,String selCoun)
	{
		Select s1=new Select(skills);
		s1.selectByValue(skill);
		
		Select s2=new Select(country);
		s2.selectByValue(coun);
		
		SelectCountry.click();
		driver.findElement(By.xpath("//*[@role=\"treeitem\" and text()='"+selCoun+"']")).click();
	}
	public void Calendar(String y,String m, String d)
	{
		Select yr=new Select(year);
		yr.selectByValue(y);
		
		Select mn=new Select(month);
		mn.selectByValue(m);
		
		Select dt=new Select(date);
		dt.selectByValue(d);
		
	}
	
	public void FinalDetails(String firstpswd,String confirmpswd)
	{
		firstpwd.sendKeys(firstpswd);
		confirmpwd.sendKeys(confirmpswd);
	}
	
	public void FileUpload()
	{
		chooseFile.sendKeys(System.getProperty("user.dir")+"/Demo.txt");
	}
	
	public void SubmitForm()
	{
		submitbutton.click();
	}
}
