package SelenumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2BootStrapDropdown2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div[1]/div/div[2]")).click(); // opens
																												// dropdown
		System.out.println("-------------1. Select single option-------------------"); // options

		// driver.findElement(By.cssSelector("#react-select-4-option-0")).click();

		System.out.println("-------------2. capture all the options and find out size-------------------");

		List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div[@role='option']"));
//		System.out.println(options.size());

		System.out.println("-------------3. printing options from dropdown-------------------");

//		for(WebElement option : options) {
//			String colour=option.getText();
//			System.out.println(colour);
//		}

		System.out.println("-------------4. select multiple options-------------------");

		for (WebElement option : options) {
			String colour = option.getText();
			if (colour.equals("Green") || colour.equals("Blue") || colour.equals("Black") || colour.equals("Red")) {
				option.click();
			}
		}
		driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div[1]/div/div[2]")).click();

	}
}