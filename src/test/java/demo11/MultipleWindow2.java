package demo11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindow2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String amazonHandle = driver.getWindowHandle();
        System.out.println("Amazon: " + driver.getTitle());

        // Open Flipkart in the second tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/");
        System.out.println("Flipkart: " + driver.getTitle());

        // Open eBay in the third tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.ebay.com/");
        System.out.println("eBay: " + driver.getTitle());

        // Open Myntra in the fourth tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.myntra.com/");
        System.out.println("Myntra: " + driver.getTitle());

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Use a for loop to iterate through window handles
        for (String handle : windowHandles) {
            // Switch to the window
            driver.switchTo().window(handle);

            // Perform actions on each window
            System.out.println("Title of the current window: " + driver.getTitle());
          

           
        }

        // Close the browser
        driver.quit();
    }
}
;

