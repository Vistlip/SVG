package Pumps.Direct;

import Color.ColorCollection;
import Page.Pumps.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SnailPumpDirectTest {
    String PumpId = "#\\36 4704";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса улитка работа")
    public void checkSnailPumpWork() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(0)
                .checkPump("#path5598", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса улитка авария")
    public void checkSnailPumpAlarm() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса улитка предупреждение")
    public void checkSnailPumpWarning() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса улитка поток")
    public void checkSnailPumpStream() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(2)
                .checkPump("#path5440", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса улитка вращение")
    public void checkSnailPumpSpin() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    public void checkSnailPumpStreamColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(0)
                .inputColor(0, "GREEN")
                .clickSaveColor(0)
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getRGBaGreen());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    public void checkSnailPumpStreamColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getRGBaRed());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    public void checkSnailPumpSpinColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(6)
                .inputColor(6, "BLUE")
                .clickSaveColor(6)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getRGBaBLUE());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    public void checkSnailPumpSpinColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getRGBaYellow());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    public void checkSnailPumpHoopColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(1)
                .inputColor(1, "Indigo")
                .clickSaveColor(1)
                .checkPump("#path5604", PumpId, "style", color.getRGBaFillIndigo());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    public void checkSnailPumpSupportColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(3)
                .inputColor(3, "Pink")
                .clickSaveColor(3)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    public void checkSnailPumpFlangesColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    public void checkSnailPumpOutputColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(7)
                .inputColor(7, "Aqua")
                .clickSaveColor(7)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBAqua());
    }
}
