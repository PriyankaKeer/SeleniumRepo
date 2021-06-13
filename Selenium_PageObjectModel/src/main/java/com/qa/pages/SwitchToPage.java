package com.qa.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class SwitchToPage extends Baseclass{

	public SwitchToPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	WebElement logo;
	
	@FindBy(xpath="//*[text()=\"SwitchTo\"]")
	WebElement SwitchTo;
	
	@FindBy(xpath="//a[text()=\"Alerts\"]")
	WebElement alert;
	
	@FindBy(xpath="//*[@id=\"OKTab\"]/button")
	WebElement Okbutton;
	
	@FindBy(xpath="(//*[@class=\"analystic\"])[2]")
	WebElement alert2;
	
	@FindBy(xpath="//*[@id=\"CancelTab\"]/button")
	WebElement Okbutton2;
	
	@FindBy(xpath="(//*[@class=\"analystic\"])[3]")
	WebElement alert3;
	
	@FindBy(xpath="//*[@id=\"Textbox\"]/button")
	WebElement Okbutton3;
	
	@FindBy(xpath="//a[text()=\"Windows\"]")
	WebElement windows;
	
	@FindBy(xpath="//*[@id=\"Tabbed\"]/a/button")
	WebElement clickbutton;
	
	@FindBy(xpath="//a[text()=\"Frames\"]")
	WebElement frames;
	
	@FindBy(xpath="(//*[@type=\"text\"])[1]")
	WebElement frame1;
	
	@FindBy(xpath="(//*[@class=\"analystic\"])[2]")
	WebElement frame2;
	
	@FindBy(xpath="//*[@src=\"MultipleFrames.html\"]")
	WebElement f1;
	
	@FindBy(xpath="//*[@src=\"SingleFrame.html\"]")
	WebElement f2;
	
	@FindBy(xpath="//*[@type=\"text\"]")
	WebElement frame2txt;
	
	public void EnterRegisterPage()
	{
		logo.click();
	}
	
	public void handlealert1()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(alert).build().perform();
		action.click(Okbutton).build().perform();
		driver.switchTo().alert().accept();
	}
	
	public void handlealert2()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(alert).build().perform();
		action.click(alert2).build().perform();
		action.click(Okbutton2).build().perform();
		driver.switchTo().alert().accept();
	}
	
	public String handlealert3()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(alert).build().perform();
		action.click(alert3).build().perform();
		action.click(Okbutton3).build().perform();
		return driver.switchTo().alert().getText().toString();
	}
	
	public void HandleWindows()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(windows).build().perform();
		action.click(clickbutton).build().perform();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs2.toString());
		driver.switchTo().window(tabs2.get(1));
	}
	
	public void HandleFrames()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(frames).build().perform();
		driver.switchTo().frame("SingleFrame");
		action.click(frame1).build().perform();
	}

	public void HandleFrames2()
	{
		Actions action=new Actions(driver);
		action.moveToElement(SwitchTo).perform();
		action.click(frames).build().perform();
		action.click(frame2).build().perform();
		driver.switchTo().frame(f1).switchTo().frame(f2);
		action.click(frame2txt).build().perform();
	}
}
