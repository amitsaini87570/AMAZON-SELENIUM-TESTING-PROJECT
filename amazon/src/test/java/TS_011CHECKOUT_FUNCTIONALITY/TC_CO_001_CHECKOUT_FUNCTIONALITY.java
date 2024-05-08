package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;

public class TC_CO_001_CHECKOUT_FUNCTIONALITY extends TC_SC_002_SHOPPINGCART_FUNCTIONALITY2 {
	@Test
	public void shoppingcart_to_checkout_whitout_add_product() {
		TC_CO_001_CHECKOUT_FUNCTIONALITY c_O_001 = new TC_CO_001_CHECKOUT_FUNCTIONALITY();
		c_O_001.without_select_product_shoppingCart();

		driver.findElement(By.xpath(loc.getProperty("clcik_on_proceed_to_checkout_co_001"))).click();

	}
}
