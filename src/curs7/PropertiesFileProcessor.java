package curs7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {

	public void writePropertiesFile() throws IOException {
		//fisier properties
		try {
			OutputStream outPut = new FileOutputStream("test.properties");
			
			Properties prop = new Properties();
			prop.setProperty("username", "oana");
			prop.setProperty("password", "pass123");
			prop.setProperty("email", "oana@oana.com");
			
			prop.store(outPut, "Am salvat fisierul text.properties");
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void readPropertiesFile(String key) throws IOException {
		
		InputStream inputStream = new FileInputStream("test.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		System.out.println(prop.getProperty(key));
		
		
		
	}
	
	
}
