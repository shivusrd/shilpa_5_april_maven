package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import propertyutility.PropertyUtility;
import testingbaba_pages.Login_page;

public class Login_test extends Baselibrary
{
   Login_page ob ;
   
   @BeforeTest 
   
   public void getlaunchurl () 
   
   {
	   getlaunch(PropertyUtility.getreadproperty("url"));
	   ob = new Login_page() ;
   }
  
   @Test
   
   public void gettitle() 
   {
	   ob.gettitle(); 
	   
   }
}
