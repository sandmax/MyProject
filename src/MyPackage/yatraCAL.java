package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yatraCAL {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.yatra.com");
	WebElement macc=driver.findElement(By.xpath("//*[@id=\"userSignInStrip\"]/a"));
	WebElement acc=driver.findElement(By.xpath("//*[@id=\"signInBtn\"]"));
	Actions act=new Actions(driver);
	act.moveToElement(macc).moveToElement(acc).click().build().perform();
	driver.navigate().back();
	//Scroll
	String js_command="window.scroll(0,5000)";
	String js_command1="window.scroll(0,0)";
	JavascriptExecutor jdriver=(JavascriptExecutor)driver;
	jdriver.executeScript(js_command);
	Thread.sleep(5000);
	
	jdriver.executeScript(js_command1);


	

	}

}
