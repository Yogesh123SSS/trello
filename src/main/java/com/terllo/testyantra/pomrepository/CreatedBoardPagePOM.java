package com.terllo.testyantra.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedBoardPagePOM {
WebDriver driver;
public CreatedBoardPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//h2[text()='To Do']/../..//span[text()='Add a card']")
private WebElement addACardOption;
public WebElement getAddaCardOption() {
	return addACardOption;
}
@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
private WebElement enterTitleForCard;
public WebElement getEnterTitleForCard() {
	return enterTitleForCard;
}
@FindBy(xpath = "//input[@value='Add card']")
private WebElement addCardButton;
public WebElement getAddCardButton() {
	return addCardButton;
}
@FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover js-cancel']")
private WebElement cancelSymbol;
public WebElement getCancelSymbol() {
	return cancelSymbol;
}
@FindBy(xpath = "//div//span[text()='He training Well']")
private WebElement trainingWell;
public WebElement getTrainingWell() {
	return trainingWell;
}
@FindBy(xpath = "//div//span[text()='Selenium trianer name is Chandan']")
private WebElement selTrainerChandan;
public WebElement getSelTrainerChandan() {
	return selTrainerChandan;
}
@FindBy(xpath = "//div//span[text()='CSV data storage is not completed']")
private WebElement CSVDataStorage;
public WebElement getCSVDataStorage() {
	return CSVDataStorage;
}
@FindBy(xpath = "//h2[text()='Doing']")
private WebElement doingStatusOpt;
public WebElement getDoingStatusOpt() {
	return doingStatusOpt;
}
@FindBy(xpath = "//h2[text()='Done']")
private WebElement doneStatusOpt;
public WebElement getDoneStatusOpt() {
	return doneStatusOpt;
}
@FindBy(xpath = "//div[@class='board-header u-clearfix js-board-header']//span[@aria-label='OverflowMenuHorizontalIcon']")
private WebElement moreOpt;
public WebElement getMoreOpt() {
	return moreOpt;
}
@FindBy(xpath = "//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']")
private WebElement innerMoreOpt;
public WebElement getInnerMoreOpt() {
	return innerMoreOpt;
}
@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-close-board']")
private WebElement closeBoardOpt;
public WebElement getCloseBoardOpt() {
	return closeBoardOpt;
}
@FindBy(xpath = "//input[@value='Close']")
private WebElement closeBoardCloseButton;
public WebElement getCloseBoardCloseButton() {
	return closeBoardCloseButton;
	//Type=submit
}
@FindBy(xpath = "//button[text()='Permanently delete board']")
private WebElement permanantlyDeleteButton;
public WebElement getPermanantlyDeleteButton() {
	return permanantlyDeleteButton;
}
@FindBy(xpath = "//button[text()='Delete']")
private WebElement permnantlyDeleteDeleteButton;
public WebElement getPermanatlyDeleteDeleteButton() {
	return permnantlyDeleteDeleteButton;
}
@FindBy(xpath = "//span[@title='yogeshkucv123 (yogeshkucv123)']")
private WebElement accountIcon;
public WebElement getAccountIcon() {
	return accountIcon;
}
@FindBy(xpath = "//span[text()='Log out']")
private WebElement logOutOption;
public WebElement getLogOutOption() {
	return logOutOption;
}
}
