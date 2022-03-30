package SwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg {

	public static void main(String[] args) throws InterruptedException {
// we can't create locator of Alerts/pop-ups hence there are some in-built methods present
// whatever operations that we are going to perform on alerts are present in alert interface
		
	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	  WebElement clickbtn = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
	  clickbtn.click();
	  
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  
	  WebElement Timerbtn = driver.findElement(By.id("timerAlertButton"));
	  Timerbtn.click();
	  Thread.sleep(5000);
	  alt.accept();
	  
	  WebElement confirmbtn = driver.findElement(By.id("confirmButton"));
	  confirmbtn.click();
	  System.out.println(alt.getText());
	  alt.dismiss();
	  WebElement result = driver.findElement(By.xpath("//span[@id=\"confirmResult\"]"));
	  System.out.println(result.getText());
	  
	  WebElement PromptBtn = driver.findElement(By.xpath("//div[@class=\"col\"]/button[@id=\"promtButton\"]"));
	  PromptBtn.click();
	  Thread.sleep(2000);
	  alt.sendKeys("Meera Jadkar");
	  Thread.sleep(2000);
	  alt.accept();
	  
		
	}

}
