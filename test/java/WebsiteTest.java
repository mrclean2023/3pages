import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class WebsiteTest {

    @Test
    public void testHomePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/index.html");

        // Check if the Home link is present
        assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
        driver.quit();
    }

    @Test
    public void testAboutPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/about.html");

        // Check if the About link is present
        assertTrue(driver.findElement(By.linkText("About")).isDisplayed());
        driver.quit();
    }

    @Test
    public void testContactPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/contact.html");

        // Check if the Contact link is present
        assertTrue(driver.findElement(By.linkText("Contact")).isDisplayed());
        driver.quit();
    }
}
