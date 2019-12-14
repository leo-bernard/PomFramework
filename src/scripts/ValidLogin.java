package scripts;
import Pom.Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Homepage;
import Pom.Viewmytimetrackpage;
import genericlib.Property;
import genericlib.Autoconstant;

public class ValidLogin implements Autoconstant {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Loginpage lp = new Loginpage(driver);
		lp.txtUsername(Property.getvalue(Propertyfilepath,"username"));
		lp.txtPassword(Property.getvalue(Propertyfilepath, "password"));
		lp.btnLogin();
		
		Homepage hp = new Homepage(driver);
		hp.lnkViewMytimeTrack();
		
		Viewmytimetrackpage vttg = new Viewmytimetrackpage(driver);
		vttg.lnkLogout();
		
		driver.close();
		

	}

}
