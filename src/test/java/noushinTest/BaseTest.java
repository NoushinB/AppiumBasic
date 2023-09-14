package noushinTest;
import java.io.File;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.net.URISyntaxException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

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
		
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	}
	
	public void longPressAction(WebElement ele) {
		 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				 ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						 "duration",2000));
		
	}
	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));}while(canScrollMore);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		// service.stop();
	}
}
