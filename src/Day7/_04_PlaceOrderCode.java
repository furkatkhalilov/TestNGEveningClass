package Day7;

import Utils.BaseDriver;
import org.testng.annotations.Test;

public class _04_PlaceOrderCode extends BaseDriver {


    @Test
    public void placeOrder(){

//        input[placeholder='Search']

        _05_PlaceOrderElements placeOrderElements = new _05_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("Palm");

        placeOrderElements.searchButton.click();

        placeOrderElements.Item1.click();

    }
}
