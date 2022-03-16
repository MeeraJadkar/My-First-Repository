import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.navigate().to("https://www.myntra.com/");
	System.out.println(driver.getTitle());
	driver.manage().window().minimize();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/login");
	driver.navigate().back();
	
	driver.quit();
	}
}
