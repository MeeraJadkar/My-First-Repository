package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchTo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	driver.switchTo().frame("content");
	WebElement Header = driver.findElement(By.tagName("h1"));
	System.out.println(Header.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='navbar']")));
	WebElement NoFrameHeader = driver.findElement(By.xpath("//a[@text='No frames')"));
	System.out.println(NoFrameHeader.getText());

	}

}
