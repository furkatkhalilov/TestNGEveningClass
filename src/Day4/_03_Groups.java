package Day4;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test(groups = "Regression")
    public void Test1(){
        System.out.println("Test1 for Regression");
    }

    @Test(groups = "Regression")
    public void Test2(){
        System.out.println("Test2 for Regression");
    }

    @Test(groups = "SmokeTest", priority = 2)
    public void Test3(){
        System.out.println("Test3 for Smoke");
    }

    @Test(groups = "SmokeTest" )
    public void Test4(){
        System.out.println("Test4 for Smoke");
    }

//    We are able to add multiple parameter in the test
    @Test(groups = "SmokeTest", enabled = false )
    public void Test5(){
        System.out.println("Test5 for Smoke");
    }

    @Test
    public void Test6(){
        System.out.println("Test 6 for no group");
    }

    /*
        Please run the Day2.ValidateMenu
            add it in the regression test

            Day2.subscribe in the smoke test
            Day2.EditAccount in the smoke test
     */


}
