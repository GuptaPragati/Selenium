package guru99Site;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {

	@Test(dataProvider="getData")
	public void setdata(String ts,String loc,String action,String val)
	{
		System.out.println(ts+"...."+loc+"...."+action+"...."+val);
	}
	@DataProvider(name="getData")
	public Object[][] getdtata() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\Pragati\\Test data\\Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		//Iterator<Row> row=sheet.iterator();
		Row r=sheet.getRow(0);
		int colCount=r.getLastCellNum();
		Object data[][]= new Object[rowCount-1][colCount] ;
		for(int i=0;i<rowCount;i++)
		{
		    r=sheet.getRow(i+1);
			
	//		Iterator<Cell> cell=r.cellIterator();
			for(int j=0;j<colCount;j++)
			{
				data[i][j]=r.getCell(j).toString();
			}
		}
		return data;
		
	}
	
}
