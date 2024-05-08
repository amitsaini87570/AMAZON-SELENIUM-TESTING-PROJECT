package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_002_SHOPPINGCART_FUNCTIONALITY2 extends TC_PDP_001_PRODUCT_DISPLAY_PAGE {

	public void disaplay_product() {

		TC_ATC_001_ADD_TO_CART_FUNCTIONALITY atc_001 = new TC_ATC_001_ADD_TO_CART_FUNCTIONALITY();
		atc_001.display_page();

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
	public void without_select_product_shoppingCart() {

		TC_ATC_001_ADD_TO_CART_FUNCTIONALITY atc_001 = new TC_ATC_001_ADD_TO_CART_FUNCTIONALITY();
		atc_001.display_page();
		// go to cart
		driver.findElement(By.xpath(loc.getProperty("go_to_cart_buttonnATC_001"))).click();

	}
}
