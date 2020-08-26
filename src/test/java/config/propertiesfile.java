package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesfile {

	public static void getProperties() throws FileNotFoundException,IOException {
       Properties prop = new Properties();
       String projectPath = System.getProperty("user.dir");
       
       InputStream is = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
       
       prop.load(is);
       System.out.println(prop.getProperty("browser") );
       
	}
	
	public static void setProperties() throws IOException
	{
		 Properties prop = new Properties();
		 String filePath = System.getProperty("user.dir");
		 try {
			OutputStream os = new FileOutputStream(filePath+"/src/test/java/config/config.properties");
			 prop.setProperty("browser", "chrome");
			 prop.store(os, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		 
		
	}
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		propertiesfile.getProperties();
		propertiesfile.setProperties();
		propertiesfile.getProperties();
	}

}
