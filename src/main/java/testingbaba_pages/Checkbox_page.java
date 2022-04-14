package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Checkbox_page extends Baselibrary
{
	public Checkbox_page  () 
	{

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements ;

	@FindBy(xpath = "//a[normalize-space()='check box']")
	private WebElement checkbox ;

	
	@FindBy(xpath = "//*[@id=\"myCheck\"]")
	private WebElement mobile ;

	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement laptop ;

	
	@FindBy(xpath = "//*[@id=\"mydesktop\"]")
	private WebElement desktop ;
	
	@FindBy(xpath  ="//*[@id=\"tab_2\"]/div/iframe")
	private WebElement frame ;

	public void elements() 
	{

		elements.click();
	}

	
	public void checkbox ()
	
	{
		
		
		checkbox.click();
		driver.switchTo().frame(frame);
		mobile.click();
		laptop.click();
		desktop.click();
		driver.switchTo().defaultContent();
		
	}
	
	
	
	
}
