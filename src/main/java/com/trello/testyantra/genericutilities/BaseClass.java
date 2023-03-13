package com.trello.testyantra.genericutilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
//Object creation statements
 public WebDriver driver;
 public FileUtility fileUtil=new FileUtility();
 public WebDriverUtility webUtil=new WebDriverUtility();
 public ExcelUtility excelUtil=new ExcelUtility();
 
 public Boolean validatation1() throws IOException {
	Boolean loginPageValidateTitle = webUtil.explicitWait(driver).until(ExpectedConditions.titleIs(fileUtil.readDataFromPropertyFile("Title")));
    return loginPageValidateTitle;
  }
  public Boolean validation2() throws IOException {
    System.out.println("----------------"+fileUtil.readDataFromPropertyFile("Boardtitle"));
	Boolean boardtitle = webUtil.explicitWait(driver).until(ExpectedConditions.titleIs(fileUtil.readDataFromPropertyFile("Boardtitle")));
	System.out.println("boardtitle------------------"+boardtitle);
    return boardtitle;
  }
  public Boolean validation3() throws IOException {
	 Boolean logoutTitle = webUtil.explicitWait(driver).until(ExpectedConditions.titleIs(fileUtil.readDataFromPropertyFile("LogoutTitle")));
      return logoutTitle;
  }
  public Boolean validation4() throws IOException {
		 Boolean createBoard = webUtil.explicitWait(driver).until(ExpectedConditions.titleIs(fileUtil.readDataFromPropertyFile("Createdboardtitle")));
	      return createBoard;
	  }
  
  @BeforeMethod
  @Parameters("browserName")
  public void beforeconfig(String browserName ) throws IOException {
	//String browserName=fileUtil.readDataFromPropertyFile("Browser");
	if (browserName.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if(browserName.equals("Edge")) {
		driver=new EdgeDriver();
	}else
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileUtil.readDataFromPropertyFile("URL"));
}
  @AfterMethod
  public void afterConfig() {
	driver.manage().window().minimize();
	driver.quit();
}
}
