package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.about;
import pages.loginpage;

public class Step {
	
	public WebDriver driver;
	
	 public loginpage lp;
	 
	 public about ab;
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser()
	{
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
		    
		    lp=new loginpage(driver);
		    ab=new about(driver);
	    
	}
	
	
	
	@When("User open URL {string}")
	public void user_open_url(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		
	   
	}
	
	
	
	
	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String Email, String Password) {
		lp.lemail(Email);
		lp.lpass(Password);
		
	   
	}
	
	
	@When("click on login")
	public void click_on_login() {
		lp.loginbtn();
	   
	}
	
	
	@Then("User able to login  site app")
	public void user_able_to_login_site_app() {
	
	}
	
	
	//////////
	
	@When("user click ok burger menu")
	public void user_click_ok_burger_menu() throws InterruptedException {
		ab.bregerclick();
		Thread.sleep(1000);
	  
	}
	@When("click on About")
	public void click_on_about() {
		ab.aboutbtn();
		
	  
	}
	@Then("user goes to contact sales page")
	public void user_goes_to_contact_sales_page() {
		
	  
	}


}
