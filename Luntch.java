package Selenium;
//Login to facebook
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luntch {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("kargaljyoti28@gmail.com");
		
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Varsha");
		
	    Thread.sleep(2000);
	    WebElement login=driver.findElement(By.name("login"));
		login.click();;

	}

}
