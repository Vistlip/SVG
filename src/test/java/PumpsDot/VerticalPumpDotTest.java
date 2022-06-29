package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDotPage;
import Page.PumpsDotPage;
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
                .checkPump("#StartedFlow", PumpId, "stop-color", "RED");
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
                .checkPump("#StoppedFlow", PumpId, "stop-color", "rgb(113,0,255)");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "AQUA");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", "rgb(255,0,188)");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "YELLOW");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(255,156,0)");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(0,156,255)");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpHoopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#path3561", PumpId, "style", "fill: navy;");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkVerticalPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrHoop()
                .checkPump("#path3561", PumpId, "style", "fill: seagreen;");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.647058823529412 0 0 0 0 0 0.164705882352941 0 0 0 0 0 0.164705882352941 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkVerticalPumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.184313725490196 0 0 0 0 0 0.309803921568627 0 0 0 0 0 0.309803921568627 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkVerticalPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.529411764705882 0 0 0 0 0 0.807843137254902 0 0 0 0 0 0.980392156862745 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpOutputColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "1 0 0 0 0 0 0.388235294117647 0 0 0 0 0 0.27843137254902 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Второе значение")
    public void checkVerticalPumpOutputColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ");
    }

}
