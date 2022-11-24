package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
		WebDriver d;
		public void login1()
		{
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			d=new ChromeDriver();
		}
		public void login1(String url)
		{
			d.get(url);
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
		}
		public void login1(String name,String pass)
		{
			d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(name);
			d.findElement(By.name("password")).sendKeys(pass);
			d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div")).click();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			login obj=new login();
			obj.login1();
			obj.login1("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			obj.login1("Admin","admin123");
		}

	}


