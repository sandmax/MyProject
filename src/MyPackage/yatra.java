package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yatra {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.yatra.com");
//driver.findElement(By.id("BE_flight_depart_date")).click();
//driver.findElement(By.id("a_2018_4_19")).click();
//	String js_command="document.getElementById(\"BE_flight_depart_date\").value=\"02/03/2018\"
	
	String js_command="document.getElementById(\"BE_flight_depart_date\").value=\"02/03/2018\"\r\n" + 
		"\"02/03/2018\"";
	JavascriptExecutor jsdriver =(JavascriptExecutor)driver;
	jsdriver.executeScript(js_command);
	

	

	}

}
