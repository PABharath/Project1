package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
//		
//	WebElement ab=	driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-touched"));
//	
//	System.out.println(driver.findElement(with(By.tagName("label")).above(ab)).getText());
	
	
	WebElement om= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	
	driver.findElement(with(By.tagName("input")).toLeftOf(om)).click();
	
	
		

	}

}
