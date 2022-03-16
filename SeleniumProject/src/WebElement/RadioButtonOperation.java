package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOperation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement YesRadio = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/ input[@id='yesRadio']"));
		if(!YesRadio.isSelected()) {
		YesRadio.click();
	}else {
		System.out.println("Hiii");
	}
	}
}
