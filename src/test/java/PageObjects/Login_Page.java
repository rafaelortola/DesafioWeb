package PageObjects;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page extends BasePage {

    public Login_Page(WebDriver navegador) {
        super(navegador);
    }

    public Login_Page informarEmailValido() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("illiii@gmail.com");
        return this;
    }

    public Login_Page informarEmailInvalido() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("dsadsa@llll.com");
        return this;
    }

    public Login_Page informarEmailInexistente() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("#@!#JSAD@P$M");
        return this;
    }

    public Login_Page informarLoginEmBranco() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("");
        return this;
    }

    public Login_Page informarSenhaValida(){
        navegador.findElement(By.id("passwd")).sendKeys("123987");
        return this;
    }

    public Login_Page informarSenhaInvalida(){
        navegador.findElement(By.id("passwd")).sendKeys("090909@#$");
        return this;
    }

    public UsuarioLogado_Page clicarNoBotãoSignIn(){
        navegador.findElement(By.cssSelector("#SubmitLogin")).click();
        return new UsuarioLogado_Page(navegador);
    }
}
