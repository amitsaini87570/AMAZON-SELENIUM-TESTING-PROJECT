package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_009_SHOPPINGCART_FUNCTIONALITY3;

public class TC_CO_006_CHECKOUT_FUNCTIONALITY6 extends TC_SC_009_SHOPPINGCART_FUNCTIONALITY3 {
	@Test
	public void address_field_empty() {
		TC_CO_006_CHECKOUT_FUNCTIONALITY6 c_O_001 = new TC_CO_006_CHECKOUT_FUNCTIONALITY6();
		c_O_001.Validate_shopping_cart_to_checkout();

		// change address
		driver.findElement(By.xpath(loc.getProperty("click_on_change_co_006"))).click();
		// click on add new address
		driver.findElement(By.xpath(loc.getProperty("click_on_add_new_addressco_006"))).click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("click_on_use_this_address_co_006")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		// click on use this address
		driver.findElement(By.xpath(loc.getProperty("click_on_use_this_address_co_006"))).click();

	}
}
