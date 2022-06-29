package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GearPumpHorizontalTest {
    String PumpId = "#\\35 44560";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса работа")
    public void checkGearPumpWork() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(0)
                .checkPump("#Work", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса авария")
    public void checkGearPumpAlarm() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса предупреждение")
    public void checkGearPumpWarning() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса поток")
    public void checkGearPumpStream() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(2)
                .checkPump("#Flow", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса вращение")
    public void checkGearPumpSpin() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет потока вкл")
    public void checkGearPumpStreamColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(0)
                .inputColor(0, "GREEN")
                .clickSaveColor(0)
                .checkPump("#Flowfilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет потока выкл")
    public void checkGearPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBRed());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет вращения вкл")
    public void checkGearPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(6)
                .inputColor(6, "BLUE")
                .clickSaveColor(6)
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет вращения выкл")
    public void checkGearPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#NWorkfilter", PumpId, "values", color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет обода")
    public void checkGearPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(1)
                .inputColor(1, "Indigo")
                .clickSaveColor(1)
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет фланца")
    public void checkGearPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет выключенного")
    public void checkGearPumpColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(10)
                .inputColor(10, "Olive")
                .clickSaveColor(10)
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBOlive());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет включенного")
    public void checkGearPumpColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickButtonColor(9)
                .inputColor(9, "Maroon")
                .clickSaveColor(9)
                .checkPump("#Workfilter", PumpId, "values", color.getSRGBMaroon());
    }
}
