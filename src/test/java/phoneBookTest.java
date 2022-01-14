import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class phoneBookTest {
    WebDriver wd;

    @BeforeMethod
    public void openSite(){
        wd= new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

    }

    @Test
    public void start(){

        WebElement element =  wd.findElement(By.tagName("input"));
        element.click();
        element.clear();
        element.sendKeys("Hi Mother Fucker");

        List<WebElement>    list = wd.findElements(By.tagName("input"));



    }

    @AfterMethod
    public void closeSite(){
     //   wd.quit();

    }
}