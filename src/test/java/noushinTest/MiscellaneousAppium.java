package noushinTest;

import java.net.MalformedURLException;

import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MiscellaneousAppium extends BaseTest {
	@Test
	public void Miscellaneous() throws MalformedURLException {
	
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"))
				.click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		DeviceRotation landScape=new DeviceRotation(0,0,90);
		driver.rotate(landScape);
		driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[2]")).click();
		// driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Noushin");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}
}



