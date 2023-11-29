package GenricLibaray;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtilClass {
	
	public String readdatafrompropertifile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/java/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	public void Writedatapropertifile() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("./src/test/java/commondata.properties");
		
		Properties pobj = new Properties();
		pobj.setProperty("url", "https://trello.com/");
		pobj.setProperty("username", "ashubeli3735@gmail.com");
		pobj.setProperty("browser", "chrome");
		pobj.setProperty("password", "ashu@3735");
		pobj.store(fos, "Write Data");
	
	}

}
