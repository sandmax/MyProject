package MyPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData2 {
	public static String FromExcel(String filepath , String sheetname , int rowIndex ,int cellIndex)
	{
	String data=null;
	try
	{
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetname);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		 data=c.toString();
		System.out.println(data);

	}
	
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return data;
	}

}
