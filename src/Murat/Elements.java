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
}
