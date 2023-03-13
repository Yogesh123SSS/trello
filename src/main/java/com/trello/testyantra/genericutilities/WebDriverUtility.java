package com.trello.testyantra.genericutilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
public WebDriverWait explicitWait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	return wait;
}
}
