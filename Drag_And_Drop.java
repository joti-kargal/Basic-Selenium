package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP on Darg and Drop in revert it back
public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
	

		
		WebElement drag=driver.findElement(By.id("drag2"));
		WebElement drop=driver.findElement(By.id("div2"));
		
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag,drop).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(drop,drag).perform();
		


	}

}
