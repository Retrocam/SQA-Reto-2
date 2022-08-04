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


public class CategoriaSteps extends MetodosSeleniumSteps{
    Scripts scripts = new Scripts();
    Scroll scroll = new Scroll();
    HomePages homePages = new HomePages();
    CategoriaPages categoriaPages = new CategoriaPages();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void busquedaPorCategoria()  {

        esperaImplicita.esperar(10);
        scripts.eliminarPopUp();

        clickear(homePages.getBtnCategorias());
        clickear(homePages.getTxtLista());
        clickear(homePages.getBtnCategoriaGaming());
        clickear(categoriaPages.getBtnListaOrdenar());
        clickear(categoriaPages.getBtnMayorAMenor());
    }
    @Step
    public void validarProducto(){

        scroll.scrollAElemento(categoriaPages.getLblScroll());
        clickear(categoriaPages.getBtnProducto());

        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx","Categoria");
        }catch (IOException e){e.printStackTrace();}

        validacion(categoriaPages.getLblNombreProducto(),leerExcel.get(0).get("NombreProducto"));
    }
}
