package demo11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless {

	public static void main(String[] args) {
		
     //System.setProperty("webdriver.chrome.driver","");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--headless=true");
		WebDriver driver=new EdgeDriver(options);
		
		driver.get("https:www.google.com/");
		System.out.println("title :"+driver.getTitle());
		WebElement sElement=driver.findElement(By.name("q"));
		sElement.sendKeys("selenium");
		sElement.sendKeys(Keys.ENTER);
		System.out.println("fetch Title: "+driver.getTitle());
		
	}

}
