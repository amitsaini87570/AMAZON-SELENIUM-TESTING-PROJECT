package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_006_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void placeholder_TC_LF_006() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		WebElement phmobile = driver.findElement(By.xpath(loc.getProperty("mobile_no6")));
		String phmobiletext = phmobile.getAttribute("placeholder");
		System.out.println("name placeholder text is = " + phmobiletext);
		String ExpectedmobileText = "enter email or phone no";
		Assert.assertEquals(phmobiletext, ExpectedmobileText);
		// no placeholders are present

	}
}
