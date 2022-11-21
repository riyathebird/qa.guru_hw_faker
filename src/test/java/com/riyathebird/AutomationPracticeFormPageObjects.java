package com.riyathebird;

import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormPageObjects extends TestBase {

    @Test
    void fillFormTest() {

        String firstName = "John";
        String lastName = "Doe";
        String userEmail = "johndoe@google.com";
        String userGender = "Male";
        String userNumber = "1234567890";

        registrationPage.openPage()
        .setFirstName(firstName)
        .setLastName(lastName)
        .setEmail(userEmail)
        .setGender(userGender)
        .setNumber (userNumber)
        .setBirthDate ("30", "Jul", "2000");






        $("#subjectsInput").setValue("English");
        $(".subjects-auto-complete__menu").$(byText("English")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();

        $("#uploadPicture").uploadFile(new File("src/test/resources/sample.jpg"));
        $("#currentAddress").setValue("Address");
        $("#state").scrollIntoView(true).click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#city").$(byText("Delhi")).click();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("John"), text("Doe"), text("johndoe@google.com"),
                text("5 January,1990"), text("Delhi"));
    }
}
