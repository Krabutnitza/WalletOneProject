package stepDefs;

import helpers.PageHelpers;
import org.openqa.selenium.By;

public class TransfersPageSteps {
    public void findTransfer(By locator, String text) {
        new PageHelpers().compareText(locator, text);
    }
}
