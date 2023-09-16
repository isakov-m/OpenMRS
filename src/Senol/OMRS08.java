package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OMRS08 extends BaseDriver {

    @Test

    public void OMRS06HastaListesindeArama() {

        Elements e = new Elements();
        toBeClickable(e.demoButton);
        e.demoButton.click();
        e.enterOpenMrs2Demo.click();
        e.userName.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.location.click();
        e.loginButton.click();
        toBeClickable(e.findPatientRecord);
        e.findPatientRecord.click();

        int boslukIndex=e.showingEntries.getText().lastIndexOf(" ");
        String sayi=e.showingEntries.getText().substring(boslukIndex -2);
        System.out.println("sayi="+sayi);
        String Entries=sayi.replaceAll("[^0-9]", "");
        System.out.println("Entries = " + Entries);
        int EntrieS=Integer.parseInt(Entries);


        int toplam = 0;
        int sayfaNumber = e.sayfaNumber.size();
        System.out.println("sayfaNumber = " + sayfaNumber);
        for (int i = 0; i < 3; i++) {
            e.sayfaNumber.get(i).click();
            System.out.println("e.numberOfLineS.size() = " + e.numberOfLineS.size());

            toplam=toplam+e.numberOfLineS.size();
            System.out.println("toplam = " + toplam);


        }

        Assert.assertEquals(toplam, EntrieS);
    }


        }
        







