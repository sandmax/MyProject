package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class phptravel {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	WebElement fname=driver.findElement(By.name("firstname"));
	fname.sendKeys("Sandeep");
	WebElement lname=driver.findElement(By.name("lastname"));
	lname.sendKeys("Peethamber");
	WebElement email=driver.findElement(By.name("reg_email__"));
	email.sendKeys("sandman@gmail.com");
	WebElement cemail=driver.findElement(By.name("reg_email_confirmation__"));
	cemail.sendKeys("sandman@gmail.com");
	WebElement pwd=driver.findElement(By.name("reg_passwd__"));
	pwd.sendKeys("sandmax");
	Select bday=new Select(driver.findElement(By.name("birthday_day")));
bday.selectByVisibleText("1");
Select yday=new Select(driver.findElement(By.name("birthday_year")));
yday.selectByVisibleText("1981");
Select mday=new Select(driver.findElement(By.name("birthday_month")));
mday.selectByVisibleText("Feb");
driver.findElement(By.xpath("//*[@id=\"u_0_11\"]/span[2]/label")).click();
driver.findElement(By.name("websubmit")).click();
Thread.sleep(5000);
driver.close(); 

	
	
	

	
//	login.sendKeys("sandmax");
//	login.sendKeys("sandmax" , Keys.ENTER);
	//WebElement passwd=driver.findElement(By.xpath("//input[@type='password']"));
//	WebElement passwd=driver.findElement(By.name("password"));
//	WebElement nextb=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]"));
	
//	passwd.sendKeys("sandmax" , Keys.ENTER);
	
	
	
//	driver.close();

	}

}
