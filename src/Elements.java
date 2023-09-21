import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(linkText = "Demo")
    public WebElement demo;
    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement demo2;
    @FindBy(xpath = "(//div[@class='elementor-button-wrapper'])[4]")
    public WebElement demo3;
    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(id = "loginButton")
    public WebElement loginBtn;
    @FindBy(linkText = "Register a patient")
    public WebElement rgstrPatient;
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy(name = "familyName")
    public WebElement famName;
    @FindBy(id = "next-button")
    public WebElement nextBtn;
    @FindBy(id = "gender-field")
    public WebElement gndrField;
    @FindBy(id = "birthdateDay-field")
    public WebElement brthDay;
    @FindBy(id = "birthdateMonth-field")
    public WebElement brthMonth;
    @FindBy(id = "birthdateYear-field")
    public WebElement brthYear;
    @FindBy(id = "cityVillage")
    public WebElement cityVillage;
    @FindBy(id = "stateProvince")
    public WebElement stateProvince;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "postalCode")
    public WebElement postalCode;
    @FindBy(name = "phoneNumber")
    public WebElement phNumber;
    @FindBy(id = "relationship_type")
    public WebElement rltnshpType;
    @FindBy(css = "[placeholder='Person Name']")
    public WebElement prsnName;
    @FindBy(id = "submit")
    public WebElement submit;
    @FindBy(className = "PersonName-givenName")
    public WebElement confirmName;
    @FindBy(css = "div[class='float-sm-right']>span")
    public WebElement confirmId;
    @FindBy(css = "[id='sessionLocation'] li")
    public List<WebElement> locations;
    @FindBy(css = "li[class='nav-item identifier']")
    public WebElement admin;
    @FindBy(xpath = "//li[@class='nav-item identifier']")
    public WebElement myAcHo;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement clck;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changePassword.page']")
    public WebElement dogrulama;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changeDefaults.page']")
    public WebElement dogrulama2;
    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement randevu;
    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement ranynt;
    @FindBy(id = "patient-search")
    public WebElement suchen;
    @FindBy(className = "odd")
    public WebElement Id;
    @FindBy(xpath = "//div[@class='text']/p")
    public WebElement dgrlmaeror;
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
    @FindBy(id = "patient-search-results-table_next")
    public WebElement nextButton;
    @FindBy(css = "[value='M']")
    public WebElement gender;
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
    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> numberOfLineS;
    @FindBy(css = "div[class='dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers'] span a")
    public List<WebElement> sayfaNumber;
    @FindBy(css = "[class='nav-item logout']>a")
    public WebElement logout;
    @FindBy(css = "[class='icon-search']")
    public WebElement findPatient;
    @FindBy(id = "patient-search")
    public WebElement findKutusu;
    @FindBy(xpath = "//*[text()='No matching records found']")
    public WebElement mssj;
    @FindBy(className = "odd")
    public WebElement adBul;
    @FindBy(id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deleteTus;
    @FindBy(id = "delete-reason")
    public WebElement deleteReason;
    @FindBy(xpath = "(//button[@class='confirm right'])[6]")
    public WebElement confirmBtn;
    @FindBy(xpath = "//*[text()='Patient has been deleted successfully']")
    public WebElement dltSuccessMsg;
    @FindBy(xpath = "//*[contains (text(),'Record merged!)]")

    public WebElement mergedMsg;
    @FindBy(id = "sessionLocationError")
    public WebElement locationerr;
    @FindBy(id = "error-message")
    public WebElement loginFailMsg;
}
