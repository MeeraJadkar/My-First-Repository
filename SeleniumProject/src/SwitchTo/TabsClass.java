package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.findElement(By.id("demo-tabpane-origin")).click();
		
	}

}
