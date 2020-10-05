package stepDefs;

import locators.GooglePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePageSteps {

    public void searchInGoogle(String query){
        GooglePage.searchField.setValue(query).pressEnter();
    }

    public void clickLinkedText(String linkedText) {
        $(By.partialLinkText(linkedText)).click();
    }
}
