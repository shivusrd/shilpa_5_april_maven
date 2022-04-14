package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Checkbox_page;

public class Checkbox_test extends Baselibrary
{
	Checkbox_page ob ;
     
     @BeforeTest 
     
     public void getlaunchurl () 
     {
  	   getlaunch("http://testingbaba.com/");
  	   ob = new Checkbox_page() ;
     }
    
     
     @Test
     
     public void checkbox_test () 
     {
    	ob.elements();
    	 
     }
     
     @Test
    
     public void checkbox_test2 () 
     {
    	
    	ob.checkbox();
     }

}
