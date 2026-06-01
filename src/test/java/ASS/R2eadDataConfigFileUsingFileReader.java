package ASS;

import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class R2eadDataConfigFileUsingFileReader {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader file = new FileReader(".\\testData\\config.properties");
		Properties pro = new Properties();
		pro.load(file);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(pro.getProperty("appurl"));
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();

		driver.findElement(By.name("username")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		driver.quit();

	}
}
