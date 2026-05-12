package Znext;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFPropertyFileUSingFileInputSteam {
	@Test
	public void readDataFromConfig() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		FileInputStream fi = new FileInputStream(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(fi);
		driver.get(pro.getProperty("appurl"));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Set<Object> keySet = pro.keySet();
		System.out.println(keySet);
		// [password, appurl, username]

		Set<String> values = pro.stringPropertyNames();
		System.out.println(values);
		// [password, appurl, username]

		Collection<Object> valuses = pro.values();
		System.out.println(valuses);
		// [admin123,
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login, Admin]

		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		String url = pro.getProperty("appurl");

		System.out.println(username + " , " + password + " , " + url);

		fi.close();

	}
}
