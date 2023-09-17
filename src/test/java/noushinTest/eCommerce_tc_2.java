package noushinTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_2 extends BaseTest {

	@Test
	public void FillForm() throws InterruptedException {

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Noushin");
		driver.hideKeyboard();
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(AppiumBy.id("android:id/text1")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));

		int productCount = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < productCount; i++) {
			String productName = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName"))
					.get(i).getText();
			if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);

	}

}