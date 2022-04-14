package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import excelutility.Excelutility;

public class Textbox_page extends Baselibrary

{
	public Textbox_page()
	{

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements;

	@FindBy(xpath = "//a[contains(text(),'text box')]")
	private WebElement textbox;

	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement name;

	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	private WebElement email;

	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	private WebElement curadd;

	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	private WebElement peradd;

	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submit;

	@FindBy(xpath = "//*[@class=\"col-md-6 mt-5\"]/label")
	private WebElement text;

//	@FindBy(xpath = "//*[@class=\"col-md-6 mt-5\"]/label")
//	private WebElement data ;

	public void elements() 
	{
		elements.click();

	}

	public void textbox() 
	{
		textbox.click();
		
		for (int i = 1; i <= 4; i++) 
		{
			try 
			{
                
				String excelname = Excelutility.Getreaddata(i, 2);
				String excelemail = Excelutility.Getreaddata(i, 3);
				String excelcurradd = Excelutility.Getreaddata(i, 4);
				String excelperadd = Excelutility.Getreaddata(i, 5);

				name.sendKeys(excelname);
                email.sendKeys(excelemail);
				curadd.sendKeys(excelcurradd);
				peradd.sendKeys(excelperadd);

				submit.click();

				name.clear();
				email.clear();
				curadd.clear();
				peradd.clear();

			}

			catch (Exception e)
			{
				System.out.println("please fill all the data correctly");
				name.clear();
				email.clear();
				curadd.clear();
				peradd.clear();
			}

		}

	}

}
