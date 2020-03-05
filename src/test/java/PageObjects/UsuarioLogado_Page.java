package PageObjects;

import Suporte.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuarioLogado_Page extends BasePage {

    public UsuarioLogado_Page(WebDriver navegador) {
        super(navegador);
    }

    public UsuarioLogado_Page validaUsuarioLogado() {
        String validacao = navegador.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals("MeuNome Teste Web", validacao);
        System.out.println("Usuário logado: " + validacao);


        return new UsuarioLogado_Page(navegador);
    }

    public UsuarioLogado_Page validaEmailInvalidoNaoLogado() {
        String emailInvalido = navegador.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        if (emailInvalido.contains("Authentication failed.")){
            Assert.assertEquals("Authentication failed.",  emailInvalido);
            System.out.println("Endereço de E-mail inexistente");
        }
        else if (emailInvalido.contains("Invalid email address.")){
            Assert.assertEquals("Invalid email address.", emailInvalido);
            System.out.println("Endereço de E-mail inválido.");
        }
        else if (emailInvalido.contains("An email address required.")){
            Assert.assertEquals("An email address required.", emailInvalido);
            System.out.println("O campo email está em branco.");
        }
        else {
            Assert.fail("Erro");
        }

        return new UsuarioLogado_Page(navegador);
    }
}
