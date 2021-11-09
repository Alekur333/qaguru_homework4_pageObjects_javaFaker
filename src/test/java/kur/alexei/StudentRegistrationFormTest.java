package kur.alexei;

import kur.alexei.pages.BasePage;
import kur.alexei.pages.RegistrationPage;

import org.junit.jupiter.api.Test;


public class StudentRegistrationFormTest extends BasePage {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void studentRegistrationFormTest() {
        registrationPage.shouldBeRegistrationForm();
        registrationPage.finalTableShouldHaveData();


    }
}
