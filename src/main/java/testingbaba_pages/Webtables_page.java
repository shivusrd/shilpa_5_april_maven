package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Webtables_page extends Baselibrary 
{

   public Webtables_page() 
  {
	  PageFactory.initElements(driver, this);
	  
  }
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements ;
	
	@FindBy(xpath = "//a[normalize-space()='web tables']")
	private WebElement webtables ;
	
	@FindBy(xpath = "//input[@title='Must contain Alphabet only(Min 3 Letters)']")
	private WebElement name ;
	
	@FindBy(xpath = "//input[@title='eg name@gmail.com']")
	private WebElement email ;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save ;
	
	@FindBy(xpath  ="//*[@id=\"tab_4\"]/div/iframe")
	private WebElement frame ;
	
	
	public void elements () 
	{
		elements.click();
	}
	
	public void webtables() throws InterruptedException 
	
	{
		Thread.sleep(2000);
	  webtables.click();
	  driver.switchTo().frame(frame);
	  name.sendKeys("aparna");
	  email.sendKeys("aparnad.@gmail.com");
	  save.click();
	  driver.switchTo().defaultContent();
	  
	 }
}
