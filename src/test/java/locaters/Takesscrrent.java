package locaters;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Takesscrrent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.google.com");
		
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(screenshot, new File("C:\\Users\\bhara\\OneDrive\\Desktop\\Bharath Personal/screenshot.png"));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Broken Links find out
		
//	String url=	driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href");
//	HttpURLConnection conn=	(HttpURLConnection) new URL(url).openConnection();
//	
//	conn.setRequestMethod("HEAD");
//	conn.connect();
//	int response=conn.getResponseCode();
//	
//	System.out.println(response);

	
List<WebElement> all1=	driver.findElements(By.xpath("//li[@class='gf-li']/a"));

SoftAssert as = new SoftAssert();


for(WebElement all:all1) {
	
	String url=	all.getAttribute("href");
	HttpURLConnection conn=	(HttpURLConnection) new URL(url).openConnection();
	
	conn.setRequestMethod("HEAD");
	conn.connect();
	int response=conn.getResponseCode();
	System.out.println(response);
	as.assertTrue(response<400, "This is the text"+ all.getText()+ " Broken link is"+response);
		
	
}
as.assertAll();
	
	

	}

}
