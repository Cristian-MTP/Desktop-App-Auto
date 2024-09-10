package ClasesJava;
import io.appium.java_client.AppiumBy;
import ClasesJava.*;

public class Acciones extends ConfiguracionDriver {



    public static void hacer_sumas() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("num1Button")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("plusButton")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("num5Button")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("equalButton")).click();
        Thread.sleep(2000);;

    }

    public static void cerrar() {
        driver.findElement(AppiumBy.accessibilityId("Close")).click();

    }


}
