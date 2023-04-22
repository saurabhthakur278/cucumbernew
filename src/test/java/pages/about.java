package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class about {
	
	
WebDriver ldriver;
	
	public about(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	
@FindBy(id="react-burger-menu-btn")
WebElement berger;
	
	
@FindBy(id="about_sidebar_link")
WebElement about;

public void bregerclick() {
	berger.click();
	
}

public void aboutbtn() {
	
	about.click();
}

}
