package Page.Pumps;

import Page.Urls;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

public class PumpsDirectPage {
    public static final String URL = Urls.PumpsDirectURL;
    @FindBy(how = How.XPATH, using = ".//ms-checkbox")
    private ElementsCollection checkboxes;
    @FindBy(how = How.ID, using = "65194")
    private SelenideElement combobox;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;

    public PumpsDirectPage clickCheckbox(int number) {
        this.checkboxes.get(number).click();
        return this;
    }

    public PumpsDirectPage clickAlarm() {
        this.combobox.click();
        return this;
    }

    public PumpsDirectPage clickButtonColor(int elementNum) {
        this.colorButtons.get(elementNum).click();
        return this;
    }

    //Ввод цветового значения
    public PumpsDirectPage inputColor(int elementNum, String color) {
        this.inputColor.get(elementNum).setValue(color);
        return this;
    }

    public PumpsDirectPage clickSaveColor(int elementNum) {
        this.saveBackgroundColorButton.get(elementNum).click();
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

    public PumpsDirectPage checkPump(String target, String shadowsHost, String attributeName, String attributeValue) {
        SelenideElement path = $(shadowCss(target, shadowsHost));
        path.shouldHave(Condition.attribute(attributeName, attributeValue));
        return this;
    }

}
