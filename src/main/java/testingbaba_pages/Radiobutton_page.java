package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Radiobutton_page  extends Baselibrary
{
   public Radiobutton_page () 
   {
	  
	  PageFactory.initElements(driver, this );
   }
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements ;
	
	@FindBy(xpath = "//a[contains(text(),'radio buttons')]")
	private WebElement radiobutton ;
	
	@FindBy(xpath = "//*[@id=\"yes\"]")
	private WebElement yes ;
	
	
	public void elements () 
	{
		elements.click();
		
	}
	 
	public void radio() 
	{
		
		radiobutton.click();
		yes.click();
		
	}
}
