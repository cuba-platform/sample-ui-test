package com.company.uisample.web.util;

import com.codeborne.selenide.WebDriverProvider;
import com.google.common.base.Strings;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class CubaWebDriverProvider implements WebDriverProvider {
    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        if (!Strings.isNullOrEmpty(System.getProperty("cuba.testui.remoteDriver"))) {
            try {
                String browser = System.getProperty("cuba.testui.browser", "firefox");

                DesiredCapabilities capabilities;
                switch (browser) {
                    case "firefox":
                        capabilities = DesiredCapabilities.firefox();
                        break;

                    case "chrome":
                        capabilities = DesiredCapabilities.chrome();
                        break;

                    default:
                        capabilities = DesiredCapabilities.firefox();
                        break;
                }

                RemoteWebDriver driver = new RemoteWebDriver(
                        new URL(System.getProperty("cuba.testui.remoteDriver")), capabilities);
                driver.manage().window().setSize(new Dimension(1280, 800));
                return driver;
            } catch (MalformedURLException e) {
                throw new IllegalStateException(e);
            }
        }

        return new FirefoxDriver();
    }
}
