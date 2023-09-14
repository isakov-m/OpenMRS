package Murat;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class Logout extends BaseDriver {
    @Test
    public  void logoutTest(){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        Elements e=new Elements();
        e.username.sendKeys("Admin");
        e.password.sendKeys("Admin123");
        e.inpatientWard.click();
        e.loginBtn.click();
        e.logout.click();




    }
}
