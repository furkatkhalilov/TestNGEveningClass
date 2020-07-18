package Day5;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionality extends BaseDriver {

    @Test
    public void searchFunctionality(){

        String text = "Mac";
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(text);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        /*
            1) is URL contains search text

            2) list of items

            3) contains search text

         */

        List<WebElement> itemNamesList = driver.findElements(By.tagName("h4"));

        System.out.println(itemNamesList);

        for(WebElement eachElement:itemNamesList){

            System.out.println(eachElement.getText());
//            Assert.assertTrue(eachElement.getText().contains(text));
            Assert.assertTrue(eachElement.getText().toLowerCase().contains(text.toLowerCase()));
        }

    }

    /*
        Create a xml file for _03_searchFunctionality

        Run the search functionality from that xml file

     */

}