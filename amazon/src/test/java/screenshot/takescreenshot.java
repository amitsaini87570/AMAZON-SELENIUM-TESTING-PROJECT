package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass_amazon.basetestamzn;



public class takescreenshot extends basetestamzn{
	public void takess() throws IOException {
		
		Date d = new Date();
		String ssfn = d.toString().replace(" ","_").replace(":","_");
		System.out.println("taking ss");
	 File ssf =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(ssf, new File("E:\\amazon\\screenshots"+ssfn+".png"));
		System.out.println("taken ss");
	}
}
