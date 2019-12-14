package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewmytimetrackpage {
	
	@FindBy(id="logoutLink")
	private WebElement lnkLogout;
	
	public Viewmytimetrackpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void lnkLogout() {
		lnkLogout.click();
	}

}
