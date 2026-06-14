package Interview;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class R1ReadDataConfigFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(fr);

		Set<Object> keys = pro.keySet();
		System.out.println("Key set : " + keys);

		Collection<Object> value = pro.values();
		System.out.println("Prpperties value: "+value);

		Set<String> names = pro.stringPropertyNames();
		System.out.println("String Property Names: " + names);

		String url = pro.getProperty("appurl");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println(url + " , " + username + " , " + password);

		fr.close();

	}
}
