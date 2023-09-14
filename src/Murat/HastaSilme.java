package Murat;

import Murat.Elements;
import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HastaSilme extends BaseDriver {
    @Test
    public  void HastaSilTest(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        Elements e = new Elements();
        e.username.sendKeys("Admin");
        e.password.sendKeys("Admin123");
        e.inpatientWard.click();
        e.loginBtn.click();
        visibilityOf(e.findPatient);
        e.findPatient.click();
        e.findKutusu.sendKeys("Murat");
        visibilityOf(e.mssj);
        Assert.assertTrue(e.mssj.getText().equals("No matching records found"),"dogrulanamadi");

        e.findKutusu.clear();
        e.findKutusu.sendKeys("Ali");
        e.adBul.click();
        visibilityOf(e.deleteTus);
        e.deleteTus.click();
        e.deleteReason.click();
        visibilityOf(e.deleteReason);
        e.deleteReason.sendKeys("Yes");
        visibilityOf(e.confirmBtn);
        e.confirmBtn.click();


    }
}
