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
    String firstColor = "1 0 0 0 0 0 0.3843137254901961 0 0 0 0 0 0.2784313725490196 0 0 0 0 0 1 0";
    String secondColor = "0.7686274509803922 0 0 0 0 0 0.4549019607843137 0 0 0 0 0 0.2235294117647059 0 0 0 0 0 1 0";
    String lastColor = "0.419607843137255 0 0 0 0 0 0.556862745098039 0 0 0 0 0 0.137254901960784 0 0 0 0 0 1 0 ";


    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor1One() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor1Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", secondColor);
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
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", lastColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpColor5One() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpColor5Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", secondColor);
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
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", lastColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Значение по умолчанию")
    public void checkSubmersiblePumpСolor6One() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", firstColor);
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    @Description("Второе значение")
    public void checkSubmersiblePumpСolor6Two() {
        PumpsLinePiecePage page = open(PumpsLinePiecePage.URL, PumpsLinePiecePage.class)
                .clickIncrOutput()
                .clickIncrOutput()
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", secondColor);
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
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", lastColor);
    }
}
