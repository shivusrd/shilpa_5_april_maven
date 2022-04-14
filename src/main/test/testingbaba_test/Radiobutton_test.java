package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Radiobutton_page;

public class Radiobutton_test  extends Baselibrary 
{

	Radiobutton_page ob ;
	
	@BeforeTest
	
	public void getlaunch () 
	{
		getlaunch ("http://testingbaba.com/");
	    ob = new Radiobutton_page () ;
		
	}
	
	@Test(priority = 0)
	
	public void radiobutton () 
	{
		
       ob.elements();
	}
	
	@Test(priority = 1)
	
	public void radiobutton1 () 
	{
		
	   ob.radio();
		
	}
	
	
}
