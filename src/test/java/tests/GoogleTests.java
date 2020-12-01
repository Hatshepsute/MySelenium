package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTests {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = ChromeDriver(options);

    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath ("//*[@jsname='j93WEe']")).click(); //(
        driver.findElement(By.xpath ("//*[@jsname='N10B9']")).click(); //1
        driver.findElement(By.xpath ("//*[@jsname='XSr6wc']")).click(); //+
        driver.findElement(By.xpath ("//*[@jsname='lVjWed']")).click(); //2
        driver.findElement(By.xpath ("//*[@jsname='qCp9A']")).click(); //)
        driver.findElement(By.xpath ("//*[@jsname='YovRWb']")).click(); //*
        driver.findElement(By.xpath ("//*[@jsname='KN1kY']")).click(); //3
        driver.findElement(By.xpath ("//*[@jsname='pPHzQc']")).click(); //-
        driver.findElement(By.xpath ("//*[@jsname='xAP7E']")).click(); //4
        driver.findElement(By.xpath ("//*[@jsname='bkEvMb']")).click(); //0
        driver.findElement(By.xpath ("//*[@jsname='WxTTNd']")).click(); ///
        driver.findElement(By.xpath ("//*[@jsname='Ax5wH']")).click(); //5
        assertEquals(1, driver.findElement());
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
