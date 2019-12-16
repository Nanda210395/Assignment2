package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableClass extends BaseClass{
    /*initial setup for selectElement method*/
    @BeforeMethod
    public void beforeExecutingSelectElementMethod(){
        selector = new SelectorClass();
        driver.findElement(selector.selectableLink).click(); }
    @Test
   /*validating elements are selectable or not*/
    public void selectElement(){
        WebElement selectingItem1=driver.findElement(selector.selectedItem);
        String backgroundBeforeSelect=selectingItem1.getCssValue("background");
        selectingItem1.click();
        String backgroundAfterSelect=selectingItem1.getCssValue("background");
        /*Assert.assertNotEquals(backgroundBeforeSelect,backgroundAfterSelect);*/
        CustomAssert.areNotEquals(backgroundBeforeSelect,backgroundAfterSelect);
    }
}
