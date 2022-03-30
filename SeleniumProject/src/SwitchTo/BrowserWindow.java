package SwitchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
// whenever a window opens internally operating system assigns a unique key/id to each window
// To know the unique id of window we have to call method named as getWindowHandle().
		//System.out.println(driver.getWindowHandle());
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window id is "+ ParentWindow);
		WebElement NewTab = driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
		NewTab.click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		System.out.println(handles.size());
		Iterator<String> itr = handles.iterator();
		while(itr.hasNext()) {
			String str = itr.next().toString();
			if(str.equalsIgnoreCase(ParentWindow)) {
				System.out.println("We both represent same window");
			}else {
				System.out.println("We both represent different windows");
				driver.switchTo().window(str);
				WebElement heading = driver.findElement(By.tagName("h1"));
				System.out.println(heading.getText());
			}
		
	}
	}
}
