package kur.alexei.pages;

import com.codeborne.selenide.Configuration;
import kur.alexei.testData.TestData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    TestData testData = new TestData();

    @BeforeAll
    public static void beforeTest() {

        Configuration.browserSize="1200x800";
    }

    @BeforeEach
    void openTestPage() {

        open(testData.testPage);
    }
}
