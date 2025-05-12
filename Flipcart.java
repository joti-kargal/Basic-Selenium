package Selenium;
//linkTest and PartialLinkTest
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com");
     
     WebElement e1=driver.findElement(By.linkText("Gmail"));
     e1.click();
     
     
     WebElement e2=driver.findElement(By.linkText("Images"));
     e2.click();
    
     WebElement e11=driver.findElement(By.partialLinkText("Gmai"));
     e11.click();
     
     WebElement e21=driver.findElement(By.tagName("textarea"));
     e21.sendKeys("India");
	}

}
