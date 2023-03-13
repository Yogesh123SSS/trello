package com.trello.testyantra.genericutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * @author Yogesh K U
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
public String readStringDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/trelloTestData.xlsx");
	Workbook workBook = WorkbookFactory.create(fis);
	String celldata = workBook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return celldata;
}
}
