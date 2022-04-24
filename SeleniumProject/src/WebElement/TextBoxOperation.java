package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxOperation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
// Driver is a reference of Chrome	
		driver.get("https://demoqa.com/text-box");// will launch url
		System.out.println(driver.getTitle());// title of the page
		driver.manage().window().maximize();// window maximize
// find the address and perform the operation
// Enter the full name field
// Address of an element is called as locator
// different way of finding the locator---> 8 ways to find the unique address
// For finding locator address of Full name---> used xpath 
		WebElement Fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
// To enter value in the field Full name
		Fullname.sendKeys("Meera Jadkar");
// Exception as no such element ---> org.openqa.selenium.NoSuchElementException: no such element
// WebElement  Email = driver.findElement(By.cssSelector("label[autocomplete='off'][placeholder='name@example.com']"));
// For finding locator address of field Email---> used CSS
		WebElement  Email = driver.findElement(By.cssSelector("input[autocomplete='off'][placeholder='name@example.com']"));	
// To enter value in the Email field.
		Email.sendKeys("meerarjadkar@gmail.com");
// For locating the field name as Current address---> used xpath
		WebElement CAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
// To enter the text in Current Address field. 
		CAddress.sendKeys("Shindewadi, District-Pune, State-Maharashtra, Country-India");
// Here clear method is used to rewrite the value in full name field.
		//Fullname.clear();
// here we are changing the field value/text of Full name field.
		//Fullname.sendKeys("MyNewValue");
// we can print the tag name of any field by using the method getTagName()
		System.out.println(Fullname.getTagName());
// we can print the text of respected field by using the method called getText()
		System.out.println(Fullname.isDisplayed());
		WebElement PAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		PAddress.sendKeys("Twin Solapur, Solapur");
// For locating the address of submit button---> by CSS
		WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
// Exception as ElementClickInterceptedException--->org.openqa.selenium.ElementClickInterceptedException: element click intercepted
// submit.click();
		System.out.println(submit.getText());
		System.out.println(submit.getTagName());
		System.out.println(submit.getSize().getHeight());
		System.out.println(submit.getSize().getWidth());
	}
}


