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
		this.driver = new ChromeDriver();
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}

	@Given("^User navigats to stackoverflow website$")
	public void user_navigats_to_stackoverflow_website() throws Throwable {
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
		//a[contains(.,'Ask Question')]
	}

	@Given("^User navigats to stackoverflow website(\\d+)$")
	public void user_navigats_to_stackoverflow_website2(int arg1)
			throws Throwable {
		System.out.println("user_navigats_to_stackoverflow_website2");
	}

	@Given("^User clicks on the login button on homepage(\\d+)$")
	public void user_clicks_on_the_login_button_on_homepage2(int arg1)
			throws Throwable {
		System.out.println("user_clicks_on_the_login_button_on_homepage2");
	}

	@Given("^User enters a valid username(\\d+)$")
	public void user_enters_a_valid_username(int arg1) throws Throwable {
		System.out.println("user_enters_a_valid_username2");
	}

	@Given("^user enters a valid password(\\d+)$")
	public void user_enters_a_valid_password(int arg1) throws Throwable {
		System.out.println("user_enters_a_valid_password2");
	}

	@When("^User clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button2");
	}

	@Then("^User should be taken to the successful login page(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page(int arg1)
			throws Throwable {
		System.out.println("user_should_be_taken_to_the_successful_login_page2");
	}
	@After()
	public void tearDown() {
		driver.quit();
	}

}
