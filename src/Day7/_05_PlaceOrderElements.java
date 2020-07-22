package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_PlaceOrderElements {

    /*
        In this class we are going to have all the elements for the _04_PlaceOrderCode class
     */

    public _05_PlaceOrderElements(WebDriver driver){
        PageFactory.initElements(driver,this); //
    }

//    The @FindBy annotation is used in Page Objects in Selenium tests to
//      specify the object location strategy for a WebElement or a list of WebElements.
//      Using the PageFactory, these WebElements are usually initialized when a Page Object is created.

//    Xpath and css is a locator type if you would like to use id or className just change it to id or classname
    @FindBy(css = "input[placeholder='Search']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchButton;

    // find an element for the first option in the item page and click on it.

//    @FindBy(linkText = "Palm Treo Pro")
//    public WebElement Item1;      Example for the linkText

    @FindBy(xpath = "(//div[@class='caption']//a)[1]")
    public WebElement Item1;





}
