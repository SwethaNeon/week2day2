package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown  { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		
		//Instantiate the ChromeDriver
		
		 ChromeDriver driver =new ChromeDriver(); 
		
		 
		// load the URl
		 
		 driver .get("http://leafground.com/pages/Dropdown.html");
		 driver .manage().window().maximize();
		 
		 
		 
		 WebElement Options =driver .findElementById("dropdown1");
		 Select dropdownOptions4 =new Select (Options);
		 dropdownOptions4.selectByIndex(2);
		 
		
		 
	}}