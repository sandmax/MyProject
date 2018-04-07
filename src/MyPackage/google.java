package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.phptravels.net/login");
	WebElement login=driver.findElement(By.name("username"));
	login.sendKeys("user@phptravels.com");
	WebElement pass=driver.findElement(By.name("password"));
	pass.sendKeys("demouser");
	driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
	
	driver.findElement(By.xpath("\r\n" + 
			"/html/body/div[3]/div/div/div[2]/ul/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a")).click();
	

//driver.close();

	}

}
