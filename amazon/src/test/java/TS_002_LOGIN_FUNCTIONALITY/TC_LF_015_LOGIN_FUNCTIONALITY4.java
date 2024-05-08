package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_015_LOGIN_FUNCTIONALITY4 extends basetestamzn {
	@Test
	public void logging_functionality_all_environment_TC_LF_015() {

	
		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		//  'Register Account' functionality is working in all the supported environments

	}
}
