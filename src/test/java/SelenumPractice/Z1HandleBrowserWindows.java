package SelenumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z1HandleBrowserWindows {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

//		String parnetTitle = driver.getTitle();
//		System.out.println("parent title : " + parnetTitle);

		// Appoach1

	//	Set<String> windowIds = driver.getWindowHandles();
	//	List<String> list = new ArrayList<>(windowIds);

//		String parentWindow1 = list.get(0);
//		String childWindow = list.get(1);

		// switch to child window
//		driver.switchTo().window(childWindow);
//		String childTitle=driver.getTitle();
//		System.out.println("Child window title : "+childTitle);

		// switch to parent window
//		driver.switchTo().window(parentWindow1);
//		String parnetWindowTitle = driver.getTitle();
//		System.out.println("Parent window title : "+parnetWindowTitle);

		// Approach2

//		for (String id : windowIds) {
//			String title = driver.switchTo().window(id).getTitle();
//			if (title.equals("OrangeHRM")) {
//				String url = driver.getCurrentUrl();
//				System.out.println(url);
//			}
//
//		}
		
		// Approach3
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr=windowIds.iterator();
		
		String parentID=itr.next();
		String childID=itr.next();
		
		for (String id : windowIds) {
		String title = driver.switchTo().window(id).getTitle();
		if (!title.equals("OrangeHRM")) {
			driver.switchTo().window(childID);
			System.out.println("we are on child window");
			String url = driver.getCurrentUrl();
			String ChildTitel = driver.getTitle();
			System.out.println(ChildTitel);
			System.out.println(url);
			break;
		}
	}
		driver.switchTo().window(parentID);
		System.out.println("we are on parent window");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String parentTitel = driver.getTitle();
		System.out.println(parentTitel);

	}
}