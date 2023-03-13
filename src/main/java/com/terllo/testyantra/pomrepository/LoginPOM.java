package com.terllo.testyantra.pomrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPOM {
WebDriver driver;
public LoginPOM(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id = "user")
private WebElement userNameTextField;
public WebElement getUserNameTextfield() {
	return userNameTextField;
}
@FindBy(id = "login")
private WebElement continueButton;
public WebElement getContinButton() {
	return continueButton;
}
}
