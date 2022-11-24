package module;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705497476599&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5twasf2d2w_e");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
		
			
			
		}
		File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(a,new File("D://new1.png") );

	}

}
