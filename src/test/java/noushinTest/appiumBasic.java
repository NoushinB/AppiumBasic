package noushinTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class appiumBasic extends BaseTest {

	@Test
	public void appiumTest() throws MalformedURLException {
		// code to start server
		// AndroidDriver
		// Appium Code -> Appium Server -> mobile
        // actual automation
		//Xpath, ID ,AccessabilityID
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(android.widget.RelativeLayout)[2]")).click();
	}
}
