package Pumps.Dot;

import Color.ColorCollection;
import Page.Pumps.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class VerticalPumpDotTest {
    String PumpId = "#\\35 44560";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка вертикального насоса работа")
    public void checkVerticalPumpWork() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(0)
                .checkPump("#path3557", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка вертикального насоса авария")
    public void checkVerticalPumpAlarm() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка вертикального насоса предупреждение")
    public void checkVerticalPumpWarning() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка вертикального насоса поток")
    public void checkVerticalPumpStream() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(2)
                .checkPump("#path3499", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка вертикального насоса вращение")
    public void checkVerticalPumpSpin() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpStreamColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "BLUE");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpStreamColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "RED");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "GREEN");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getBlack());

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "YELLOW");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpHoopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#path3561", PumpId, "style", color.getRGBaFillBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkVerticalPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrHoop()
                .checkPump("#path3561", PumpId, "style", color.getRGBaFillAqua());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkVerticalPumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkVerticalPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpOutputColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Второе значение")
    public void checkVerticalPumpOutputColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBOrange());
    }

}
