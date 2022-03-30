package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement FullName = driver.findElement(By.id("userName"));
		Thread.sleep(2000);
		FullName.sendKeys("Meera Jadkar");
		Thread.sleep(2000);
		FullName.clear();
		Thread.sleep(2000);
		FullName.sendKeys("Panda");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("meerarjadkar@gmail.com");
		FullName.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("I Love Myself");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("Have Some Patience");
	}
}
