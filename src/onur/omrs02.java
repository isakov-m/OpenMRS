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

public class omrs02 extends BaseDriver {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Her test öncesinde yeni bir WebDriver örneği oluştur
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

        // Giriş sonrasında  kontrol noktası
        WebElement findpatient = driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
        Assert.assertTrue(findpatient.getText().contains("Find Patient Record"), "giris yapildi ");
        //
    }

    @DataProvider
    public Object[][] loginData() {
        Object[][] data = new Object[7][2];

        // 1. Test Verisi
        data[0][0] = "Kullanici0";
        data[0][1] = "admin123";

        // 2. Test Verisi
        data[1][0] = "Kullanici1";
        data[1][1] = "test123";

        // 3. Test Verisi
        data[2][0] = "Kullanici2";
        data[2][1] = "Yossword";

        // 4. Test Verisi
        data[3][0] = "Kullanici3";
        data[3][1] = "adfmin123";

        // 5. Test Verisi
        data[4][0] = "Kullanici4";
        data[4][1] = "Parola5";

        // 6. Test Verisi
        data[5][0] = "Kullanici5";
        data[5][1] = "Parola6";

        // 7. Test Verisi
        data[6][0] = "admin";
        data[6][1] = "Admin123";

        return data;
    }

    @AfterMethod
    public void tearDown() {
        // Her test sonrasında sayfayı kapat
        driver.close();
    }
}