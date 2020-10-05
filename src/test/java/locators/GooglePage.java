package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public static SelenideElement searchField = $(By.xpath("//input[@name='q']"));
}
