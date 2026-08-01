package Date1362026;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class August {

    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeTest
    public void setupBrowser(){
        driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority=1)
    public void checkPageTitle(){
        String expectedTitle= "Automation Testing Practice";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Both title are matched");
        }
        else {
            System.out.println("Both title are not matched");
        }
    }

    @Test (priority=2)
    public void textfileds(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"name\"]"))).sendKeys("Jaswinder Singh");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"email\"]"))).sendKeys("Jaswindersingh050@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"phone\"]"))).sendKeys("9987888887");
    }

    @Test (priority=3)
    public void alertunderstanding(){
        WebElement simpleAlert=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"alertBtn\"]")));
        simpleAlert.click();
        Alert alt= driver.switchTo().alert();
        alt.accept();

        WebElement Confirmalt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"confirmBtn\"]")));
        Confirmalt.click();
        alt.dismiss();

        WebElement prmpalert=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"promptBtn\"]")));
        prmpalert.sendKeys("Jaswinder Singh Automation Tester");
        alt.accept();
    }

@Test(priority = 4)
public void conditionalStatements(){
        WebElement maleRadioButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"male\"]")));

        if(maleRadioButton.isEnabled()){
            maleRadioButton.click();
            System.out.println("male radio button is clicked");
        }

        if(maleRadioButton.isSelected()){
            maleRadioButton.click();
            System.out.println("male radio button was selected but now disselected");
        }
}

@Test (priority = 5)
    public void differentActions(){
        Actions act= new Actions(driver);

        WebElement buttonText=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Copy Text')]")));
       act.doubleClick(buttonText).build().perform();

       WebElement field= driver.findElement(By.xpath("//input[@id=\"field2\"]"));
       String fieldText= field.getAttribute("value");
       if(fieldText.equals("Hello World!")){
           System.out.println("Test Case Passed");
       }

    WebElement ele1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"draggable\"]")));
    WebElement ele2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"droppable\"]")));
    act.dragAndDrop(ele1,ele2).build().perform();


}
@Test(priority = 7)
public void pageScroller(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, 1000)");
    }


    @Test(priority = 88888)
    public void checkBoxes(){
        //bySpecific text

//        WebElement sunday= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"checkbox\" and @value=\"sunday\"]")));
//        sunday.click();

        List<WebElement> allchboxes= driver.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]//input[@type=\"checkbox\"]"));
        for(int i=0; i<allchboxes.size();i++){
            if(allchboxes.get(i).getAttribute("value").equals("wednesday"))
            allchboxes.get(i).click();
        }





    }
public void tearDown(){
        driver.quit();
    }

}
