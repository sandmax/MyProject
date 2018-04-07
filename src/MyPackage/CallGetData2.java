package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallGetData2 {

	public static void main(String[] args) {
		String uname=GetData2.FromExcel("C:\\data\\data.xlsx", "Sheet1", 1, 0);
		String pwd=GetData2.FromExcel("C:\\data\\data.xlsx", "Sheet1", 1, 1);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// FirefoxDriver driver=new FirefoxDriver();
//		WebDriver driver = new FirefoxDriver();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement login=driver.findElement(By.id("identifierId"));
//		login.sendKeys("sandmax");
		login.sendKeys(uname , Keys.ENTER);
		//WebElement passwd=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement passwd=driver.findElement(By.name("password"));
//		WebElement nextb=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]"));
		
		passwd.sendKeys(pwd , Keys.ENTER);

	}

}
