package co.com.falabella.pageObjects;

import org.openqa.selenium.By;

public class CategoriaPages {

    private By lblScroll = By.id("testId-searchResults-products");
    private By btnProducto = By.xpath( "(//a[@class='jsx-3128226947  layout_grid-view layout_view_4_GRID'])[1]");
    private By btnListaOrdenar = By.id("testId-Dropdown-desktop-button");
    private By btnMayorAMenor = By.id("testId-Dropdown-Precio de mayor a menor");


    private By lblNombreProducto = By.xpath("//div[@class='jsx-1442607798 product-name fa--product-name false']");

    public By getLblNombreProducto() {return lblNombreProducto;}
    public By getBtnMayorAMenor() {return btnMayorAMenor;}
    public By getBtnListaOrdenar() {return btnListaOrdenar;}
    public By getBtnProducto() {return btnProducto;}
    public By getLblScroll() {
        return lblScroll;
    }
}
