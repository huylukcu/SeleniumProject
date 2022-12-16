package selenium_review;

import com.github.javafaker.Faker;
import org.junit.Test;

public class JavaFaker {
    /*
    TEST DATA: useRname, pasDword, URL, test envirement
     */

    @Test
    public void javaFakerTest(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println(firstName);

        String lastName = faker.name().lastName();
        System.out.println(lastName);

        String username = faker.name().username();
        System.out.println(username);

        String fullAddress = faker.address().fullAddress();
        System.out.println(fullAddress);

        String title = faker.name().title();
        System.out.println(title);

        String phone = faker.phoneNumber().cellPhone();
        System.out.println(phone);

        System.out.println(faker.funnyName().name());

    }
}
