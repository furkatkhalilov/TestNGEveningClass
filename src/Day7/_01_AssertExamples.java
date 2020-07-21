package Day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_AssertExamples {

    /*
        Check all assert types.


        POM ( page object model )

     */

    @Test
    public void equalExample(){

        String actualResult = "Account updated successfully";

        Assert.assertEquals("Account updated successfully",actualResult);

    }

    @Test
    public void NotequalExample(){

        String actualResult = "Account updated successfully";

        Assert.assertNotEquals("Account updated ",actualResult); // actual vs expected result should
//                                                                                  not be equal

    }

    Integer integerELement;
    @Test
    public void NotNullExample(){

        Assert.assertNotNull(integerELement); // integerELement should not be null and if it is null
//                                                  then it will fail the @Test

    }

    Integer integerELement2;
    @Test
    public void NullExample(){
//        integerELement2=15; If I add this line then it will fail because integerELement2 is not null any more
        Assert.assertNull(integerELement2); // integerELement should be null and if it is not null
//                                                  then it will fail the @Test

    }


    @Test
    public void equalvsDotEquals(){

        /*
            AssertSame is working as == in Java
            AssertEquals is working as .equals in Java.
         */

        String s1 = new String("name");
        String s2 = new String("name");

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));  // true

        /*
            == vs .equals()

            == -> is looking for is the reference is also same for both of the variablese
            .equals -> checking the value

         */
    }

    @Test
    public void assertSameExample(){
//        assertSame is working as ==

        String s1 = new String("name");
        String s2 = new String("name");

        Assert.assertSame(s1,s2);

    }

    @Test
    public void assertEquals(){
//        assertEquals is working as .equals in Java

        String s1 = new String("name");
        String s2 = new String("name");

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        Assert.assertEquals(s1,s2);
        Assert.assertEquals(i1,i2);
    }
}
