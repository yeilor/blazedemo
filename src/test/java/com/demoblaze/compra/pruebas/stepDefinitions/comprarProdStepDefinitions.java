package com.demoblaze.compra.pruebas.stepDefinitions;

import com.demoblaze.compra.pruebas.steps.agregarProdSteps;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class comprarProdStepDefinitions {

    @Steps
    agregarProdSteps prod;

    @Dado("^que el usuario se encuentra en el sitio web demoblaze$")
    public void queElUsuarioSeEncuentraEnElSitioWebDemoblaze() {
        prod.abrirNavegador();
    }

    @Cuando("^selecciona un producto agregandolo al carrito$")
    public void seleccionaUnProductoAgregandoloAlCarrito() throws InterruptedException {
        prod.selecProdUno();
        prod.clicBtnAddToCart();
        Thread.sleep(1000);
        prod.clicBtnCart();
    }

    @Entonces("^visualiza el producto agregado en el carrito de compras$")
    public void visualizaElProductoAgregadoEnElCarritoDeCompras() {
        prod.validarProducto();
    }

    @Cuando("^selecciona otro producto llenando el formulario de compras$")
    public void seleccionaOtroProductoLlenandoElFormularioDeCompras() throws IOException, InterruptedException {
        prod.clicEnHome();
        prod.selecProdDos();
        prod.clicBtnAddToCart();
        Thread.sleep(1000);
        prod.clicBtnCart();
        prod.validarProducto();
        prod.clicEnPlaceOrder();
        prod.ingresaNombre();
        prod.ingresaPais();
        prod.ingresaCiudad();
        prod.ingresaNumTarjeta();
        prod.ingresaMes();
        prod.ingresaAnio();
    }

    @Y("^da clic en el boton Purchase$")
    public void daClicEnElBotonPurchase() {
        prod.clicBtnPurchase();
    }

    @Entonces("^debe ver mensaje Thank you for your purchase!$")
    public void debeVerMensajeThankYouForYourPurchase() {
        prod.validaCompra();
    }

    @Y("^da clic en boton Ok$")
    public void daClicEnBotonOk() {
        prod.clicBtnOk();
    }

    @Entonces("^debe volver a la pantalla de Inicio$")
    public void debeVolverALaPantallaDeInicio() {
        prod.validaFinal();
    }


}
