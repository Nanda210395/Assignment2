package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResizableClass extends BaseClass {
    /*initial setup for resize method*/
    @BeforeMethod
    public void beforeResize() {
        selector = new SelectorClass();
        driver.findElement(selector.resizableLink).click(); }
    /*Resize the element and validating it*/
    @Test
    public void resize() {
        WebElement initialSize=driver.findElement(selector.resize);
        String initialWidth=initialSize.getCssValue("width");
        WebElement verticalDrag=driver.findElement(selector.verticalBar);
        Actions actions = new Actions(driver);
        Action dragVerticalBar= actions.clickAndHold(verticalDrag).moveByOffset(580,151).release().build();
        dragVerticalBar.perform();
        WebElement afterResize=driver.findElement(selector.resize);
        String newWidth=afterResize.getCssValue("width");
       /* Assert.assertNotEquals(initialWidth,newWidth);*/
        CustomAssert.areNotEquals(initialWidth,newWidth);
    }
}