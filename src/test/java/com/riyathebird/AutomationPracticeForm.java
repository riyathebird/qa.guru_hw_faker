package com.riyathebird;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1960x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
//в чате было прописано это решение. кнопка submit на моем ноуте ни с какими бубнами не показывается.
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("johndoe@google.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");

        $("[#dateOfBirthInput]").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--005").click();

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
