package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to print all the links[URL]
public class Print_All_links {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<link.size();i++) 
		{
	
		WebElement link1=link.get(0);//Will give me 1st Element
		String s1=link1.getDomAttribute("href");  //Attribute name(href)will give the attribute value
		
		System.out.println(s1);
		}

	}

}
