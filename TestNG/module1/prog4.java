package module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class prog4 {
	WebDriver d;
	 @BeforeClass
	  public void opening_browser() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			 d=new ChromeDriver();
			d.get("https://www.amazon.com");
			d.manage().window().maximize();
	  }
	  @Test(priority=2)
	  public void title() {
		  System.out.println(d.getTitle());
	  }
	  @Test(priority=3)
	  public void url() {
		  System.out.println(d.getCurrentUrl());
	  }
	  @Test(priority=4)
	  public void screenshot() throws IOException {
		  File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			FileUtils.copyFile(a,new File("D://new3.png") );
	  }
	  @AfterMethod
	  public void close() {
		  
		  d.close();
	  }
	  
}
