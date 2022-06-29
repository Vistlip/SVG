package PumpsDot;

import Color.ColorCollection;
import Page.PumpsDotPage;
import Page.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ProfilePumpDotTest {
    String PumpId = "#\\35 44614";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка насоса в профиль работа")
    public void checkProfilePumpWork() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(0)
                .checkPump("#motor", PumpId, "class", "Started");
    }

    @Test
    @DisplayName("Проверка насоса в профиль авария")
    public void checkProfilePumpAlarm() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkPump("#AvaryBorder", PumpId, "class", "Alarm");
    }

    @Test
    @DisplayName("Проверка насоса в профиль предупреждение")
    public void checkProfilePumpWarning() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickAlarm()
                .inputWarning()
                .checkPump("#AvaryBorder", PumpId, "class", "Warning");
    }

    @Test
    @DisplayName("Проверка насоса в профиль поток")
    public void checkProfilePumpStream() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickCheckbox(2)
                .checkPump("#pump", PumpId, "class", "Yes");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStreamColorOnDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", "1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока вкл")
    @Description("Второе значение")
    public void checkProfilePumpStreamColorOn() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOn()
                .checkPump("#feColorMatrixFlowFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStreamColorOffDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", "0.443137254901961 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет потока выкл")
    @Description("Второе значение")
    public void checkProfilePumpStreamColorOff() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStreamOff()
                .checkPump("#feColorMatrixBackFilter", PumpId, "values", "0 0 0 0 0 0 1 0 0 0 0 0 1 0 0 0 0 0 1 0 ");
    }
    
    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStopColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", "1 0 0 0 0 0 0.611764705882353 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет вращения выкл")
    @Description("Второе значение")
    public void checkProfilePumpStopColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSpinOff()
                .checkPump("#feColorMatrixStoppedFilter", PumpId, "values", "0 0 0 0 0 0 0.611764705882353 0 0 0 0 0 1 0 0 0 0 0 1 0 ");

    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    @Description("Значение по умолчанию")
    public void checkProfilePumpSupportColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0.647058823529412 0 0 0 0 0 0.164705882352941 0 0 0 0 0 0.164705882352941 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет опоры")
    @Description("Второе значение")
    public void checkProfilePumpSupportColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrSupport()
                .checkPump("#feColorMatrixSupportFilter", PumpId, "values", "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Значение по умолчанию")
    public void checkProfilePumpFlangesColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.184313725490196 0 0 0 0 0 0.309803921568627 0 0 0 0 0 0.309803921568627 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Второе значение")
    public void checkProfilePumpFlangesColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrFlanges()
                .checkPump("#feColorMatrixFlangesFilter", PumpId, "values", "0.529411764705882 0 0 0 0 0 0.807843137254902 0 0 0 0 0 0.980392156862745 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Значение по умолчанию")
    public void checkProfilePumpStartedColorDef() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", "0 0 0 0 0 0 0.501960784313725 0 0 0 0 0 0.501960784313725 0 0 0 0 0 1 0 ");
    }

    @Test
    @DisplayName("Проверка насоса в профиль цвет фланца")
    @Description("Второе значение")
    public void checkProfilePumpStartedColor() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrStarted()
                .checkPump("#feColorMatrixStartedFilter", PumpId, "values", "0.823529411764706 0 0 0 0 0 0.705882352941177 0 0 0 0 0 0.549019607843137 0 0 0 0 0 1 0 ");
    }
}
