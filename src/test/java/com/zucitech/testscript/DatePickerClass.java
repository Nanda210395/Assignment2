package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerClass extends BaseClass {
    private String defaultDateValue;
    private WebElement dateText_Box;
    /*initial setup for DatePicker method*/
    @BeforeMethod
    public void beforeDatePick() {
        selector = new SelectorClass();
        driver.findElement(selector.datePickerLink).click();
        dateText_Box=driver.findElement(selector.dateTextBox);
        dateText_Box.click();
    }
    /*validating datePickerTable_Visible or not*/
    @Test
    public void datePickerTable_Visible() {
        defaultDateValue = dateText_Box.getAttribute("value");
        WebElement dateTableVisible = driver.findElement(selector.datePickerTable);
        /*Assert.assertTrue(dateTableVisible.isDisplayed());*/
        CustomAssert.areTrue(dateTableVisible.isDisplayed());
    }
    /*validating currentDate is Highlighted or not*/
    @Test
    public void currentDate_Highlighted() {
        WebElement todaysDate = driver.findElement(selector.todaysDate);
        String todaysDateBackgroundColor = todaysDate.getCssValue("background");
        CustomAssert.areNotEquals(selector.defaultBackgroundColor, todaysDateBackgroundColor);
       /* Assert.assertNotEquals(selector.defaultBackgroundColor, todaysDateBackgroundColor);*/
    }
    /*validating otherDate is possible to select or not*/
    @Test
    public void otherDate_Selection(){
        WebElement otherDate =driver.findElement(selector.otherDate);
        otherDate.click();
        String otherDateValue = dateText_Box.getAttribute("value");
        CustomAssert.areNotEquals(defaultDateValue,otherDateValue);
       /* Assert.assertNotEquals(defaultDateValue,otherDateValue);*/
    }
}