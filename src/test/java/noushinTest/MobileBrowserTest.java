package noushinTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest {

	@Test
	public void browserTest() throws InterruptedException {

		driver.get("https://www.google.com");
		Thread.sleep(20000);
		driver.findElement(By.name("q")).sendKeys("Noushin");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
