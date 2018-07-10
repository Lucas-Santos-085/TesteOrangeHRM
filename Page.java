package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suporte.BaseTest;

public class Page extends BaseTest {
	

	/*************Incluir Funcionários******************/
	
	
	public void clicarMenu() {
		getDriver().findElement(By.linkText("PIM")).click();
	}
	
	public void PrimeiroNome(String primeiroNome) {
		getDriver().findElement(By.id("firstName")).sendKeys(primeiroNome);
		
	}
	public Page clicarMenuPIM() {
		getDriver().findElement(By.linkText("PIM")).click();
		return this;
	}

	
	public Page clicarAdicionarFuncionario() {
		getDriver().findElement(By.id("btnAdd")).click();
		return this;
	}
		
	public Page inserirPrimeiroNome(String primeiroNome) {
		getDriver().findElement(By.id("firstName")).sendKeys(primeiroNome);
		return this;
	}
	
	public Page inserirUltimoNome(String ultimoNome) {
		getDriver().findElement(By.id("lastName")).sendKeys(ultimoNome);
		return this;
	}
	
	public Page salvarCadastroFuncionario() {
		getDriver().findElement(By.id("btnSave")).click();
		return this;
	}
	
	public String conferirCadastroRealizado() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		WebElement nomeCompleto = getDriver().findElement(By.xpath("//div[@id='profile-pic']//h1"));
		wait.until(ExpectedConditions.visibilityOf(nomeCompleto));
		return nomeCompleto.getText();
		
	}
	
	public String conferirMensagemErro() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		WebElement mensagemErro = getDriver().findElement(By.xpath("//span[@class='validation-error']"));
		wait.until(ExpectedConditions.visibilityOf(mensagemErro));
		return mensagemErro.getText();
	}
	
}
