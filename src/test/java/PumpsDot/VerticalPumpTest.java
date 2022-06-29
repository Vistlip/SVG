package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class VerticalPumpTest {
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
}
