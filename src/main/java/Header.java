import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	WebDriver dr;
@FindBy(xpath="") WebElement cart;
Header(WebDriver dr) {
	
	this.dr= dr;
	PageFactory.initElements(dr, this);
}

}
