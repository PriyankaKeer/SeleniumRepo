package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.WidgetsPage;

public class WidgetsTest extends Baseclass{

	WidgetsPage wp=new WidgetsPage();
	public WidgetsTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException
	{
		initialization();
		wp=new WidgetsPage();
		wp.EnterRegisterPage();
		Thread.sleep(1000);
	}
	
	@Test
	public void AccordianTest1() throws InterruptedException
	{
		wp.HandleAccordion();
	}
	
	@Test
	public void Datepicker(int year,String month, int date) throws InterruptedException
	{
		wp.CalendarHandling(2021, "June", 30);
	}
	
	@Test
	public void Slidertest() throws InterruptedException
	{
		wp.HandleSlider();
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
