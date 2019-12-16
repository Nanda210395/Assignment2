package com.zucitech.selector;

import org.openqa.selenium.By;

public class SelectorClass {

    /*Selectors for Sortable link*/
    public By sort= By.cssSelector("#sidebar > aside:nth-child(1) > ul > li:nth-child(1) > a");
    public By firstElementBeforeSort=By.xpath("//ul[@id='sortable']/li[1]");
    public By targetElementBeforeSort=By.xpath("//ul[@id='sortable']/li[5]");
    public By allSortableElements=By.xpath("//ul[@id='sortable']");

    /*Selectors for Selectable link*/
    public By selectableLink=By.xpath("//a[contains(text(),'Selectable')]");
    public By selectedItem=By.xpath("//li[contains(text(),'Item 1')]");

    /*Selectors for Resizable link*/
    public By resizableLink=By.xpath("//a[contains(text(),'Resizable')]");
    public By resize=By.xpath(("//div[@id='resizable']"));
    public By verticalBar=By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']");

    /*Selectors for Slider link*/
    public By sliderLink=By.xpath("//a[contains(text(),'Slider')]");
    public By slidableElement=By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']");

    /*Selectors for DataPicker*/
    public By datePickerLink=By.xpath("//a[contains(text(),'Datepicker')]");
    public By dateTextBox=By.xpath("//input[@id='datepicker']");
    public By datePickerTable=By.xpath("//div[@id='ui-datepicker-div']");
    public By todaysDate=By.xpath("//a[contains(@class,'ui-state-highlight')]");
    public By otherDate=By.xpath("//a[contains(text(),'21')]");
    public String defaultBackgroundColor="rgb(246, 246, 246)";

    /*Selectors for Keyboard events*/
    public By keyboardEventLink=By.xpath("//aside[2]//ul[1]//li[2]//a[1]");
    public By filePathSelector=By.xpath("//input[@id='browseFile']");
    public By uploadSelector=By.xpath("//button[@id='uploadButton']");
    public String filePath="/Users/shirn012/Desktop/Nanda/Jackson.json";
}

