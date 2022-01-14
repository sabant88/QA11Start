import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open https://contacts-app.tobbymarshall815.vercel.app/login
    }

    @Test
    public void firstTest(){

        //open form
        //fill login correct value
        //submit login

    }

    @Test
    public void secondTest(){

        //open form
        //fill login incorrect value
        //submit login

    }
    @AfterMethod
    public void postCondition(){
        //logout
    }

}
