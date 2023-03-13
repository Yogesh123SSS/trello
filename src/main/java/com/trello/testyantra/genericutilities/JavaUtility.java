package com.trello.testyantra.genericutilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class JavaUtility {
public void timeStamp(TakesScreenshot driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	String TimeStamp=LocalDateTime.now().toString().replace(":", "-");
	File destFile=new File("./errorshots/nasaWebpage"+TimeStamp+".png");//commans-io lib
	FileUtils.copyFile(srcFile, destFile);
}
}
