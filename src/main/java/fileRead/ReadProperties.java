package fileRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static Properties fileRead(String path) throws IOException {
		FileInputStream f= new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(f);
		return prop;
		
		
	}

}
