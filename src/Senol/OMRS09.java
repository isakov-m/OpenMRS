package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class OMRS09 extends BaseDriver {
    @Test
    public void OMRS06HastaListesindeArama() {

        Elements e = new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(e.demoButton));
        e.demoButton.click();
        e.enterOpenMrs2Demo.click();
        e.userName.sendKeys("admin");
        e.password.sendKeys("Admin123");
        List<WebElement> locations = driver.findElements(By.cssSelector("[id='sessionLocation'] li"));
        locations.get(new Random().nextInt(locations.size())).click();
        e.loginButton.click();

        String myidText1 = null;
        String myidText2 = null;

        wait.until(ExpectedConditions.elementToBeClickable(e.registerButton));
        e.registerButton.click();
        e.given.sendKeys("Ali Cebbar");
        e.familyName.sendKeys("TAkmettinOglu");
        e.nextButton.click();
        e.gender.click();
        e.nextButton.click();
        e.years.sendKeys("35");
        e.months.sendKeys("11");
        e.nextButton.click();
        e.nextButton.click();
        e.country.sendKeys("Germany");
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.submit));
        e.submit.click();
        wait.until(ExpectedConditions.visibilityOf(e.myidText1));
        myidText1 =e.myidText1.getText();
        System.out.println("e.myidText1 = " + myidText1);
        e.logo.click();

        wait.until(ExpectedConditions.elementToBeClickable(e.registerButton));
        e.registerButton.click();
        e.given.sendKeys("Ali Cebbar");
        e.familyName.sendKeys("TAkmettinOglu");
        e.nextButton.click();
        e.gender.click();
        e.nextButton.click();
        e.years.sendKeys("35");
        e.months.sendKeys("11");
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        e.country.sendKeys("Germany");
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.nextButton));
        e.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.submit));
        e.submit.click();
        wait.until(ExpectedConditions.visibilityOf(e.myidText2));
        myidText2 = e.myidText2.getText();
        System.out.println("e.myidText2 = " + myidText2);
        e.logo.click();
        e.dataManager.click();
        e.mergePatient.click();
        wait.until(ExpectedConditions.visibilityOf(e.patient1));
        e.patient1.sendKeys(myidText1);
        e.patient2.sendKeys(myidText2);
        wait.until(ExpectedConditions.visibilityOf(e.dropMenu));
        e.dropMenu.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.conTinue));
        e.conTinue.click();
        wait.until(ExpectedConditions.elementToBeClickable(e.firstPatient));
        e.firstPatient.click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.visibilityOf(e.message));
        Assert.assertTrue(e.message.getText().contains("Merging"));
        e.yesConfirm.click();
        wait.until(ExpectedConditions.visibilityOf(e.patientIds));
        Assert.assertTrue(e.patientIds.getText().contains("100"));

    }
}
