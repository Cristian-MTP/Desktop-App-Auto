package ClasesJava;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;


import java.net.URL;



public class ConfiguracionDriver {

    public static WebDriver driver = null;

    /**
     * Funcion para inicializar el driver
     */
    public static void init() {
        try {
            System.out.println("Conectando Driver");

//            -Driver para app de escritorio con appium:
            MutableCapabilities caps = new MutableCapabilities();
            caps.setCapability("platformName", "windows");
            caps.setCapability("appium:automationName", "windows");
//            -Direccion de la app:
            caps.setCapability("appium:app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/"), caps);

        } catch (Exception e) {
            throw new RuntimeException("Error de conexión");
        }

    }

    /**
     * Funcion para cerrar el driver
     */

    public static void tearDown() {
        try {
            System.out.println("Cerrando Driver");
            if (driver != null) {
                driver.quit();
                System.out.println("Driver correctamente cerrado");
            }
        } catch (Exception e) {
            System.out.println("ERROR en cierre de Driver Mobile Remoto");
            e.printStackTrace();
            assert (false);
        }

    }
}