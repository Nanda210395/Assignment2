package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderClass extends BaseClass {
    /*initial setup for slide method*/
    @BeforeMethod
    public void beforeSlide() {
        selector = new SelectorClass();
        driver.findElement(selector.sliderLink).click(); }
    /*Slide the element and validating it*/
    @Test
    public void slide() {
    WebElement SliderElement=driver.findElement(selector.slidableElement);
        String initialSlideCssValue=SliderElement.getCssValue("left");
        Actions actions = new Actions(driver);
        Action a= actions.clickAndHold(SliderElement).moveByOffset(231,100).release().build();
        a.perform();
        String afterSlideCssValue=SliderElement.getCssValue("left");
        /*Assert.assertNotEquals(initialSlideCssValue,afterSlideCssValue);*/
        CustomAssert.areNotEquals(initialSlideCssValue,afterSlideCssValue);
    }
}