import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindPhonebookHw {
    WebDriver wd;

    @BeforeMethod
    public  void preCondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

    }

    @Test
    public  void FindElements(){

        //to find PHONEBBOK
        WebElement element = wd.findElement(By.xpath("//h1"));

        //to find HOME
        element= wd.findElement(By.xpath("//a[1]"));

        //to find ABOUT
        element=wd.findElement(By.linkText("ABOUT"));

        //to find LOGIN
        element=wd.findElement(By.xpath("//a[last()]"));

        //to find E-MAIL
        element=wd.findElement(By.xpath("//input[1]"));

        //to find Login Button
        element=wd.findElement(By.xpath("//button[1]"));


        String text= element.getText();
        System.out.println(text);

    }

    @AfterMethod
    public  void postCondition(){
        wd.quit();
    }
}
