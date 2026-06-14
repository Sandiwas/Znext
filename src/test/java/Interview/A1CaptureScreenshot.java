package Interview;

import java.time.Duration;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.maven.surefire.shared.io.FileUtils;


public class A1CaptureScreenshot {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://playwright.dev/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\screenshots\\inter.png");
		// FileUtils.copyFile(source, destination);
		source.renameTo(destination);

		WebElement header = driver.findElement(By.xpath("//header[@class='hero hero--primary heroBanner_UJJx']"));
		File s1 = header.getScreenshotAs(OutputType.FILE);
		File d1 = new File(".\\screenshots\\interHeader.png");
		FileUtils.copyFile(s1, d1);

		WebElement gitButton = driver.findElement(By.xpath("//a[@class='gh-btn']"));
		File s2 = gitButton.getScreenshotAs(OutputType.FILE);
		File d2 = new File(".\\screenshots\\interGit.png");
		FileUtils.copyFile(s2, d2);
	}
}
