import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.util.List;

public class FindElements {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saban\\Desktop\\tel-ran\\QaAuto\\getHubProjects\\QA11Start\\chromedriver.exe");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

    }


    @Test
    public void testFindElement(){
       WebElement element = wd.findElement(By.tagName("a"));

       List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }

    @Test
    public void testFindElementLogin(){
        wd.findElement(By.linkText("LOGIN"));
       wd.findElement(By.partialLinkText("LOG"));

    }



    @AfterMethod
    public void postConditon(){
        //close site
        wd.quit();
    }

}
