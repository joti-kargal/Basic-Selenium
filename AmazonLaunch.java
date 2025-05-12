package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to login to Amazone Search product on Amazone
public class AmazonLaunch {

	public static void main(String[] args) 
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in");
     
     WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
     Search.sendKeys("HouseDecorationItems");
     
     WebElement SearchButton=driver.findElement(By.id("nav-search-submit-button"));
     SearchButton.click();
     
     
	}

}
