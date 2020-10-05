package stepDefs;

import locators.LoginPage;

public class LoginPageSteps {

    public void login(String login, String password) {
        LoginPage.loginButton.click();
        LoginPage.login.sendKeys(login);
        LoginPage.password.sendKeys(password);
        LoginPage.openWallet.click();
    }
}
