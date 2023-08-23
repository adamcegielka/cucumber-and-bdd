package junit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void correctCredentialsTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3);
    }

    @Test
    public void incorrectCredentialsTest() {}
}
