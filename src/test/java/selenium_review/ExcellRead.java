package selenium_review;

import java.io.File;

public class ExcellRead {
    public static void main(String[] args) {
        File file = new File("./src/test/java/resources/Capitals.xlsx");
        System.out.println(file.exists());
    }
}
