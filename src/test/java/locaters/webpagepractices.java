package locaters;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webpagepractices {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://datatables.net/examples/basic_init/multi_col_sort.html");
		
		driver.manage().window().maximize();
		
	List<WebElement> data=	driver.findElements(By.xpath("//tr/td[1]"));
	
	List<String> names=new ArrayList<String>();
	
	for(WebElement name:data) {
		
		names.add(name.getText());
		
	}
	
String next1=	driver.findElement(By.xpath("//button[text()='›']")).getAttribute("class");

while(next1.contains("next")) {
	
	driver.findElement(By.xpath("//button[text()='›']")).click();
	
	Thread.sleep(2000);
	data=	driver.findElements(By.xpath("//tr/td[1]"));
	
for(WebElement name:data) {
		
		names.add(name.getText());
		
	}
	
next1=	driver.findElement(By.xpath("//button[text()='›']")).getAttribute("class");
}

for(String alldata:names) {
	System.out.println(alldata);
}


	
	
	}
	
	}


