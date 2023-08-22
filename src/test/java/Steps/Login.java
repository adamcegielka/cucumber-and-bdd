package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Step 1");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @When("User enters a valid username")
    public void user_enters_a_valid_username() {
        System.out.println("Step 2");
    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
        System.out.println("Step 3");
    }
    @When("User clicks Login button")
    public void user_clicks_login_button() {
        System.out.println("Step 4");
    }
    @Then("User has successfully logged in")
    public void user_has_successfully_logged_in() {
        System.out.println("Step 5");
    }
}
