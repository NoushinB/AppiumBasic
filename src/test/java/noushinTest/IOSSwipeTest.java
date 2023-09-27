package noushinTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSSwipeTest extends IOSBaseTest {

	@Test
	public void IOSSwipeTestDemo() {
		// BundleId
		Map<String, String> params = new HashMap<String, String>();
		params.put("bundleId", "com.apple.mobileslideshow");
		driver.executeScript("mobile:launchApp", params);

		// open photos App on IOS with bundleId
		driver.findElement(AppiumBy.iOSNsPredicateString("label=='All Photos' ")).click();
		List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUElementTypeCell"));
		System.out.println(allPhotos.size());
		driver.findElement(AppiumBy.xpath("//XCUElementTypeCell[1]")).click();
		for (int i = 0; i < allPhotos.size(); i++) {
			driver.findElement(By.xpath("//XCUElementTypeNavigationBar")).getAttribute("name");
			Map<String, Object> params1 = new HashMap<String, Object>();
			params1.put("direction", "left");
			// params1.put("element", ((RemoteWebElement) ele).getId());
			driver.executeScript("mobile:swipe", params1);

		}
		driver.navigate().back();
		// baray inke dar narmafzar ios halat hefz mishavad bayad khodman be aghab
		// bargardim
		driver.findElement(AppiumBy.accessibilityId("Albums")).click(); // CleanUp

	}

}
