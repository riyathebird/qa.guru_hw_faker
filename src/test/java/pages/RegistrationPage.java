package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResults;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private final CalendarComponent calendarComponent = new CalendarComponent();
    private final RegistrationResults registrationResults = new RegistrationResults();

    private final String TITLE_TEXT = "Student Registration Form";

    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            dateOfBirthInput = $("[id=dateOfBirthInput]"),
            numberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateWrapper = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            submitButton = $("#submit");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }
    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }
    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderInput.$(byText(gender)).click();

        return this;
    }

    public RegistrationPage setNumber(String number) {
        numberInput.setValue(number);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String subject) {
        subjectInput.setValue(subject).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String hobbies) {
        hobbiesInput.$(byText(hobbies)).click();

        return this;
    }

    public RegistrationPage uploadPicture(String picture) {
        pictureInput.uploadFile(new File(picture));

        return this;
    }

    public RegistrationPage setCurrentAddress(String currentAddress) {
        addressInput.sendKeys(currentAddress);

        return this;
    }

    public RegistrationPage setState(String state) {
        stateInput.click();
        stateWrapper.$(byText(state)).click();

        return this;
    }

    public RegistrationPage setCity(String city) {
        cityInput.click();
        stateWrapper.$(byText(city)).click();

        return this;
    }

    public RegistrationPage submit() {
        submitButton.click();

        return this;
    }

    public RegistrationPage verifyRegistrationResultsAppears() {
        registrationResults.verifyRegistrationResultsAppears();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResults.verifyResult(key,value);

        return this;
    }
}
