package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.containsString;

public class HomePage {
    private final WebDriver driver;
    private final By buttonPersonalAccount = By.xpath(".//p[text()='Личный Кабинет']");
    private final By bunSection = By.xpath(".//span[text()='Булки']");
    private final By saucesSection = By.xpath(".//span[text()='Соусы']");
    private final By stuffingSection = By.xpath(".//span[text()='Начинки']");
    private final By checkoutButton = By.xpath(".//button[text()='Оформить заказ']");
    private final By bunSectionCurrent = By.xpath(".//div[@style]/div[1]");
    private final By sauceSectionCurrent = By.xpath(".//div[@style]/div[2]");
    private final By stuffingSectionCurrent = By.xpath(".//div[@style]/div[3]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonPersonalAccount() {
        driver.findElement(buttonPersonalAccount).click();
    }
    public void clickBunSauces() {
        driver.findElement(bunSection).click();
    }
    public void clickSaucesSection() {
        driver.findElement(saucesSection).click();
    }
    public void clickStuffingSection() {
        driver.findElement(stuffingSection).click();
    }
    public boolean isDisplayedCheckoutButton() {
        driver.findElement(checkoutButton).isDisplayed();
        return true;
    }
    public void activityCheckCurrentBunSection() {
        String text = driver.findElement(bunSectionCurrent).getAttribute("class");
        MatcherAssert.assertThat(text, containsString("current"));
    }
    public void activityCheckCurrentSauceSection() {
        String text = driver.findElement(sauceSectionCurrent).getAttribute("class");
        MatcherAssert.assertThat(text, containsString("current"));
    }
    public void activityCheckStuffingBunSection() {
        String text = driver.findElement(stuffingSectionCurrent).getAttribute("class");
        MatcherAssert.assertThat(text, containsString("current"));
    }
}
