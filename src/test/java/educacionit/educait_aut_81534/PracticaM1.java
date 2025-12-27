package educacionit.educait_aut_81534;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticaM1 {
	//Variables que necesitaremos para nuestra prueba
	String url="http://www.automationpractice.pl/index.php";

	@Test @Disabled
	public void lab1_test(){

		System.out.println("Hola mundo de Automatización!!");

	}

	@Test
	public void buscarProductoEdge() throws InterruptedException {
		//Paso 1: Definir navegador a utilizar

		WebDriver navegador= new EdgeDriver();

		navegador.manage().deleteAllCookies();// Borra las cookies

		navegador.manage().window().maximize();//Maximiza la ventana

		//Paso 2: Abrir la página que se va a probar
		navegador.get(url);
		
		//Paso 3: Escribir la palabra que queremos buscar
		
		WebElement txtBusqueda=navegador.findElement(By.id("search_query_top"));
		txtBusqueda.sendKeys("dress");
		
		//Paso 4: Hacer ENTER  
		
		txtBusqueda.sendKeys(Keys.ENTER); //Simulamos que presionamos ENTER

		
		//Paso 5: Cerrar el navegador

		navegador.quit();


	}

	@Test @Disabled
	public void buscarProductoFirefox() {
		//Paso 1: Definir navegador a utilizar

		WebDriver navegador= new FirefoxDriver();
		
		navegador.manage().deleteAllCookies();// Borra las cookies

		navegador.manage().window().maximize();//Maximiza la ventana


		//Paso 2: Abrir la página que se va a probar
		navegador.get(url);

		//Paso 3: Cerrar el navegador

		navegador.quit();

	}

}
