package practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class KeywordEngineTest {
	public static Workbook book;
	public static Sheet sheet;
	String sheetPath="D:\\Pragati\\Test data\\Book1.xlsx";
	@Test
	public void sendsheetNmae() throws FileNotFoundException
	{
		getExcelData("Sheet1");
	}
	public void getExcelData(String sheetName) throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream(sheetPath);
		System.out.println(sheetName);
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		book.getSheet(sheetName);
		Iterator<Row> r=sheet.iterator();
		r.next();
		while(r.hasNext())
		{
			Row i=r.next();
			Iterator<Cell> ce=i.cellIterator();
			while(ce.hasNext())
			{
		       
			String value=ce.next().getStringCellValue().toString().trim();
				if(!value.equalsIgnoreCase("NA"))
				{
					String locatorValue=value.split("=")[0].toString().trim();
					String locatorName=value.split("=")[1].toString().trim();
					System.out.println(locatorValue);
					System.out.println(locatorName);
				}
			}
	}
	}
}
