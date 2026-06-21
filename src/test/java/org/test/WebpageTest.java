package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebpageTest {

    @Test
    public void testPageTitle() {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/jeeva/IdeaProjects/SimpleProject/SimpleProject/src/main/resources/index.html");

        String title = driver.getTitle();

        Assert.assertEquals(title, "My Simple Website");

        driver.quit();
    }
}