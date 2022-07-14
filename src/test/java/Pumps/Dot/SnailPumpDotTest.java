package Pumps.Dot;

import Color.ColorCollection;
import Page.Pumps.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SnailPumpDotTest {
    String PumpId = "#\\35 44587";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса улитка работа")
    public void checkSnailPumpWork() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(0)
                .checkPump("#path5598", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса улитка авария")
    public void checkSnailPumpAlarm() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса улитка предупреждение")
    public void checkSnailPumpWarning() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса улитка поток")
    public void checkSnailPumpStream() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(2)
                .checkPump("#path5440", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса улитка вращение")
    public void checkSnailPumpSpin() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpStreamColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "BLUE");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpStreamColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "RED");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "GREEN");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Второе значение")
    public void checkSnailPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "YELLOW");

    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Значение по умолчанию")
    public void checkSnailPumpHoopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#path5604", PumpId, "style", color.getRGBaFillBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Второе значение")
    public void checkSnailPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrHoop()
                .checkPump("#path5604", PumpId, "style", color.getRGBaFillAqua());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Второе значение")
    public void checkSnailPumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Значение по умолчанию")
    public void checkSnailPumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Второе значение")
    public void checkSnailPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSnailPumpOutputColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Второе значение")
    public void checkSnailPumpOutputColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBOrange());
    }
}
