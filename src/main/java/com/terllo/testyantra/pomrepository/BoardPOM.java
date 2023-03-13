package com.terllo.testyantra.pomrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BoardPOM {
WebDriver driver;
public BoardPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//span[text()='Create new board']")
private WebElement createNewBoard;
public WebElement getCreateNewBoardOpt() {
	return createNewBoard;
}
@FindBy(xpath = "//input[@type='text']")
private WebElement boardTitle;
public WebElement getBoardTitleTextField() {
	return boardTitle;
}
@FindBy(xpath = "//button[text()='Create']")
private WebElement createButton;
public WebElement getCreateButton() {
	return createButton;
}
}

