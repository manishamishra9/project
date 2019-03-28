package Scripts;

import org.testng.annotations.Test;

import generic1.BaseTest;
import generic1.Library;
import pompage.loginfacebook;

public class invalidlogiin extends BaseTest{
  @Test
  public void invalidLogin() throws InterruptedException {
	  loginfacebook lg = new loginfacebook(driver);
	  int rowcount = Library.rowcount("invalidvalue");
	  System.out.println(rowcount);
	  for(int i=0;i<rowcount;i++) {
		  String excel2 = Library.excel("invalidvalue",i ,0 );
		  String excel3 = Library.excel("invalidvalue",i ,1 );
		  
		  lg.setUsername(excel2);
		  lg.setPassword(excel3);
		  lg.login();
		  Thread.sleep(3000);
	  }
	  
  }
}
