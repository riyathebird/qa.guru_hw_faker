package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();

    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            dateOfBirthInput = $("[id=dateOfBirthInput]")
                    ;


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public void setGender(String value) {
        genderInput.setValue(value)$(byText(value)).click();
        return this;
    }

    public void setNumber(String value) {
        numberInput.setValue(value)$(byText(value));
        return this;
    }

    public void setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
}
