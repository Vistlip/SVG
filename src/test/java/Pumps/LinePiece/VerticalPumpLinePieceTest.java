package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class VerticalPumpLinePieceTest {
    String PumpId = "#\\35 47146";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка вертикального насоса работа")
    public void checkVerticalPumpWork() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(0)
                .checkPump("#path3557", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка вертикального насоса авария")
    public void checkVerticalPumpAlarm() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка вертикального насоса предупреждение")
    public void checkVerticalPumpWarning() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка вертикального насоса поток")
    public void checkVerticalPumpStream() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(2)
                .checkPump("#path3499", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка вертикального насоса вращение")
    public void checkVerticalPumpSpin() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpStreamColorOnOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFlow", PumpId, "stop-color", "#ff0000");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "#990066");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Последнее значение")
    public void checkVerticalPumpStreamColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "BLUE");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpStreamColorOffOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", "#7100ff");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "#4466ff");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Последнее значение")
    public void checkVerticalPumpStreamColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "AQUA");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOnOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", "#ff00bc");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "#ff6671");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Последнее значение")
    public void checkVerticalPumpSpinColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "YELLOW");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOffOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", "#ff9c00");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "#999c66");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Последнее значение")
    public void checkVerticalPumpSpinColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "rgb(0,156,255)");

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpHoopColorOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#path3561", PumpId, "style", "fill: rgb(0, 0, 128);");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkVerticalPumpHoopColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .clickIncrHoop()
                .checkPump("#path3561", PumpId, "style", "fill: rgb(19, 56, 112);");
    }


    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Последнее значение")
    public void checkVerticalPumpHoopColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .checkPump("#path3561", PumpId, "style", "fill: seagreen;");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSupportColorOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.6470588235294118 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkVerticalPumpSupportColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.38823529411764707 0 0 0 0 0 0.09803921568627451 0 0 0 0 0 0.09803921568627451 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Последнее значение")
    public void checkVerticalPumpSupportColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpFlangesColorOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.1803921568627451 0 0 0 0 0 0.3058823529411765 0 0 0 0 0 0.3058823529411765 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkVerticalPumpFlangesColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.3215686274509804 0 0 0 0 0 0.5098039215686274 0 0 0 0 0 0.5764705882352941 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Последнее значение")
    public void checkVerticalPumpFlangesColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.529411764705882 0 0 0 0 0 0.807843137254902 0 0 0 0 0 0.980392156862745 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpOutputColorOne() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "1 0 0 0 0 0 0.3843137254901961 0 0 0 0 0 0.2784313725490196 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Второе значение")
    public void checkVerticalPumpOutputColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.7686274509803922 0 0 0 0 0 0.4549019607843137 0 0 0 0 0 0.2235294117647059 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Последнее значение")
    public void checkVerticalPumpOutputColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ");
    }
}
