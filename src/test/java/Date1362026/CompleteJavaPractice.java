package Date1362026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class CompleteJavaPractice {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public void browserSetup(){
        driver= new ChromeDriver();
        driver .get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    }


    @Test(priority = 1)
    public void basicInputFields(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys("Jaswinder Singh");
        System.out.println("Name is printed");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("jaswindersingh050@gmail.com");
        System.out.println("email is printed");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("phone"))).sendKeys("9855710932");
        System.out.println("Phone number is printed");
    }

    @Test(priority = 2)
    public void titleChecker(){
        String expectedTitle="Automation Testing Practice";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Both the title are matched");
        }
        else{
            System.out.println("Both the titles are not matched");
        }
    }

    @Test(priority = 3)

    public void alertHandling(){
        WebElement alert1=wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBtn")));
        alert1.click();
        Alert alert= driver.switchTo().alert();
        alert.accept();
          WebElement alert2=wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBtn")));
           alert2.click();
           alert.accept();
        WebElement alert3=wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn")));
        alert3.click();
        alert.sendKeys("Jaswinder Singh SDET");
        alert.accept();

    }@Test(priority = 4)
    public void actionProperties(){

        //drag and drop functionality
        WebElement ele1= wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        WebElement ele2= wait.until(ExpectedConditions.elementToBeClickable(By.id("droppable")));

        Actions act= new Actions(driver);
        act.dragAndDrop(ele1,ele2).build().perform();

        WebElement copyButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Copy Text')]")));
        act.doubleClick(copyButton).build().perform();

        WebElement startButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"start\"]")));
        act.moveToElement(startButton).build().perform();



    }

@Test(priority = 5)
    public void iframeUnderstanding(){
        driver.get("https://ui.vision/demo/webtest/frames/");

        WebElement frame1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//frame[@src=\"frame_1.html\"]")));
        driver.switchTo().frame(frame1);
        WebElement name1Field= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext1\"]")));
        name1Field.sendKeys("Jaswinder Singh SDET Bebo Technologies");
        driver.switchTo().defaultContent();

        WebElement frame2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//frame[@src=\"frame_2.html\"]")));
        driver.switchTo().frame(frame2);
    WebElement nameField2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext2\"]")));
    nameField2.sendKeys("you will crack the interview bro");



}
@Test(priority = 6)
public void checkBoxesUnderstanding(){
 //specific check box
driver.get("https://testautomationpractice.blogspot.com/");
 WebElement sundayCheckBox= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"checkbox\" and @id=\"sunday\"]")));
 sundayCheckBox.click();

 if(sundayCheckBox.isSelected()){
     sundayCheckBox.click();
     System.out.println("Now the sunday checkbox get disselected");
 }


List<WebElement> allCheckBoxes= driver.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]//input[@type=\"checkbox\"]"));

    System.out.println(allCheckBoxes.size());

    for(int i=0;i<allCheckBoxes.size();i++){
        allCheckBoxes.get(i).click();
    }
}

}


