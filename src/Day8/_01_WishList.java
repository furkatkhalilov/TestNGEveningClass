package Day8;

import Day7._05_PlaceOrderElements;
import Utils.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_WishList extends BaseDriver {


    @Test
    public void WishListTest(){

        /*
            Search input and search button elments are coming from the _05_PlaceOrderElements
                Which we worked on it in the last class
                With a page object model we can use same element for different classes , @Test

         */

        _02_WishListElements wishListElements = new _02_WishListElements(driver);
        _05_PlaceOrderElements placeOrderElements = new _05_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("Mac");

        placeOrderElements.searchButton.click();

        System.out.println(wishListElements.hearthIconList.size());

        System.out.println(wishListElements.nameListInTheItemPage.size());

        /*
            Click on the hearth icon one by one

         */
        for(WebElement eachHearthIcon:wishListElements.hearthIconList){

            eachHearthIcon.click();

//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        wishListElements.wishListButton.click();
    }

}
