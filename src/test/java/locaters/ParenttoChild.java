package locaters;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParenttoChild {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> it=windows.iterator();
	
	String parentid=it.next();
	String childid=it.next();
	
	driver.switchTo().window(childid);
	
	String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(parentid);
	
	driver.findElement(By.id("username")).sendKeys(email);
	
	

	}

}
