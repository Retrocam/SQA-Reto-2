package co.com.falabella.pageObjects;

import org.openqa.selenium.By;

public class HomePages {
    private By txtBarra = By.id("testId-SearchBar-Input");
    private By btnCategorias = By.id("testId-HamburgerBtn-toggle");
    private By txtLista = By.xpath( "//div[@id='triangle_down_overlay_0']/preceding-sibling::p");
    private By btnCategoriaGaming = By.xpath( "(//a[contains(text(),'Gaming')])[2]");

    private By scroll1 = By.xpath( "//ol[@class='carousel-indicators']");
    private By scroll2 = By.xpath( "//div[@class='title-module-daily-deal row m-0 h-100 TitleModule-module_title-module__-6rGg']");
    private By scroll3 = By.xpath( "//flb-carousel");


    private String btnProducto1 ="return document.querySelector(\"#faco-home-cyber-agosto\").shadowRoot.querySelector(\"div" +
            ".o-mainContainer > div > div.sc-carousel__carousel-container > div.sc-carousel__content-container > div" +
            ".sc-carousel__pages-window > div > div:nth-child(2) > div:nth-child(1) > a\")";
    private String btnProducto2 = "return document.querySelector(\"#faco-home-cyber-agosto\").shadowRoot.querySelector(\"div" +
            ".o-mainContainer > div > div.sc-carousel__carousel-container > div.sc-carousel__content-container > div" +
            ".sc-carousel__pages-window > div > div:nth-child(2) > div:nth-child(2) > a\")";
    private String btnProducto3 = "return document.querySelector(\"#faco-home-cyber-agosto\").shadowRoot.querySelector(\"div" +
            ".o-mainContainer > div > div.sc-carousel__carousel-container > div.sc-carousel__content-container > div" +
            ".sc-carousel__pages-window > div > div:nth-child(2) > div:nth-child(3) > a\")";
    private String btnProducto4 = "return document.querySelector(\"#faco-home-cyber-agosto\").shadowRoot.querySelector(\"div" +
            ".o-mainContainer > div > div.sc-carousel__carousel-container > div.sc-carousel__content-container > div" +
            ".sc-carousel__pages-window > div > div:nth-child(2) > div:nth-child(4) > a\")";
    private String btnProducto5 = "return document.querySelector(\"#faco-home-cyber-agosto\").shadowRoot" +
            ".querySelector(\"div.o-mainContainer > div > div.sc-carousel__carousel-container > div" +
            ".sc-carousel__content-container > div.sc-carousel__pages-window > div > div:nth-child(2) > div:nth-child" +
            "(5) > a\")";

    private By btnHome = By.name("falabella-logo");

    private String [] productos = {btnProducto1,btnProducto2,btnProducto3,btnProducto4,btnProducto5};

    public String[] getProductos() { return productos; }
    public By getBtnHome() {return btnHome;}
    public By getTxtBarra() { return txtBarra;}
    public By getBtnCategorias() { return btnCategorias;}
    public By getTxtLista() {return txtLista;}
    public By getBtnCategoriaGaming() {return btnCategoriaGaming;}
    public By getScroll1()  {return scroll1;}
    public By getScroll2() {return scroll2;}
    public By getScroll3() {return scroll3;}

}
