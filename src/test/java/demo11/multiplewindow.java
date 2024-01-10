package demo11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver-win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        String amazonHandle = driver.getWindowHandle();
	        System.out.println("Amazon: " + driver.getTitle());

	        // Open Flipkart in the second tab
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.flipkart.com/");
	        String flipkartHandle = driver.getWindowHandle();
	        System.out.println("Flipkart: " + driver.getTitle());

	        // Open eBay in the third tab
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.ebay.com/");
	        String ebayHandle = driver.getWindowHandle();
	        System.out.println("eBay: " + driver.getTitle());

	        // Open Myntra in the fourth tab
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.get("https://www.myntra.com/");
	        String myntraHandle = driver.getWindowHandle();
	        System.out.println("Myntra: " + driver.getTitle());

	        // Create a list of window handles
	        List<String> windowHandles = new ArrayList<>();
	        windowHandles.add(amazonHandle);
	        windowHandles.add(flipkartHandle);
	        windowHandles.add(ebayHandle);
	        windowHandles.add(myntraHandle);

	        // Switch back to the Flipkart window  //index start from 0,1,2,3
	        driver.switchTo().window(windowHandles.get(0));
	       
	}

}
