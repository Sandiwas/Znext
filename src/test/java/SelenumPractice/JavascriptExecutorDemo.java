package SelenumPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='START']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// passing the text into input box - alternate of sendKeys()
		js.executeScript("arguments[0].value='sandip';", name);
		//js.executeScript("arguments[0].setAttribute('value','Sandip')", name);

		// clicking on element - alternate of click()
		js.executeScript("arguments[0].click();", button);

	}

}
