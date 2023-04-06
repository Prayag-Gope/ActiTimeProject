package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement unTbx;
	
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	
	 @FindBy(id="keepLoggedInCheckBox")
	private WebElement kmlTbx;
	 
	 @FindBy(xpath="//div[text()='Login ']")
	private WebElement LgBtn;
	 
	 public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
		  
   }
	  public void setLogin(String un,String pwd) {
		  unTbx.sendKeys(un);
		  pwdTbx.sendKeys(pwd);
		  kmlTbx.click();
		  LgBtn.click();
	  }
	  
}

