package co.com.falabella.steps;

import co.com.falabella.pageObjects.HomePages;
import co.com.falabella.utils.EsperaImplicita;
import co.com.falabella.utils.Excel;
import co.com.falabella.utils.Scripts;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaSteps extends MetodosSeleniumSteps{
    Scripts scripts = new Scripts();
    HomePages homePages = new HomePages();
    EsperaImplicita esperaImplicita =new EsperaImplicita();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Step
    public void buscar(){

        esperaImplicita.esperar(10);
        scripts.eliminarPopUp();

        try {
            leerExcel = Excel.readExcel("Reto#2.xlsx","items");
        }catch (IOException e){e.printStackTrace();}

        for (int i = 0;i<leerExcel.size(); i++){
            escribirMasEnter(homePages.getTxtBarra(),leerExcel.get(i).get("Productos"));
        }
    }
}


