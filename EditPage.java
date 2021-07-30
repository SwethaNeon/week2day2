package week2day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
driver.findElementByXPath("//input[@id='email']").sendKeys("abc");


driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']/following-sibling::input").sendKeys("asdadad");

Actions act=new Actions(driver);
act.sendKeys(Keys.TAB).build().perform();
act.sendKeys(Keys.RETURN).build().perform();
 
String a=driver.findElementByXPath("//label[text()='Get default text entered']/following-sibling::input").getAttribute("value");
System.out.println(a);

driver.findElementByXPath("//label[text()='Clear the text']/following-sibling::input").clear();

String b=driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").getAttribute("disabled");
System.out.println(b);
if(b=="true")
{
System.out.println("column was not editable");	
}
}
}
