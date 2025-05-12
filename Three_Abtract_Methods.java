package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Three Abtract Methods Is Enable(),IS Display(),Is Selected().
public class Three_Abtract_Methods {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/admin/OneDrive/Desktop/learningHTML1.html");
	     
	     WebElement username=  driver.findElement(By.id("1"));
	     boolean b1=username.isEnabled();      //Is Enable
	     System.out.println(b1);
	     
	     boolean b2= username.isDisplayed();   //IS Display
	     System.out.println(b2);
	     
	     //If both conditions are true then we can perform action by using && operator
	     if(b1 && b2)
	     {
	    	 username.sendKeys("Jyoti");
	     }
	     
	     WebElement e2=  driver.findElement(By.xpath("//input[@value='Girl']"));
	     boolean b3= e2.isSelected();  //is selected
	     System.out.println(b3);
	     if(b3==false)
	     {
	    	 e2.click();
	     }
	     
	}

}
