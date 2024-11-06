package com.github.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinition {


    @Dado("que estoy en la pagina de git")
    public void queEstoyEnLaPaginaDeGit() {
        System.out.println("Estoy en la página de Git");
    }

    @Cuando("ingreso mi usuario y clave")
    public void ingresoMiUsuarioYClave() {
        System.out.println("Ingresando usuario y clave");
    }

    @Entonces("ingreso exitosamente al menu.")
    public void ingresoExitosamenteAlMenu() {
        System.out.println("Ingreso exitoso al menú");
    }
}
