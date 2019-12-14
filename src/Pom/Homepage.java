package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//Declaration
	@FindBy(xpath = "//div[.='View My Time-Track']")
	private WebElement lnkViewMytimeTrack;
	
	@FindBy(xpath = "//div[.='Enter Time-Track']")
	private WebElement lnkEnterTimeTrack;
	
	//Initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void lnkViewMytimeTrack() {
		lnkViewMytimeTrack.click();
	}
	
	public void lnkEnterTimeTrack() {
		lnkEnterTimeTrack.click();
	}

}
