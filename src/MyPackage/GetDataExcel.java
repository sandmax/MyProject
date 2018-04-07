package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataExcel {

	public GetDataExcel() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\data\\data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet("Sheet1");
		Row r=st.getRow(0);
		Cell c=r.getCell(1);
		String data=c.toString();
		System.out.println(data);

	}

}
