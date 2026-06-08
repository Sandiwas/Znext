package june0;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R1ReadDataConfigFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(fi);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(pro.getProperty("appurl"));

		String appurl = pro.getProperty("appurl");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");

		System.out.println(appurl + " , " + username + " , " + password);

		Set<Object> keys = pro.keySet();
		System.out.println(keys);

		Collection<Object> values = pro.values();
		System.out.println(values);

		Set<String> names = pro.stringPropertyNames();
		System.out.println(names);

		fi.close();

	}
}
