package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_009_SHOPPINGCART_FUNCTIONALITY3;

public class TC_CO_007_CHECKOUT_FUNCTIONALITY7 extends TC_CO_003_CHECKOUT_FUNCTIONALITY3 {
	@Test
	public void address_field_filled() {
		TC_CO_007_CHECKOUT_FUNCTIONALITY7 c_O_001 = new TC_CO_007_CHECKOUT_FUNCTIONALITY7();
		c_O_001.existing_address_checkout();

	}
}
