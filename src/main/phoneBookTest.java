import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class phoneBookTest {
    WebDriver wb;

        @BeforeM
       public void openSite(){
        wb= new ChromeDriver();
        wb.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

    }

    @Test
    public void start(){
        WebElement element = wb.findElement(By.tagName("a"));
        // element

    }

    @AfterMethod
    public void closeSite(){
        wb.quit();

    }
}
}
