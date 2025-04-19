package Generic_Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {

	
		
	public String getKeyAndValueData(String key) throws Throwable
	
	{
	 FileInputStream fis = new FileInputStream("./src/test/resources/Amazon.txt");
	 
	 Properties pro = new Properties();
	 
	 pro.load(fis);
	 
	 return pro.getProperty(key);
	}

}
