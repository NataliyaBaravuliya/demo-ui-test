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
            Assert.assertTrue(element.isDisplayed());
            element.click();
            driver.quit();
        }
    }

