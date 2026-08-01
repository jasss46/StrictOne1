package Date1362026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class BeboTechnologies {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    By alert_1= By.xpath("//button[@id='alertBtn']");
    By confirmationAlert= By.xpath("//button[@id='confirmBtn']");
    By prompt_Alert= By.xpath("//button[@id='promptBtn']");


    @Test(priority=1)
    public void setupBrowser(){
        driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void alertHandling() throws InterruptedException {

        WebElement alert1= wait.until(ExpectedConditions.visibilityOfElementLocated(alert_1));
        alert1.click();
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement confAlert= wait.until(ExpectedConditions.elementToBeClickable(confirmationAlert));
        confAlert.click();
         alert.dismiss();

         WebElement promptAlert= wait.until(ExpectedConditions.elementToBeClickable(prompt_Alert));
         promptAlert.click();
         alert.sendKeys("Jaswinder Singh");
         alert.accept();




    }

}
