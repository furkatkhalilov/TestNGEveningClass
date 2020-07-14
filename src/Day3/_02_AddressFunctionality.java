package Day3;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

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
        Select s1 = new Select(countryDropdown);
        s1.selectByIndex(5);

        
    }
}

    /*
        Create a Method which is choosing the element from from the dropdown
     */

