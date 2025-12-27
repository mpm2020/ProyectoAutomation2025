package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.paginaLogin;

public class PracticaM4 {
	
	WebDriver driver;
	paginaLogin login;
	
	String url="http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
	
	@BeforeSuite
	public void setUp() {
		driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void loginTest() {
		
		login=new paginaLogin(driver);
		login.ingresarDatos("test1@gmail.com","ABCD");
		Assert.assertEquals(login.getTituloForm(),"AUTHENTICATION");
		
		
	}
	
	@AfterSuite
	public void  teardown() {
		
		driver.quit();
		
	}

}
