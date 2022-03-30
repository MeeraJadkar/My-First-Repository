package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select obj = new Select(driver.findElement(By.xpath("//Select[@name='cars']")));
		obj.selectByIndex(1);
		obj.selectByIndex(2);
		System.out.println(obj.isMultiple());
		obj.getAllSelectedOptions();
		System.out.println(obj.getAllSelectedOptions().size());
		
		
		
	}

}
