package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.xpath("//*[@id=\"wrap_app\"]/main/div/div[1]/form/div/div[2]/div/div/input");
//    private By passwordField = By.id("password");
//    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
//        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
//        driver.findElement(loginButton).click();
    }
}
