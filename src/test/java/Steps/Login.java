package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Step 1");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @When("User enters a valid username")
    public void user_enters_a_valid_username() {
        System.out.println("Step 2");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
        System.out.println("Step 3");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
    }
    @When("User clicks Login button")
    public void user_clicks_login_button() {
        System.out.println("Step 4");
        driver.findElement(By.tagName("button")).click();
    }
    @Then("User has successfully logged in")
    public void user_has_successfully_logged_in() {
        System.out.println("Step 5");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        driver.close();
    }

    // Incorrect login
    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        System.out.println("Step 3");
        driver.findElement(By.name("password")).sendKeys("incorrectPassword!");
    }
    @Then("User unsuccessfully logged in")
    public void user_unsuccessfully_logged_in() {
        System.out.println("Step 5");
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
        driver.close();
    }
}
