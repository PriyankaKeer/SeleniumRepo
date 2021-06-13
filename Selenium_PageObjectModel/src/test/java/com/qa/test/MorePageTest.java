package com.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.MorePage;

public class MorePageTest extends Baseclass {

	MorePage mp=new MorePage();
	public MorePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException
	{
		initialization();
		mp=new MorePage();
		mp.EnterRegisterPage();
		Thread.sleep(1000);
	}
	
	@Test
	public void FileDownloadTest() throws InterruptedException
	{
		mp.FileDownloadDir();
	}
	

}
