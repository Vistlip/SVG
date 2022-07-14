package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GearPumpVerticalLinePieceTest {
    String PumpId = "#\\35 47224";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса работа")
    public void checkGearPumpWork() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(0)
                .checkPump("#Work", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса авария")
    public void checkGearPumpAlarm() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса предупреждение")
    public void checkGearPumpWarning() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса поток")
    public void checkGearPumpStream() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(2)
                .checkPump("#Flow", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса вращение")
    public void checkGearPumpSpin() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpStreamColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Flowfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока вкл")
    @Description("Второе значение")
    public void checkGearPumpStreamColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .checkPump("#Flowfilter", PumpId, "values", color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока вкл")
    @Description("Последнее значение")
    public void checkGearPumpStreamColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .clickIncrStreamOn()
                .checkPump("#Flowfilter", PumpId, "values", color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpStreamColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkGearPumpStreamColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBRed());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока выкл")
    @Description("Последнее значение")
    public void checkGearPumpStreamColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .clickIncrStreamOff()
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBRed());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpSpinColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkGearPumpSpinColorOnTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения вкл")
    @Description("Последнее значение")
    public void checkGearPumpSpinColorOnLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .clickIncrSpinOn()
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpSpinColorOffDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#NWorkfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkGearPumpSpinColorOffTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .checkPump("#NWorkfilter", PumpId, "values",  color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения выкл")
    @Description("Последнее значение")
    public void checkGearPumpSpinColorOffLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .clickIncrSpinOff()
                .checkPump("#NWorkfilter", PumpId, "values",  color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkGearPumpHoopColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkGearPumpHoopColorTwo() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBAqua());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет обода")
    @Description("Последнее значение")
    public void checkGearPumpHoopColorLast() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .clickIncrHoop()
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBAqua());
    }


    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkGearPumpSupportColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Supportfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkGearPumpSupportColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrSupport()
                .checkPump("#Supportfilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkGearPumpFlangesColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkGearPumpFlangesColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrFlanges()
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет выключенного")
    @Description("Значение по умолчанию")
    public void checkGearPumpColorDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет выключенного")
    @Description("Второе значение")
    public void checkGearPumpColor() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrGear()
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBAquamarine());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет включенного")
    @Description("Значение по умолчанию")
    public void checkGearPumpColorOnDef() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#Workfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет включенного")
    @Description("Второе значение")
    public void checkGearPumpColorOn() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrWork()
                .checkPump("#Workfilter", PumpId, "values",color.getSRGBThistle());
    }
}
