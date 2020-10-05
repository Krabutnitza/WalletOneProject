package Test;

import com.codeborne.selenide.WebDriverRunner;
import helpers.TabsHelper;
import locators.ChangePage;
import locators.MainPage;
import locators.TransfersPage;
import org.junit.After;
import org.junit.Test;
import stepDefs.GooglePageSteps;
import stepDefs.LoginPageSteps;
import stepDefs.MainPageSteps;
import stepDefs.TransfersPageSteps;

import static com.codeborne.selenide.Selenide.*;

public class WalletOneTest {
    @After
    public void afterTest() {
        WebDriverRunner.getWebDriver().quit();
    }

    MainPageSteps mainPageSteps = new MainPageSteps();

    public void goToSite(){
        open("https://www.google.com/");
        GooglePageSteps googleSteps = new GooglePageSteps();
        googleSteps.searchInGoogle("walletone сайт");
        googleSteps.clickLinkedText("Единый кошелек - Единая касса");
        new TabsHelper().goToLastTab();
    }

    public void enterInSystem() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("9818291066","34267");
    }

    @Test
    public void checkAlert() {
        goToSite();
        enterInSystem();
        mainPageSteps.goToTab(MainPage.changeTab);
        ChangePage.alert.isDisplayed();
    }

    @Test
    public void findTransaction() {
        goToSite();
        enterInSystem();
        mainPageSteps.goToTab(MainPage.transactions);
        new TransfersPageSteps().findTransfer(TransfersPage.transactionsMethod, "Выберите способ перевода");
    }
}
