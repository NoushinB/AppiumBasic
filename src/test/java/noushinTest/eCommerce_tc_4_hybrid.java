package noushinTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eCommerce_tc_4_hybrid extends BaseTest {

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
		driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(2000);
		// driver.findElements(AppiumBy.xpath("(//android.widget.TextView[@text='ADD TO
		// CART'])[1]")).get(0).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.attributeContains(
				driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		Thread.sleep(2000);
		List<WebElement> productPrices = driver
				.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
		int count = productPrices.size();
		double totalSum = 0;
		for (int i = 0; i < count; i++) {
			String amountString = productPrices.get(i).getText();
			// $160.70
			// Double price= Double.parseDouble(amountString.substring(1));
			Double price = getFormattedAmount(amountString);

			totalSum = price + totalSum;
		}
		Thread.sleep(4000);
		String displaySum = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl"))
				.getText();
		Double displayFormattedSum = getFormattedAmount(displaySum);
		Assert.assertEquals(totalSum, displayFormattedSum);

		Thread.sleep(3000);

		WebElement ele = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/termsButton"));
		longPressAction(ele);

		// String alertTitle =
		// driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/alertTitle")).getText();

		// Assert.assertEquals(alertTitle, "Terms Of Conditions");

		driver.findElement(AppiumBy.id("android:id/button1")).click();

		Thread.sleep(2000);
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();

		Thread.sleep(8000);
		// get context name from console
		Set<String> contexts = driver.getContextHandles();
		for (String contextName : contexts) {
			System.out.println(contextName);
		}
		Thread.sleep(20000);

		driver.context("WEBVIEW_com.androidsample.generalstore");

		WebElement searchElement = driver.findElement(By.name("q"));

		if (searchElement != null) {
			searchElement.sendKeys("rahul shetty academy");
			Thread.sleep(20000);
			searchElement.sendKeys(Keys.ENTER);
		}

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");

		Thread.sleep(8000);
		System.out.print(Ids.FINISH_MESSAGE);
	}
}
