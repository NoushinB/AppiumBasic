package noushinTest;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
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

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
//import rahulshettyacademy.pageObjects.android.FormPage;

public class IOSBaseTest {
	public IOSDriver driver;
	//public FormPage formPage;
	// public AppiumDriverLocalService service;

	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {

		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhon 14 Pro");
		//options.setApp("////UIKitCatalog.app");
		options.setApp("////TestApp 3.app");
		options.setPlatformVersion("");
		// Appium -> Webdriver -> IOS Apps.
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		URL url = new URL("http://127.0.0.1:4723");
		driver = new IOSDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	@AfterClass
	
	public void tearDown() {
		driver.quit();
		// service.stop();
	}
}
