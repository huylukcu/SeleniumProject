package tests;

import org.junit.Test;

public class Day09_FileExistTest {
        @Test
        public void isExistTest(){
//        Pick a file on your desktop
//        1 cup of water
//        And verify if that file exist on your computer or not
            String userDIR= System.getProperty("user.dir");       //=>gives the path of the current folder
            System.out.println(userDIR);

            String userHOME=System.getProperty("user.home");      //=>gives you the user folder
            System.out.println(userHOME);
        }
    }
