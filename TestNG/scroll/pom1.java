package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
	WebDriver d;
	By Fname=By.name("firstName");
	By lname=By.name("lastName");
	By phone=By.name("phone");
	By Uname=By.name("userName");
	By Cont=By.name("country");
	
	pom1(WebDriver d) 
	{
		this.d=d;
	}
	public void Fname()
	 {
		 d.findElement(Fname).sendKeys("testing123");
	 }
	public void lname()
	 {
		 d.findElement(lname).sendKeys("testing");
	 }
	public void phone()
	 {
		 d.findElement(phone).sendKeys("6281777304");
	 }
	public void Uname()
	 {
		 d.findElement(Uname).sendKeys("admin");
	 }
	public void Cont()
	 {
		 d.findElement(Cont).sendKeys("INDIA");
	 }

}
