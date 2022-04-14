package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import testingbaba_pages.Textbox_page;

public class Textbox_test extends Baselibrary

{
     Textbox_page ob ;
     
     @BeforeTest 
     
     public void getlaunchurl () 
     {
  	   getlaunch("http://testingbaba.com/");
  	   ob = new Textbox_page() ;
     }
    
     
     @Test
     
     public void textbox_test () 
     {
    	 ob.elements();
    	 
     }
     
     @Test
    
     public void textbox_test2 () 
     {
    	
    	 ob.textbox();
     }

}
