package Pumps.Direct;

import Color.ColorCollection;
import Page.Pumps.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GearPumpHorizontalDirectTest {
    String PumpId = "#\\36 4752";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса работа")
    public void checkGearPumpWork() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(0)
                .checkPump("#Work", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса авария")
    public void checkGearPumpAlarm() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса предупреждение")
    public void checkGearPumpWarning() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса поток")
    public void checkGearPumpStream() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(2)
                .checkPump("#Flow", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса вращение")
    public void checkGearPumpSpin() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет потока вкл")
    public void checkGearPumpStreamColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(0)
                .inputColor(0, "GREEN")
                .clickSaveColor(0)
                .checkPump("#Flowfilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет потока выкл")
    public void checkGearPumpStreamColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBRed());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет вращения вкл")
    public void checkGearPumpSpinColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(6)
                .inputColor(6, "BLUE")
                .clickSaveColor(6)
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет вращения выкл")
    public void checkGearPumpSpinColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#NWorkfilter", PumpId, "values", color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет обода")
    public void checkGearPumpHoopColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(1)
                .inputColor(1, "Indigo")
                .clickSaveColor(1)
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет фланца")
    public void checkGearPumpFlangesColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет выключенного")
    public void checkGearPumpColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(10)
                .inputColor(10, "Olive")
                .clickSaveColor(10)
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBOlive());
    }

    @Test
    @DisplayName("Проверка шестеренчетого горизонтального насоса цвет включенного")
    public void checkGearPumpColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(9)
                .inputColor(9, "Maroon")
                .clickSaveColor(9)
                .checkPump("#Workfilter", PumpId, "values", color.getSRGBMaroon());
    }
}
