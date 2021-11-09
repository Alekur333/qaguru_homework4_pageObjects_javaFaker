package kur.alexei.testData;

import com.github.javafaker.Faker;

import java.io.File;
import java.util.Locale;

public class TestData {
    // Faker http://dius.github.io/java-faker/apidocs/index.html
    static Faker faker = new Faker(new Locale("ru"));
    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress("alekur");
    public static String gender = "Male";
    public static String mobile = faker.phoneNumber().subscriberNumber(10);
    public static String subject = "comp";
    public static String fileToAttach = "files/filePath.png";
//    File filePath = new File("src/test/resources/files/filePath.png");
    public static String currentAddress = faker.address().streetAddress();
    public static String state = "NCR";
    public static String city = "Delhi";
    public static String testPage = "https://demoqa.com/automation-practice-form";
}
