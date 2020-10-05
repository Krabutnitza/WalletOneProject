package helpers;

import org.openqa.selenium.By;

public class PageHelpers {
    public void compareText(By locator, String text) {
        locator.equals(text);
    }
}
