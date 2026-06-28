package SelenumPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)", "");
		System.out.println(js.executeScript("return window.pageYOffset")); // 300
//		
//		WebElement voteBtn=driver.findElement(By.xpath("//button[@id='vote-poll-1']"));
//		js.executeScript("arguments[0].scrollIntoView();",voteBtn);
//		System.out.println(js.executeScript("return window.pageYOffset")); 

		// 3) scroll page till end of the page.
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// System.out.println(js.executeScript("return window.pageYOffset"));

		// scrolling up to initial position
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		// System.out.println(js.executeScript("return window.pageYOffset"));
	}

}
