package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
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
    public void checkVerticalPumpStreamColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getHashBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока вкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .checkPump("#StartedFlow", PumpId, "stop-color", "#000033");
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
                .checkPump("#StartedFlow", PumpId, "stop-color", color.getBlue());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpStreamColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getHashBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkVerticalPumpStreamColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .checkPump("#StoppedFlow", PumpId, "stop-color", "#330000");
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
                .checkPump("#StoppedFlow", PumpId, "stop-color", color.getRed());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StartedFill", PumpId, "stop-color", color.getHashBlack());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .checkPump("#StartedFill", PumpId, "stop-color", "#001a00");
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
                .checkPump("#StartedFill", PumpId, "stop-color", color.getGreen());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSpinColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getHashBlack());

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkVerticalPumpSpinColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .checkPump("#StoppedFill", PumpId, "stop-color", "#333300");

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
                .checkPump("#StoppedFill", PumpId, "stop-color", color.getYellow());

    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpHoopColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#path3561", PumpId, "style", "fill: rgb(0, 0, 0);");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkVerticalPumpHoopColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .checkPump("#path3561", PumpId, "style", "fill: rgb(0, 51, 51);");
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
                .checkPump("#path3561", PumpId, "style", color.getRGBaFillAqua());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpSupportColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkVerticalPumpSupportColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values","0.058823529411764705 0 0 0 0 0 0 0 0 0 0 0 0.10196078431372549 0 0 0 0 0 1 0");
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
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values",color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpFlangesColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkVerticalPumpFlangesColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.2 0 0 0 0 0 0.15294117647058825 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 1 0");
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
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkVerticalPumpOutputColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка вертикального насоса цвет корпуса")
    @Description("Второе значение")
    public void checkVerticalPumpOutputColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", "0.2 0 0 0 0 0 0.12941176470588237 0 0 0 0 0 0 0 0 0 0 0 1 0");
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
                .checkPump("#feColorMatrixOutputFilter", PumpId, "values", color.getSRGBOrange());
    }

}
