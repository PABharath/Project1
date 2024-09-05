package locaters;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inovokemultiplewindoes {
	
	public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.switchTo().newWindow(WindowType.TAB);
	
	Set<String> siva=driver.getWindowHandles();
	
	Iterator<String> itc=siva.iterator();
	
	String Parent=itc.next();
	
	String child=itc.next();
	
	driver.switchTo().window(child)	;
	
	driver.get("https://rahulshettyacademy.com/#/practice-project");
	
	String om=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p'] ")).get(1).getText();
	
	driver.switchTo().window(Parent);
	
	WebElement name=driver.findElement(By.cssSelector("[name='name']"));
	
	name.sendKeys(om);
	
	File screenshot=name.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshot, new File("siva.png"));
	
	//height and widthy
	
Integer hei=	name.getRect().getDimension().getHeight();

System.out.println(hei);
Integer wid=	name.getRect().getDimension().getWidth();
System.out.println(wid);
	
	}

}
