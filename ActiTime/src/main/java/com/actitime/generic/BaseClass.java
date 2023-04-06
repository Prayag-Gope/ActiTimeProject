package com.actitime.generic;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Maven\\ActiTime\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void CloseBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("Login",true);
		FileLib fl= new FileLib();
		String Url = fl.getpropertyData("url");
		String un = fl.getpropertyData("username");
		String pwd = fl.getpropertyData("password");
		driver.get(Url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pwd);
		
	}
	
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		HomePage h= new HomePage(driver);
		h.setLogout();
	}

}
