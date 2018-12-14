package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Shared;

public class HomePage {
	
	protected WebDriver dr1;
	@FindBy(xpath="html/body/div[1]/div/div/div/header/div/div[3]/div/div/div[1]/div/button")WebElement menu;
	@FindBy(xpath="html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/button")WebElement ClickOnCloth;
	@FindBy(xpath="html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/div[1]/div[3]/div[2]/div[2]/div[3]/h4/a")WebElement ClickSubMenu;
	@FindBy(xpath="html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/div[1]/div[3]/div[2]/div[2]/div[4]/h4/a")WebElement ClickOnKids;
	
	protected WebDriver dr;

	public HomePage(WebDriver dr) {
	this.dr1= dr;
}
	
	public void clickOnMenu() throws InterruptedException {
		//Shared.click(dr.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[3]/div/div/div[1]/div/button")));
		Shared.click(menu);
	}
	
	public void mouseHoverOverOnCloth() throws InterruptedException {
		//Shared.click(dr1.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/button")));
		Shared.click(ClickOnCloth);
	}
	public void clickOnMenSubMenu() throws InterruptedException {
		//Shared.click(dr1.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/div[1]/div[3]/div[2]/div[2]/div[3]/h4/a")));
		Shared.click(ClickSubMenu);
	}
	
	public void clickOnKids() throws InterruptedException {
		//Shared.click(dr1.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[7]/div[1]/div[3]/div[2]/div[2]/div[4]/h4/a")));
		Shared.click(ClickOnKids);
	}
	public void clickOnBabyAndToddler() throws InterruptedException {
		Shared.click(dr1.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[8]/button")));
	}
	public void clickOnShopAllBaby() throws InterruptedException {
		Shared.click(dr1.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[8]/div[1]/div[3]/div[2]/div[1]/div[3]/h4/a")));
	}
}
