package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
public class PageLoadTimeOut {
	public static void main(String[] args) throws Exception {
	System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
    Instant starttime =Instant.now();
    System.out.println(starttime.toString());
    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    Instant endtime =Instant.now();
    System.out.println(endtime.toString());
    Duration duration = Duration.between(starttime, endtime);
    System.out.println("Pageload time is "+duration.toMillis()+"milliseconds");
    
	driver.quit();
       
   }

}
