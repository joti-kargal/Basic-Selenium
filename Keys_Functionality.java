package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP on typing the first name and typing the same into surname as well?
public class Keys_Functionality {

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/admin/OneDrive/Desktop/learningHTML1.html");
     
     WebElement e1=  driver.findElement(By.id("1"));
     e1.sendKeys("Jyoti");
     e1.sendKeys(Keys.CONTROL+"a");
     e1.sendKeys(Keys.CONTROL+"c");
     
     Thread.sleep(2000);
     WebElement e2=  driver.findElement(By.id("2"));
     e2.sendKeys(Keys.CONTROL+"v");
     
     WebElement e3=  driver.findElement(By.id("3"));
     e3.sendKeys("Jyoti@123");
     
     WebElement e4=  driver.findElement(By.name("fname"));
     e4.sendKeys("Jyoti");
    
    // WebElement e5=  driver.findElement(By.name("lname"));
     //e5.sendKeys("Waghmode");
     
    // WebElement submit1=  driver.findElement(By.xpath("(/html/body/form)[1]"));//absolute X-path
   //  e6.submit1();
     
     WebElement e7=  driver.findElement(By.xpath("//input[@value='Girl']"));// X-path
     e7.click();
     
    // WebElement submit2=  driver.findElement(By.xpath("(/html/body/form)[2]"));//absolute X-path
     //submit2.click();
     
     WebElement e9=  driver.findElement(By.xpath("/html[1]/body[1]/input[5]"));//absolute X-path
     e9.click();
     
     WebElement e10=  driver.findElement(By.xpath("/html/body/a"));//absolute X-path
     e10.click();
     
     WebElement Relegion=  driver.findElement(By.id("Relegion"));
     Relegion.click();
	}

}
