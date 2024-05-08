package TS_018_CONTECT_US;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_002_CONTECT_US2 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void validate_contect_us_details() {
		TC_002_CONTECT_US2 tc_001_cs = new TC_002_CONTECT_US2();
		tc_001_cs.logging_valid_credentials_TC_LF_001();

		driver.manage().window().maximize();
		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover_tc_cs_001")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on your accountt
		driver.findElement(By.xpath(loc.getProperty("click_on_my_account_tc_Cs_001"))).click();
//click on contect us 
		driver.findElement(By.xpath(loc.getProperty("click_on_contect_us_tc_cs_001"))).click();

	}
}
