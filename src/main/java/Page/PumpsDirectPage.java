package Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

public class PumpsDirectPage {
    public static final String URL = Urls.PumpsDirectURL;
    @FindBy(how = How.XPATH, using = ".//ms-checkbox")
    private ElementsCollection checkboxes;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.ID, using = "65194")
    private SelenideElement combobox;

    public PumpsDirectPage clickCheckboxWork() {
        this.checkboxes.get(0).click();
        return this;
    }

    public PumpsDirectPage clickCheckboxStream() {
        this.checkboxes.get(2).click();
        return this;
    }

    public PumpsDirectPage clickCheckboxSpin() {
        this.checkboxes.get(1).click();
        return this;
    }

    public PumpsDirectPage clickAlarm() {
        this.combobox.click();
        return this;
    }

    public PumpsDirectPage inputWarning() {
        actions().moveToElement(combobox).sendKeys("Warning").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsDirectPage inputAlarm() {
        actions().moveToElement(combobox).sendKeys("Alarm").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsDirectPage checkVerticalPumpWork() {
        SelenideElement path = $(shadowCss("#path3557", "#\\36 4692"));
        path.shouldHave(Condition.attribute("class", "Started"));
        return this;
    }

    public PumpsDirectPage checkVerticalPumpAlarm(String attribute) {
        SelenideElement path = $(shadowCss("#AvaryBorder", "#\\36 4692"));
        path.shouldHave(Condition.attribute("class", attribute));
        return this;
    }

}
