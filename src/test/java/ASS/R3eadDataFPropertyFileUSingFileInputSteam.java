package ASS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.Collection;

public class R3eadDataFPropertyFileUSingFileInputSteam {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(fi);
		Set<Object> keys = pro.keySet();
		System.out.println(keys);

		Collection<Object> values = pro.values();
		System.out.println(values);

		Set<String> names = pro.stringPropertyNames();
		System.out.println(names);

		String appurl = pro.getProperty("appurl");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
		System.out.println(appurl + " , " + username + " , " + password);
		fi.close();

	}
}
