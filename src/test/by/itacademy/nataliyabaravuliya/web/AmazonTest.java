package by.itacademy.nataliyabaravuliya.web;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    @Test
    public void testOpenAmazon() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(AmazonPage.URL);
        By copyright = By.xpath(AmazonPage.COPYRIGHT);
        WebElement COPYRIGHT = driver.findElement(copyright);
        Assert.assertTrue(COPYRIGHT.isDisplayed());
        driver.quit();

    }
    @Test
    public void testOpenAmazonCart() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(AmazonPage.URL);
        By btn_cart = By.xpath(AmazonPage.BTN_CART);
        WebElement BTN_CART = driver.findElement(btn_cart);
        BTN_CART.click();
        By label = By.xpath(AmazonPage.LABEL);
        WebElement LABEL = driver.findElement(label);
        Assert.assertTrue(LABEL.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenAmazonLoginForm() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(AmazonPage.URL);
        By btn_cart = By.xpath(AmazonPage.BTN_CART);
        WebElement BTN_CART = driver.findElement(btn_cart);
        BTN_CART.click();
        By btn_enter = By.xpath(AmazonPage.BTN_ENTER);
        WebElement BTN_ENTER = driver.findElement(btn_enter);
        BTN_ENTER.click();
        By label1 = By.xpath(AmazonPage.LABEL1);
        WebElement LABEL1 = driver.findElement(label1);
        Assert.assertTrue(LABEL1.isDisplayed());
        driver.quit();

    }
    @Test
    public void testAmazonLoginFormWithEmptyCredentials() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(AmazonPage.URL);
        By btn_cart = By.xpath(AmazonPage.BTN_CART);
        WebElement BTN_CART = driver.findElement(btn_cart);
        BTN_CART.click();
        By btn_enter = By.xpath(AmazonPage.BTN_ENTER);
        WebElement BTN_ENTER = driver.findElement(btn_enter);
        BTN_ENTER.click();
        By btn_continue = By.xpath(AmazonPage.BTN_CONTINUE);
        WebElement BTN_CONTINUE = driver.findElement(btn_continue);
        BTN_CONTINUE.click();
        driver.quit();
        //выполнить проверку
    }
}
