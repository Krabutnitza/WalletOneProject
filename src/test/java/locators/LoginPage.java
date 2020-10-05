package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static SelenideElement loginButton = $(By.xpath("//a[text()='�����']"));
    public static SelenideElement login = $(By.xpath("(//input[@placeholder='����� �������� ��� ����������� �����'])[1]"));
    public static SelenideElement password = $(By.xpath("//input[@placeholder='������']"));
    public static SelenideElement openWallet = $(By.xpath("//span[text()='������� �������']"));
}
