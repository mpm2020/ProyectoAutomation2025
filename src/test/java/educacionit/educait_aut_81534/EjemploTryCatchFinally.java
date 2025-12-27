package educacionit.educait_aut_81534;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploTryCatchFinally {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.ejemplo.com");

            // Intentamos encontrar un botón que quizás no exista
            WebElement boton = driver.findElement(By.id("botonInexistente"));
            boton.click(); // Esto lanzaría una excepción si no existe

            System.out.println("Botón clickeado correctamente");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            // Siempre se ejecuta, incluso si hubo error
            driver.quit();
            System.out.println("Navegador cerrado");
        }
    }
}


