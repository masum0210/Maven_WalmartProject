package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Shared {

	public static void click(WebElement webElement ) throws InterruptedException {
		Thread.sleep(2000);
		
		}
	public static void mouseHover(WebDriver dr, WebElement e) {
		Actions mouseHover= new Actions(dr);
		mouseHover.moveToElement(e).build().perform();
		
	}
	public static WebElement waitForElement(WebElement e) {
		ExpectedConditions.visibilityOf(e);
		return e;
		
	}
	
	}


