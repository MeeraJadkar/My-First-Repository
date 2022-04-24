import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.myntra.com/");//30 sec
		
		System.out.println(driver.getTitle());

	}

}
