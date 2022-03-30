package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOperation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement YesRadioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		YesRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement ImpressiveBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		ImpressiveBtn.click();
		
		WebElement NoBtn = driver.findElement(By.xpath("//input[@id='noRadio']"));
		System.out.println(NoBtn.isEnabled());
		if(!NoBtn.isEnabled()) {
			System.out.println("No Radion Button is disabled - Test case is passed");
		}else {
			System.out.println("No Radio Button is Enabled - Test case is Failed");
		}
		
	}
}
