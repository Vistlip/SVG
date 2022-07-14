package Pumps.Direct;

import Color.ColorCollection;
import Page.Pumps.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ProfilePumpDirectTest {
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
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", "0.00 0 0 0 0 0 0.50 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    public void checkProfilePumpStreamColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", "1.00 0 0 0 0 0 0.00 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }


    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    public void checkProfilePumpStopColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", "1.00 0 0 0 0 0 1.00 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }


    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    public void checkProfilePumpSupportColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(3)
                .inputColor(3, "Pink")
                .clickSaveColor(3)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "1.00 0 0 0 0 0 0.76 0 0 0 0 0 0.80 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    public void checkProfilePumpFlangesColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.00 0 0 0 0 0 0.00 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    public void checkProfilePumpStartedColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(8)
                .inputColor(8, "Orange")
                .clickSaveColor(8)
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", "1.00 0 0 0 0 0 0.65 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }

}
