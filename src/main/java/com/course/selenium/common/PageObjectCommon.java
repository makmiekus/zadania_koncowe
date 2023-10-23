package com.course.selenium.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

public class PageObjectCommon {
    protected WebDriver driver;

    public PageObjectCommon(){
        this.driver = Hook.driver;
        PageFactory.initElements(driver, this);
    }

    public void getScreenshot(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("./image.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitFor(Function<WebDriver, WebElement> conditions, int maxWait){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxWait));
        wait.until(conditions);
    }
}
