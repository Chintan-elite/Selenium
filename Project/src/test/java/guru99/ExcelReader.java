package guru99;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	String path;
	String name;
	
	public ExcelReader(String path, String name) {
		super();
		this.path = path;
		this.name = name;
	}

	public int getRowCount()
	{
		int i=0;
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet worksheet = workbook.getSheet(name);
			
			i = worksheet.getPhysicalNumberOfRows();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public int getColCount()
	{
		int i=0;
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet worksheet = workbook.getSheet(name);
			
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	public String getData(int row, int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet worksheet = workbook.getSheet(name);
			
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	
	
	
	
}
