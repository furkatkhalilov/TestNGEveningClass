package Day2;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends BaseDriver {

    @Test
    public void validateMenu(){

        List<String> expectedMenuItems=new ArrayList<>();

        expectedMenuItems.add("Desktops");
        expectedMenuItems.add("Laptops & Notebooks");
        expectedMenuItems.add("Components");
        expectedMenuItems.add("Tablets");
        expectedMenuItems.add("Software");
        expectedMenuItems.add("Phones & PDAs");
        expectedMenuItems.add("Cameras");
        expectedMenuItems.add("MP3 Players");

        List<WebElement> actualResult = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));





    }
}
