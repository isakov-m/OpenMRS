package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us10HasRanSaat extends BaseDriver {

    @Test
    public  void TS10(){

        Elements e=new Elements();
        e.grs.click();
        MyFunc.Bekle(3);
        e.Mr2D.click();
        e.usrnm.sendKeys("admin");
        e.pss.sendKeys("Admin123");
        e.loc.click();
        e.lgn.click();
        e.randevu.click();
        e.ranynt.click();
        e.suchen.sendKeys("Ali Cabbar");
        MyFunc.Bekle(3);
        e.Id.click();
        MyFunc.Bekle(3);
        Assert.assertTrue(!e.dgrlmaeror.getText().contains("text"), "Dogrulanamadi");

    }


}
