package manipulacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValorSuperior {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void before(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);		
	}
	@Test
	public void testeValorSuperior() {
		//Entra no site informado
		driver.get("http://eliasnogueira.com/uninassau/financiamento/index.html");
		//Escolhe o radio button informado
		driver.findElement(By.id("residencial")).click();
		//Digita o valor informado do imóvel
		driver.findElement(By.id("valor_imovel")).sendKeys("50000000");
		//Digita o valor informado da entrada
		driver.findElement(By.id("valor_entrada")).sendKeys("80000000");
		//Digita o valor informado do prazo
		driver.findElement(By.name("prazo")).sendKeys("24");
		//Clica no botão para enviar as informações digitadas anteriormente
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();	
		//Validando mensagem de saída
		assertEquals("Entrada superior ao valor do imóvel", driver.findElement(By.cssSelector(".alert.alert-danger.superior")).getText());
		driver.quit();
	}
	
	}
