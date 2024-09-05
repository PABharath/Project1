package locaters;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
	WebElement inside=	footer.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
	
	System.out.println(inside.findElements(By.tagName("a")).size());
	
	for(int i=1;i<inside.findElements(By.tagName("a")).size();i++) {
		
		String send=Keys.chord(Keys.CONTROL , Keys.ENTER);
		
		inside.findElements(By.tagName("a")).get(i).sendKeys(send);
		Thread.sleep(5000l);
	}
		Set<String>abc=driver.getWindowHandles();
		
		Iterator<String> itc=abc.iterator();
		while(itc.hasNext()) {
			driver.switchTo().window(itc.next());
	
			
			System.out.println(driver.getTitle());
		}
		
		
		

		
	}
	
	
}
