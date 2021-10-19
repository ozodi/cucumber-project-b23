package com.cydeo.step_definitions;

import com.cydeo.pages.WAllProductPage;
import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WebOrderStepDef {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);
        WCommonArea commonArea = new WCommonArea();
        switch (tabName){
            case "View all products":
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders":
                commonArea.viewAllOrderTab.click();
                break;
            case "Order":
                commonArea.orderTab.click();
                break;
            default:
                System.out.println("it did not work");

        }

    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOptions ) {
        System.out.println("options = " + expectedOptions);

        WOrderPage orderPage =new WOrderPage();
        WebElement dropDown = orderPage.productDropdown;
        Select selectObj = new Select(dropDown);

        //to
        List<WebElement> allProductOption =  selectObj.getOptions();
//      this is the list ot store actual option so we can compare with expected
        List<String> actualOptions = new ArrayList<>();

        for(WebElement eachOption :  allProductOption){
            System.out.println(eachOption.getText());
            actualOptions.add(eachOption.getText());
        }

        assertEquals( expectedOptions,actualOptions );


    }

    @Then("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<Map<String,String>> productMap) {
        System.out.println("productMap = " + productMap);
        WAllProductPage allProductPage =new WAllProductPage();
        //get expected headers:

         Set<String> headerSet = productMap.get(0).keySet();
        System.out.println("headerSet = " + headerSet);

        List<String > actualHeaders = allProductPage.getAllHeaderText();
        System.out.println("actualHeaders = " + actualHeaders);
        //check the size is the same
        assertEquals( headerSet.size() , actualHeaders.size() );

        // list to set equality check will not work
        // so we need to turn the set into list
        List<String> expectedHeaders = new ArrayList<>( headerSet );
        assertEquals(expectedHeaders,actualHeaders);

    }

}
