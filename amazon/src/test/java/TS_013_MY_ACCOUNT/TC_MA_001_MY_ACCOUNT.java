package TS_013_MY_ACCOUNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_011CHECKOUT_FUNCTIONALITY.TC_CO_003_CHECKOUT_FUNCTIONALITY3;

public class TC_MA_001_MY_ACCOUNT extends TC_CO_003_CHECKOUT_FUNCTIONALITY3 {
	@Test
	public void navigate_checkout_to_my_account() {
		TC_MA_001_MY_ACCOUNT m_a_001 = new TC_MA_001_MY_ACCOUNT();
		m_a_001.existing_address_checkout();

		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover_TC_MA_001")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
		// click on my account
		driver.findElement(By.xpath(loc.getProperty("click_on_my_account_TC_ma_001"))).click();

	}

}
