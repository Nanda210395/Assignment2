package com.zucitech.testscript;

import com.zucitech.selector.SelectorClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardEvent extends BaseClass{
    /*initial setup for keyboardEvent method*/
    @BeforeMethod
    public void beforeExecutingSelectElementMethod() {
        selector = new SelectorClass();
        driver.findElement(selector.keyboardEventLink).click();
    }
    @Test
    /*validating file can be uploaded or not*/
    public void keyboardEvent(){
        driver.findElement(selector.uploadSelector).click();
        Alert alertBeforeUpload=driver.switchTo().alert();
        String alertMessageBeforeUploadFile=alertBeforeUpload.getText();
        alertBeforeUpload.accept();
        WebElement filePath =driver.findElement(selector.filePathSelector);
        filePath.click();
        filePath.sendKeys(selector.filePath);
        driver.findElement(selector.uploadSelector).click();
        Alert alertAfterUpload=driver.switchTo().alert();
        String alertMessageAfterUploadFile=alertAfterUpload.getText();
        /*Assert.assertNotEquals(alertMessageAfterUploadFile,alertMessageBeforeUploadFile);*/
        CustomAssert.areNotEquals(alertMessageAfterUploadFile,alertMessageBeforeUploadFile);
    }
}