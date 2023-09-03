import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePage;
import java.util.concurrent.TimeUnit;

public class HomePageTests{
    private WebDriver driver;
    private HomePage homePage;

    @Before
    @Step("Open site")
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }
    @Test
    @Step("Click section buns")
    @DisplayName("Testing sections constructor - buns")
    public void clickBunSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection();//клик на другую вкладку
        homePage.clickBunSauces();
        homePage.activityCheckCurrentBunSection();
    }
    @Test
    @Step("Click section sauces")
    @DisplayName("Testing sections constructor - sauces")
    public void clickSaucesSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection();
        homePage.activityCheckCurrentSauceSection();
    }
    @Test
    @Step("Click section stuffing")
    @DisplayName("Testing sections constructor - stuffing")
    public void clickStuffingSection() {
        homePage = new HomePage(driver);
        homePage.clickStuffingSection();
        homePage.activityCheckStuffingBunSection();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
