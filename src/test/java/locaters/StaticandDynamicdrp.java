package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticandDynamicdrp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Static table using select classes and methods we are using to dynamic tables
		
//		WebElement options=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		Select all=new Select(options);
//		
//		all.selectByIndex(1);
//		System.out.println(all.getFirstSelectedOption());
//		Thread.sleep(3000);
//		all.selectByVisibleText("USD");
//		System.out.println(all.getFirstSelectedOption());
//		all.selectByValue("AED");
//		System.out.println(all.getFirstSelectedOption());
		
		
		// Dynamic dropdown table
		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		
//        for(int i=1;i<5;i++) {
//    		driver.findElement(By.id("hrefIncAdt")).click();
//
//        }
//		
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();		
//		
//
		
		// dynamic dropdown and based on indexes
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector("a[value='BLR']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement opy:options) {
			if(opy.getText().equalsIgnoreCase("india")) {
				opy.click();
				break;
			}
		}
	}

}
