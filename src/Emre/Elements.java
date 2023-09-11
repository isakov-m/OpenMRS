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
    @FindBy (id = "password")
    public WebElement pss;
    @FindBy (id = "Inpatient Ward")
    public WebElement loc;
    @FindBy (id = "loginButton")
    public WebElement lgn;
    @FindBy(xpath = "(//*[@id='navbarSupportedContent']/ul/li[1]/i[1]")
    public WebElement myAcHo;

}
