package Package_seleniumj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFF {
	  static WebDriver driver;
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Demp\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("http://google.co.in/");
	}

}
