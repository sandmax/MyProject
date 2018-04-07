package MyPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoIT {

	public autoIT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException
	{
	
		Runtime.getRuntime().exec("C:\\Users\\sandm\\Documents\\Selenium\\open1.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Navigation+Commands&submit=");
	
driver.findElement(By.xpath("//*[@id=\"photo\"]")).click();
		

	}

}
