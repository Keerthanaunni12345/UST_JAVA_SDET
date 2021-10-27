package TestNGpractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class NewTestClass {
	WebDriver d;
	@BeforeTest
	public void checkWebsite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb419\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.navigate().to("https://www.google.com/");
	}
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("Mlampuzha");
  }
}
