package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17112196289805659080&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300156&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		Actions a=new Actions(driver);
//		
//		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
//		
//		driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]")).click();
		
		WebElement click=driver.findElement(By.xpath("//a[@id='nav-orders']/span[1]"));
	    a.contextClick(click).perform();

	}

}
