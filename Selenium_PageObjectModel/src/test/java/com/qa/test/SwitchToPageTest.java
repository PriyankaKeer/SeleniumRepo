package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.SwitchToPage;

public class SwitchToPageTest extends Baseclass
{
    SwitchToPage stp;
	public SwitchToPageTest() throws IOException {
		super();	
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		stp=new SwitchToPage();
		stp.EnterRegisterPage();
	}
	
	@Test
	public void Alert1Test() throws InterruptedException
	{	
		stp.handlealert1();
	}
	
	@Test
	public void Alert2Test() throws InterruptedException
	{	
		stp.handlealert2();
	}
	
	@Test
	public void Alert3Test() throws InterruptedException
	{	
		stp.handlealert3();
	}
	
	@Test
	public void WindowsTest() throws InterruptedException
	{	
		stp.HandleWindows();
	}
	
	@Test
	public void FramesTest() throws InterruptedException
	{	
		stp.HandleFrames();
	}
	
	@Test
	public void Frames2Test() throws InterruptedException
	{	
		stp.HandleFrames2();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
