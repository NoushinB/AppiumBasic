package noushinTest;

import java.util.HashMap;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSSlider extends IOSBaseTest {

	@Test
	public void IOSSliderTest() {

		WebElement slider = driver.findElement(AppiumBy.iOSClassChain("**/XCUElementTypeSlider[`label == 'AppElem'`]"));
		slider.sendKeys("0%");
		System.out.println(slider.getAttribute("value"));
		slider.sendKeys("100%");
		System.out.println(slider.getAttribute("value"));
	}

}
