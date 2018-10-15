package Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

@Test
public void method1()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	
}

}
