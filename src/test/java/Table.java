import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Table {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        //OPEN BROWSER
        wd = new ChromeDriver();
        //OPEN SITE
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();

    }


    @Test
    public void testTable(){
        WebElement element = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[2]/td[2]"));
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));

        String text = element.getText();
        System.out.println(text);

        Assert.assertEquals(text, "Maria Anders");

    }




    @AfterMethod
    public void postConditon(){
        //close site
        wd.quit();
    }
}
