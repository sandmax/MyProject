package MyPackage;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileDialer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("deviceName", "192.168.209.101:5555");
		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		URL ip = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver =new AndroidDriver(ip,cap);
	}

}
