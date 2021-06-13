package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.InteractionsPage;


public class InteractionsTest extends Baseclass{

	InteractionsPage ip=new InteractionsPage();
	
	public InteractionsTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		ip=new InteractionsPage();
		ip.EnterRegisterPage();
		Thread.sleep(1000);
	}
	
	@Test
	public void DragDrop1() throws InterruptedException
	{
		ip.DragAndDropStatic();
	}
	
	@Test
	public void DragDrop2() throws InterruptedException
	{
		ip.DragAndDropDynamic();
	}
	
	@Test
	public void ResizeTest() throws InterruptedException
	{
		ip.ResizableObj();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
