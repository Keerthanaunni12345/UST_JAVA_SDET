package TestNGpractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Group {
	WebDriver d;
	@BeforeTest
	public void checkWebsite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb419\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
	}
	
	@Test(priority=1)
	  public void verifyPageTitleTest() {
		String title = d.getTitle();
		System.out.println("The page title is: "+ title);
		  Assert.assertEquals(title,"Register: Mercury Tours");
		  
	  }
	@Test(priority=2)
	public void details() {
		d.findElement(By.name("firstName")).sendKeys("Naveen");
		d.findElement(By.name("lastName")).sendKeys("K");
		d.findElement(By.name("phone")).sendKeys("8079683120");
		d.findElement(By.name("userName")).sendKeys("naveenktest@123.com");
		d.findElement(By.name("address1")).sendKeys("abcdefg");
		d.findElement(By.name("city")).sendKeys("Kochi");
		d.findElement(By.name("state")).sendKeys("Kerala");
		d.findElement(By.name("postalCode")).sendKeys("680555");
	}
		@Test(priority=3)
		public void dropdown() {
		Select dropdown = new Select(d.findElement(By.name("country")));  
		dropdown.selectByVisibleText("INDIA");
	}
		@Test(priority=4)
		public void image() {
			boolean flag= d.findElement(By.xpath("//img[@src='/logo.png']")).isDisplayed();
			Assert.assertTrue(flag);
		}
		@Test(priority=5)
		public void image1() {
			boolean flag= d.findElement(By.xpath("//img[@src='images/logo.gif']")).isDisplayed();
			Assert.assertTrue(flag);
			
		}
		@Test(priority=6)
		public void image2() {
			boolean flag= d.findElement(By.xpath("//img[@src='images/html.gif']")).isDisplayed();
			Assert.assertTrue(flag);
			
		}
	@Test(priority=7)
	public void login() {
		d.findElement(By.name("email")).sendKeys("naveenk");
		d.findElement(By.name("password")).sendKeys("test@123");
		d.findElement(By.name("confirmPassword")).sendKeys("test@123");
	}
		@Test(priority=8)
		//submit button:
		public void submit() {
		WebElement submitBtn = d.findElement(By.xpath("//input[@name='submit']"));
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", submitBtn);

	}
		@Test(priority=9)
		//submit button:
		public void signon() {
		WebElement signonBtn = d.findElement(By.xpath("//a[@href='login.php']"));
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", signonBtn);
	
	}
		@Test(priority=10)
		public void teardown() {
			d.quit();
		}
}

