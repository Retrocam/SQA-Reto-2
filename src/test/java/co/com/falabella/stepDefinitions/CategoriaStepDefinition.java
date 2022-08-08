package co.com.falabella.stepDefinitions;

import co.com.falabella.driver.SeleniumWebDriver;
import co.com.falabella.steps.CategoriaSteps;
import co.com.falabella.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CategoriaStepDefinition {
    @Steps
    CategoriaSteps categoriaSteps = new CategoriaSteps();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();


    @Dado("^que me encuentro en falabella$")
    public void que_me_encuentro_en_falabella() {
        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx","url");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("URL"));
    }

    @Cuando("^doy click en una categoria$")
    public void doy_click_en_una_categoria()  {
        categoriaSteps.busquedaPorCategoria();
    }

    @Cuando("^doy click en un producto de esa categoria$")
    public void doy_click_en_un_producto_de_esa_categoria() {
        categoriaSteps.validarProducto();
    }

    @Entonces("^valido el titulo del producto relacionado$")
    public void valido_el_titulo_del_producto_relacionado() {
        SeleniumWebDriver.driver.close();
    }
}
