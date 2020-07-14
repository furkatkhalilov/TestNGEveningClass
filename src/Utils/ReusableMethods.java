package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods extends BaseDriver{

     /*
        Create one method
        Parameter is two List of String
        Verify both of the list is equal

     */
    public static void verifyTwoStringList(List<String> list1 , List<String> list2){

        for(int i = 0 ; i <list1.size() ; i++){

//            System.out.println(list1.get(i).equals(list2.get(i)));
            Assert.assertEquals(list1.get(i) , list2.get(i));

        }

    }

        /*
            Create a method
            Which is taking a WebElement list
            Make each WebElement to String (get the text from each one)
            Return the List of String

         */

    public static List<String> WebElmentToString(List<WebElement> myElements){

        List<String> actualResultString = new ArrayList<>();

        for(WebElement eachElement:myElements){

            actualResultString.add(eachElement.getText());

        }

        return actualResultString;
    }


    //Create one method it should search for the sucess message and verify it
    public void verifySuccessMessage(WebDriver driver){

        WebElement SuccessMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']"));

        Assert.assertTrue(SuccessMessage.getText().contains("Success"));
//        Assert.assertEquals(SuccessMessage.getText() , "Success");
//         Success: Your account has been successfully updated.
//         Success: Your newsletter subscription has been successfully updated
    }

}
