package MyPackage;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileMessage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("deviceName", "192.168.217.101:5555");
		cap.setCapability("appPackage", "com.android.messaging");
		cap.setCapability("appActivity", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		
		URL ip = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver =new AndroidDriver(ip,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Waiting for 5 sec");
		Thread.sleep(5000);
		System.out.println("done Waiting");
		System.out.println(driver.getContext());
		
//	driver.findElementById("com.android.messaging:id/start_new_conversation_button").click();
driver.findElementByAccessibilityId("Start new conversation").click();
//	element.click();
Thread.sleep(5000);
//	driver.findElement(By.id("com.android.messaging:id/recipient_text_view")).sendKeys("7406767770",Keys.ENTER);
driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys("7406767770");
driver.findElementByXPath("//android.widget.TextView[@text='FREQUENTS']").click();
//	driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.findElementById("com.android.messaging:id/compose_message_text").sendKeys("Hi");
	Thread.sleep(5000);
	driver.findElementByAccessibilityId("Send Message").click();
//	driver.close();
	}

}
