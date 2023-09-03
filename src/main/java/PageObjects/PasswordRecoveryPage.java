package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
    private final WebDriver driver;
    private final By buttonEnterPasswordRecoveryPage = By.className("Auth_link__1fOlj");

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickEnterPasswordRecoveryPage() {
        driver.findElement(buttonEnterPasswordRecoveryPage).click();
    }
}
