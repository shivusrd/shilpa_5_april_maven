package testingbaba_pages;

import baselibrary.Baselibrary;

public class Login_page extends Baselibrary
{
 
	 public void gettitle () 
      {
	    String title = driver.getTitle();
        System.out.println("Title is - "+ title);
      }
}
