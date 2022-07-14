package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SnailPumpLinePieceTest {
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
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "#000033");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока вкл")
    @Description("Последнее значение")
    public void checkSnailPumpStreamColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getBlue());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpStreamColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Второе значение")
    public void checkSnailPumpStreamColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "#330000");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет потока выкл")
    @Description("Последнее значение")
    public void checkSnailPumpStreamColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getRed());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "#001a00");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения вкл")
    @Description("Последнее значение")
    public void checkSnailPumpSpinColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", color.getGreen());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSpinColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Второе значение")
    public void checkSnailPumpSpinColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "#333300");

    }

    @Test
    @DisplayName("Проверка насоса улитка цвет вращения выкл")
    @Description("Последнее значение")
    public void checkSnailPumpSpinColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getYellow());

    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Значение по умолчанию")
    public void checkSnailPumpHoopColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#path5604", PumpId, "style", color.getRGBaFillBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Второе значение")
    public void checkSnailPumpHoopColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .checkPump("#path5604", PumpId, "style", "fill: rgb(0, 51, 51);");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет обода")
    @Description("Последнее значение")
    public void checkSnailPumpHoopColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .checkPump("#path5604", PumpId, "style", color.getRGBaFillAqua());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Значение по умолчанию")
    public void checkSnailPumpSupportColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Второе значение")
    public void checkSnailPumpSupportColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.058823529411764705 0 0 0 0 0 0 0 0 0 0 0 0.10196078431372549 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет опоры")
    @Description("Последнее значение")
    public void checkSnailPumpSupportColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Значение по умолчанию")
    public void checkSnailPumpFlangesColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Второе значение")
    public void checkSnailPumpFlangesColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.2 0 0 0 0 0 0.15294117647058825 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет фланца")
    @Description("Последнее значение")
    public void checkSnailPumpFlangesColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSnailPumpOutputColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Второе значение")
    public void checkSnailPumpOutputColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values","0.2 0 0 0 0 0 0.12941176470588237 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса улитка цвет корпуса")
    @Description("Последнее значение")
    public void checkSnailPumpOutputColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBOrange());
    }
}
