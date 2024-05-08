package TS_016_ORDER_INFORMATION;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_015_ORDER_HISTORY.TS_015_003_ORDER_HISTORY3;
import TS_015_ORDER_HISTORY.TS_015_007_ORDER_HISTORY6;

public class TS_OHI__016_005_ORDER_INFORMATION5 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void validate_ui() {

		TS_OHI__016_005_ORDER_INFORMATION5 tc_oh_001 = new TS_OHI__016_005_ORDER_INFORMATION5();
		tc_oh_001.logging_valid_credentials_TC_LF_001();
		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oi_003"))).click();

		// Proper and good UI are displayed on the 'order history information' page

	}
}
