package amazon;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class operations extends login{
	@Test(priority=2)
	  public void url() {
		  System.out.println(d.getCurrentUrl());
	  }
	@Test(priority=3)
	  public void dropdown() {
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
		}
	  }
	@Test(priority=4)
	  public void screenshot() throws IOException {
		  File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			FileUtils.copyFile(a,new File("D://new4.png") );
	  }
}
