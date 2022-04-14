package baselibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;



public class Baselibrary
{
	public static WebDriver driver = null ;
	
	
   public void getlaunch (String url) 
   {
	   System.setProperty("WebDriver.chrome.driver","C:\\Users\\dubey\\eclipse-workspace\\5April_maven\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	  
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
   }
   
   
   @AfterTest
   public void  teardown()
   {   
	  
	   driver.quit();
	   
   }
}
