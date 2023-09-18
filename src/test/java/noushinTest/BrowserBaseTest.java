package noushinTest;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BrowserBaseTest {
	public AndroidDriver driver;

	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("NoushinEm2");
		options.setChromedriverExecutable("D:\\drivers\\chromedriver_91_0_4472\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");

		URL url = new URL("http://127.0.0.1:4723");
		driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}

	public WebElement findByAccessibilityId(String id) {
		return driver.findElement(AppiumBy.accessibilityId(id));
	}

	public WebElement elementById(String id) {
		return driver.findElement(AppiumBy.id(id));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
