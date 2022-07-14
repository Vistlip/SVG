package Pumps.LinePiece;

import Color.ColorCollection;
import Page.Pumps.PumpsLinePiecePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SubmersiblePumpLinePieceTest {
    String PumpId = "#\\35 47279";
    String PumpId5 = "#\\35 47296";
    String PumpId6 = "#\\35 47648";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor1Def() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor1Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", "0.2 0 0 0 0 0 0.12941176470588237 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Последнее значение")
    public void checkSubmersiblePumpColor1Last() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", color.getSRGBOrange());
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor5Def() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor5Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", "0.2 0 0 0 0 0 0.12941176470588237 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Последнее значение")
    public void checkSubmersiblePumpColor5Last() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", color.getSRGBOrange());
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpСolor6Def() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", color.getSRGBBlackWithoutBlank());
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpСolor6Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", "0.2 0 0 0 0 0 0.12941176470588237 0 0 0 0 0 0 0 0 0 0 0 1 0");
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Последнее значение")
    public void checkSubmersiblePumpСolor6Last() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", color.getSRGBOrange());
    }
}

