package Infosys;

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

public class P2CaptureScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://playwright.dev/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + ".//screenshots//main.png");
		FileUtils.copyFile(source, destination);

		WebElement part = driver.findElement(By.xpath("//header[@class='hero hero--primary heroBanner_UJJx']"));
		File source1 = part.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir") + "\\screenshots\\part.png");
		source1.renameTo(destination1);
		WebElement Pget = driver.findElement(By.xpath("//h1[@class='hero__title heroTitle_ohkl']"));
		File source2 = Pget.getScreenshotAs(OutputType.FILE);
		File destination2 = new File(System.getProperty("user.dir") + "\\screenshots\\Pget.png");
		source2.renameTo(destination2);
		

	}
}
