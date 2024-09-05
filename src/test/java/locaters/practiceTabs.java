package locaters;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceTabs {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_9ii80v99l2_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=161261&hvtargid=kwd-82189528294506:loc-90&hydadcr=14452_2334185&msclkid=573a03b7211813b2cb5b651aba8cd5fc");
//		
//		List<WebElement>all=driver.findElements(By.tagName("a"));
//		System.out.println(all.size());
//		
//	WebElement all1=	driver.findElement(By.id("navFooter"));
//	
//	System.out.println(all1.findElements(By.tagName("a")).size());
//	
//	WebElement all2=all1.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul"));
//	
//System.out.println(	all2.findElements(By.tagName("a")).size());
//
//for(int i=0;i<all2.findElements(By.tagName("a")).size();i++) {
//	
//	String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
//	all2.findElements(By.tagName("a")).get(i).sendKeys(clickon);
//	Thread.sleep(6000l);
//}
//
//Set<String> allwindows=driver.getWindowHandles();
//Iterator<String> abc=allwindows.iterator();
//
//while(abc.hasNext()) {
//	driver.switchTo().window(abc.next());
//	
//	System.out.println(driver.getTitle());
		
		
//}
		
		
		

	}

}
