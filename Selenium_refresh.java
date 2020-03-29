package Domaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.navigate().to("https://www.youtube.com/");
		int i = 0;
		
		for ( i = 0; i < 5 ; i++) { 
			wd.navigate().refresh();
		}
		
		
		wd.close();

	}

}
