import by.itacademy.nataliyabaravuliya.web.OnlinerPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OnlinerTest {
    @Test
    public void testOpenOnliner() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By copyright = By.xpath(OnlinerPage.COPYRIGHT);
        WebElement element = driver.findElement(copyright);
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }

    @Test
    public void testOpenOnlinerLoginForm() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By btn_login = By.xpath(OnlinerPage.BTN_LOGIN);
        WebElement element = driver.findElement(btn_login);
        element.click();
        By label = By.xpath(OnlinerPage.LABEL);
        WebElement element1 = driver.findElement(label);
        Assert.assertTrue(element1.isDisplayed());
        driver.quit();
    }

    @Test
    public void testOnlinerLoginFormWithEmptyCredentials() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By btn_login = By.xpath(OnlinerPage.BTN_LOGIN);
        WebElement element = driver.findElement(btn_login);
        element.click();
        By btn_enter = By.xpath(OnlinerPage.BTN_ENTER);
        WebElement element2 = driver.findElement(btn_enter);
        element2.click();
        //Assert.assertTrue(element1.isDisplayed());
        // driver.quit();
    }


    //element1.sendKeys("test@gmail.com");
}

