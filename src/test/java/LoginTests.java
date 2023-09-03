import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.*;
import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;
    private LoginPage loginPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    @Step("Open site and login")
    @DisplayName("Login from HomePage")
    public void loginFromHomePage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        loginPage = new LoginPage(driver);
        loginPage.login("lapkakoteka1@ya.ru", "123456");
    }
    @Test
    @Step("Open site and login")
    @DisplayName("Login from PersonalAccountPage")
    public void loginFromPersonalAccountPage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);

        loginPage = new LoginPage(driver);
        loginPage.login("lapkakoteka2@ya.ru", "123456");
    }
    //вход через страницу регистрации
    @Test
    @Step("Open site and login")
    @DisplayName("Login from RegistrationPage")
    public void loginfromRegistrationPage(){
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickButtonEnter();

        loginPage = new LoginPage(driver);
        loginPage.login("lapkakoteka2@ya.ru", "123456");
    }
    @After
    public void tearDown() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayedCheckoutButton());
        driver.quit();
    }
}
