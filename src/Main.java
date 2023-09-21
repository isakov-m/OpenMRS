import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class Main extends BaseDriver {
    @Test(dataProvider = "loginData",groups = {"Smoke","Login"})
    public void OMRS01(String userName, String password) {
        Elements e = new Elements();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        //driver.get("https://openmrs.org");
        //myClick(e.demo);
        //myClick(e.demo2);
        //myClick(e.demo3);
        mySendKeys(e.username, userName);
        mySendKeys(e.password, password);
        myClick(e.loginBtn);
        visibilityOf(e.locationerr);
        Assert.assertTrue(e.locationerr.getText().contains("You must choose a location!"), "Location secilmeden Login olundu.");
    }

    @DataProvider
    public Object[][] loginData() {
        Object[][] data = {{"Kullanici0", "admin123"}, {"", "admin123"}, {"admin", ""},
                {"fsfssdf", "fsfsdfs"}, {"sfsaa", "afdaffd"}, {"", "Admin123"}};
        return data;
    }


    @Test(dataProvider = "loginData2",groups = {"Smoke","Login"})
    public void OMRS02(String userName, String password) {
        Elements e = new Elements();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        //driver.get("https://openmrs.org");
        //myClick(e.demo);
        //myClick(e.demo2);
        //myClick(e.demo3);
        mySendKeys(e.username, userName);
        mySendKeys(e.password, password);
        e.locations.get(new Random().nextInt(e.locations.size())).click();
        myClick(e.loginBtn);

        if (driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/referenceapplication/home.page")) {
            Assert.assertTrue(e.findPatient.getText().contains("Find Patient Record"), "Giris yapilamadi.");
        } else {
            Assert.assertTrue(e.loginFailMsg.getText().contains("Invalid"));
        }

    }


    @DataProvider
    public Object[][] loginData2() {
        Object[][] data = {{"admin", ""}, {"", "Admin123"}, {"", ""}, {"321321", "1321"},
                {"1321", "sfdfs"}, {"14ffs", ""}, {"admin", "Admin123"}};
        return data;
    }

    @Test(groups = {"Smoke","Logout"})
    public void OMRS03() {
        Login();
        Elements e = new Elements();
        Assert.assertTrue(e.logout.getText().equals("Logout"),"Login yapilamadi.");
        myClick(e.logout);
        wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/login.htm"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/login.htm"), "Logout yapilamadi");
    }

    @Test(groups = {"Regression"})
    public void OMRS04() {
        Login();
        Elements e = new Elements();
        myClick(e.rgstrPatient);
        mySendKeys(e.givenName, "Ali");
        mySendKeys(e.famName, "Cabbar");
        e.nextBtn.click();
        Select select = new Select(e.gndrField);
        select.selectByValue("M");
        e.nextBtn.click();
        mySendKeys(e.brthDay, "1");
        Select select1 = new Select(e.brthMonth);
        select1.selectByIndex(1);
        mySendKeys(e.brthYear, "2000");
        e.nextBtn.click();
        mySendKeys(e.cityVillage, "Ramenki");
        mySendKeys(e.stateProvince, "Moscow");
        mySendKeys(e.country, "Russia");
        mySendKeys(e.postalCode, "111");
        e.nextBtn.click();
        visibilityOf(e.phNumber);
        e.phNumber.sendKeys("+74323235523");
        mySendKeys(e.phNumber, "+79162341212");
        e.nextBtn.click();
        visibilityOf(e.rltnshpType);
        Select select2 = new Select(e.rltnshpType);
        select2.selectByIndex(4);
        mySendKeys(e.prsnName, "Farruko");
        e.nextBtn.click();
        myClick(e.submit);

        Assert.assertTrue(e.confirmName.getText().equals("Ali"), "Hasta isimi eslesmiyor.");
        Assert.assertTrue(!e.confirmId.getText().isEmpty(), "Hasta ID si yok.");
    }

    @Test(groups = {"Smoke"})
    public void OMRS05() {
        Login();
        Elements e = new Elements();
        visibilityOf(e.rgstrPatient);
        MoveToElement(e.myAcHo);
        myClick(e.clck);

        Assert.assertTrue(e.dogrulama.getText().contains("Password"), "Sifre degistirme butonu bulunamadi.");
        Assert.assertTrue(e.dogrulama2.getText().contains("Languages"), "Dil degistirme butonu bulunamadi.");
    }


    @Test(groups = {"Patient Management"})
    public void OMRS06() {
        Login();
        Elements e = new Elements();
        myClick(e.findPatientRecord);
        mySendKeys(e.searchBox, "Ali Cabbar");
        myClick(e.patientSelect);
        visibilityOf(e.dashBoard);
        Assert.assertTrue(e.dashBoard.getText().contains("DIAGNOSES"), "");
        driver.navigate().back();
        mySendKeys(e.searchBox, "Senol");
        visibilityOf(e.notMatching);
        Assert.assertTrue(e.notMatching.isDisplayed(), "Listede olmayan kisi bulundu.");
    }

    @Test(groups = {"Patient Management","Smoke"})
    public void OMRS07() {
        Login();
        Elements e = new Elements();
        myClick(e.findPatient);
        mySendKeys(e.findKutusu, "Murat");
        visibilityOf(e.mssj);
        Assert.assertTrue(e.mssj.getText().equals("No matching records found"), "Listede olmayan kisi bulundu.");

        mySendKeys(e.findKutusu, "Ali");
        myClick(e.adBul);
        myClick(e.deleteTus);
        myClick(e.deleteReason);
        mySendKeys(e.deleteReason, "Yes");
        myClick(e.confirmBtn);
        visibilityOf(e.dltSuccessMsg);
        Assert.assertTrue(e.dltSuccessMsg.getText().equals("Patient has been deleted successfully"), "Hasta silme islemi basarisiz oldu.");
    }

    @Test(groups = {"Patient Management","Regression"})
    public void OMRS08() {
        Login();
        Elements e = new Elements();
        myClick(e.findPatientRecord);
        int boslukIndex = e.showingEntries.getText().lastIndexOf(" ");
        String sayi = e.showingEntries.getText().substring(boslukIndex - 2);
        String Entries = sayi.replaceAll("[^0-9]", "");
        int EntrieS = Integer.parseInt(Entries);
        int toplam = 0;
        int sayfa = 0;

        do {
            toplam += e.numberOfLineS.size();
            myClick(e.nextButton);
            sayfa++;
        } while (sayfa < e.sayfaNumber.size());

        Assert.assertEquals(toplam, EntrieS, "Listedeki hasta sayisiyla toplamdaki hasta sayisi ayni degil.");
    }

    @Test(groups = {"Patient Management","Regression"})
    public void OMRS09() {
        Login();
        Elements e = new Elements();
        visibilityOf(e.admin);
        String myidText1 = null;
        String myidText2 = null;

        myClick(e.rgstrPatient);
        mySendKeys(e.givenName, "Serg");
        mySendKeys(e.famName, "Filin");
        e.nextBtn.click();
        Select select = new Select(e.gndrField);
        select.selectByValue("M");
        e.nextBtn.click();
        mySendKeys(e.brthDay, "1");
        Select select1 = new Select(e.brthMonth);
        select1.selectByIndex(1);
        mySendKeys(e.brthYear, "2002");
        e.nextBtn.click();
        mySendKeys(e.cityVillage, "Ch");
        mySendKeys(e.stateProvince, "Moscow");
        mySendKeys(e.country, "Russia");
        mySendKeys(e.postalCode, "111");
        e.nextBtn.click();
        mySendKeys(e.phNumber, "+79162345672");
        e.nextBtn.click();
        visibilityOf(e.rltnshpType);
        Select select2 = new Select(e.rltnshpType);
        select2.selectByIndex(4);
        mySendKeys(e.prsnName, "Drake");
        e.nextBtn.click();
        myClick(e.submit);
        visibilityOf(e.myidText1);
        myidText1 = e.myidText1.getText();
        myClick(e.logo);

        myClick(e.rgstrPatient);
        mySendKeys(e.givenName, "Joao");
        mySendKeys(e.famName, "Pill");
        e.nextBtn.click();
        Select selectt = new Select(e.gndrField);
        selectt.selectByValue("M");
        e.nextBtn.click();
        mySendKeys(e.brthDay, "2");
        Select select11 = new Select(e.brthMonth);
        select11.selectByIndex(1);
        mySendKeys(e.brthYear, "2001");
        e.nextBtn.click();
        mySendKeys(e.cityVillage, "Piter");
        mySendKeys(e.stateProvince, "Saint Petersburg");
        mySendKeys(e.country, "Russia");
        mySendKeys(e.postalCode, "111");
        e.nextBtn.click();
        mySendKeys(e.phNumber, "+79162345212");
        e.nextBtn.click();
        visibilityOf(e.rltnshpType);
        Select select22 = new Select(e.rltnshpType);
        select22.selectByIndex(4);
        mySendKeys(e.prsnName, "Fiasko");
        e.nextBtn.click();
        myClick(e.submit);

        visibilityOf(e.myidText2);
        myidText2 = e.myidText2.getText();
        myClick(e.logo);
        myClick(e.dataManager);
        myClick(e.mergePatient);
        mySendKeys(e.patient1, myidText1);
        mySendKeys(e.patient2, myidText2);
        myClick(e.dropMenu);
        myClick(e.conTinue);
        myClick(e.firstPatient);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.visibilityOf(e.message));
        Assert.assertTrue(e.message.getText().contains("Merging"));
        e.yesConfirm.click();
        wait.until(ExpectedConditions.visibilityOf(e.patientIds));
        Assert.assertTrue(e.patientIds.getText().contains("100"));
    }

    @Test(groups = {"Regression","Appointment"})
    public void OMRS10() {
        Login();
        Elements e = new Elements();
        myClick(e.randevu);
        myClick(e.ranynt);
        mySendKeys(e.suchen, "Cabbar");
        MyFunc.Bekle(2);
        myClick(e.Id);
        visibilityOf(e.dgrlmaeror);
        Assert.assertTrue(e.dgrlmaeror.getText().contains("Your computer is not set to the right time zone."), "GMT saat hatasini alamadim.");
    }

    public void Login(){
        Elements e = new Elements();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        //driver.get("https://openmrs.org");
//        myClick(e.demo);
//        myClick(e.demo2);
//        myClick(e.demo3);
        mySendKeys(e.username, "admin");
        mySendKeys(e.password, "Admin123");
        e.locations.get(new Random().nextInt(e.locations.size())).click();
        e.loginBtn.click();
    }

}
