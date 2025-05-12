package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveroverProblem {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	

		//WebElement e1=driver.findElement(By.xpath("//span[.='Prime']"));
		WebElement e1=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 =driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		e2.click();
		
		WebElement e3 =driver.findElement(By.id("ap_email_login"));
		e3.sendKeys("jyotilargal03@gmail.com");
		
		WebElement e4 =driver.findElement(By.id("continue"));
		e4.click();
		
	}

}
