package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Sortable extends BaseClass {
    /*initial setup for sortableElements method*/
    @BeforeMethod
    public void beforeExecutingSortableElementMethod() {
        selector = new SelectorClass();
        driver.findElement(selector.sort).click(); }
    /*Validating Elements are sortable*/
    @Test
    public void sortableElements() throws InterruptedException {
        List<WebElement> listBeforeSort = driver.findElements(selector.allSortableElements);
        WebElement firstElementBeforeSorting=listBeforeSort.get(0);
        String beforeSort=firstElementBeforeSorting.getText();
        Actions action = new Actions(driver);
        WebElement sourceLocator = driver.findElement(selector.firstElementBeforeSort);
        WebElement targetLocator = driver.findElement(selector.targetElementBeforeSort);
        action.dragAndDrop(targetLocator,sourceLocator).build().perform();
        List<WebElement> listAfterSort = driver.findElements(selector.allSortableElements);
        WebElement firstElementAfterSorting=listAfterSort.get(0);
        String afterSort=firstElementAfterSorting.getText();

        /*Assert.assertNotEquals(beforeSort,afterSort);*/
    }
}