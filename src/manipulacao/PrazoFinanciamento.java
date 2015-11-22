package manipulacao;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrazoFinanciamento {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void before(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);		
	}

	@Test
	public void testePrazoFinanciamento() {
		//Entra no site informado
		driver.get("http://eliasnogueira.com/uninassau/financiamento/index.html");
		//Escolhe o radio button informado
		driver.findElement(By.id("residencial")).click();
		//Digita o valor informado do imóvel
		driver.findElement(By.id("valor_imovel")).sendKeys("30000000");
		//Digita o valor informado da entrada
		driver.findElement(By.id("valor_entrada")).sendKeys("6000000");
		//Digita o valor informado do prazo
		driver.findElement(By.name("prazo")).sendKeys("10");
		//Clica no botão para enviar as informações digitadas anteriormente
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();	
		//Validando mensagem de saída
		assertEquals("O prazo deve ser de de 12 a 120 meses", driver.findElement(By.cssSelector(".alert.alert-danger.meses")).getText());
		driver.quit();
	}

}
