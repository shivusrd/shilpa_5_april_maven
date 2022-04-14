package waitutility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class Waitutility extends Baselibrary

{
	static WebDriverWait wait = null;

	public static void alertispresent(Duration time)
	{
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void visibilityofelements(Duration time, WebElement ele) 
	{

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
