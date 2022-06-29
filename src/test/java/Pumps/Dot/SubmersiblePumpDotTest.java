package Pumps.Dot;

import Color.ColorCollection;
import Page.Pumps.PumpsDotPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SubmersiblePumpDotTest {
    String PumpId = "#\\35 44693";
    String PumpId5 = "#\\35 44710";
    String PumpId6 = "#\\35 45182";
    ColorCollection color = new ColorCollection();
    String firstColor = "1 0 0 0 0 0 0.388235294117647 0 0 0 0 0 0.27843137254902 0 0 0 0 0 1 0 ";
    String secondColor = "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ";

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor1Def() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor1() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", secondColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor5Def() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor5() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", secondColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpСolor6Def() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpСolor6() {
        PumpsDotPage page = open(PumpsDotPage.URL, PumpsDotPage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", secondColor);
    }
}

