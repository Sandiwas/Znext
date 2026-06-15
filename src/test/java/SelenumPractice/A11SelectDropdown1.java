package SelenumPractice;

import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class A11SelectDropdown1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpcountry = driver.findElement(By.cssSelector("#country"));
		Select country = new Select(drpcountry);

		System.out.println("-------------1. select option from the drop down-------------------");

		// country.selectByVisibleText("United States");
		// country.selectByValue("canada");
		// country.selectByIndex(5);

		System.out.println("------------2. capture the options from the dropdown-------------------");

//		List<WebElement> options = country.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			String countryName = options.get(i).getText();
//			System.out.println(countryName);
//		}

		System.out.println("------------2. enhanced for loop-------------------");
		List<WebElement> options = country.getOptions();
		for (WebElement option : options) {
			String countyName = option.getText();
			System.out.println(countyName);
		}

	}
}
