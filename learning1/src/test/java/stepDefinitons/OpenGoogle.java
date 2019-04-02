package stepDefinitons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogle {
	WebDriver driver;
	@Given("^user is entering google\\.com$")
	public void user_is_entering_google_com() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\borajama\\eclipse-workspace\\learning1\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@When("^user clicks the search box$")
	public void user_clicks_the_search_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("gmail");
	}

	@When("^types the search term as \"([^\"]*)\"$")
	public void types_the_search_term_as(String searchTerm) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).submit();
		
	}

	@Then("^the user should see the search results for Agniprasath$")
	public void the_user_should_see_the_search_results_for_Agniprasath() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean resultsCame=driver.findElement(By.partialLinkText("Gmail")).isDisplayed();
		if(true==resultsCame){
			System.out.println("search results came");
		}else{
			System.out.println("Some error");
		}
	}

}