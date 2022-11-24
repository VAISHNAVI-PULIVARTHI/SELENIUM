package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promt1 {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title() {
		String a=d.getTitle();
		System.out.println(a);
	}
	public void url() {
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void promt_window() throws InterruptedException
	{
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		promt1 p=new promt1();
		p.opening_browser();
		p.title();
		p.url();
		p.promt_window();
		

	}

}
