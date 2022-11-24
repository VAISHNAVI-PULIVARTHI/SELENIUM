package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	WebDriver d;
	By username=By.name("userName");
	By password=By.name("password");
	By button=By.name("submit");
	pom(WebDriver d)
	 {
		 this.d=d;
	 }
	 public void uname()
	 {
		 d.findElement(username).sendKeys("admin");
	 }
	 public void pass()
	 {
		 d.findElement(password).sendKeys("admin123");
	 }
	 public void signon()
	 {
		 d.findElement(button).click();
	 }

}
