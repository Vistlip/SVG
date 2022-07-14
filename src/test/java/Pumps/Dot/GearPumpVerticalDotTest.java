package Pumps.Dot;

import Color.ColorCollection;
import Page.Pumps.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GearPumpVerticalDotTest {
    String PumpId = "#\\35 44638";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса работа")
    public void checkGearPumpWork() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(0)
                .checkPump("#Work", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса авария")
    public void checkGearPumpAlarm() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса предупреждение")
    public void checkGearPumpWarning() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса поток")
    public void checkGearPumpStream() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(2)
                .checkPump("#Flow", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса вращение")
    public void checkGearPumpSpin() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(1)
                .checkPump("#pump", PumpId, "class", "Start");
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpStreamColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Flowfilter", PumpId, "values",color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока вкл")
    @Description("Второе значение")
    public void checkGearPumpStreamColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOn()
                .checkPump("#Flowfilter", PumpId, "values",color.getSRGBBlue());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpStreamColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет потока выкл")
    @Description("Второе значение")
    public void checkGearPumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#NFlowfilter", PumpId, "values", color.getSRGBRed());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения вкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpSpinColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения вкл")
    @Description("Второе значение")
    public void checkGearPumpSpinColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOn()
                .checkPump("#Rotationfilter", PumpId, "values", color.getSRGBGreen());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkGearPumpSpinColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#NWorkfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет вращения выкл")
    @Description("Второе значение")
    public void checkGearPumpSpinColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#NWorkfilter", PumpId, "values",  color.getSRGBYellow());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет обода")
    @Description("Значение по умолчанию")
    public void checkGearPumpHoopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет обода")
    @Description("Второе значение")
    public void checkGearPumpHoopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrHoop()
                .checkPump("#Obodfilter", PumpId, "values", color.getSRGBAqua());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет опоры")
    @Description("Значение по умолчанию")
    public void checkGearPumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Supportfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет опоры")
    @Description("Второе значение")
    public void checkGearPumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#Supportfilter", PumpId, "values", color.getSRGBIndigo());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет фланца")
    @Description("Значение по умолчанию")
    public void checkGearPumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет фланца")
    @Description("Второе значение")
    public void checkGearPumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#Flangesfilter", PumpId, "values", color.getSRGBPink());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет выключенного")
    @Description("Значение по умолчанию")
    public void checkGearPumpColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет выключенного")
    @Description("Второе значение")
    public void checkGearPumpColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrGear()
                .checkPump("#Animatefilter", PumpId, "values", color.getSRGBAquamarine());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет включенного")
    @Description("Значение по умолчанию")
    public void checkGearPumpColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#Workfilter", PumpId, "values", color.getSRGBBlack());
    }

    @Test
    @DisplayName("Проверка шестеренчетого вертикального насоса цвет включенного")
    @Description("Второе значение")
    public void checkGearPumpColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrWork()
                .checkPump("#Workfilter", PumpId, "values",color.getSRGBThistle());
    }
}
