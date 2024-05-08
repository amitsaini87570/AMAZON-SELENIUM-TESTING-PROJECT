package TS_008_ADD_TO_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;

public class TC_ATC_003_ADD_TO_CART_FUNCTIONALITY2 extends TC_PDP_001_PRODUCT_DISPLAY_PAGE {

	public void display_page() {

		// login to application
		TC_PDP_001_PRODUCT_DISPLAY_PAGE display_pdp_001 = new TC_PDP_001_PRODUCT_DISPLAY_PAGE();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001")))
				.sendKeys((loc.getProperty("product_namePDP_001")));
		// click on search box
		driver.findElement(By.xpath(loc.getProperty("search_buttonPDP_001"))).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("scrool_add_to_caret_buttonTC_PDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	}

	@Test
	public void click_on_comparision_page() {

		TC_ATC_003_ADD_TO_CART_FUNCTIONALITY2 atc_001 = new TC_ATC_003_ADD_TO_CART_FUNCTIONALITY2();
		atc_001.display_page();

		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("add_tocart_ButtonTC_PDP_001"))).click();

		// click on image product
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_0001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

		// go to cart
		driver.findElement(By.xpath(loc.getProperty("go_to_cart_buttonnATC_001"))).click();
		Assert.assertTrue(false);
		// no compare page found

	}

}
