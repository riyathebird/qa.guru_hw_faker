package pages.testdata;
import com.github.javafaker.Faker;
import java.util.Locale;

public class AutomationPracticeData {
    Faker faker = new Faker();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    public static String
            firstName = faker.name().firstName(),
            lastName = "Doe",
            userEmail = "johndoe@google.com",
            userGender = "Male",
            userNumber = "1234567890",
            day = "30",
            month = "June",
            year = "2000",
            subject = "English",
            hobbies = "Reading",
            picture = "src/test/resources/sample.jpg",
            currentAddress = "Address",
            state = "NCR",
            city = "Delhi";

}


    static Faker faker = new Faker();
    public static String userName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = genderRandom(),
            phone = faker.phoneNumber().subscriberNumber(10),
            day = "30",
            month = monthRandom(),
            year = "2008",
            subject = "English",
            file = "img/image_2022-11-11_17-13-46.png",
            hobbies = hobbiesRandom(),
            address = faker.address().fullAddress(),
            state = "Uttar Pradesh",
            city = "Merrut";

    public static int randomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String genderRandom() {
        String[] gender = {"Male", "Female", "Other"};
        int index = randomInt(0, gender.length - 1);
        return gender[index];
    }

    public static String monthRandom() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = randomInt(0, month.length - 1);
        return month[index];
    }

    public static String hobbiesRandom() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int index = randomInt(0, hobbies.length - 1);
        return hobbies[index];
    }