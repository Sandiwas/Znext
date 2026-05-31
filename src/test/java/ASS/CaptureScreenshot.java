package ASS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.io.*;
import java.time.*;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;

public class CaptureScreenshot {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void captureScreeshot() throws IOException {
		driver.get("https://playwright.dev/");
		driver.manage().window().maximize();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\resource\\fullPageSS.png");
		FileUtils.copyFile(source, destination);

		WebElement header = driver.findElement(By.xpath("//header[@class='hero hero--primary heroBanner_UJJx']"));
		File s1 = header.getScreenshotAs(OutputType.FILE);
		File d1 = new File(System.getProperty("user.dir") + "\\resource\\HeaderPageSS.png");
		s1.renameTo(d1);

		WebElement git = driver.findElement(By.xpath("//a[@class='gh-btn']"));
		File s2 = git.getScreenshotAs(OutputType.FILE);
		File d2 = new File(System.getProperty("user.dir") + "\\resource\\GitPageSS.png");
		s2.renameTo(d2);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
