package co.com.falabella.stepDefinitions;

import co.com.falabella.driver.SeleniumWebDriver;
import co.com.falabella.steps.ProductosSteps;
import co.com.falabella.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductoStepDefinition {
    @Steps
    ProductosSteps productosSteps = new ProductosSteps();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Dado("^que me encuentro en el home de falabella$")
    public void queMeEncuentroEnElHomeDeFalabella() {
        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx","url");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("URL"));
    }


    @Cuando("^doy click en un producto$")
    public void doyClickEnUnProducto() {
        productosSteps.scrollear();
        //productosSteps.elegirProducto();
    }

    @Entonces("^valido el titulo del producto$")
    public void validoElTituloDelProducto() { SeleniumWebDriver.driver.close(); }

}
