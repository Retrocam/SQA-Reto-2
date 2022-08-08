package co.com.falabella.steps;

import co.com.falabella.driver.SeleniumWebDriver;
import org.openqa.selenium.*;
import static org.junit.Assert.assertEquals;


public class MetodosSeleniumSteps {

    public void clickear(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).click();
    }
    public void escribirMasEnter(By localizador, String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
    }
    public String  getTextElement(By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }
    public void validacion(By localizador, String texto){
        assertEquals(getTextElement(localizador), texto);
    }


}
