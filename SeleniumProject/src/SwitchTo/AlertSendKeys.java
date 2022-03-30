package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement promptBtn = driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		System.out.println(promptBtn.getText());
		promptBtn.click();
		
		/*WebElement clickbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickbutton.click();*/
	}

}
