package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		//music element
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
		Thread.sleep(2000);
		WebElement Jazz=d.findElement(By.id("ui-id-13"));
		//Jazz
		Jazz.click();
		Thread.sleep(2000);
		//Modern
		WebElement modern=d.findElement(By.id("ui-id-16"));
		modern.click();
		Thread.sleep(2000);
		Actions act = new Actions(d);
		act.moveToElement(music).moveToElement(Jazz).moveToElement(modern).build().perform();
	}

}
