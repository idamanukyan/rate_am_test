package com.example.rate_am_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateAmTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateAmTestApplication.class, args);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\st-homework\\rate_am_test\\src\\main\\java\\com\\example\\rate_am_test\\drivers\\chromedriver.exe");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\Admin\\Desktop\\st-homework\\rate_am_test\\src\\main\\java\\com\\example\\rate_am_test\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://rate.am/");

        String title = driver.getTitle();
        WebElement elementById = driver.findElement(By.id("1"));
        WebElement elementByName = driver.findElement(By.name("usd"));
        WebElement elementByClassName = driver.findElement(By.className("Banks"));
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("selector"));

        elementById.click();
        if (elementByClassName.isDisplayed()) {
            elementByClassName.getText();
        }
        elementByName.sendKeys("Key to send");
        elementByCssSelector.clear();

        driver.close();
    }

}
