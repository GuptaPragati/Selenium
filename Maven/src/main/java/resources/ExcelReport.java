package resources;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReport {
	

public	XSSFWorkbook workbook=null;
public	XSSFSheet sheet=null;
public	FileInputStream fls=null;
public XSSFRow row=null;
public XSSFCell cell=null;

public void XLS_Reader(String path) throws IOException
{

	FileInputStream fls=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(fls);
	
	
}
//to return row count

public int RowCount(String sheetName)
{
int index=workbook.getSheetIndex(sheetName);
if(index==-1)
{return 0;}

else
{
	sheet=workbook.getSheetAt(0);
	int number=sheet.getLastRowNum()+1;
	return number;
}
}

public void getCellData(String path,int rownum,int cellnum) throws IOException
{
	FileInputStream fls=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(fls);
	sheet=workbook.getSheetAt(0);
	Row row = sheet.getRow(rownum);
	if (row != null) {
	    for (int j = 0; j < row.getLastCellNum(); j++) {
	        if (row.getCell(j) != null) {
	            if (row.getCell(j).getCellType() == CellType.STRING) {
	                String value=row.getCell(j).getStringCellValue();
	                if(value != null) { 
	                    System.out.println(value);
	                }
	            }
	        }   
	    }
	}
}
}

