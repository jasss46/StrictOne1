package Date1362026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium1 {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test
    public void setupBrowser(){
        driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        //title checker
       String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="Automation Testing Practice";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Actual Title is equals to Expected Title");
        }
        else{
            System.out.println("Actual Title is not matching with the expected Title");
        }
    }
}
