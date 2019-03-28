package generic1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Library implements IAutoInterface{
	
	public static String excel(String sheet,int row,int cell) {
		String data = null;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(EXCEL));
			 data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		} catch (Exception e) {}
	
	
    return data;}
	
	public static String property(String propertyvalue){
		String property = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(PROPERTIES));
			  property = prop.getProperty(propertyvalue);
		} catch (Exception e) {
			
	}
            //String property = prop.getProperty(propertyvalue);
            return property;
}
	public static int rowcount(String sheet) {
		int data=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(EXCEL));
			 data = wb.getSheet(sheet).getLastRowNum();
			
		} catch (Exception e) {}
		return data;
		
	}
    public static void screenshot(WebDriver driver) {
    TakesScreenshot ts= (TakesScreenshot)driver;
    File srcfile = ts.getScreenshotAs(OutputType.FILE);
    File DESFIL = new File(SCREENSHOT);
    try {
		Files.copy(srcfile, DESFIL);
	} catch (Exception e) {
		
	}

}

}


