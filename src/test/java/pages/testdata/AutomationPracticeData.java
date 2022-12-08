package pages.testdata;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

public class AutomationPracticeData {
    static Faker faker = new Faker(new Locale("en-US"));
    static Random random = new Random();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = genderRandom(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.format("%02d", faker.number().numberBetween(1,28)),
            month = monthRandom(),
            year = String.valueOf(faker.number().numberBetween(1970, 2010)),
            subject = subjectsRandom(),
            hobbies = hobbiesRandom(),
            picture = "src/test/resources/sample.jpg",
            currentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi";


    public static String genderRandom() {
        String[] gender = {"Male", "Female", "Other"};
        int index = random.nextInt(gender.length);
        return (gender[index]);
    }

    public static String monthRandom() {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int index = random.nextInt(month.length);
        return month[index];
    }

    public static String subjectsRandom() {
        String[] subjects = {"Hindi", "English", "Civics", "Computer Science",
                "Social Studies", "Maths", "Commerce", "Arts", "Biology",
                "Accounting", "Chemistry", "Economics", "History", "Physics"};
        int index = random.nextInt(subjects.length);
        return subjects[index];
    }

    public static String hobbiesRandom() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int index = random.nextInt(hobbies.length);
        return hobbies[index];
    }
}