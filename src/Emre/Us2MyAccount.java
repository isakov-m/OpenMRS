package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Us2MyAccount extends BaseDriver {


    @Test
    public  void  TS02(){

        driver.get("https://openmrs.org/");

        Elements elements=new Elements();
        MyFunc.Bekle(3);


        elements.grs.click();
        MyFunc.Bekle(3);
        elements.Mr2D.click();
        elements.usrnm.sendKeys("admin");
        elements.pss.sendKeys("Admin123");
        elements.loc.click();
        elements.lgn.click();
       // elements.myAcHo.b;

        MyFunc.Bekle(3);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(elements.myAcHo).build();
        aksiyon.perform();



        BekleVeKapat();
    }
}
