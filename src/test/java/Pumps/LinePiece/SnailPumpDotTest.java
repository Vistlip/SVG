package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SnailPumpDotTest {
    String PumpId = "#\\35 47173";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса улитка работа")
    public void checkSnailPumpWork() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(0)
                .checkPump("#path5598", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса улитка авария")
    public void checkSnailPumpAlarm() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса улитка предупреждение")
    public void checkSnailPumpWarning() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса улитка поток")
    public void checkSnailPumpStream() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(2)
                .checkPump("#path5440", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса улитка вращение")
    public void checkSnailPumpSpin() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpStreamColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFlow", PumpId, "stop-color", "#ff0000");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOn() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "BLUE");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpStreamColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", "#7100ff");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOff() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "AQUA");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", "#ff00bc");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOn() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "YELLOW");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", "#ff9c00");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Второе значение")
    public void checkSnailPumpSpinColorOff() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(0,156,255)");

    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Значение по умолчанию")
    public void checkSnailPumpHoopColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#path5604", PumpId, "style", "fill: rgb(0, 0, 128);");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Второе значение")
    public void checkSnailPumpHoopColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .checkPump("#path5604", PumpId, "style", "fill: seagreen;");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSupportColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.6470588235294118 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Второе значение")
    public void checkSnailPumpSupportColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Значение по умолчанию")
    public void checkSnailPumpFlangesColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.1803921568627451 0 0 0 0 0 0.3058823529411765 0 0 0 0 0 0.3058823529411765 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Второе значение")
    public void checkSnailPumpFlangesColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.529411764705882 0 0 0 0 0 0.807843137254902 0 0 0 0 0 0.980392156862745 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSnailPumpOutputColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "1 0 0 0 0 0 0.3843137254901961 0 0 0 0 0 0.2784313725490196 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Второе значение")
    public void checkSnailPumpOutputColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ");
    }
}
