package CommonReuseableMethods;

import org.apache.bcel.generic.RETURN;
import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

    public static String getFirstName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("john"+generatedString);
    }
    public static String getLastName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Ken"+generatedString);
}
    public static String getUserName(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return ("paul"+generatedString);
        }
    public static String getPassword(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return ("john"+generatedString);
    }
    public static String getEmail(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return ("john"+generatedString);
    }
    public static String empName(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return ("john"+generatedString);
    }
    public static String emsal(){
        String generatedString = RandomStringUtils.randomNumeric(5);
        return ("john"+generatedString);
    }
    public static String empAge(){
        String generatedString = RandomStringUtils.randomNumeric((3));
        return ("john"+generatedString);

}
}