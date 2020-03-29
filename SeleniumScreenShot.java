package vjezbanje;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreenShot {

	static WebDriver drive;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "src\\vjezbanje\\chromedriver.exe");

		drive = new ChromeDriver();

		drive.get("https://www.google.com");
		drive.manage().window().maximize();

		drive.navigate().to("https://github.com/");

		TakesScreenshot ts = (TakesScreenshot) drive;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File lokacija = new File("C:\\Users\\home\\Downloads\\skrinsotselenium.jpg");

		FileUtils.copyFile(source, lokacija);

		drive.close();

	}

}
