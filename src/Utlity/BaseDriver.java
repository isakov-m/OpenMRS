package Utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://openmrs.org/");

    }

    @AfterClass
    public void bekleVeKapat() {
        MyFunc.Bekle(5);
        driver.quit();
    }

    public void elementeKadarKaydir(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        MyFunc.Bekle(2);

    }
    public void visibilityOf(WebElement e){
        WebDriverWait wait=new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void toBeClickable(WebElement e){
        WebDriverWait wait=new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(e));

}}