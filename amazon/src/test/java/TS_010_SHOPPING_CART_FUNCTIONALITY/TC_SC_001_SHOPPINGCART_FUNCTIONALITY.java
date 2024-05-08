package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_001_SHOPPINGCART_FUNCTIONALITY extends TC_PDP_001_PRODUCT_DISPLAY_PAGE {

	public void add_to_cart() {

		TC_ATC_001_ADD_TO_CART_FUNCTIONALITY atc_001 = new TC_ATC_001_ADD_TO_CART_FUNCTIONALITY();
		atc_001.navigate_to_product_display_page();

		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("add_tocart_ButtonTC_PDP_001"))).click();

		// click on image product
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);
	}

	@Test
	public void success_message_to_shoppingCart() {

		TC_ATC_001_ADD_TO_CART_FUNCTIONALITY atc_001 = new TC_ATC_001_ADD_TO_CART_FUNCTIONALITY();
		atc_001.display_page();
		// go to cart
		driver.findElement(By.xpath(loc.getProperty("go_to_cart_buttonnATC_001"))).click();

	}
}
