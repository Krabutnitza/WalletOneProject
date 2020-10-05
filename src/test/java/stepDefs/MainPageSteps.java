package stepDefs;

import com.codeborne.selenide.SelenideElement;

public class MainPageSteps {
    public void goToTab(SelenideElement locator) {
        locator.click();
    }
}
