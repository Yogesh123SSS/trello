package trellotesting;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.terllo.testyantra.pomrepository.BoardPOM;
import com.terllo.testyantra.pomrepository.CreatedBoardPagePOM;
import com.terllo.testyantra.pomrepository.HomePOM;
import com.terllo.testyantra.pomrepository.LogOutOfYourAtlasianAccountPOM;
import com.terllo.testyantra.pomrepository.LoginPOM;
import com.terllo.testyantra.pomrepository.LoginToContinuePOM;
import com.trello.testyantra.genericutilities.BaseClass;
public class EndToEndTesting extends BaseClass{
@Test	
public void testCase_01() throws IOException, Throwable
{
	//Launching Browser and pre conditions URL triggering by BaseClass Depending on test data
	webUtil.implicitWait(driver);
	HomePOM home=new HomePOM(driver);
	WebElement loginButton = home.getLoginButton();
	loginButton.click();
	//log in page validation
    if (validatation1()) {
    	Reporter.log("Pass: Log in page is Displayed");
	}else
	{
		Reporter.log("Fail :Log in page is not displayed");
	}
   LoginPOM login=new LoginPOM(driver);
   WebElement userNameTextField = login.getUserNameTextfield();
   userNameTextField.sendKeys(fileUtil.readDataFromPropertyFile("Email"));
   login.getContinButton().submit();
   LoginToContinuePOM loginCont=new LoginToContinuePOM(driver);
   WebElement passwordTextField=loginCont.getPasswordTextField();
   Thread.sleep(10000);// Explicit condition to be designed
   passwordTextField.sendKeys(fileUtil.readDataFromPropertyFile("Password"));
   loginCont.getLogButtonInContinuePage().click();
   if (validation2()) {
	Reporter.log("Pass: Board page is displayed");
}else
{
	Reporter.log("Fail: Board page is not displayed");
}
   BoardPOM board = new BoardPOM(driver);
   board.getCreateNewBoardOpt().click();
   board.getBoardTitleTextField().sendKeys(excelUtil.readStringDataFromExcel("MyData", 0, 1));
   Thread.sleep(7000);//until button is enabled
   board.getCreateButton().click();
   if (validation4()) {
	Reporter.log("Pass: Create board page is displayed");
}else
{
	Reporter.log("Fail : Create board page is not displayed");
}
   CreatedBoardPagePOM createBoard = new CreatedBoardPagePOM(driver);
  // Thread.sleep(10000);//explict wait need to add Until become active
   createBoard.getEnterTitleForCard().sendKeys(excelUtil.readStringDataFromExcel("MyData", 1, 1));
   createBoard.getAddCardButton().click();
   createBoard.getEnterTitleForCard().sendKeys(excelUtil.readStringDataFromExcel("MyData", 2, 1));
   createBoard.getAddCardButton().click();
   createBoard.getEnterTitleForCard().sendKeys(excelUtil.readStringDataFromExcel("MyData", 3, 1));
   createBoard.getAddCardButton().click();
   Thread.sleep(5000);//not necessory but check once
   createBoard.getCancelSymbol().click();
   Actions act=new Actions(driver);
   Thread.sleep(4000);// explicit wait check
   act.dragAndDropBy(createBoard.getTrainingWell(), 240, 0).perform();
   Thread.sleep(4000);//explicit wait check
   act.dragAndDropBy(createBoard.getCSVDataStorage(), 500, 0).perform();
   Thread.sleep(4000);//explicit wait visibility
   createBoard.getMoreOpt().click();
   createBoard.getInnerMoreOpt().click();
   createBoard.getCloseBoardOpt().click();
   createBoard.getCloseBoardCloseButton().click();
   createBoard.getPermanantlyDeleteButton().click();
   createBoard.getPermanatlyDeleteDeleteButton().click();
   createBoard.getAccountIcon().click();
   createBoard.getLogOutOption().click();
   LogOutOfYourAtlasianAccountPOM logOut = new LogOutOfYourAtlasianAccountPOM(driver);
   if (validation3()) {
	Reporter.log("Pass: Logout of your atlasian account Page is displayed");
}else
{
	Reporter.log("Fail: Logout of your atlasian account Page not displayed");
}
  // Thread.sleep(3000);//wait explicit visibility and validation 
   logOut.getLogOutButton().click();
}
}
