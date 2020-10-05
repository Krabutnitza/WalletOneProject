package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static SelenideElement transactions = $(By.xpath("(//div[text()='ֿונוגמהû'])[1]"));
    public static SelenideElement changeTab = $(By.xpath("//div[text()='־בלום']"));
}
