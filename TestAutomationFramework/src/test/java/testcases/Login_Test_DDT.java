package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLXSData;

public class Login_Test_DDT extends BaseTest {
	@Test(dataProviderClass=ReadXLXSData.class,dataProvider="ExcelData")
	public static void LoginDDT(String username,String password) throws InterruptedException {
		
		driver.findElement(By.id(loc.getProperty("Username"))).sendKeys(username);
		Thread.sleep(500);
		driver.findElement(By.id(loc.getProperty("Password"))).sendKeys(password);
		
		driver.findElement(By.className(loc.getProperty("Submit_Button"))).click();
		Thread.sleep(1000);
		driver.findElement(By.className(loc.getProperty("SwagLabIconClick"))).click();//it will fail if user is unable to login
	}
	
	
			

}
