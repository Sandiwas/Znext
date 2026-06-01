package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import org.testng.annotations.Test;

public class ReadDataConfigFileUsingFileReader1 {
	@Test
	public void readData() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(file);

		Set<Object> keyset = pro.keySet();
		System.out.println(keyset);

		Collection<Object> values = pro.values();
		System.out.println(values);

		Set<String> keys = pro.stringPropertyNames();
		System.out.println(keys);

		String appurl = pro.getProperty("appurl");
		String username = pro.getProperty("username");
		String passwoed = pro.getProperty("password");

		System.out.println(appurl + " , " + username + " , " + passwoed);

	}
}
