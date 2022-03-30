import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/");
		System.out.println(driver.getTitle());
		
	}
}
