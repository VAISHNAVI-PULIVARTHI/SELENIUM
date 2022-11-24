package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class itera {
	WebDriver d;
	public void openurl()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://itera-qa.azurewebsites.net/");
	    d.manage().window().maximize();
	}
	public void signup()
	{
		d.findElement(By.linkText("Sign Up")).click();
	}
	public void register()
	{
		d.findElement(By.id("FirstName")).sendKeys("vaishnavi");
		d.findElement(By.id("Surname")).sendKeys("pulivarthi");
		d.findElement(By.id("E_post")).sendKeys("524201");
		d.findElement(By.id("Mobile")).sendKeys("6302392381");
		d.findElement(By.id("Username")).sendKeys("vaishu");
		d.findElement(By.id("Password")).sendKeys("123456789");
		d.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		d.findElement(By.id("submit")).click();
		
	}
	public static void main(String[] args) {
		itera i = new itera();
		i.openurl();
		i.signup();
		i.register();
	}

}
