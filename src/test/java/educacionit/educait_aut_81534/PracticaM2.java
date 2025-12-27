package educacionit.educait_aut_81534;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticaM2 {
	String url="http://www.automationpractice.pl/index.php";

	@Test
	public void registrarUsuario() throws InterruptedException {
		//(1)Definir qué navegador queremos usar	
		WebDriver driver=new EdgeDriver();

		//(2) Abrir el navegador que queremos usar

		driver.get(url);

		// (16) Maximizar el navegador

		driver.manage().window().maximize();

		//(3) Hacer clic en 'Sign in'

		WebElement lnkSign=driver.findElement(By.partialLinkText("Sign"));
		lnkSign.click();

		//(4) Escribir Correo electronico

		WebElement txtEmail=driver.findElement(By.cssSelector("#email_create"));
		txtEmail.sendKeys("correo29nov_"+ Math.random() + "@gmail.com");

		//(5) Hacer clic en el boton "Create an Account'

		WebElement btnCreate=driver.findElement(By.name("SubmitCreate"));
		btnCreate.click();


		//(6) Seleccionar el titulo (Sr. o  Sra.)
		
		// Agregamos espera explicita
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ver que esta visible el radio button
        WebElement radTitulo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));

		//WebElement radTitulo=driver.findElement(By.id("id_gender1"));
		radTitulo.click();

		//(7) Escribir el nombre

		WebElement txtNombre=driver.findElement(By.name("customer_firstname"));
		txtNombre.sendKeys("Arturo");

		//(8) Escribir el apellido

		WebElement txtApellido=driver.findElement(By.cssSelector("#customer_lastname"));
		txtApellido.sendKeys("Lopez");

		//(9) Limpiar el valor del correo electronico

		WebElement txtEmailForm=driver.findElement(By.id("email"));
		txtEmailForm.clear();

		//(10) Escribir un nuevo valor de correo electronico
		txtEmailForm.sendKeys("correomodificado29nov_"+ Math.random() + "@gmail.com");

		//(11) Escribir la contraseña

		WebElement txtPasswordForm=driver.findElement(By.name("passwd"));
		txtPasswordForm.clear();
		txtPasswordForm.sendKeys("123456");

		//(12) Seleccionar la fecha de nacimiento(día-mes-año)
		
		Select drpDaysForm=new Select(driver.findElement(By.id("days")));
		drpDaysForm.selectByValue("11");
		
		Select drpMonthsForm=new Select(driver.findElement(By.id("months")));
		drpMonthsForm.selectByValue("4");
		
		Select drpYearsForm=new Select(driver.findElement(By.id("years")));
		drpYearsForm.selectByValue("1990");
		
		
		//(13)Hacer clic en el checkbox
		
		WebElement chkNewsletter=driver.findElement(By.name("newsletter"));
		chkNewsletter.click();
		
		
		//(14)Hacer clic en el boton "Register"
		
	 	  WebElement btnRegister=driver.findElement(By.id("submitAccount"));
		//WebElement btnRegister=driver.findElement(By.xpath("//*[text()='Register']"));
		btnRegister.click();
		
		
		//(15) Cerrar el navegador
		
		driver.quit();
		


	}

}
