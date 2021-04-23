package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    String drivePath = "D:\\SOFTWARE\\chromedriver.exe";

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", drivePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Set<Cookie> allCookies = driver.manage().getCookies();
//        for(Cookie cookie : allCookies)
//        {
//            System.out.println(cookie);
//        }
//
    }

    @AfterClass
    public void closedown(){

        driver.quit();
    }
}