package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyStorePage extends PageObjectCommon {
    public void clickProduct(String product){
        driver.findElement(By.xpath("//article[.//*[contains(text(),'"+product+"')]]")).click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id='product']//nav")),30);
    }
}
