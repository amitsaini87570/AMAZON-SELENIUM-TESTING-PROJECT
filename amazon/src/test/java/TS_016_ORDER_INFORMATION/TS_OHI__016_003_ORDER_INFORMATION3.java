package TS_016_ORDER_INFORMATION;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_015_ORDER_HISTORY.TS_015_003_ORDER_HISTORY3;
import TS_015_ORDER_HISTORY.TS_015_007_ORDER_HISTORY6;

public class TS_OHI__016_003_ORDER_INFORMATION3 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void validate_to_return_order() {

		TS_OHI__016_003_ORDER_INFORMATION3 tc_oh_001 = new TS_OHI__016_003_ORDER_INFORMATION3();
		tc_oh_001.logging_valid_credentials_TC_LF_001();
		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oi_003"))).click();
		// click on return order
		driver.findElement(By.xpath(loc.getProperty("click_on_order_return_oi_003"))).click();

	}
}
