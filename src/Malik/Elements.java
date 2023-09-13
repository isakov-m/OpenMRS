package Malik;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    String adi="Ali";

    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;
    @FindBy (id = "loginButton")
    public WebElement loginBtn;
    @FindBy (linkText = "Register a patient")
    public WebElement rgstrPatient;
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy (name = "familyName")
    public WebElement famName;
    @FindBy(id = "next-button")
    public WebElement nextBtn;
    @FindBy(id = "gender-field")
    public WebElement gndrField;
    @FindBy(id = "birthdateDay-field")
    public WebElement brthDay;
    @FindBy(id = "birthdateMonth-field")
    public WebElement brthMonth;
    @FindBy (id="birthdateYear-field")
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
    @FindBy (id = "submit")
    public WebElement confirm;
    @FindBy(className = "PersonName-givenName")
    public WebElement confirmName;
    @FindBy(css = "div[class='float-sm-right']>span")
    public WebElement confirmId;












}
