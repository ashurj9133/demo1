package demo11;

import java.io.FileInputStream;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteINExcel {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver-win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        //String amazonHandle = driver.getWindowHandle();
	        System.out.println("Amazon: " + driver.getTitle());
	        Set<Cookie>all=driver.manage().getCookies();
	        System.out.println(all);
	        System.out.println("cookie"+   driver.manage().getCookies());
	        Cookie c=new Cookie("test colk","amazon");
	        driver.manage().addCookie(c);
	}

}
