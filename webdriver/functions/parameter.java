package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameter {
	static ChromeDriver d;
	
	public void details(String uname,String pass){
		
	}
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.findElement(By.id("userName")).sendKeys("selenium");
		WebElement a=d.findElement(By.xpath(""));
		a.sendKeys("example");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no return type with parameters
		parameter p = new parameter();
		p.details("vaishu", "abcd");

	}

}
