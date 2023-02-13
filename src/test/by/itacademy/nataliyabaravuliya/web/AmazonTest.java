package by.itacademy.nataliyabaravuliya.web;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest{
    @Test
    public void testOpenAmazon(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(AmazonPage.URL);
        By copyright = By.xpath(AmazonPage.COPYRIGHT);
        WebElement COPYRIGHT = driver.findElement(copyright);
        Assert.assertTrue(COPYRIGHT.isDisplayed());
        driver.quit();

    }
}
