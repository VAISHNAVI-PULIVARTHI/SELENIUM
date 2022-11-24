package module;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();

		String a=d.getTitle();
		System.out.println(a);

		String b=d.getCurrentUrl();
		System.out.println(b);
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected =  d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		boolean enabled =  d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		boolean displayed =  d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);
		//Thread.sleep(1000);
		d.close();

	}

}
