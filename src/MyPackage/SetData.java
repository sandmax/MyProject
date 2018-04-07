package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class SetData {
	public static String toproperty(String filepath,String KEY , String VALUE , String COMMENT) 
	{
		String Data=null;
		try
		{
	File f=new File(filepath)	;
	FileInputStream fis=new FileInputStream(f);
	Properties prop=new Properties();
	prop.load(fis);
    prop.put(KEY, VALUE);
    FileOutputStream fos=new FileOutputStream(f);
    prop.store(fos, COMMENT);
	
		}
		catch (Exception e)
		
		{
			e.printStackTrace();
		}
		return Data;
	}
	
	
	
	
	
	

}
