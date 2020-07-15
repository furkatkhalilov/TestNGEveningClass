package Day3;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Random;

public class _02_AddressFunctionality extends BaseDriver {
    

    @Test
    public void AddAddress(){

        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        WebElement NewAddressButton = driver.findElement(By.linkText("New Address"));
        NewAddressButton.click();

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("Johhny");

        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("Cash");

        WebElement inputCompany = driver.findElement(By.id("input-company"));
        inputCompany.sendKeys("Techno Strudy");

        WebElement inputAddress1 = driver.findElement(By.id("input-address-1"));
        inputAddress1.sendKeys("600 perry Ellis Dr");

        WebElement inputAddress2 = driver.findElement(By.id("input-address-2"));
        inputAddress2.sendKeys("Apt 2");

        WebElement inputCity = driver.findElement(By.id("input-city"));
        inputCity.sendKeys("12312323123123123123");

        WebElement inputPostcode = driver.findElement(By.id("input-postcode"));
        inputPostcode.sendKeys("12345");

        WebElement countryDropdown = driver.findElement(By.id("input-country"));

        selectByIndex(countryDropdown);

        WebDriverWait wait = new WebDriverWait(driver , 10);

        By optionsForState = By.xpath("//select[@id='input-zone']/option");

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(optionsForState , 2));

        WebElement StateDropdown = driver.findElement(By.id("input-zone"));

        selectByIndex(StateDropdown);

    }

    public void selectByIndex(WebElement dropdownName ){

        Select s1 = new Select(dropdownName);

        s1.selectByIndex(RandomNumberGenerator(s1.getOptions().size()));// s1.getOptions().size() return is how many options we have in the dropdown

    }

//    Create a random number generator method and use it in the selectByIndex method

    public int RandomNumberGenerator(int max){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max);
        return randomNumber;
    }

}

    /*
        Create a Method which is choosing the element from from the dropdown
     */

        /*
            StaleElementReferenceException
                After find the element page is refreshed that is why element is not able find it
         */
