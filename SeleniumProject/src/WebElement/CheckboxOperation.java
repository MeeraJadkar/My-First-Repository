package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
// findelement method will return Webelement----if the test case is failed then JVM will throw an exception.
		WebElement Homecheckbox = driver.findElement(By.cssSelector("label[for='tree-node-home']span[class='rct-checkbox']"));
// here we are checking whether Homecheckbox is selected or not. 
		if(!Homecheckbox.isSelected()) {
// if check box is not selected then we have to click on it
		Homecheckbox.click();
		}
// here we are checking for result whether it is getting displayed or not?
		/*WebElement Result = driver.findElement(By.xpath("//div[@id='result']"));
// checking for the display of result.
		if(Result.isDisplayed()) {
// here we are trying to get the text of result in console window.
	      System.out.print(Result.getText());
		}*/
// findelements will not throw any exception even if any test case is failed
// here findelements method will return List of webelements 
		List<WebElement> Result1 = driver.findElements(By.xpath("//div[@id='result']"));
		if(Result1.size()>0) {
			System.out.println(Result1.get(0).getText());
		}else {
			System.out.println("This test case is failed and Unable to read the results from page");
		}
	
		WebElement arrowbutton = driver.findElement(By.cssSelector("button[class='rct-collapse rct-collapse-btn']"));
		arrowbutton.click();
	}

}
