package noushinTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MobileBrowserTest2 extends BrowserBaseTest {

	@Test
	public void browserTest() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[routerlink*='/products']")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(8000);
		String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		Assert.assertEquals(text, "Devops");

	}
}
