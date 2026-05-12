package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	@Test
	public void captureScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://playwright.dev/");
		driver.manage().window().maximize();

		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\screenshots\\fullPageSS.png");
		FileUtils.copyFile(source, destination);

		WebElement header = driver.findElement(By.xpath("//header[@class='hero hero--primary heroBanner_UJJx']"));
		File s1 = header.getScreenshotAs(OutputType.FILE);
		File d1 = new File(".\\screenshots\\header.png");
		FileUtils.copyFile(s1, d1);

		WebElement h1 = driver.findElement(By.xpath("//h1[@class='hero__title heroTitle_ohkl']"));
		File s2 = h1.getScreenshotAs(OutputType.FILE);

		File d2 = new File(".//screenshots//h1.png");
		FileUtils.copyFile(s2, d2);
	}
}
