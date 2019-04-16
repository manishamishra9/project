import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Desktop\\javaselenium\\Selenium\\driver\\chromedriver.exe");
		 wd= new ChromeDriver();
		  wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        wd.get("https://opensource-demo.orangehrmlive.com/");  
	        Workbook sheet = WorkbookFactory.create(new FileInputStream("C:\\Users\\Home\\git\\project\\frameworkhome\\testdata\\New Microsoft Office Excel Worksheet.xlsx"));
	        int lastRowNum = sheet.getSheet("valid").getLastRowNum();
	        for(int i=0;i<lastRowNum;i++) {
	       String un = sheet.getSheet("valid").getRow(i).getCell(0).toString();
	       String pwd = sheet.getSheet("valid").getRow(i).getCell(1).toString();
	        wd.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("un");
	        wd.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("pwd");
	        wd.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
         }

	  }
   }

