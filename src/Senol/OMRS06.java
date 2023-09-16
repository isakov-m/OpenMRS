package Senol;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OMRS06 extends BaseDriver {

    @Test

    public void OMRS06HastaListesindeArama() {

        Elements e = new Elements();

        toBeClickable(e.demoButton);
        e.demoButton.click();
        elementeKadarKaydir(e.enterOpenMrs2Demo);
        e.enterOpenMrs2Demo.click();
        e.userName.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.location.click();
        e.loginButton.click();

        toBeClickable(e.findPatientRecord);
        e.findPatientRecord.click();
        e.searchBox.sendKeys("Ali Cabber");
        e.patientSelect.click();

        visibilityOf(e.dashBoard);
        Assert.assertTrue(e.dashBoard.getText().contains("DIAGNOSES"));

        driver.navigate().back();

        e.searchBox.sendKeys("Senol");

        visibilityOf(e.notMatching);
        Assert.assertTrue(e.notMatching.isDisplayed());




    }
}
