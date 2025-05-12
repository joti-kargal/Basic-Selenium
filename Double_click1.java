package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click1 {

	public static void main(String[] args) throws InterruptedException 
	{

    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
     
    WebElement e1= driver.findElement(By.id("APjFqb"));
    e1.sendKeys("India");
    
    Thread.sleep(2000);
    Actions a1=new Actions (driver);
    a1.doubleClick(e1).perform();
   
	}

}
