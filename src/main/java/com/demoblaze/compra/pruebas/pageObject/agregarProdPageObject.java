package com.demoblaze.compra.pruebas.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class agregarProdPageObject extends PageObject {

    By imgProdUno = By.xpath("(//img[@class='card-img-top img-fluid'])[9]");
    By btnAddToCart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By btnCart = By.id("cartur");
    By lblValidaTexto = By.xpath("//h2[contains(.,'Products')]");
    By btnHome = By.xpath("(//a[@class='nav-link'])[1]");
    By imgProdDos = By.xpath("(//img[@class='card-img-top img-fluid'])[2]");
    By btnPlaceOrder = By.xpath("//button[@class='btn btn-success']");
    By txtName = By.id("name");
    By txtCountry = By.id("country");
    By txtCity = By.id("city");
    By txtCard = By.id("card");
    By txtMonth = By.id("month");
    By txtYear = By.id("year");
    By btnPurchase = By.xpath("//button[contains(.,'Purchase')]");
    By lblValidaThankYou = By.xpath("//h2[contains(.,'Thank you for your purchase!')]");
    By btnOk = By.xpath("//button[contains(.,'OK')]");
    By pnlCategories = By.id("cat");

    public By getImgProdUno() {
        return imgProdUno;
    }

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getBtnCart() {
        return btnCart;
    }

    public By getLblValidaTexto() {
        return lblValidaTexto;
    }

    public By getBtnHome() {
        return btnHome;
    }

    public By getImgProdDos() {
        return imgProdDos;
    }

    public By getBtnPlaceOrder() {
        return btnPlaceOrder;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtCountry() {
        return txtCountry;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtCard() {
        return txtCard;
    }

    public By getTxtMonth() {
        return txtMonth;
    }

    public By getTxtYear() {
        return txtYear;
    }

    public By getBtnPurchase() {
        return btnPurchase;
    }

    public By getLblValidaThankYou() {
        return lblValidaThankYou;
    }

    public By getBtnOk() {
        return btnOk;
    }

    public By getPnlCategories() {
        return pnlCategories;
    }
}
