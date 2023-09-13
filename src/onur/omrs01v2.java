package onur;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class omrs01v2 extends BaseDriver {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
    }

    @Test(dataProvider = "loginData")
    public void TestLogin(String userName, String password) {
        // Web sayfasına git
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        // Kullanıcı adı ve şifreyi doldur
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);

        // Diğer işlemleri gerçekleştir
        WebElement impatw = driver.findElement(By.xpath("//ul[@id='sessionLocation']/li[1]"));
        impatw.click();

        WebElement login = driver.findElement(By.id("loginButton"));
        login.click();
        MyFunc.Bekle(1);


        WebElement idpass = driver.findElement(By.id("error-message"));
        Assert.assertTrue(idpass.getText().contains("Invalid username/password. Please try again."), "sifre yok");

        // Giriş sonrasında  kontrol noktası
    }

    @DataProvider
    public Object[][] loginData() {
        Object[][] data = new Object[6][2];

        // 1. Test Verisi
        data[0][0] = "";
        data[0][1] = "";

        // 2. Test Verisi
        data[1][0] = "";
        data[1][1] = "";

        // 3. Test Verisi
        data[2][0] = "";
        data[2][1] = "";

        // 4. Test Verisi
        data[3][0] = "";
        data[3][1] = "";

        // 5. Test Verisi
        data[4][0] = "";
        data[4][1] = "5";

        // 6. Test Verisi
        data[5][0] = "";
        data[5][1] = "";

        return data;
    }

    @AfterMethod
    public void tearDown() {
        // Her test sonrasında sayfayı kapat
        driver.close();
    }
}