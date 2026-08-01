package Date1362026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Dropdowns {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test(priority = 1)
    public void setupBrowser(){

        driver= new ChromeDriver();
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test(priority = 2)
    public void selectDropdown(){

        WebElement dropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name=\"input_57\"]")));
        Select dpd= new Select(dropdown);

//        dpd.selectByVisibleText("$3,000-$7,000");
          dpd.selectByIndex(4);
              List<WebElement> option= dpd.getOptions();
        System.out.println(option.size());

        for(WebElement ele: option){
            System.out.println(ele.getText());
        }

    }

}
