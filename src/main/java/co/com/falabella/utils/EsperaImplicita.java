package co.com.falabella.utils;

import co.com.falabella.driver.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class EsperaImplicita {
    public void esperar(int segundos){
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }
}
