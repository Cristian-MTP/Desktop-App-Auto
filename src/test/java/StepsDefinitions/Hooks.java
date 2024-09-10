package StepsDefinitions;

import ClasesJava.ConfiguracionDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks {
    @Before
    public void before(Scenario scenario){
        ConfiguracionDriver.init();
    }

    @After
    public void after(Scenario scenario){
        ConfiguracionDriver.tearDown();
    }
}
