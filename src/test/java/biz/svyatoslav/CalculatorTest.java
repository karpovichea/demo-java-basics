package biz.svyatoslav;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String xpathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By byName = By.xpath(xpathName);
        WebElement name = driver.findElement(byName);
        name.sendKeys("John");

        String xpathButton = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By byButton = By.xpath(xpathButton);
        WebElement button = driver.findElement(byButton);
        button.click();
    }
}
