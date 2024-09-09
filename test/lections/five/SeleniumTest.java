package lections.five;


import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public SeleniumTest() {
    }
    @Test
    public void testGoogleSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(new CharSequence[]{"Selenium"});
        searchBox.submit();
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div.g"));
        boolean isFound = false;
        Iterator var5 = searchResults.iterator();

        while(var5.hasNext()) {
            WebElement webElement = (WebElement)var5.next();
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        Assertions.assertTrue(isFound);
        driver.quit();
    }

    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys(new CharSequence[]{"standard_user"});
        passwordField.sendKeys(new CharSequence[]{"secret_sauce"});
        loginButton.click();
        WebElement productsLabel = driver.findElement(By.className("title"));
        Assertions.assertEquals("Products", productsLabel.getText());
        driver.quit();
    }
}
