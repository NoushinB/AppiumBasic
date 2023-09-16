package noushinTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest {

	@Test
	public void FillForm() throws InterruptedException {

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Noushin");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(AppiumBy.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//String toastMessage=driver.findElement(AppiumBy.xpath("//(andrid.widget.Toast) [1]")).getAttribute("name");
		//Assert.assertEquals(toastMessage,"Please  your name");
		Thread.sleep(4000);

	}

}
