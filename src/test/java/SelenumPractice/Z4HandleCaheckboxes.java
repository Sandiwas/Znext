package SelenumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z4HandleCaheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		for (int i = 0; i < list.size(); i++) {
		list.get(i).click();
	}
		
		// select last 3 check box
//		for (int i = list.size() - 3; i < list.size(); i++) {
//			list.get(i).click();
//		}
		// select first 3 check box
//		
//		for (int i = 0; i < 3; i++) {
//			list.get(i).click();
//		}
//		
		//select first 3 checkbox select and then unselect this checkbox
		
//		for (int i = 0; i < 3; i++) {
//			list.get(i).click();
//		}
//		for (int i = 0; i < 3; i++) {
//			if(list.get(i).isSelected()) {
//				list.get(i).click();	
//			}
//			
//		}
		
	}
}
