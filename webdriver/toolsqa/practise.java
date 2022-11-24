package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("vaishu");
		d.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("kavali");
		d.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("kavalinelloreandharapradeshINDIA");
		Thread.sleep(2000);
		WebElement t= d.findElement(By.id("submit"));
		t.click();
		String s1=d.findElement(By.xpath("//*[@id='output']/div")).getText();
		System.out.println(s1);
		d.close();
		


	}

}
