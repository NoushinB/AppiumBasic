package noushinTest;
import java.io.File;


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	// public AppiumDriverLocalService service;

	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		// code to start server
		// AndroidDriver
		// Appium Code -> Appium Server -> mobile

		/*
		 * AppiumDriverLocalService service = new AppiumServiceBuilder() .withAppiumJS(
		 * new File(
		 * "C:\\Users\\96475\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
		 * )) .withIPAddress("127.0.0.1").usingPort(4723).build();
		 */

		// service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("NoushinEm");
		options.setApp("D:\\maven\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		//driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		// service.stop();
	}
}
