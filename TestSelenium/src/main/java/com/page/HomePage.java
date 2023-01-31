package com.page;





import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

import dev.failsafe.internal.util.Assert;

public class HomePage extends TestBase{
	
	Wrapper objWrapper = new Wrapper();
	
	@FindBy(id = "signin2")
	WebElement pSignUpButton;
	
	@FindBy(id = "sign-username")
	WebElement pSignUsername;
	
	@FindBy(id = "sign-password")
	WebElement pSignPassword;
	
	@FindBy(xpath = "(//*[text() = 'Sign up'])[2]")
	WebElement pSignUp;
	
	@FindBy(xpath = "(//*[text() = 'Close'])[2]")
	WebElement pCloseButton;
	
	@FindBy(xpath = "//*[text() = 'Contact']")
	WebElement pContactButton;
	
	@FindBy(id = "recipient-email")
	WebElement pContactEmail;
	
	@FindBy(id = "recipient-name")
	WebElement pContactName;
	
	@FindBy(id = "message-text")
	WebElement pContactMessage;
	
	@FindBy(xpath = "//*[text() = 'Send message']")
	WebElement pSendMessage;
	
	@FindBy(id = "login2")
	WebElement pLoginButton;
	
	@FindBy(id = "loginusername")
	WebElement pLoginUsername;
	
	@FindBy(id = "loginpassword")
	WebElement pLoginPassword;
	
	@FindBy(xpath = "(//*[text() = 'Log in'])[2]")
	WebElement pLogin;
	
	@FindBy(id = "logout2")
	WebElement pLogout;
	
	@FindBy(id = "nameofuser")
	WebElement welcomeUsername;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSignUpButton() {
		pSignUpButton.click();
	}
	
	public void SignUpUsername(String pValue) {
		objWrapper.enterText(pValue, pSignUsername, driver);
	}
	
	public void SignUpPassword(String pValue) {
		objWrapper.enterText(pValue, pSignPassword, driver);
	}
	
	public void clickSignUp() {
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		objWrapper.alertDismiss(driver);
	}
	
	//public void clickCloseButton() {
	//	objWrapper.waitForElement(driver, pCloseButton);
	//	pCloseButton.click();
	//}
	public void clickContactButton() {
		pContactButton.click();
	}
	public void contactEmailEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactEmail, driver);
	}
	public void contactNameEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactName, driver);
	}
	public void contactMessageEntertext(String pValue) {
		objWrapper.enterText(pValue, pContactMessage, driver);
		
		
	}
	public void clickSendMessage() {
		pSendMessage.click();
		objWrapper.waitForAlert(driver);
		objWrapper.alertDismiss(driver);
	}
	public void clickLoginButton() {
		pLoginButton.click();
	}
	public void loginUsernameEnterText(String pValue) {
		objWrapper.enterText(pValue, pLoginUsername, driver);
	}
	public void loginPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue, pLoginPassword, driver);
	}
	public void clickLogin() {
		pLogin.click();
		//objWrapper.waitForAlert(driver);
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//objWrapper.alertDismiss(driver);
		
	}
	public void clickLogOut() {
		objWrapper.waitForElement(driver, pLogout);
		pLogout.click();
		
		
		
	}
	public String userName() {
		String expectedtest = "test46866055";
		objWrapper.waitForElement(driver, welcomeUsername);
		String name=welcomeUsername.getText();
		//int startingIndex = 8;
		//int endingIndex = welcomeUsername.getText().length();
		//String actualtest=name.substring(startingIndex, endingIndex);
		//int second = name.indexOf(" ");
        
        String actualtest = name.substring(name.lastIndexOf(" ")+1);
		return actualtest;
	   
	
		
		
	}
	
	
	
}
