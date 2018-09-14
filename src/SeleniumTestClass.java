import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTestClass {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void test() {
        driver.get(baseUrl);
        driver.findElement(By.id("lst-ib"));
        System.out.println("Clear!");
        driver.findElement(By.id("lst-ib")).sendKeys("testing google like a pro");
        System.out.println("String sent");
        driver.findElement(By.name("btnK")).click();
        System.out.println("Proceeding");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}