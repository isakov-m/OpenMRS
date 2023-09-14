package Murat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {


    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;
    @FindBy (id = "loginButton")
    public WebElement loginBtn;
    @FindBy(xpath = "//i[@class='icon-signout small']")
    public WebElement logout;

    @FindBy (css = "[class='icon-search']")
    public WebElement findPatient;

    @FindBy (id ="patient-search")
    public WebElement findKutusu;

    @FindBy (xpath = "//*[text()='No matching records found']")
    public WebElement mssj;

    @FindBy (xpath = "(//*[@class='even'])[1]")
    public WebElement adBul;

    @FindBy (id="org.openmrs.module.coreapps.deletePatient")
    public  WebElement deleteTus;

    @FindBy (id ="delete-reason")
    public  WebElement deleteReason;

    @FindBy(xpath = "(//button[@class='confirm right'])[6]")
    public WebElement confirmBtn;
}
