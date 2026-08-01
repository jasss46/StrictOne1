package Date1362026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class date06182026 {

    public static WebDriver driver;
    public static WebDriverWait wait;


//    public static void main(String[] args) {
//        int a=98,b=89,c=87,d=20;
//
//        if(a>b&& a>c&& a>d){
//            System.out.println("a is the largest number"+ a);
//        }
//        else if( b>a&& b>c&& b>d){
//            System.out.println("b is the largest number"+ b);
//        }
//        else if(c>a&&c>b&&c>d){
//            System.out.println("c is the largest number"+ c);
//        }
//        else{
//            System.out.println("d is the largest number");
//        }


//    public static void main(String[] args) {
//        int n=98;
//        if (n%2==0&& n%3==0&&n%5==0){
//            System.out.println("The number is divisible by 2, 3 and 5");
//        }
//        else{
//            System.out.println("the number is not divisible by 2,3 and 5");
//        }
//    }

//    public static void main(String[] args) {
//        String browserName= "Chrome";
//
//        if(browserName.equalsIgnoreCase("Chrome")){
//            System.out.println("the browser name is chrome");
//        }
//        else if(browserName.equalsIgnoreCase("Firefox")){
//            System.out.println("the browser name is firefox");
//        }
//        else if (browserName.equalsIgnoreCase("edge")){
//            System.out.println("the browser name is edge");
//    }
//    else{
//        System.out.println("unsupported browser");
//    }
//public static void main(String[] args) {
//    int year=2028;
//    if (year%4==0 && year%100!=0|| year%400==0){
//        System.out.println("The year is leap year");
//    }
//    else{
//        System.out.println("the year is not leap year");
//    }
//}
By loginButton= By.xpath("//button[@name=\"start\"]");


    @Test
    public void titleChecker(){

        driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String actualTitle= driver.getTitle();
        String expectedTitle= "Automation Testing Practice";
        WebElement loginBtn= driver.findElement(loginButton);


        if(!loginBtn.isEnabled()){
            System.out.println("yes");
        }
        else{
            System.out.println("It is enabled");
        }


    }


}


