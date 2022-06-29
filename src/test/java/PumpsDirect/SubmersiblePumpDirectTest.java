package PumpsDirect;

import Color.ColorCollection;
import Page.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SubmersiblePumpDirectTest {
    String PumpId = "#\\36 4764";
    String PumpId5 = "#\\36 64776";
    String PumpId6 = "#\\35 42686";
    ColorCollection color = new ColorCollection();

    @Test
    @DisplayName("Проверка погружного насоса №1 цвет корпуса")
    public void checkSubmersiblePumpColor1() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(7)
                .inputColor(7, "Aqua")
                .clickSaveColor(7)
                .checkPump("#feColorMatrixBodyFilter", PumpId, "values", color.getSRGBAqua());
    }

    @Test
    @DisplayName("Проверка погружного насоса №5 цвет корпуса")
    public void checkSubmersiblePumpColor5() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(7)
                .inputColor(7, "Aqua")
                .clickSaveColor(7)
                .checkPump("#feColorMatrixBodyFilter", PumpId5, "values", color.getSRGBAqua());
    }

    @Test
    @DisplayName("Проверка погружного насоса цвет корпуса")
    public void checkSubmersiblePumpСolor6() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickButtonColor(7)
                .inputColor(7, "Aqua")
                .clickSaveColor(7)
                .checkPump("#feColorMatrixBodyFilter", PumpId6, "values", color.getSRGBAqua());
    }
}
