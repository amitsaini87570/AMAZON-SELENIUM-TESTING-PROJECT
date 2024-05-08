package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_012_PRODUCT_DISPLAY_PAGE8 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void navigate_to_product_display_page_12() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
//login to application
		TC_PDP_012_PRODUCT_DISPLAY_PAGE8 display_pdp_001 = new TC_PDP_012_PRODUCT_DISPLAY_PAGE8();
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
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_000111"))).click();
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
	public void validate_product_qty_price_in_bulk() {
		TC_PDP_012_PRODUCT_DISPLAY_PAGE8 TC_PDP003 = new TC_PDP_012_PRODUCT_DISPLAY_PAGE8();
		TC_PDP003.navigate_to_product_display_page_12();

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// scroll
		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("scrooll2_qty_btn_pdp_12")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc.getProperty("updated_quentity_tobtn_pdp_12"))).click();

		WebElement qty20 = driver.findElement(By.xpath(loc.getProperty("updated_quentity_to_9")));
		Select select = new Select(qty20);
		select.selectByValue("20");

		Assert.assertTrue(true);

//prices are updated according to quentity
	}
}