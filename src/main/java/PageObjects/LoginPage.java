package PageObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By inputLoginFieldEmail = By.xpath(".//input[@type='text' and @name='name']");
    private final By inputLoginFieldPassword = By.xpath(".//input[@type='password']");
    private final By buttonEnterOnLoginPage = By.xpath(".//button[text()='Войти']");
    private final By textEnter = By.xpath(".//h2[text()='Вход']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Login")
    public void login(String email, String password) {
        driver.findElement(inputLoginFieldEmail).sendKeys(email);
        driver.findElement(inputLoginFieldPassword).sendKeys(password);
        driver.findElement(buttonEnterOnLoginPage).click();
    }
    @Step("Search text \"Enter\"")
    public boolean isDisplayedTextEnter() {
        driver.findElement(textEnter).isDisplayed();
        return true;
    }
}
