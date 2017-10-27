package Testcases;
 
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 {
@Test
public void TestCase4()
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.findElementById("twotabsearchtextbox").sendKeys("toothbrush");
	driver.findElementById("twotabsearchtextbox").sendKeys(Keys.ENTER);
	//driver.findElementByClassName("nav-input").click();
	driver.quit();
}
}
