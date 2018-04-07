package MyPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	WebElement login=driver.findElement(By.id("lst-ib"));
//	login.sendKeys("sandmax");
	login.sendKeys("java" , Keys.ENTER);
	//WebElement passwd=driver.findElement(By.xpath("//input[@type='password']"));
//	WebElement passwd=driver.findElement(By.name("password"));
//	WebElement nextb=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]"));
	
//	passwd.sendKeys("sandmax" , Keys.ENTER);
	WebElement login1=driver.findElement(By.id("lst-ib"));
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int size=links.size();
	for(int i=0;i<size;i++)
	{
		WebElement link =links.get(i);
		String text=link.getText();
		System.out.println(i + text);
		
	}
	driver.close();
	}
	
	
//	driver.close();

	}


