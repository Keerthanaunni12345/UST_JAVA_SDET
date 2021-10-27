import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.ous.jtoml.ParseException;

public class Sample12 {
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb419\\Downloads\\chromedriver_win32\\chromedriver.exe");			
	     wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List  col = (List) wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        java.util.List<WebElement> col3 = (java.util.List<WebElement>) col;
		java.util.List<WebElement> col2 = col3;
		java.util.List<WebElement> list = col2;
		System.out.println("No of cols are : " +list.size()); 
        //No.of rows 
        List  rows = (List) wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        java.util.List<WebElement> list2 = (java.util.List<WebElement>) rows;
		System.out.println("No of rows are : " + list2.size());
        wd.close();
    }
}



