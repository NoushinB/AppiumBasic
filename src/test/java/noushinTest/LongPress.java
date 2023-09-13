package noushinTest;

import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@Test
	public void LongPressGesture() throws MalformedURLException {
		
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		 ((JavsscriptExecutor)driver).executeScript("mobile: longClickGesture",
				 ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						 "duration",2000));
	}
}
