package Emre;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@href='https://openmrs.org/demo/']")
    public WebElement grs;
    @FindBy(xpath = "//span[contains(text(), 'Enter the OpenMRS 2 Demo')]")
    public  WebElement Mr2D;
    @FindBy(id = "username")
    public WebElement usrnm;
    @FindBy (id = "password ")
    public WebElement pss;
    @FindBy (id = "Inpatient Ward")
    public WebElement loc;
    @FindBy (id = "loginButton")
    public WebElement lgn;
    @FindBy(xpath = "//li[@class='nav-item identifier']")
    public WebElement myAcHo;
    @FindBy (xpath = "//a[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement clck;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changePassword.page']")
    public WebElement dogrulama;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changeDefaults.page']")
    public  WebElement dogrulama2;
    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement randevu;
    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement ranynt;
    @FindBy(id = "patient-search")
    public WebElement suchen;
    @FindBy (xpath = "//td[text()='Ali Cabbar']")
    public WebElement Id;
    @FindBy (xpath = "//div[@class='text']/p")
    public WebElement dgrlmaeror;



}
