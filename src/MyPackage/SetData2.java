package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData2 {
	public static void ToExcel(String filepath , String sheetname , int rowIndex ,int cellIndex , String value)
	{
		
	try
	{
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetname);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		 c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
