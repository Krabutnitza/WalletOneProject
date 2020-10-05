package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChangePage {
    public static SelenideElement alert = $(By.xpath("//div[text()='Невозможно совершить обмен. Недостаточно средств или обмен для имеющихся валют недоступен.']"));
}
