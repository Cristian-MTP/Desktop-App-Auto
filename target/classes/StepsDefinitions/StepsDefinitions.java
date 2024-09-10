package StepsDefinitions;
import ClasesJava.Acciones;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepsDefinitions {


    @Given("^Abrimos app$")
    public void conexion() throws Exception {
        System.out.println("App abierta correctamente");
    }


    @Then("^Hacemos sumas$")
    public void sumar_cosas() throws Exception {
        System.out.println("Procede a hacer suma");
        Acciones.hacer_sumas();
        System.out.println("Suma hecha correctamente");
    }

    @And("^Cerramos calculadora$")
    public void cerrar_programa() throws Exception {
        System.out.println("Procede a cerrar programa");
        Acciones.cerrar();
    }

}