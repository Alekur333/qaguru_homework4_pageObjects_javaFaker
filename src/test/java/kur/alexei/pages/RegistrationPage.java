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

    public void setName() {

        $("#firstName").setValue(testData.firstName);
        $("#lastName").setValue(testData.lastName);
    }

    public void setEmail() {

        $("#userEmail").setValue(testData.email);
    }

    public void setMale() {

        $(byText("Male")).click();
    }

    public void setMobileNumber() {

        $("#userNumber").setValue(testData.mobile);
    }

      public void setDateOfBirth() {

          $("#dateOfBirthInput").click();
          calendarComponent.shouldBeCalendar();
    }

      public void setSubjects() {

          $("#subjectsInput").setValue(testData.subject).pressEnter();
    }

      public void setHobbies() {

          $(byText("Music")).click();
    }

      public void attachPicture() {

          $("#uploadPicture").uploadFromClasspath(testData.fileToAttach);
    }

      public void setCurrentAddress() {

          $("#currentAddress").setValue(testData.currentAddress);
    }

      public void setLocation() {

          $("#react-select-3-input").setValue(testData.state).pressEnter();
          $("#react-select-4-input").setValue(testData.city).pressEnter();
    }

      public void submitForm() {

          $("#submit").click();
    }

    public void fillRegistrationForm() {

        setName();
        setEmail();
        setMale();
        setMobileNumber();
        setDateOfBirth();
        setSubjects();
        setHobbies();
        attachPicture();
        setCurrentAddress();
        setLocation();
        submitForm();
    }

    public void finalTableShouldHaveData() {

        $(".table").$(byText("Student Name")).sibling(0).
                shouldHave(text(testData.firstName +" "+ testData.lastName));
        $(".table").$(byText("Student Email")).sibling(0).
                shouldHave(text(testData.email));
        $(".table").$(byText("Gender")).sibling(0).
                shouldHave(text("Male"));
        $(".table").$(byText("Mobile")).sibling(0).
                shouldHave(text(testData.mobile));
        $(".table").$(byText("Date of Birth")).sibling(0).
                shouldHave(text("30 March,1974"));
        $(".table").$(byText("Subjects")).sibling(0).
                shouldHave(text("Computer Science"));
        $(".table").$(byText("Hobbies")).sibling(0).
                shouldHave(text("Music"));
        $(".table").$(byText("Picture")).sibling(0).
                shouldHave(text("filePath.png"));
        $(".table").$(byText("Address")).sibling(0).
                shouldHave(text(testData.currentAddress));
        $(".table").$(byText("State and City")).sibling(0).
                shouldHave(text(testData.state +" "+ testData.city));


//        $(".table").shouldHave(
//                text(testData.firstName),
//                text(testData.lastName),
//                text(testData.email),
//                text("Male"),
//                text(testData.mobile),
//                text("30 March,1974"),
//                text("Computer Science"),
//                text("Music"),
//                text("filePath.png"),
//                text(testData.currentAddress),
//                text(testData.state),
//                text(testData.city));
    }
}
