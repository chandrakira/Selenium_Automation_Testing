package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestFirst {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
	
		
		/*driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		WebElement colors=driver.findElement(By.name("color"));
		Select sel=new Select(colors);
		sel.selectByValue("Red");
		sel.selectByVisibleText("Yellow");*/

//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(3000);
//		WebElement selectmul=driver.findElement(By.id("ide"));
//		System.out.println(selectmul.getText());
//		Select selectmuloptions= new Select(selectmul);
//		selectmuloptions.selectByIndex(1);
//		Thread.sleep(2000);
//		selectmuloptions.selectByValue("ij");
//		Thread.sleep(2000);
//		selectmuloptions.deselectByVisibleText("NetBeans");
//		List<WebElement> selectedoptions = selectmuloptions.getAllSelectedOptions();
//		for (WebElement selectedoption: selectedoptions) {
//			System.out.println(selectedoption.getText());
//		}
//		WebElement dropdown=driver.findElement(By.id("course"));
//		Select coursenamedropdown = new Select(dropdown);
//		List<WebElement> coursenamedropdownoptions= coursenamedropdown.getOptions();
//		for(WebElement option: coursenamedropdownoptions) {
//			System.out.println(option.getText());
//		}
//		coursenamedropdown.selectByIndex(1);
//		coursenamedropdown.selectByValue("net");
//		coursenamedropdown.selectByVisibleText("Javascript");
//		Thread.sleep(2000);
//		System.out.println(dropdown.getText());
	    
		
//		WebElement radio=driver.findElement(By.id("malerb"));
//		Thread.sleep(3000);
//		radio.click();
//		WebElement check=driver.findElement(By.id("englishchbx"));
//		check.click();
//		Thread.sleep(2000);
//		if(check.isSelected()) {
//			check.click();
//			
//		}
//		Thread.sleep(3000);
//		WebElement button=driver.findElement(By.id("registerbtn"));
//		button.click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("msg")).getText());
//		WebElement link=driver.findElement(By.linkText("Click here to navigate to the home page"));
//		link.click();
		
		
		//String expectedTitle="W3Schools Online Web Tutorial";
		//String actualTitle=driver.getTitle();
		
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title has been matched with user's expectations");
		}
		else {
			System.out.println("Title not matched!");
			
			
		}
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"pagetop\"]/a[1]"));
		if(logo.isEnabled()) {
			System.out.println("logo is Enabled");
		}
		else {
			System.out.println("logo is not displayed");
			
			
		}
		Thread.sleep(2000);
		
		WebElement python=driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[7]"));
		python.click();
		Thread.sleep(2000);
	    driver.navigate().back();

		WebElement takeText =driver.findElement(By.className("learntocodeh3"));
		System.out.println(takeText.getText());
		Thread.sleep(2000);
		
		
		WebElement tutorial=driver.findElement(By.id("navbtn_tutorials"));
		Actions act=new Actions(driver);
		act.moveToElement(tutorial).click().build().perform();
		
	
		
		WebElement loginbtn=driver.findElement(By.id("w3loginbtn"));
		loginbtn.click();
		Thread.sleep(2000);
		
		WebElement usernamebox=driver.findElement(By.name("email"));
		usernamebox.sendKeys("chandrakiranreddy@gmail.com");
		
		System.out.println(usernamebox.getAttribute("value"));
		
		WebElement password=driver.findElement(By.name("current-password"));
		password.sendKeys("kiranreddy");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button"));
		login.click();
		Thread.sleep(2000);
		driver.close();
        */ 		
		
	
	
	}

}
