package Day1;

import Utils.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _03_Sample extends BaseDriver {

    @Test
    public void test1(){

        String u1 = driver.getCurrentUrl();

        System.out.println(u1);
    }

    @Test
    public void test2(){

        String u1 = driver.getCurrentUrl();

        System.out.println(u1);
    }

}

