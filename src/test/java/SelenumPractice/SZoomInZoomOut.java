package SelenumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.body.style.zoom='50%'"); // set zoom level 50%
		
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='200%'"); // set zoom level 50%
		Thread.sleep(5000);

	}

}
//hight element on webpage
//js.executeScript("arguments[0].style.background='yellow'",ele)

//js.executeScript("arguments[0].setAttribute('value','Sandip')", name);
//js.executeScript("arguments[0].value='sandip';", name);
//js.executeScript("arguments[0].click();", button);

//js.executeScript("arguments[0].scrollIntoView();",voteBtn);
//js.executeScript("window.scrollBy(0,300)","");

//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

//js.executeScript("document.body.style.zoom='50%'"); // set zoom level 50%

//System.out.println(js.executeScript("return window.pageYOffset"));
