package Cetvrtak;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticPopunjavanjeForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Katarina");
		driver.findElement(By.name("lastname")).sendKeys("Uksanovic");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.cssSelector("input#exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("4.6.2020");
		driver.findElement(By.cssSelector("input#profession-0")).click();
		driver.findElement(By.id("tool-2")).click();
		
		driver.findElement(By.className("input-xlarge")).sendKeys("Europe");
		driver.findElement(By.xpath("//option[contains(text(),'Navigation Commands')]")).click();
		
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]")).click();
		
		driver.navigate().back();
	    driver.findElement(By.cssSelector("button.btn btn-info")).click();
		
		
		
  
		
		
		

	}
}
