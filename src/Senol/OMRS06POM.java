package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OMRS06POM extends BaseDriver {

    @Test

    public void  OMRS06HastaListesindeArama(){

        OMRS06Elements elements=new OMRS06Elements();

        driver.get("https://openmrs.org");

        wait.until(ExpectedConditions.elementToBeClickable(elements.demoButton));

        elements.demoButton.click();
        elements.enterOpenMrs2Demo.click();
        elements.userName.sendKeys("admin");
        elements.password.sendKeys("Admin123");
        elements.location.click();
        elements.loginButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.findPatientRecord));
        elements.findPatientRecord.click();

        elements.searchBox.sendKeys("iris");

        elements.patientSelect.click();

        wait.until(ExpectedConditions.visibilityOf(elements.dashBoard));
        Assert.assertTrue(elements.dashBoard.getText().contains("DIAGNOSES"));

        driver.navigate().back();

        elements.searchBox.sendKeys("Senol");

        wait.until(ExpectedConditions.visibilityOf(elements.notMatching));
        Assert.assertTrue(elements.notMatching.isDisplayed());

        bekleVeKapat();

    }
}
