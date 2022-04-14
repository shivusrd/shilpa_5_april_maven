package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Webtables_page;

public class Webtables_test extends Baselibrary 
{
  Webtables_page ob ;
  
  @BeforeTest 
  
  public void getlaunch () 
  {
	  getlaunch ("http://testingbaba.com/");
	  ob = new Webtables_page ();  
	  
  }
  
  @Test
  
  public void webtables () 
  {
	  ob.elements();
  }
  
  @Test 
  
  public void webtables1 () throws InterruptedException
  {
	  ob.webtables();
	  
  }
}
