package locaters;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait ab=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		String[] vegge= {"Carrot","Cucumber","Beetroot"};
		
		List<WebElement> vegetables=driver.findElements(By.cssSelector("h4.product-name"));
		
//		List<WebElement> plus=driver.findElements(By.xpath("//a[@class='increment']"));
		
		
		
		
		
		
		
				for(int i=1;i<vegetables.size();i++) {
					
					String[] text=vegetables.get(i).getText().split("-");
					String name=text[0].trim();
					
					 List al = Arrays.asList(vegge);
					 
					
					 
					 int j=0;
					 
					 if(al.contains(name)) {
						 
						 j++;
						
						
						
						 driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
						 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						 
						 	if(j==3) {
						 		break;
						 	}
					 }
					 
			 
			}
		
		
		
		
		
		
		
		
		
//			
//		String[] vegetables= {"Brocolli","Cucumber","Carrot","Beans"};
//		
//		AddtoCart as=new AddtoCart();
//		as.siva(driver,vegetables);
//		
//		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='action-block']//button[1]")).click();
//		
//		ab.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
//	    
//		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//		
//		ab.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
//		
//		driver.findElement(By.cssSelector("button.promoBtn")).click();
//		
//		ab.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		
//       System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//    
//	}
//	
//	public void siva(WebDriver driver, String[] vegetables) {
//	List<WebElement> vegge=driver.findElements(By.xpath("//h4[@class='product-name']"));
//		
//		
//		for(int i=0;i<vegge.size();i++) {
//			
//			String[] name=vegge.get(i).getText().split("-");
//			String name1= name[0].trim();
//			
//			List allOptions=Arrays.asList(vegetables);
//			
//			int j=0;
//			if(allOptions.contains(name1)) {
//				
//				j++;
//				
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//			if(j==vegetables.length) {
//				break;
//			}
//			}
//		}
	}

}
