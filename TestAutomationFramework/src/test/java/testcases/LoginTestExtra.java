package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTestExtra extends BaseTest {
	
	@Test
	public static void loginTest1() throws InterruptedException {
		System.out.println("Login page Opened");
		//Thread.sleep(1000);
		driver.findElement(By.id(loc.getProperty("Username"))).sendKeys("standard_user");
		//Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("Password"))).sendKeys("secret_sauce");
		//Thread.sleep(5000);
		driver.findElement(By.className(loc.getProperty("Submit_Button"))).click();
	}

}
