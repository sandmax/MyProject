package MyPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc2 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in");
	driver.findElement(By.linkText("Flights")).click();
	Set<String> windowsID=driver.getWindowHandles();
	Iterator<String> it = windowsID.iterator();
	String parendID=it.next();
	String childID=it.next();
	driver.switchTo().window(childID);
	driver.findElement(By.id("international")).click();
	
	
	

	

	}

}
