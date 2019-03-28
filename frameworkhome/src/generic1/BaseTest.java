package generic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoInterface {
	static{
	System.setProperty(CHROMEKEY,CHROMEVALUE);
	}
	public static WebDriver driver;
     @BeforeMethod
      public static void openApplication(){
       driver = new ChromeDriver();
      driver.get(Library.property("url"));
      String max = Library.property("MAX");
      int maxint = Integer.parseInt(max);
      
      driver.manage().timeouts().implicitlyWait(maxint,TimeUnit.SECONDS);
      }@AfterMethod
      public static void closeappliacation(ITestResult result) {
    	  System.out.println(result.getStatus());
  		System.out.println(result.getTestName());
  		System.out.println(result.getName());
  		
    	  testlistner ts = new testlistner();
    	  if(ITestResult.FAILURE==result.getStatus()) {
    	  ts.onTestFailure( result);}
     // driver.close();
      }
}
