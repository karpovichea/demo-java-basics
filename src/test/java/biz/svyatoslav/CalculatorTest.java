package biz.svyatoslav;

import org.junit.jupiter.api.Assertions;
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

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("85");

        String inputGenderXpath = "//html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputGenderBy = By.xpath(inputGenderXpath);
        WebElement inputGenderWebElement = driver.findElement(inputGenderBy);
        inputGenderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String messageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By messageBy = By.xpath(messageXpath);
        WebElement messageWebElement = driver.findElement(messageBy);
        String expectedValue = messageWebElement.getText();

        Assertions.assertEquals("Идеальная масса тела", expectedValue, "Сообщение отличается");
    }
}
