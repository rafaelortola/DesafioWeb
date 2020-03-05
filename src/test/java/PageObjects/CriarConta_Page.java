package PageObjects;

import Suporte.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarConta_Page extends BasePage {
    public CriarConta_Page(WebDriver navegador) {
        super(navegador);
    }

    public CriarConta_Page selecionarTitulo(String titulo){
        if (titulo.contains("Mr.")) {
            navegador.findElement(By.id("id_gender1")).click();
        }
        else if (titulo.contains("Mrs.")){
            navegador.findElement(By.id("id_gender2")).click();
        }
        else {
            Assert.fail("Título inválido");
        }
        return this;
    }

    public CriarConta_Page informarNome(){
        navegador.findElement(By.id("customer_firstname")).sendKeys("MeuNome");
        return this;
    }

    public CriarConta_Page informarSobreNome(){
        navegador.findElement(By.id("customer_lastname")).sendKeys("Teste Web");
        return this;
    }

    public CriarConta_Page informarSenha(){
        navegador.findElement(By.id("passwd")).sendKeys("123987");
        return this;
    }

    public CriarConta_Page informarDataNascimento(){
        navegador.findElement(By.id("days")).sendKeys("3");
        navegador.findElement(By.id("months")).sendKeys("April");
        navegador.findElement(By.id("years")).sendKeys("1990");
        return this;
    }

    public CriarConta_Page informarEndereco(){
        navegador.findElement(By.id("address1")).sendKeys("Rua Teste do Teste");
        return this;
    }

    public CriarConta_Page informarCidade(){
        navegador.findElement(By.id("city")).sendKeys("cidade teste");
        return this;
    }

    public CriarConta_Page selecionarEstado(){
        navegador.findElement(By.id("id_state")).sendKeys("Alaska");
        return this;
    }

    public CriarConta_Page informarCodigoPostal(){
        navegador.findElement(By.id("postcode")).sendKeys("98767");
        return this;
    }

    public CriarConta_Page informarTelefone(){
        navegador.findElement(By.id("phone_mobile")).sendKeys("999999999");
        return this;
    }

    public UsuarioLogado_Page clicarBotaoRegister(){
        navegador.findElement(By.cssSelector("#submitAccount")).click();
        return new UsuarioLogado_Page(navegador);
    }
}
