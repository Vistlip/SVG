package Page.Pumps;

import Page.Urls;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class PumpsLinePiecePage {
    public static final String URL = Urls.PumpsLinePieceURL;
    @FindBy(how = How.XPATH, using = ".//ms-checkbox")
    private ElementsCollection checkboxes;
    @FindBy(how = How.ID, using = "547534")
    private SelenideElement combobox;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;

    public PumpsLinePiecePage clickCheckbox(int number) {
        this.checkboxes.get(number).click();
        return this;
    }

    public PumpsLinePiecePage clickAlarm() {
        this.combobox.click();
        return this;
    }

    public PumpsLinePiecePage clickIncrStreamOn() {
        $(shadowCss("#incr", "#\\35 47713")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrStreamOff() {
        $(shadowCss("#incr", "#\\35 47777")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrSpinOn() {
        $(shadowCss("#incr", "#\\35 47745")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrSpinOff() {
        $(shadowCss("#incr", "#\\35 47729")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrHoop() {
        $(shadowCss("#incr", "#\\35 47809")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrSupport() {
        $(shadowCss("#incr", "#\\35 47793")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrFlanges() {
        $(shadowCss("#incr", "#\\35 47761")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrOutput() {
        $(shadowCss("#incr", "#\\35 47873")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrStarted() {
        $(shadowCss("#incr", "#\\35 47825")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrWork() {
        $(shadowCss("#incr", "#\\35 47841")).click();
        return this;
    }

    public PumpsLinePiecePage clickIncrGear() {
        $(shadowCss("#incr", "#\\35 47857")).click();
        return this;
    }

    public PumpsLinePiecePage inputWarning() {
        actions().moveToElement(combobox).sendKeys("Warning").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsLinePiecePage inputAlarm() {
        actions().moveToElement(combobox).sendKeys("Alarm").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsLinePiecePage checkPump(String target, String shadowsHost, String attributeName, String attributeValue) {
        SelenideElement path = $(shadowCss(target, shadowsHost));
        path.shouldHave(Condition.attribute(attributeName, attributeValue));
        return this;
    }
}
