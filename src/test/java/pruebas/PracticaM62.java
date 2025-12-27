package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticaM62 {
	WebDriver driver;
	
	String URL="https://demo.guru99.com/test/table.html";
	
	@BeforeSuite
	public void setUp() {
		driver=new EdgeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void obtenerCelda() {
		
		WebElement getCelda=driver.findElement(By.xpath("//tbody/tr[4]/td[3]"));
		Assert.assertEquals(getCelda.getText(), "8");
		
		
	}
	
	@AfterMethod
	public void  teardown() {
		
		driver.quit();
		
	}


}
