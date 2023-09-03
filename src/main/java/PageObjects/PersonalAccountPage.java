package PageObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {
    private final WebDriver driver;
    private final By buttonLogOutOfAccount = By.xpath(".//button[text()='Выход']");
    private final By headerConstructor = By.xpath(".//p[text()='Конструктор']");
    private final By logo = By.xpath(".//a[@href='/']");
    private final By textAssembleBurger = By.xpath(".//h1[text()='Соберите бургер']");

    public PersonalAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Click logout")
    public void clickButtonGetOutOfAccount(){
        driver.findElement(buttonLogOutOfAccount).click();
    }
    @Step("Click header constructor")
    public void clickHeaderConstructor() {
        driver.findElement(headerConstructor).click();
    }
    @Step("Click logo")
    public void clickLogo() {
        driver.findElement(logo).click();
    }
    public boolean isDisplayedTextAssembleBurger() {
        driver.findElement(textAssembleBurger).isDisplayed();
        return true;
    }
}
