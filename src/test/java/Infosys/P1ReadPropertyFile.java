package Infosys;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class P1ReadPropertyFile {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(fi);

		String url = pro.getProperty("apppurl");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");

		Set<Object> keys = pro.keySet();
		System.out.println(keys);

		Collection<Object> values = pro.values();
		System.out.println(values);

		Set<String> keysName = pro.stringPropertyNames();
		System.out.println(keysName);

		System.out.println("Appurl : " + url);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);

		System.out.println(url + " , " + username + " , " + password);

		fi.close();

	}

}
