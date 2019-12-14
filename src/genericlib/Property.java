package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static String getvalue(String path, String key) {
		String v="";
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream(path));
			v = p.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
}
