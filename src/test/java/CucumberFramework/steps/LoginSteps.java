package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Before()
	public void setup() {
		                                             
	    //System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"/src/test/java/CucumberFramework/resources/geckodriver"); //THIS WILL WORK TOO - MAKE SURE YOU PUT YOUR GECKO AND CHROMEDRIVER IN PROJECT PATH
		 System.setProperty("webdriver.gecko.driver","/Users/sandeepgangireddy/Desktop/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/geckodriver");
		//System.setProperty("webdriver.chrome.driver","/Users/sandeepgangireddy/Desktop/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/chromedriver");
		//sample commit for GIT  
		//this.driver = new ChromeDriver();
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}

	@Given("^User navigate to stackoverflow website$")
	public void user_navigate_to_stackoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
	
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		System.out.println("user_clicks_on_the_login_button_on_homepage");
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		
		
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
		username.clear();
		username.sendKeys("reddydeep_79@yahoo.co.in");
		Thread.sleep(3000);
	}

	@Given("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("Chikku123");
		Thread.sleep(3000);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@name='submit-button']")).click();
		
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
		Assert.assertEquals(true,  askQuestionButton.isDisplayed());
		
	}
	
	@Then("^Title of the page is correct$")
	public void Title_of_the_page_is_correct() throws Throwable {
		Thread.sleep(3000);
		String Title = driver.getTitle();
		Assert.assertEquals(Title,"Stack Overflow - Where Developers Learn, Share, & Build Careers");
		
		
	}

	@Given("^user enters an invalid password$")
	public void user_enters_an_invalid_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("Chikku12");
		Thread.sleep(3000);
	
	}
	
	@Then("^User is shown the error message for Incorrect Login$")
	public void user_is_shown_the_error_message_for_Incorrect_Login() throws Throwable {
		Thread.sleep(6000);
		WebElement message_Text = driver.findElement(By.xpath("//div[@class='message-text'][contains(.,'The email or password is incorrect.')]"));
		Assert.assertEquals(true,  message_Text.isDisplayed());
		System.out.println("Test");
		//a[contains(.,'Ask Question')]
	}
	
	@After()
	public void tearDown() {
		driver.quit();
		
	}

}
