package StepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Step {
	WebDriver d = null;
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb419\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("the user navigates to MercuryTours register page")
	public void the_user_navigates_to_mercury_tours_register_page() {
		d.get("http://demo.guru99.com/test/newtours/register.php");
		d.getTitle().contains("Tours");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the user enters lands on the page")
	public void the_user_enters_lands_on_the_page() {
		d.findElement(By.name("firstName")).sendKeys("Naveen");
		d.findElement(By.name("lastName")).sendKeys("K");
		d.findElement(By.name("phone")).sendKeys("8079683120");
		d.findElement(By.name("userName")).sendKeys("naveenktest@123.com");
		d.findElement(By.name("address1")).sendKeys("abcdefg");
		d.findElement(By.name("city")).sendKeys("Kochi");
		d.findElement(By.name("state")).sendKeys("Kerala");
		d.findElement(By.name("postalCode")).sendKeys("680555");
		Select dropdown = new Select(d.findElement(By.name("country")));  
		dropdown.selectByVisibleText("INDIA");
		boolean flag= d.findElement(By.xpath("//img[@src='/logo.png']")).isDisplayed();
		Assert.assertTrue(flag);
		d.findElement(By.name("email")).sendKeys("naveenk");
		d.findElement(By.name("password")).sendKeys("test@123");
		d.findElement(By.name("confirmPassword")).sendKeys("test@123");
		WebElement submitBtn = d.findElement(By.xpath("//input[@name='submit']"));
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", submitBtn);
		WebElement signonBtn = d.findElement(By.xpath("//a[@href='login.php']"));
		JavascriptExecutor js2= (JavascriptExecutor)d;
		js2.executeScript("arguments[0].click();", signonBtn);
	}
	
	}
