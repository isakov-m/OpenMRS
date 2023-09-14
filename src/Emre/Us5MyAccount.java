package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us5MyAccount extends BaseDriver {

    @Test
    public  void  TS05(){

        Elements e=new Elements();

        e.grs.click();
        MyFunc.Bekle(3);
        e.Mr2D.click();
        e.usrnm.sendKeys("admin");
        e.pss.sendKeys("Admin123");
        e.loc.click();
        e.lgn.click();
        MyFunc.Bekle(3);
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(e.myAcHo).build();
        aksiyon.perform();
        e.clck.click();

      Assert.assertTrue(e.dogrulama.getText().contains("Password"), "Dogrulanamadi");

        Assert.assertTrue(!e.dogrulama2.getText().contains("Defaults"), "Dogrulanamadi");





    }
}
