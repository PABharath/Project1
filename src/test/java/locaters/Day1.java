package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args)  {
	
		
		String password="rahulshettyacademy";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys("Bharath");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Bharath");
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Bharath12@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9652984399");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	

	}

}
