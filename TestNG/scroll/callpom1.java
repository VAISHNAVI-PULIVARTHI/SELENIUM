package scroll;

import org.openqa.selenium.chrome.ChromeDriver;

public class callpom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		
		pom1 a1=new pom1(d);
		a1.Fname();
		a1.lname();
		a1.phone();
		a1.Uname();
		a1.Cont();
		

	}

}
