package com.qa.pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class WidgetsPage extends Baseclass{

	public WidgetsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	WebElement logo;
	
	@FindBy(xpath="//*[text()=\"Widgets\"]")
	WebElement Widgets;
	
	@FindBy(xpath="//a[contains(text(),\"Accordion\")]")
	WebElement AccordionObj;
	
	@FindBy(xpath="(//*[@data-parent=\"#accordion\"])[2]")
	WebElement FirstAccodion;
	
	@FindBy(xpath="//*[@id=\"collapse2\"]/div")
	WebElement InsideAccordion;
	
	@FindBy(xpath="//*[@class=\"imgdp\"]")
	WebElement CalendarClick;
	
	@FindBy(xpath="//a[contains(text(),\"Datepicker\")]")
	WebElement DatePicker;
	
	@FindBy(xpath="//span[@class=\"ui-datepicker-month\"]")
	WebElement MonthDiv;
	
	@FindBy(xpath="//span[@class=\"ui-datepicker-year\"]")
	WebElement YearDiv;
	
	@FindBy(xpath="//a[@class=\"ui-state-default\" and text()=\"20\"]")
	WebElement DaySelect;
	
	@FindBy(xpath="//*[text()=\"Prev\"]")
	WebElement Prev;
	
	@FindBy(xpath="//*[text()=\"Next\"]")
	WebElement Next;
	
	@FindBy(xpath="//a[contains(text(),\"Slider\")]")
	WebElement SliderObj;
	
	@FindBy(xpath="//*[@id=\"slider\"]/a")
	WebElement Slider;
	
	public void EnterRegisterPage()
	{
		logo.click();
	}
	
	public String HandleAccordion() throws InterruptedException
	{
	   Actions action=new Actions(driver);
	   action.moveToElement(Widgets).build().perform();
	   Thread.sleep(500);
	   action.click(AccordionObj).build().perform();
	   Thread.sleep(500);
	   action.click(FirstAccodion).build().perform();
	   return InsideAccordion.getText();	   
	}
	
	public void CalendarHandling(int yr,String mn,int dt) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(Widgets).build().perform();
		
		action.click(DatePicker).build().perform();
		
		Thread.sleep(500);
		CalendarClick.click();
		String month=MonthDiv.getText();
		System.out.println(month);
		String year=YearDiv.getText();
		int y=Integer.parseInt(year);
		System.out.println(y);
		
		WebElement day=driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and text()="+dt+"]"));
		if(mn==month && yr==y)
		{
			day.click();
		}
		Thread.sleep(3000);
	}
	
	public void HandleSlider() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(Widgets).build().perform();		
		action.click(SliderObj).build().perform();	
		Thread.sleep(500);
		action.moveToElement(Slider).clickAndHold().moveByOffset(40,0).release().perform();
		Thread.sleep(1000);
	}

}
