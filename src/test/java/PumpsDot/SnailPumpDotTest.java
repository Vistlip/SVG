package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDotPage;
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
                .checkPump("#StartedFlow", PumpId, "stop-color", "RED");
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
                .checkPump("#StoppedFlow", PumpId, "stop-color", "rgb(113,0,255)");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "AQUA");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", "rgb(255,0,188)");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "YELLOW");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(255,156,0)");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Второе значение")
    public void checkSnailPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(0,156,255)");

    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Значение по умолчанию")
    public void checkSnailPumpHoopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#path5604", PumpId, "style", "fill: navy;");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Второе значение")
    public void checkSnailPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrHoop()
                .checkPump("#path5604", PumpId, "style", "fill: seagreen;");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.647058823529412 0 0 0 0 0 0.164705882352941 0 0 0 0 0 0.164705882352941 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Второе значение")
    public void checkSnailPumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Значение по умолчанию")
    public void checkSnailPumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.184313725490196 0 0 0 0 0 0.309803921568627 0 0 0 0 0 0.309803921568627 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Второе значение")
    public void checkSnailPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.529411764705882 0 0 0 0 0 0.807843137254902 0 0 0 0 0 0.980392156862745 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSnailPumpOutputColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "1 0 0 0 0 0 0.388235294117647 0 0 0 0 0 0.27843137254902 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Второе значение")
    public void checkSnailPumpOutputColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ");
    }
}
