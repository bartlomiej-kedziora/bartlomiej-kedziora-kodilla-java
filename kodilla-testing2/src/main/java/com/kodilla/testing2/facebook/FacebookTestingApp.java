package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT_NAME = "//div[contains(@class, \"mbm\")][1]//input";
    public static final String XPATH_INPUT_SURNAME = "//div[contains(@class, \"mbm\")][2]//input";
    public static final String XPATH_INPUT_NEW_PASSWORD = "//div[contains(@class, \"mbm\")][3]//input";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]//select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]//select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]//select[3]";
    public static final String XPATH_SEX = "//div[contains(@class, \"mtm _5wa2 _5dbb\")]//span/span[2]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.xpath(XPATH_INPUT_NAME));
        nameField.sendKeys("UserTestName");

        WebElement surnameField = driver.findElement(By.xpath(XPATH_INPUT_SURNAME));
        surnameField.sendKeys("UserTestSurname");

        WebElement passField = driver.findElement(By.xpath(XPATH_INPUT_NEW_PASSWORD));
        passField.sendKeys("secret");

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByIndex(1);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByIndex(1);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByIndex(1);

        WebElement radioField = driver.findElement(By.xpath(XPATH_SEX));
        radioField.click();
    }
}
