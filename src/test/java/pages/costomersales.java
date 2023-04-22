package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class costomersales {
	
WebDriver ldriver;
	
	public costomersales(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	
@FindBy(id="react-burger-menu-btn")
WebElement berger;
	

}
