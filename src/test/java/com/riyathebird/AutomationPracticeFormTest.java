package com.riyathebird;

import org.junit.jupiter.api.Test;
import static pages.testdata.AutomationPracticeData.*;

public class AutomationPracticeFormTest extends TestBase {

    @Test
    void fillFormTest() {

        registrationPage.openPage()
        .setFirstName(firstName)
        .setLastName(lastName)
        .setEmail(userEmail)
        .setGender(userGender)
        .setNumber(userNumber)
        .setBirthDate(day, month, year)
        .setSubject(subject)
        .setHobbies(hobbies)
        .uploadPicture(picture)
        .setCurrentAddress(currentAddress)
        .setState(state)
        .setCity(city)
        .submit();


        registrationPage.verifyRegistrationResultsAppears()
        .verifyResult("Student Name", firstName + " " + lastName)
        .verifyResult("Student Email", userEmail)
        .verifyResult("Gender", userGender)
        .verifyResult("Mobile", userNumber)
        .verifyResult("Date of Birth",
                day + " " + month + "," + year)
        .verifyResult("Subjects", subject)
        .verifyResult("Hobbies", hobbies)
        .verifyResult("Picture", picture)
        .verifyResult("Address", currentAddress)
        .verifyResult("State and City", state + " " + city);
    }
}
