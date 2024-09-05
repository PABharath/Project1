package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement>all=driver.findElements(By.cssSelector(".tableFixHead td:nth-last-child(1)"));
		int sum=0;
		for(int i=0;i<all.size();i++) {
		System.out.println(all.get(i).getText());
		
		sum=sum+Integer.parseInt(all.get(i).getText());
		}
		System.out.println(sum);
		
		String arr1=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[2].trim();
		Assert.assertEquals(sum, arr1);
		
//		driver.findElement(By.id("name")).sendKeys("Bharath123");
//		
//		driver.findElement(By.id("alertbtn")).click();
//		
//		driver.switchTo().alert().accept();

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//		driver.findElement(By.cssSelector("a[value='DEL']")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))
//				.click();
//
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("Div1")).getAttribute("style");
//
//		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1.0")) {
//
//			System.out.println("is Disbled");
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertFalse(false);
//			System.out.println("Is enabled");
//
//		}
//
//		driver.findElement(By.id("divpaxinfo")).click();
//
//		Thread.sleep(2000);
//
//		int i = 1;
//		while (i < 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//
//		driver.findElement(By.cssSelector(".buttonN")).click();
//
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//
	}

}



