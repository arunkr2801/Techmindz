package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;



public class HomePageTestCases extends TestBase {
	HomePage homepage;
	public HomePageTestCases() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}
	
	@Test(priority = 1)
	public void clickOnSignUpButton() {
		homepage.clickSignUpButton();
		//homepage.clickCloseButton();
		homepage.SignUpUsername("test63866055");
		homepage.SignUpPassword("password");
		homepage.clickSignUp();
	}
	
	
	@Test(enabled = false)
	public void clickOnContactButton() {
		homepage.clickContactButton();
		homepage.contactEmailEnterText("test@gmail.com");
		homepage.contactNameEnterText("textname");
		homepage.contactMessageEntertext("EnterText");
		homepage.clickSendMessage();
	}

	
	@Test(priority = 2)
	public void clickOnLoginButton() {
		homepage.clickLoginButton();
		homepage.loginUsernameEnterText("test63866055");
		homepage.loginPasswordEnterText("password");
		
		homepage.clickLogin();
		String ab=homepage.userName();
		System.out.println(ab);
		
		Assert.assertEquals(ab, "test63866055", "passed");
		//
		
		
		//homepage.clearEnterText();
		homepage.clickLogOut();
	}
	
 
}
