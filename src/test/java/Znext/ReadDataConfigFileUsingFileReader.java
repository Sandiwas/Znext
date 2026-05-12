package Znext;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataConfigFileUsingFileReader {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FileReader file = new FileReader(System.getProperty("user.dir") + "\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(file);

		driver.get(pro.getProperty("appurl"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		file.close();
	}
}
