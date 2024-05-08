package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_011_SHOPPINGCART_FUNCTIONALITY5 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void all_supported_environments() {

		TC_SC_011_SHOPPINGCART_FUNCTIONALITY5 atc_001 = new TC_SC_011_SHOPPINGCART_FUNCTIONALITY5();
		atc_001.success_message_to_shoppingCart();
		//  'shopping cart' functionality is working in all the supported environments
	}
}
