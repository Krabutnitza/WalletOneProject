package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static SelenideElement loginButton = $(By.xpath("//a[text()='Войти']"));
    public static SelenideElement login = $(By.xpath("(//input[@placeholder='Номер телефона или электронная почта'])[1]"));
    public static SelenideElement password = $(By.xpath("//input[@placeholder='Пароль']"));
    public static SelenideElement openWallet = $(By.xpath("//span[text()='Открыть кошелек']"));
}
