package com.terllo.testyantra.pomrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginToContinuePOM {
WebDriver driver;
public LoginToContinuePOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@name='password']")
private WebElement passwordTextField;
public WebElement getPasswordTextField() {
	return passwordTextField;
}
@FindBy(xpath = "//span[text()='Log in']")
private WebElement logButtonInContinuePage;
public WebElement getLogButtonInContinuePage() {
	return logButtonInContinuePage;
}
}

