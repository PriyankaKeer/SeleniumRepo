package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class InteractionsPage extends Baseclass{

	public InteractionsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),\"Interactions\")]")
	WebElement InteractionsObj;
	
	@FindBy(xpath="//a[contains(text(),\"Drag and Drop\")]")
	WebElement DragAndDrop;
	
	@FindBy(xpath="//a[contains(text(),\"Static\")]")
	WebElement Static;
	
	@FindBy(xpath="//a[text()=\"Dynamic \"]")
	WebElement Dynamic;
	
	@FindBy(xpath="//*[@id=\"angular\"]")
	WebElement DragObj;
	
	@FindBy(xpath="//*[@id=\"droparea\"]")
	WebElement DropObj;
	
	@FindBy(xpath="//a[text()=\"Resizable\"]")
	WebElement ResizeableObject;
	
	@FindBy(xpath="//*[@id=\"resizable\"]/div[3]")
	WebElement Resizee;
	
	public void EnterRegisterPage()
	{
		logo.click();
	}
	
	public void DragAndDropStatic() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(InteractionsObj).build().perform();
		action.moveToElement(DragAndDrop).build().perform();
		action.click(Static).build().perform();
		Thread.sleep(10000);
		action.clickAndHold(DragObj).moveToElement(DropObj).release().perform();
	}
	
	public void DragAndDropDynamic() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(InteractionsObj).build().perform();
		action.moveToElement(DragAndDrop).build().perform();
		action.click(Dynamic).build().perform();
		Thread.sleep(10000);
		action.clickAndHold(DragObj).moveToElement(DropObj).release().perform();
	}
	
	public void ResizableObj() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(InteractionsObj).build().perform();
		action.moveToElement(ResizeableObject).build().perform();
		action.click(ResizeableObject).build().perform();
		Thread.sleep(10000);
		action.clickAndHold(Resizee).moveByOffset(50,50).release().build().perform();
		Thread.sleep(10000);
	}
	

}
