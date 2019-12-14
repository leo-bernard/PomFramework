package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//Declaration
		@FindBy(id="username")
		private WebElement txtUsername;
		
		@FindBy(name="pwd")
		private WebElement txtPassword;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement btnLogin;
		
		//Initialization
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void txtUsername(String strUsername) {
			txtUsername.sendKeys(strUsername);
		}
		
		public void txtPassword(String strPassword) {
			txtPassword.sendKeys(strPassword);
		}
		
		public void btnLogin() {
		btnLogin.click();
		}
	}


