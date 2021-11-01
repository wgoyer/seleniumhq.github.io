package dev.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerExample {
    public WebDriver driver;

    @Test
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        Assertions.assertEquals("data:,", driver.getCurrentUrl());
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
