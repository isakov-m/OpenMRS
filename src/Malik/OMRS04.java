package Malik;

import Utlity.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OMRS04 extends BaseDriver {

    @Test
    public void OMRS04() {

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        Elements e = new Elements();
        e.username.sendKeys("Admin");
        e.password.sendKeys("Admin123");
        e.inpatientWard.click();
        e.loginBtn.click();
        visibilityOf(e.rgstrPatient);
        e.rgstrPatient.click();
        visibilityOf(e.givenName);
        e.givenName.sendKeys(e.adi);
        e.famName.sendKeys("Cabbar");
        e.nextBtn.click();
        Select select = new Select(e.gndrField);
        select.selectByValue("M");
        e.nextBtn.click();
        visibilityOf(e.brthDay);
        e.brthDay.sendKeys("1");
        Select select1 = new Select(e.brthMonth);
        select1.selectByIndex(1);
        e.brthYear.sendKeys("2000");
        e.nextBtn.click();
        visibilityOf(e.cityVillage);
        e.cityVillage.sendKeys("Ramenki");
        e.stateProvince.sendKeys("Moscow");
        e.country.sendKeys("Russia");
        e.postalCode.sendKeys("111");
        e.nextBtn.click();
        visibilityOf(e.phNumber);
        e.phNumber.sendKeys("+74323235523");
        e.nextBtn.click();
        visibilityOf(e.rltnshpType);
        Select select2 = new Select(e.rltnshpType);
        select2.selectByIndex(4);
        e.prsnName.sendKeys("Farruko");
        e.nextBtn.click();
        visibilityOf(e.confirm);
        e.confirm.click();

        Assert.assertTrue(e.confirmName.getText().equals(e.adi), "Hasta isimi eslesmiyor.");
        Assert.assertTrue(!e.confirmId.getText().isEmpty(), "Hasta aydisi yok.");

    }

}
