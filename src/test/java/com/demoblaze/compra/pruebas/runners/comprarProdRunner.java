package com.demoblaze.compra.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.demoblaze.compra.pruebas.features",
        glue = "com.demoblaze.compra.pruebas.stepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class comprarProdRunner {
}
