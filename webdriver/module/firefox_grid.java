package module;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefox_grid {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
	    String baseurl="https://www.google.com";
	    DesiredCapabilities cap=DesiredCapabilities.chrome();
	    cap.setBrowserName("firefox");
	    cap.setPlatform(Platform.WINDOWS);
	    WebDriver d1=new RemoteWebDriver(new URL(nodeurl),cap);
	    
	    FirefoxDriver d11=new FirefoxDriver();
	    d11.get(baseurl);
	    d11.manage().window().maximize();
	    Thread.sleep(2000);
	    d11.close();
		

	}

}
