package SelenumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5ShadowDomElements0 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();

		// driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
		// //NoSuchElementException

		// Hanadle shaow dom element
		SearchContext shadowdom0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(2000);
		String value0 = shadowdom0.findElement(By.cssSelector("#shadow-element")).getText();
		System.out.println(value0);

		SearchContext shadowdom1 = shadowdom0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(2000);
		String value1 = shadowdom1.findElement(By.cssSelector("#nested-shadow-element")).getText();
		System.out.println(value1);

		SearchContext shadowdo2 = shadowdom1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(2000);
		String value2 = shadowdo2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		System.out.println(value2);
	}

}
