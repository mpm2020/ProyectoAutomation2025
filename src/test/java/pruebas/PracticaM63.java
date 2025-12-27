package pruebas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticaM63 {
	
	WebDriver driver;
	
	String URL="https://practice-automation.com/popups/";
	
	@BeforeSuite
	public void setUp() {
		//driver=new EdgeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		driver= new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void alertaNotificacion() {
		
		WebElement btnButton=driver.findElement(By.id("alert"));
		btnButton.click();
		
		Alert Alerta=driver.switchTo().alert();
		
		Alerta.accept();
			
		
	}
	
	@AfterMethod
	public void  teardown() {
		
		driver.quit();
		
	}

}
