package PageObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private final WebDriver driver;
    private final By inputRegistrationFieldName = By.xpath(".//*[text()='Имя']/../*[@type='text']");
    private final By inputRegistrationFieldEmail = By.xpath("//*[text()='Email']/../*[@type='text']");
    private final By inputRegistrationFieldPassword = By.xpath(".//*[@type='password']");
    private final By buttonRegistration = By.xpath(".//*[text()='Зарегистрироваться']");
    private final By buttonEnterOnRegistrationPage = By.className("Auth_link__1fOlj");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Registration")
    public void registration(String name, String email, String password) {
        driver.findElement(inputRegistrationFieldName).sendKeys(name);
        driver.findElement(inputRegistrationFieldEmail).sendKeys(email);
        driver.findElement(inputRegistrationFieldPassword).sendKeys(password);
        driver.findElement(buttonRegistration).click();
    }
    @Step("Go to login page")
    public void clickButtonEnter() {
        driver.findElement(buttonEnterOnRegistrationPage).click();
    }
}
