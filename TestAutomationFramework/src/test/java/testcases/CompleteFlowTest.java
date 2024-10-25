package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class CompleteFlowTest extends BaseTest {
	@Test
	public static void main(String[] args) {
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className(loc.getProperty("submit-button"))).click();
		
		
		
	//	driver.findElement(By.xpath(loc.getProperty(1st_Item_add_to_cart)))

	}

}
