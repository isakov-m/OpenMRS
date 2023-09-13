package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OMRS06Elements {
    public OMRS06Elements() {
        PageFactory.initElements(BaseDriver.driver, this);

    }

    @FindBy(css = "a[class='zak-button']")
    public WebElement demoButton;

    @FindBy(css = "a[href='https://demo.openmrs.org/openmrs/login.htm']")
    public WebElement enterOpenMrs2Demo;
    @FindBy(css = "input[id='username']")
    public WebElement userName;
    @FindBy(css = "input[id='password']")
    public WebElement password;
    @FindBy(css = "li[id='Inpatient Ward']")
    public WebElement location;
    @FindBy(css = "input[id='loginButton']")
    public WebElement loginButton;
    @FindBy(css = "div[id='apps']>:nth-child(1)")
    public WebElement findPatientRecord;
    @FindBy(css = "input[id='patient-search']")
    public WebElement searchBox;
    @FindBy(css = "[aria-live='polite']")
    public WebElement patientSelect;
    @FindBy(xpath = "//*[text()='DIAGNOSES']")
    public WebElement dashBoard;
    @FindBy(css = "[class='dataTables_empty']")
    public WebElement notMatching;


}
