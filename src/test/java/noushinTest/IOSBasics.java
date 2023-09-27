package noushinTest;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest {

	@Test
	public void IOSBasicsTest() {
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		// driver.findElement(By.xpath("//XCUElementTypeStaticText[@name ='Text
		// Entry']")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUElementTypeStaticText[`label== 'Text Entry'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUElementTypeCell")).sendKeys("Hello World");
		driver.findElement(AppiumBy.accessibilityId("Ok")).click();

		driver.findElement(
				AppiumBy.iOSNsPredicateString(" type=='XCUElementTypeStaticText' AND  value BEGINSWITH [C]'Confirm'"))
				.click();
		String text=driver.findElement(AppiumBy.iOSNsPredicateString("name== BEGINSWITH [C] 'A message' ")).getText();
		System.out.println(text);
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Confirm'")).click();
		// driver.findElement(AppiumBy.iOSNsPredicateString(" type=='XCUElementTypeStaticText' AND value ENDSWITH [C]'Cancel'"));
		// driver.findElement(AppiumBy.iOSNsPredicateString(" type =='XCUElementTypeStaticText' AND value=='Confirm/Cancel'"));
	}

}
