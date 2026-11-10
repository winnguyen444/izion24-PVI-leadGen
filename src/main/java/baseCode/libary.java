package baseCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.testng.annotations.BeforeClass;	
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class libary {

	public static AndroidDriver driver;
	Properties props = new Properties();
	
	@BeforeClass
	public void setUpAndroid() throws IOException {
		
		InputStream fiel = new FileInputStream("src/test/resources/config/config.Property");
		props.load(fiel);
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName(props.getProperty("platformName"))
				.setAutomationName(props.getProperty("automationName"))
				.setDeviceName(props.getProperty("deviceName"))
				.setUdid(props.getProperty("udid"))
				.setAppPackage(props.getProperty("appPackage"))
				.setAppActivity(props.getProperty("appActivity"))
				.setAppWaitActivity(props.getProperty("appWaitActivity"))
				.setAppWaitDuration(Duration.ofSeconds(Long.parseLong(props.getProperty("appWaitDuration"))))
				.setAutoGrantPermissions(Boolean.parseBoolean(props.getProperty("autoGrantPermissions")))
				.setNoReset(Boolean.parseBoolean(props.getProperty("noReset")));

		driver = new AndroidDriver(new URL(props.getProperty("appiumServerUrl")), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(props.getProperty("implicitWait"))));
	}

	public void openApp() throws InterruptedException {
		driver.activateApp(props.getProperty("activateApp"));
		Thread.sleep(5000);
		System.out.println("Package: " + driver.getCurrentPackage());
		System.out.println("Activity: " + driver.currentActivity());
	}
	
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
