package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoveroverMeshoo {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");

		WebElement e2=driver.findElement(By.xpath("//span[.='Profile']"));
		
				Actions a1=new Actions(driver);
		        a1.moveToElement(e2).perform();
	

	}
	}


