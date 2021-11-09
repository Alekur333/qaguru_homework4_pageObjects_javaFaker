package kur.alexei.pages.components;

import kur.alexei.testData.TestData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {

    public void shouldBeCalendar() {
        $(".react-datepicker__year-dropdown-container").click();
        $(".react-datepicker__year-select").selectOptionByValue("1974");
        $(".react-datepicker__month-dropdown-container").click();
        $(".react-datepicker__month-select").selectOptionByValue("2");
        $x("//div[text()=\"30\"]").click();


    }
}
