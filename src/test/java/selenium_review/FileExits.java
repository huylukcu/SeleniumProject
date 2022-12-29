package selenium_review;

import org.junit.Test;

public class FileExits {
    @Test
    public void isExist(){
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
    }

}
