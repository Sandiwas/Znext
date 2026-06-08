package june0;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1CaptureScreenshot {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://playwright.dev/");
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\screenshots\\today1.png");
		FileUtils.copyFile(source, destination);

		WebElement header = driver.findElement(By.xpath("//header[@class='hero hero--primary heroBanner_UJJx']"));
		File s1 = header.getScreenshotAs(OutputType.FILE);
		File d1 = new File(".\\screenshots\\today2.png");
		s1.renameTo(d1);

		WebElement git = driver.findElement(By.xpath("//a[@class='gh-btn']"));
		File s2 = git.getScreenshotAs(OutputType.FILE);
		File d2 = new File(".\\screenshots\\today3.png");
		s2.renameTo(d2);
	}
}
