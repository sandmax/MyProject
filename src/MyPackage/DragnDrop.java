package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement src=driver.findElement(By.xpath("//*[@id=\"block-1\"]/h1"));
	WebElement des4=driver.findElement(By.xpath("//*[@id=\"block-4\"]/h1"));
	WebElement des2=driver.findElement(By.xpath("//*[@id=\"block-2\"]/h1"));
	Actions act=new Actions(driver);
	act.dragAndDrop(src, des4).perform();
	Thread.sleep(5000);
	act.dragAndDrop(des4, des2).perform();

	

	}

}
