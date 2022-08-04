package co.com.falabella.utils;

import co.com.falabella.driver.SeleniumWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scripts {
    public void eliminarPopUp() {
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"body >" +
                " div.airship-html-prompt-shadow\").shadowRoot.querySelector(\"div > div > div.airship-alert-buttons >" +
                " button.airship-btn.airship-btn-deny\")");
        jse.executeScript("arguments[0].click()", element);
    }
    public void tomarProducto(String script){
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        WebElement element = (WebElement) jse.executeScript(script);
        jse.executeScript("arguments[0].click()", element);
    }
}
