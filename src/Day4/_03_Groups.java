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

//    We are able to add multiple parameter in the test
    @Test(groups = "SmokeTest" , priority = 1)
    public void Test4(){
        System.out.println("Test4 for Smoke");
    }
    
}
