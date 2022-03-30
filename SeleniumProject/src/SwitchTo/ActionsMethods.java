package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	Actions obj = new Actions(driver);
	obj.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
	obj.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
	obj.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();
	
	driver.get("https://demoqa.com/tool-tips");
	obj.clickAndHold(driver.findElement(By.id("toolTipButton"))).perform();
	Thread.sleep(1000);
	
	}

}
