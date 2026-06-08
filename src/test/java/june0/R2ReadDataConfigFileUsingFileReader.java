package june0;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class R2ReadDataConfigFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(file);

		Set<Object> keys = pro.keySet();
		System.out.println(keys);

		Collection<Object> values = pro.values();
		System.out.println(values + " ");

		Set<String> names = pro.stringPropertyNames();
		System.out.println(names);

		String appurl = pro.getProperty("appurl");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");

		System.out.println(appurl + " , " + username + " , " + password);
	}

}
