package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GetData {
	public static String fromproperty(String filepath,String Key) 
	{
		String Data=null;
		try
		{
	File f=new File(filepath)	;
	FileInputStream fis=new FileInputStream(f);
	Properties prop=new Properties();
	prop.load(fis);
	Data=(String)prop.get(Key);
	
	
		}
		catch (Exception e)
		
		{
			e.printStackTrace();
		}
		return Data;
	}
	
	
	
	
	
	

}
