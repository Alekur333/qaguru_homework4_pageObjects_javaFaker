package kur.alexei.pages;

import kur.alexei.pages.components.CalendarComponent;
import kur.alexei.testData.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {

    TestData testData = new TestData();
    CalendarComponent calendarComponent = new CalendarComponent();

    public void shouldBeRegistrationForm() {
        $("#firstName").setValue(testData.firstName);
        $("#lastName").setValue(testData.lastName);
        $("#userEmail").setValue(testData.email);
        $(byText("Male")).click();
        $("#userNumber").setValue(testData.mobile);
        $("#dateOfBirthInput").click();
        calendarComponent.shouldBeCalendar();
        $("#subjectsInput").setValue(testData.subject).pressEnter();
        $(byText("Music")).click();
        //        $("#uploadPicture").uploadFile(filePath);
        $("#uploadPicture").uploadFromClasspath(testData.fileToAttach);
        $("#currentAddress").setValue(testData.currentAddress);
        $("#react-select-3-input").setValue(testData.state).pressEnter();
        $("#react-select-4-input").setValue(testData.city).pressEnter();
        $("#submit").click();

    }

    public void finalTableShouldHaveData() {
        $(".table").shouldHave(
                text(testData.firstName), text(testData.lastName), text(testData.email),
                text("Male"), text(testData.mobile), text("30 March,1974"), text("Computer Science"),
                text("Music"), text("filePath.png"), text(testData.currentAddress),
                text(testData.state), text(testData.city));
    }
}
