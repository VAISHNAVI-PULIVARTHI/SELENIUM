package classesandobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_amazon {
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	}
	public void get_current_url() {
		System.out.println(d.getCurrentUrl());
	}
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
