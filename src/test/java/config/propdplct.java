package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propdplct {
	
	public static void main(String[] Args)
	{
		try {
			getval();
			setval();
			getval();
		} catch (IOException e) {
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	}

	public static void getval() throws IOException
	{
		Properties prop = new Properties();
		
		String fpath = System.getProperty("user.dir");
		InputStream is = new FileInputStream(fpath+"/src/test/java/config/config.properties");
		prop.load(is);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("URL1"));
	}
	
	public static void setval() throws IOException
	{
		Properties prop = new Properties();
		String fpath = System.getProperty("user.dir");
		OutputStream os = new FileOutputStream(fpath+"/src/test/java/config/config.properties");
		prop.setProperty("browser", "b1");
		prop.setProperty("username", "u1");
		prop.setProperty("password", "p1");
		prop.setProperty("URL1", "url1");
		prop.store(os,null);
	}

}
