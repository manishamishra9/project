package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic1.BaseTest;

public class loginfacebook extends BaseTest {
	@FindBy(xpath="//input[@type='email']")
	
	WebElement un;
	@FindBy(xpath="(//input[@type='password'])[1] ")
	WebElement pwd;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginbutn;
	public loginfacebook(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	public  void setUsername(String u){
		un.sendKeys(u);
		}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
		}
	public void login(){
		loginbutn.click();
		}
	}
    


