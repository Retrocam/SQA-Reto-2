package co.com.falabella.steps;

import co.com.falabella.pageObjects.CategoriaPages;
import co.com.falabella.pageObjects.HomePages;
import co.com.falabella.utils.EsperaImplicita;
import co.com.falabella.utils.Excel;
import co.com.falabella.utils.Scripts;
import co.com.falabella.utils.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductosSteps extends MetodosSeleniumSteps {
    Scripts scripts = new Scripts();
    Scroll scroll = new Scroll();
    HomePages homePages = new HomePages();
    CategoriaPages categoriaPages = new CategoriaPages();
    EsperaImplicita esperaImplicita =new EsperaImplicita();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void scrollear(){
        scripts.eliminarPopUp();

        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx", "Productos");
        } catch (IOException e) {e.printStackTrace();}

        for (int i = 0; i < leerExcel.size(); i++) {

            scroll.scrollAElemento(homePages.getScroll1());
            scroll.scrollAElemento(homePages.getScroll2());
            scroll.scrollAElemento(homePages.getScroll3());

            scripts.tomarProducto(homePages.getProductos()[i]);

            validacion(categoriaPages.getLblNombreProducto(), leerExcel.get(i).get("NombreProductos"));
            clickear(homePages.getBtnHome());

            esperaImplicita.esperar(10);
        }
    }
}
