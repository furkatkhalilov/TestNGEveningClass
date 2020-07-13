package Utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {

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
}
