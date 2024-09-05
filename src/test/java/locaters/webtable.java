package locaters;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//tr/th[1]")).click();
//		
//	List<WebElement> original=	driver.findElements(By.xpath("//tr/td[1]"));
//	
//	List <String> originallist=original.stream().map(s->s.getText()).collect(Collectors.toList());
//	originallist.forEach(a->System.out.println(a));
//	
//	
//	List<String> sortedlist=originallist.stream().sorted().collect(Collectors.toList());
//	sortedlist.forEach(c->System.out.println(c));
//	
//	Assert.assertTrue(originallist.equals(sortedlist));
	
//	List<String> price;
//	do {
//	
//	List<WebElement> original1=	driver.findElements(By.xpath("//tr/td[1]"));
//	
//	 price=original1.stream().filter(s->s.getText().contains("Mango")).map(s->getprize(s)).collect(Collectors.toList());
//
//	price.forEach(b->System.out.println(b));
//	if(price.size()<1) {
//		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
//	}
//	
//	}while(price.size()<1);
	
	driver.findElement(By.id("search-field")).sendKeys("Rice");
	
	List<WebElement>all=driver.findElements(By.xpath("//tr/td[1]"));
	
	List <WebElement> all1=all.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	all1.forEach(s->System.out.println(s));
	
	Assert.assertTrue(all.equals(all1));
	
	
	
	
	
	
	}

//	public static String getprize(WebElement s) {
//		
//		String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		
//		return pricevalue;
//	}

}
