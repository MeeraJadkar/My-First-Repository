package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "Resources/Chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/checkbox");
		
// Here we are trying to check Expand all operation
		WebElement plus = Driver.findElement(By.xpath("//button[@title='Expand all']"));
		plus.click();
		Thread.sleep(2000);
		
// we are checking for collapse all operation
		WebElement minus = Driver.findElement(By.xpath("//button[@aria-label=\"Collapse all\"]"));
		minus.click();
		Thread.sleep(3000);
		
// Trying to toggle the main switch so that to expand home option
		WebElement Toggle = Driver.findElement(By.xpath("//button[@aria-label='Toggle']"));
		Toggle.click();
		Thread.sleep(2000);
// 2nd approach to find the toggle locator is
	  //WebElement Toggle1 = Driver.findElement(By.xpath("//div[@class='react-checkbox-tree rct-icons-fa4']/ol/li/span/button"));
		
// Now we are selecting checkbox and after that we are trying to read the content that is displaying.
		WebElement CheckBox = Driver.findElement(By.cssSelector("svg[class=\"rct-icon rct-icon-uncheck\"]"));
		if(!CheckBox.isSelected()) {
			CheckBox.click();
		}
		WebElement Text = Driver.findElement(By.id("result"));
		if(Text.isDisplayed()) {
		System.out.println(Text.getText());
		}
// here we are again clicking on toggle to collpase the expanded options.
		Toggle.click();
		
// now we will uncheck the checkbox so that to perform rest of the operations.
		WebElement Uncheck = Driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
		Uncheck.click();
		Toggle.click();
		
// now we are checking for Desktop checkbox content reading operation by clicking on the resp.checkbox
		WebElement DeskCheckBox = Driver.findElement(By.xpath("//label[@for='tree-node-desktop'] /span[@class=\"rct-checkbox\"]"));
		DeskCheckBox.click();
		WebElement DeskText = Driver.findElement(By.id("result"));
		if(DeskText.isDisplayed()) {
		System.out.println("Desktop Content reading :" + DeskText.getText());
		}
// We are locating the label of Document and along with that trying to read the Label.
		WebElement LabelDoc = Driver.findElement(By.xpath("//label[@for='tree-node-documents'] /span[@class=\"rct-title\"]"));
		System.out.println("Label of Document field: " + LabelDoc.getText());

//======================********** Very IMP ************=========================
 /*here we are trying to expand desktop through toggle switch but for all toggle
 switches there is same HTML code written hence we can't find locator for particular
 toggle uniquely. hence we need to go for Siblings concept.
 1) Preceding Sibling 2) following Sibling
 */ 
	
/* suppose if we want to locate any webelement by using label then use in-built
 * method of xpath----> //tagname[text()='labelName']
 */

// ===================****** Approach 1 *****============================
// here we are using in-built function of xpath using text() method. and then 
// using parent child relation.
	/*WebElement DeskToggle = Driver.findElement(By.xpath("//span[text()='Desktop']//parent::label//preceding-sibling::button"));
	DeskToggle.click();*/
	
// ===================****** Approach 2 ******==============================
// we are trying to locate desktop node and then using sibling concept locating 
// toggle button for our use.
    /*WebElement DeskToggle = Driver.findElement(By.xpath("//label[@for='tree-node-desktop']//preceding-sibling::button"));
    DeskToggle.click();*/
    
// ==================******* Approach 3 ******================================    
// we can use ancestor concept to locate the webelement
    WebElement DeskToggle = Driver.findElement(By.xpath("//span[text()='Desktop']//ancestor::label//preceding-sibling::button"));
    DeskToggle.click();
    
	}
	
	// approach 1
	//tagname[text()='LabelName']-----> //span[text()='Desktop']
//****    //span[text()='Desktop']//parent::label//preceding-sibling::button
//tagname[text()='LabelName']
}

