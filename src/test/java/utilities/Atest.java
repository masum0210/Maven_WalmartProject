package utilities;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fileRead.ReadProperties;

public class Atest {
	

	WebDriver dr;
	
	
	@Before
	public void openBrowser() throws IOException {
		Properties prop = ReadProperties.fileRead("/Users/masumparvezapu/eclipse-workspace/Maven_WalmartProject/config.properties");
		String C= prop.getProperty("chrome");
		String R= prop.getProperty("local");
		if(C.equals("chrome")) {
			if(R.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
				dr= new ChromeDriver();
			}
		}
		if(C.equals("firefox")) {
			if(R.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
				dr= new ChromeDriver();
				
			}
		}
		dr.get("https://www.walmart.com/");
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		dr.quit();
		
	}

}
