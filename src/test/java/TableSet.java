import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableSet {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
    wd = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","C:\\Users\\saban\\Desktop\\tel-ran\\QaAuto\\getHubProjects\\QA11Start\\chromedriver.exe");
  //  wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

}

    @Test
    public void testFindRow4(){
 //       WebElement element = wd.findElement(By.cssSelector("tr:nth-child(4)"));
        WebElement element = wd.findElement(By.cssSelector("[placeholder='Password']"));
        String text = element.getText();
        System.out.println(text);
//        Assert.assertEquals(text, "Centro comercial Moctezuma Francisco Chang Mexico");
//        Assert.assertTrue(true, "Mexico");
//        Assert.assertFalse(false, "Canada");
//        Assert.assertTrue(text.contains("Francisco Chang"));
//
//        String text2 = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)")).getText();
//        Assert.assertEquals(text2, "Francisco Chang");
//        Assert.assertTrue(true, "Francisco Chang");
//        Assert.assertFalse(false, null);

    //    wd.findElement(By.cssSelector("[placeholder$='Password']"));
        element.click();
        element.clear();
        element.sendKeys("hoooo");


    }

    @AfterMethod
    public void postConditon(){
        //close site
        wd.quit();
    }

}
