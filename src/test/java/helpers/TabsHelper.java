package helpers;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.switchTo;

public class TabsHelper {
    public void goToLastTab() {
        switchTo().window((WebDriverRunner.getWebDriver().getWindowHandles()).size()-1);
    }
}
