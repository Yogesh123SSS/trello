package com.terllo.testyantra.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
WebDriver driver;
//Parameterized constructor of this class used to initialize the Global variable driver with local variable in the constructor
public HomePOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);//along with driver reference elements address is sent to script
}
@FindBy(xpath = "//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/a[text()='Log in']")
private WebElement loginButton;
public WebElement getLoginButton() {
	return loginButton;
}
}
