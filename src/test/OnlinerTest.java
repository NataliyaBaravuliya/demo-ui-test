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
        WebElement COPYRIGHT = driver.findElement(copyright);
        Assert.assertTrue(COPYRIGHT.isDisplayed());
        driver.quit();
    }

    @Test
    public void testOpenOnlinerLoginForm() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By btn_login = By.xpath(OnlinerPage.BTN_LOGIN);
        WebElement BTN_LOGIN = driver.findElement(btn_login);
        BTN_LOGIN.click();
        By label = By.xpath(OnlinerPage.LABEL);
        WebElement LABEL = driver.findElement(label);
        Assert.assertTrue(LABEL.isDisplayed());
        driver.quit();
    }

    @Test
    public void testOnlinerLoginFormWithEmptyCredentials() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By btn_login = By.xpath(OnlinerPage.BTN_LOGIN);
        WebElement BTN_LOGIN = driver.findElement(btn_login);
        BTN_LOGIN.click();
        By btn_enter = By.xpath(OnlinerPage.BTN_ENTER);
        WebElement BTN_ENTER = driver.findElement(btn_enter);
        BTN_ENTER.click();
        //Assert.assertTrue(BTN_ENTER.isDisplayed());
        driver.quit();
    }

    @Test
    public void testOnlinerLoginFormWithEmptyPassword() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(OnlinerPage.URL);
        By btn_login = By.xpath(OnlinerPage.BTN_LOGIN);
        WebElement BTN_LOGIN = driver.findElement(btn_login);
        BTN_LOGIN.click();
        By input = By.xpath(OnlinerPage.INPUT);
        WebElement INPUT = driver.findElement(input);
        INPUT.sendKeys("test@gmail.com");
        By btn_enter = By.xpath(OnlinerPage.BTN_ENTER);
        WebElement BTN_ENTER = driver.findElement(btn_enter);
        BTN_ENTER.click();
        //Выполнить проверку
        driver.quit();

    }
}

