package Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic1.BaseTest;
import generic1.IAutoInterface;
import generic1.Library;
import pompage.loginfacebook;

public class validLogin extends BaseTest{
  

	  @Test
	@Parameters({"node","browser"})
		
	public void launchbrowres(String node,String browser) throws MalformedURLException {
	
		    URL whichsystem = new URL(node);
			DesiredCapabilities  whichbrowser = new DesiredCapabilities();
			
	        whichbrowser.setBrowserName(browser);
	        whichbrowser.setPlatform(Platform.XP);
	        WebDriver driver = new RemoteWebDriver(whichsystem,whichbrowser);
	      //  driver.get("http://localhost:8080/crm/HomePage.do");
  }
}
