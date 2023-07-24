package Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Url {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);

		driver.quit();

	}
}
