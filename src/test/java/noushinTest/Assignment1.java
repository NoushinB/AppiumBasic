package noushinTest;


import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Assignment1 extends BaseTest {

	@Test
	public void Assignment1Test() throws MalformedURLException, InterruptedException {
		
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		
	     String dialog=driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
	     //Assert.assertEquals(dialog, "Lorem ipsum dolor sit aie consectetur adipiscing Plloaso mako nuto siwuf cakso dodtos anr koop.");
	     driver.findElement(AppiumBy.xpath("//android.widget.Button[2]")).click();
			//Thread.sleep(3000);

		
		
		
	}
}
