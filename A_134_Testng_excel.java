package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class A_134_Testng_excel 
{
	@Test
	public void data_fetch() throws EncryptedDocumentException, IOException
	{
		FileInputStream excel = new FileInputStream("D:\\JAva\\Automation\\DataFetching\\Assignment_134.xlsx");
		Workbook wbook = WorkbookFactory.create(excel);
		Sheet s1 = wbook.getSheet("abc");
		
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String result_1 = c1.toString();
		System.out.println(result_1);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String result_2 = c2.toString();
		System.out.println(result_2);
	}
}
