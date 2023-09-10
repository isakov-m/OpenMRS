package Utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    static {  //bunun sarti extends olmasi ve basta yer almasi mi

        Logger logger = Logger.getLogger("");// output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster


        //driver=new FirefoxDriver();
        driver = new EdgeDriver();        //driver= new SafariDriver();
        //driver =new EdgeDriver();
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));  // 20 sn mühlet: elementi bulma mühleti

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void BekleVeKapat() {
        MyFunc.Bekle(5);
        driver.quit();
    }

    public static void SayfaAsagiKaydir(){

        JavascriptExecutor js= (JavascriptExecutor) driver; //casting

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");  //sayfanin sonuna gider
        MyFunc.Bekle(3);

       // js.executeScript("window.scrollTo(0,0);"); //sayfanin en üst kismina git
    }}



//  Java hızlı - Web sitesi yavaş
// java elemanı bulmaya çalışıyor, ama web sitesi hala yuklenıyor. site yüklenmeden java bulamadım dıyor bıtırıyor,
// Web elementı bulmaya calıstıgında (FindElement/s)
//  çözüm 1 : biraz süre vereceğiz (20s)

//  Thread.sleep(); -> javayı direkt verilen süre kadar durdurur. kac sanıye verırsen o kadar durdurur programı. Osebeple bu işimize yaramıyor. Bize buldugu zaman cıksın yanı mesela 20 sn verdık 10. sanıyede java buldun cık, 20 sn beklemesın ısterız
//         bıde bu Thread.sleep ıyı kod degıldır mulakatta bundan bahsetme mesela.
//  bunun yerıne driver.manage yapıp bunu MyFunc a atıcam oradan cagırıyorum her seferınde yazmayayım dıye