package Day24_Assgn;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class DummyLoginPageParameter {
	WebDriver driver;

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("Enter username and password ");
        System.out.println("username : " + username);
        System.out.println("password : " + password);

        if ("rao".equals(username) && "anush".equals(password)) {
            System.out.println("login");
        } else {
            System.out.println("Login Failed");
        }
    }
}
