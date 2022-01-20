import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstClass {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //open browser
        wd = new ChromeDriver();
        //open site
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");//with history
//        wd.navigate().back();
//        wd.navigate().forward();
//        wd.navigate().refresh();
//        wd.get("");  //without history
        //login
    }

    @Test
    public void opensite(){
        // add new car
        System.out.println("hello");

        //**************** tagName

        WebElement element = wd.findElement(By.tagName("a"));
        element.click();

        List<WebElement> list1 = wd.findElements(By.tagName("a"));


        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));

        ///*********** ID

        WebElement element1 = wd.findElement(By.id("root"));

        //*********** class

        WebElement element2  = wd.findElement(By.className("container"));

        //*********** name

        WebElement element3 = wd.findElement(By.name(""));

        //*********** linkText() +.partialLinkText
        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));

        //************* Css

        wd.findElement(By.cssSelector("a"));
        wd.findElements(By.cssSelector("a"));

// css by tagname
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("div"));

        // css by id
        wd.findElement(By.cssSelector("#root"));

        // css by class
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //css by atributte
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[id='root']"));

        // css обединение
        wd.findElement(By.cssSelector("a.active[href='/login']"));
        wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:nth-child(2)"));

        //************* xPath





    }

    @AfterMethod
    public void postCondition(){
        //close browser +url
        wd.close(); //- one tab
        wd.quit(); // all tabs
        // logout
    }
}
