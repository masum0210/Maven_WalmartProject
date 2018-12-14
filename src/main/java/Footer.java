import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	WebDriver dr;
@FindBy(xpath=".//*[@id='carousel-Main Course']/div/div[1]/ul/li[1]/div/a/img") WebElement cart;
Footer(WebDriver dr){
	this.dr= dr;
	PageFactory.initElements(dr, this);
}
	
}
