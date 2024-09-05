package locaters;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderui {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.redbus.com");
		
		driver.findElement(By.id("src")).sendKeys("Delhi, India");
		
		driver.findElement(By.id("dest")).sendKeys("Bengare, Karnataka, India");
		Thread.sleep(3000);
		
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("span.DayTiles__CalendarDaysSpan-sc-14em0t0-1.fxWHuy")).click();
		
		driver.findElement(By.id("return-box")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("span.DayTiles__CalendarDaysSpan-sc-14em0t0-1.fxWHuy")).click();
		
		driver.findElement(By.xpath("//div[text()='SEARCH']")).click();		
		
		
		
		
		
		
		
//		String[] arr= {month,date,year};
		
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		
//		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
//		
//		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
//		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
//
//		
//		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
//		
//		driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
//		
//		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
//		
//		List<WebElement> three=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
//		
//		for(int i=0;i<three.size();i++) {
//			System.out.println(three.get(i).getAttribute("value"));
//			Assert.assertEquals(three.get(i).getAttribute("value") , arr[i]);
//		}
		

	}

}
