package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ProfilePumpLinePieceTest {
    String PumpId = "#\\35 47200";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса в профиль работа")
    public void checkProfilePumpWork() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(0)
                .checkPump("#motor", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса в профиль авария")
    public void checkProfilePumpAlarm() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса в профиль предупреждение")
    public void checkProfilePumpWarning() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса в профиль поток")
    public void checkProfilePumpStream() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(2)
                .checkPump("#pump", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStreamColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    @Description("Второе значение")
    public void checkProfilePumpStreamColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0.2 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    @Description("Последнее значение")
    public void checkProfilePumpStreamColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStreamColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    @Description("Второе значение")
    public void checkProfilePumpStreamColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", "0.2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    @Description("Последнее значение")
    public void checkProfilePumpStreamColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", color.getSRGBRed());
    }
    
    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStopColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    @Description("Второе значение")
    public void checkProfilePumpStopColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", "0.2 0 0 0 0 0 0.2 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    @Description("Последнее значение")
    public void checkProfilePumpStopColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    @Description("Значение по умолчанию")
    public void checkProfilePumpSupportColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    @Description("Второе значение")
    public void checkProfilePumpSupportColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.058823529411764705 0 0 0 0 0 0 0 0 0 0 0 0.10196078431372549 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    @Description("Последнее значение")
    public void checkProfilePumpSupportColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Значение по умолчанию")
    public void checkProfilePumpFlangesColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Второе значение")
    public void checkProfilePumpFlangesColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.2 0 0 0 0 0 0.15294117647058825 0 0 0 0 0 0.1607843137254902 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Последнее значение")
    public void checkProfilePumpFlangesColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStartedColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Второе значение")
    public void checkProfilePumpStartedColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStarted()
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", "0.2 0 0 0 0 0 0.2 0 0 0 0 0 0.2 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Последнее значение")
    public void checkProfilePumpStartedColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStarted()
                .clickIncrStarted()
                .clickIncrStarted()
                .clickIncrStarted()
                .clickIncrStarted()
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", color.getSRGBWhite());
    }
}
