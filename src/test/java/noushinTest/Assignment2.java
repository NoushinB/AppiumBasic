package noushinTest;

import java.net.MalformedURLException;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Assignment2 extends BaseTest {

	@Test
	public void Assignment2Test() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();

		List<WebElement> menu_items = driver.findElements(AppiumBy.xpath("//android.widget.CheckedTextView"));

		for (WebElement ele : menu_items) {
			Thread.sleep(500);
			ele.click();
		}

		elementById("android:id/button1").click();

		Thread.sleep(10000);
	}
}
