package Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class PumpsDotPage {
    public static final String URL = Urls.PumpsDotURL;
    @FindBy(how = How.XPATH, using = ".//ms-checkbox")
    private ElementsCollection checkboxes;
    @FindBy(how = How.ID, using = "545008")
    private SelenideElement combobox;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;

    public PumpsDotPage clickCheckbox(int number) {
        this.checkboxes.get(number).click();
        return this;
    }

    public PumpsDotPage clickAlarm() {
        this.combobox.click();
        return this;
    }



    public PumpsDotPage inputWarning() {
        actions().moveToElement(combobox).sendKeys("Warning").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsDotPage inputAlarm() {
        actions().moveToElement(combobox).sendKeys("Alarm").perform();
        actions().moveToElement(combobox).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PumpsDotPage checkPump(String target, String shadowsHost, String attributeName, String attributeValue) {
        SelenideElement path = $(shadowCss(target, shadowsHost));
        path.shouldHave(Condition.attribute(attributeName, attributeValue));
        return this;
    }
}
