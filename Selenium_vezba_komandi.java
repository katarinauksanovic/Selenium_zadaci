package Domaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_vezba_komandi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na IT
		 * Bootcamp Primeniti metode koje smo vezbali na casu (get URL i Title, navigate
		 * - refresh, to, back, forward) U kodu treba da se prozor maksimizuje, a pre
		 * zatvaranja drajvera vrati na prvobitnu velicinu.
		 * 
		 * Dodatni neobavezni zadatak Nadji metodu kojom ces vratiti duzinu “naslova”,
		 * ne samo naslov
		 * 
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.get("https://www.google.com//");
		wd.manage().window().getSize();

		wd.navigate().to("https://itbootcamp.rs/");

		wd.manage().window().maximize();

		wd.navigate().refresh();
		String tekst = wd.getTitle();

		System.out.println(tekst);
		int duzina = wd.getTitle().length();
		System.out.println( duzina );

		wd.navigate().to("https://www.youtube.com//");
		wd.navigate().back();
		wd.navigate().forward();

		wd.manage().window().setSize(wd.manage().window().getSize());

		wd.close();

	}

}
