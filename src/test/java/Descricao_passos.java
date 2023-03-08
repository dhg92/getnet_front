import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Descricao_passos {
	
	private WebDriver driver;
	
	@Given("o usuario acessar o site da GetNet")
	public void o_usuario_acessar_o_site_da_get_net() {
		driver = new ChromeDriver();
		driver.get("https://site.getnet.com.br/");
		driver.manage().window().maximize();
		
	}

	@And("o usuario acessar o menu Conta SuperGet dentro do menu Mais Solucoes")
	public void o_usuario_acessar_o_menu_conta_super_get_dentro_do_menu_mais_solucoes() {
		driver.findElement(By.xpath("/html/body/header/section/div/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("/html/body/header/section/div/nav/ul/li[2]/ul/li[3]/ul/li[3]/a")).click();
		
	}

	@When("o usuario clicar em Como ativar meu cartao SuperGet")
	public void o_usuario_clicar_em_como_ativar_meu_cartao_super_get() {
		driver.findElement(By.cssSelector("a[aria-label=\'allow cookies\']")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[12]/div/div/div/section/div[2]/ul/li[3]/input")).click();
	}

	@Then("um modal aparece contendo a mensagem explitiva")
	public void um_modal_aparece_contendo_a_mensagem_explitiva() {
		String MensagemEncontrada = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[12]/div/div/div/section/div[2]/ul/li[3]/div/div")).getText();
		String MensagemEsperada = "Para ativar o seu cartão SuperGet, basta baixar o SuperGet na App Store ou Google Play. Para o seu primeiro acesso, você deve criar o seu login e senha: 1. Informe seu CPF e dados cadastrais para criação do login e senha do seu aplicativo; 2. Valide o e-mail cadastrado durante o credenciamento realizado na Getnet. Você receberá um código de ativação no seu e-mail para validação; 3. Acesse o menu “Cartões”; 4. Digite os dados do verso do seu cartão SuperGet; 5. Crie uma senha de 4 dígitos. Essa senha você irá utilizar para realizar compras com o seu Cartão SuperGet e fazer movimentações no seu APP SuperGet; 6. Pronto, o seu cartão foi ativado e você já pode começar a usá-lo.";
	    Assert.assertEquals(MensagemEsperada, MensagemEncontrada);
	}
}
