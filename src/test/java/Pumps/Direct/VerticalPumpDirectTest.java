package Pumps.Direct;

import Color.ColorCollection;
import Page.Pumps.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class VerticalPumpDirectTest {
    String PumpId = "#\\36 4692";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка вертикального насоса работа")
    public void checkVerticalPumpWork() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(0)
                .checkPump("#path3557", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка вертикального насоса авария")
    public void checkVerticalPumpAlarm() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка вертикального насоса предупреждение")
    public void checkVerticalPumpWarning() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка вертикального насоса поток")
    public void checkVerticalPumpStream() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(2)
                .checkPump("#path3499", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка вертикального насоса вращение")
    public void checkVerticalPumpSpin() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    public void checkVerticalPumpStreamColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(0)
                .inputColor(0, "GREEN")
                .clickSaveColor(0)
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getRGBaGreen());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    public void checkVerticalPumpStreamColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(4)
                .inputColor(4, "RED")
                .clickSaveColor(4)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getRGBaRed());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    public void checkVerticalPumpSpinColorOn() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(6)
                .inputColor(6, "BLUE")
                .clickSaveColor(6)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getRGBaBLUE());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    public void checkVerticalPumpSpinColorOff() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(2)
                .inputColor(2, "YELLOW")
                .clickSaveColor(2)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getRGBaYellow());

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    public void checkVerticalPumpHoopColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(1)
                .inputColor(1, "Indigo")
                .clickSaveColor(1)
                .checkPump("#path3561", PumpId, "style", "fill: rgb(76, 1, 130);");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    public void checkVerticalPumpSupportColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(3)
                .inputColor(3, "Pink")
                .clickSaveColor(3)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "1.00 0 0 0 0 0 0.76 0 0 0 0 0 0.80 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    public void checkVerticalPumpFlangesColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(5)
                .inputColor(5, "Black")
                .clickSaveColor(5)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.00 0 0 0 0 0 0.00 0 0 0 0 0 0.00 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    public void checkVerticalPumpOutputColor() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(7)
                .inputColor(7, "Aqua")
                .clickSaveColor(7)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.00 0 0 0 0 0 1.00 0 0 0 0 0 1.00 0 0 0 0 0 1 0");
    }
}
