package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class MorePage extends Baseclass{

	public MorePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),\"More\")]")
	WebElement MoreObj;
	
	@FindBy(xpath="//a[contains(text(),\"File Download\")]")
	WebElement FileDown;
	
	@FindBy(xpath="//a[@type=\"button\"]")
	WebElement Download;

	public void EnterRegisterPage()
	{
		logo.click();
	}
	
	public void FileDownloadDir() throws InterruptedException
	{
		   Actions action=new Actions(driver);
		   action.moveToElement(MoreObj).build().perform();
		   Thread.sleep(500);
		   action.click(FileDown).build().perform();
		   action.click(Download).build().perform();
	}
	
}
