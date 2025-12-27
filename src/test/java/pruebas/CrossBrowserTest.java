package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	//Definimos variables
	WebDriver driver=null;
	String url="http://www.automationpractice.pl/index.php";
	
	
	@BeforeMethod
	@Parameters("navegador")
	public void setUp(String navegador) {
		
		
		if(navegador.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
		
		}
		
		else {
			
			driver=new FirefoxDriver();
		}
		
		//Maximiza Navegador
		driver.manage().window().maximize();
		//Navega a URL
		driver.get(url);
		
	}
	
	
	
	@Test
	public void buscarPalabra() {
		//Test Buscar Producto
		WebElement txtBusqueda=driver.findElement(By.id("search_query_top"));
		txtBusqueda.clear();
		txtBusqueda.sendKeys("dress");	
		txtBusqueda.sendKeys(Keys.ENTER); 
		
	}
	
	@AfterMethod
	public void cierreNavegador() {
		
		//Cierre Navegador
		driver.quit();
	}

}
