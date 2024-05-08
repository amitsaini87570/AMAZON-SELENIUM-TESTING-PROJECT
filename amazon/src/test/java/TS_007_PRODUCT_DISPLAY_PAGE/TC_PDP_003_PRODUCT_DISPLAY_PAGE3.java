package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_003_PRODUCT_DISPLAY_PAGE3 extends TC_LF_001_LOGIN_FUNCTIONALITY {

	public void navigate_to_product_display_page() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

//login to application
		TC_PDP_003_PRODUCT_DISPLAY_PAGE3 display_pdp_001 = new TC_PDP_003_PRODUCT_DISPLAY_PAGE3();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001")))
				.sendKeys((loc.getProperty("product_namePDP_001")));
		// click on search box
		driver.findElement(By.xpath(loc.getProperty("search_buttonPDP_001"))).click();

		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("scrool_add_to_caret_buttonTC_PDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
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

		// again scroll
		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("colour_scroll_element_tc_003_pdp")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);
	}

	@Test
	public void validate_product_discription() {
		TC_PDP_003_PRODUCT_DISPLAY_PAGE3 TC_PDP003 = new TC_PDP_003_PRODUCT_DISPLAY_PAGE3();
		TC_PDP003.navigate_to_product_display_page();

		// validate product description
		WebElement product_element_discription = driver
				.findElement(By.xpath(loc.getProperty("product_discreiptionPDP_001")));
		String actual_product_disc = product_element_discription.getText();
		System.out.println("product discription is ..." + actual_product_disc);
		String Expected_product_disc = loc.getProperty("expected_product_discriptionPDP_001");
		 Assert.assertEquals(actual_product_disc, Expected_product_disc, "discription not matched");

	}
}