package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		
		 WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("meerarjadkar@gmail.com");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("jhfvwjhfjwbjw");
		Thread.sleep(2000);
		Email.clear();
		Email.sendKeys("sushmita123");
		
		WebElement Loginbtn = driver.findElement(By.id("loginbutton"));
		System.out.println(Loginbtn.getAttribute("id"));
		
		WebElement Link = driver.findElement(By.xpath("//a[@class='_97w4']"));
		Link.click();
	
		/*WebElement Logo = driver.findElement(By.cssSelector("div[class='_97vy'] img[class='_97vu img']"));
		System.out.println(Logo.getText());*/
	}

}
