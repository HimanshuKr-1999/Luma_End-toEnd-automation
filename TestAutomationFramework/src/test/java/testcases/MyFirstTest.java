package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTest extends BaseTest{
	
	@Test(dataProvider="testdata")
	public static void loginTest(String username,String password) throws InterruptedException {
		System.out.println("Login page Opened");
		//Thread.sleep(1000);
		driver.findElement(By.id(loc.getProperty("Username"))).sendKeys(username);
		//Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("Password"))).sendKeys(password);
		
		driver.findElement(By.className(loc.getProperty("Submit_Button"))).click(); 
		Thread.sleep(5000);
		
		driver.findElement(By.className(loc.getProperty("SwagLabIconClick"))).click();//it will fail if user is unable to login
		
		
//		System.out.println(driver.getTitle());
//		
//		String title=driver.getTitle();
//		String RealTitle="Single Page Apps for GitHub Pages";
//		
//		Assert.assertEquals(title,RealTitle,"Unable to login");
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] tData(){
		return new Object[][] {
			{"Wrong_user","secret_sauce"},
			{"standard_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			
		};
	}
	

}
