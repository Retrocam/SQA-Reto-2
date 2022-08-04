package co.com.falabella.stepDefinitions;

import co.com.falabella.driver.SeleniumWebDriver;
import co.com.falabella.steps.BusquedaSteps;
import co.com.falabella.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaStepDefinition {
    @Steps
    BusquedaSteps busquedaSteps = new BusquedaSteps();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Dado("^que me encuentro en la pagina de falabella$")
    public void queMeEncuentroEnLaPaginaDeFalabella() {
        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx","url");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("URL"));
    }

    @Cuando("^ingreso una palabra en la barra de busqueda$")
    public void ingresoUnaPalabraEnLaBarraDeBusqueda() {
        busquedaSteps.buscar();
    }

    @Entonces("^valido que busca el producto relacionado$")
    public void validoQueBuscaElProductoRelacionado() {
        SeleniumWebDriver.driver.close();
    }
}
