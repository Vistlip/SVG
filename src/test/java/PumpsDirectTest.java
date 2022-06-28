import Page.PumpsDirectPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class PumpsDirectTest {

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkVerticalPumpWork() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickCheckboxWork()
                .checkVerticalPumpWork();
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkVerticalPumpAlarm() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .clickAlarm()
                .inputAlarm()
                .checkVerticalPumpAlarm("Alarm");
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkVerticalPumpWarning() {
        PumpsDirectPage page = open(PumpsDirectPage.URL, PumpsDirectPage.class)
                .clickAlarm()
                .inputWarning()
                .checkVerticalPumpAlarm("Warning");
    }
}
