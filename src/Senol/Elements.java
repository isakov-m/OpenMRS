package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {


    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);

    }

    @FindBy(css = "a[class='zak-button']")
    public WebElement demoButton;

    @FindBy(css = "a[href='https://demo.openmrs.org/openmrs/login.htm']")
    public WebElement enterOpenMrs2Demo;
    @FindBy(css = "input[id='username']")
    public WebElement  userName;
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
    @FindBy(css = "[id='apps']>:nth-child(4)")
    public WebElement registerButton;
    @FindBy(name = "givenName")
    public WebElement given;
    @FindBy(name = "familyName")
    public WebElement familyName;
    @FindBy(id = "next-button")
    public WebElement nextButton;
    @FindBy(css = "[value='M']")
    public WebElement gender;
    @FindBy(name = "birthdateYears")
    public WebElement years;
    @FindBy(name = "birthdateMonths")
    public WebElement months;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "submit")
    public WebElement submit;
    @FindBy(css = "div[class=float-sm-right]>:nth-child(2)")
    public WebElement myidText1;


    @FindBy(css = "div[class=float-sm-right]>:nth-child(2)")
    public WebElement myidText2;

    @FindBy(css = "div[class='logo']")
    public WebElement logo;
    @FindBy(css = "[class='icon-hdd']")
    public WebElement dataManager;
    @FindBy(css = "[class='icon-group']")
    public WebElement mergePatient;
    @FindBy(css = "span[id='selected-location']")
    public WebElement dropMenu;
    @FindBy(id = "confirm-button")
    public WebElement conTinue;
    @FindBy(css = "div[class='messages-container'] h1")
    public WebElement message;
    @FindBy(xpath = "(//div[@id='first-patient']//h3)[1]")
    public WebElement firstPatient;
    @FindBy(id = "confirm-button")
    public WebElement yesConfirm;
    @FindBy(css = "div[class='float-sm-right']")
    public WebElement patientIds;

    @FindBy(css = "[id='patient1-text']")
    public WebElement patient1;

    @FindBy(css = "[id='patient2-text']")
    public WebElement patient2;








}
