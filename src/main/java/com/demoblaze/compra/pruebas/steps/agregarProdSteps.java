package com.demoblaze.compra.pruebas.steps;

import com.demoblaze.compra.pruebas.pageObject.agregarProdPageObject;
import com.demoblaze.compra.pruebas.utils.DatosExcel;
import com.demoblaze.compra.pruebas.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class agregarProdSteps {

    agregarProdPageObject prod = new agregarProdPageObject();
    Scroll scroll = new Scroll();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void abrirNavegador() {
        prod.open();
    }

    @Step
    public void selecProdUno() {
        scroll.scrollAlElemento(prod.getDriver(), prod.getImgProdUno());
        prod.getDriver().findElement(prod.getImgProdUno()).click();
    }

    @Step
    public void clicBtnAddToCart() {
        prod.getDriver().findElement(prod.getBtnAddToCart()).click();
    }

    @Step
    public void clicBtnCart() {
        //espera.esperaElementoVisible(prod.getDriver(),prod.getBtnCart());
        prod.getDriver().findElement(prod.getBtnCart()).click();
    }

    @Step
    public void validarProducto() {
        Assert.assertThat(prod.getDriver().findElement(prod.getLblValidaTexto()).isDisplayed(), Matchers.is(true));

    }

    @Step
    public void clicEnHome() {
        prod.getDriver().findElement(prod.getBtnHome()).click();
    }

    @Step
    public void selecProdDos() {
        prod.getDriver().findElement(prod.getImgProdDos()).click();
    }

    @Step
    public void clicEnPlaceOrder() {
        prod.getDriver().findElement(prod.getBtnPlaceOrder()).click();
    }

    @Step
    public void ingresaNombre() throws IOException {
        prod.getDriver().findElement(prod.getTxtName()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 0));
    }

    @Step
    public void ingresaPais() throws IOException {
        prod.getDriver().findElement(prod.getTxtCountry()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 1));
    }

    @Step
    public void ingresaCiudad() throws IOException {
        prod.getDriver().findElement(prod.getTxtCity()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 2));
    }

    @Step
    public void ingresaNumTarjeta() throws IOException {
        prod.getDriver().findElement(prod.getTxtCard()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 3));
    }

    @Step
    public void ingresaMes() throws IOException {
        prod.getDriver().findElement(prod.getTxtMonth()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 4));
    }

    @Step
    public void ingresaAnio() throws IOException {
        prod.getDriver().findElement(prod.getTxtYear()).sendKeys(datosExcel.obtenerDatos("Datos", "datosUsuario.xlsx", 2, 5));
    }

    @Step
    public void clicBtnPurchase() {
        prod.getDriver().findElement(prod.getBtnPurchase()).click();
    }

    @Step
    public void validaCompra() {
        Assert.assertThat(prod.getDriver().findElement(prod.getLblValidaThankYou()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clicBtnOk() {
        prod.getDriver().findElement(prod.getBtnOk()).click();
    }

    @Step
    public void validaFinal() {
        Assert.assertThat(prod.getDriver().findElement(prod.getPnlCategories()).isDisplayed(), Matchers.is(true));
    }

}
