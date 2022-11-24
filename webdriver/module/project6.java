package module;

import org.openqa.selenium.chrome.ChromeDriver;

public class project6 {
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
		//Thread.sleep(1000);
		d.close();
}
}
