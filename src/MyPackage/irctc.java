package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\sandm\\Downloads\\Pack\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// FirefoxDriver driver=new FirefoxDriver();
//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in");
	WebElement user=driver.findElement(By.id("usernameId"));
	WebElement pass=driver.findElement(By.name("j_password"));
	WebElement login=driver.findElement(By.id("loginbutton"));
	user.sendKeys("sandmax");
	String lenght=user.getAttribute("maxlength");
	String plenght=pass.getAttribute("maxlength");
	System.out.println("max Lenght allowed in username is "+ lenght);
	System.out.println("max Lenght allowed in passwd is "+ plenght);
	pass.sendKeys("sandmax12345");
login.click();

	

	}

}
