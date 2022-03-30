package WebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Resources//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		
// here we are trying to read the header of table: by using text() function.
// ===========================******** Approach 1 *******================================
		
		/*WebElement FullNHeader = driver.findElement(By.xpath("//div[text()='First Name']"));
		System.out.println(FullNHeader.getText());
*/
// ==========================********* Approach 2 ********===============================
// here we will create common locator for all the columns and will use findElements method.
		/*List<WebElement> columnName = driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
		System.out.println(columnName.size());
		Iterator<WebElement> itr = columnName.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().getText());
		}
		
		List<WebElement> rowName = driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
		System.out.println(rowName.size());
		Iterator<WebElement> itr1 = rowName.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next().getText());
		}
// Task1: Print the entire row in which the gentry last name is present
// Task2: Print the columname in which 10000 value is present
// Task3: click on delete where insurance is department.
		
	List<WebElement> Row1 = driver.findElements(By.xpath("//div[@role=\'rowgroup']//div[@class=\"rt-tr -even\"]"));
		System.out.println(Row1.size());
		//System.out.println("Row1 output is");
		Iterator<WebElement> itr2 = Row1.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next().getText());
		}
		
		List<WebElement> rowName1 = driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
		System.out.println(rowName1.size());
		Iterator<WebElement> it = rowName1.iterator();
		String salary = "10000";
		while(it.hasNext()) {
			String meera = it.next().getText();
			if(salary.equalsIgnoreCase(meera)) {
				WebElement virtual = driver.findElement(By.xpath("//div[@role=\"rowgroup\"]//div[@class=\"rt-tr -even\"]"));
			System.out.println(virtual.getText());
		}
		WebElement delete = driver.findElement(By.xpath("//div[@class=\"action-buttons\"]//span[@id=\"delete-record-1\"]"));
		delete.click();
		*/
		List<WebElement> columnName = driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
		System.out.println(columnName.size());
		Iterator<WebElement> itr = columnName.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next().getText());
		}
		int index = 0;
		List<WebElement> rowName = driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
		System.out.println(rowName.size());
		
		for(int i=0; i<=rowName.size() -1;i++) {
			//System.out.println(rowName.get(i).getText());
		if(rowName.get(i).getText().equals("10000")) {
			index=i;
			break;
		}
		}
		System.out.println(columnName.get(index%7).getText());
	}	
}
