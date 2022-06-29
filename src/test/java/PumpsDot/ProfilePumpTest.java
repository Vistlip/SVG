package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ProfilePumpTest {
    String PumpId = "#\\36 4728";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса в профиль работа")
    public void checkProfilePumpWork() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(0)
                .checkPump("#motor", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса в профиль авария")
    public void checkProfilePumpAlarm() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса в профиль предупреждение")
    public void checkProfilePumpWarning() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса в профиль поток")
    public void checkProfilePumpStream() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(2)
                .checkPump("#pump", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    public void checkProfilePumpStreamColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(0)
                .inputColor(0, "GREEN")
                .clickSaveColor(0)
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    public void checkProfilePumpStreamColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", color.getSRGBRed());
    }


    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    public void checkProfilePumpStopColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getSRGBYellow());
    }


    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    public void checkProfilePumpSupportColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(3)
                .inputColor(3, "Pink")
                .clickSaveColor(3)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    public void checkProfilePumpFlangesColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    public void checkProfilePumpStartedColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(8)
                .inputColor(8, "Orange")
                .clickSaveColor(8)
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", color.getSRGBOrange());
    }

}
