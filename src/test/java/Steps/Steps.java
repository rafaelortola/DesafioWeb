package Steps;

import PageObjects.Autenticação_Page;
import PageObjects.CriarConta_Page;
import PageObjects.Login_Page;
import PageObjects.UsuarioLogado_Page;
import Suporte.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class Steps {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Dado("informe um email válido")
    public void cadastrarUsuario() throws InterruptedException {
        new Autenticação_Page(navegador)
                .criarConta()
                .clicarBotaoCreateAnAccount();
    }

    @Dado("seleciono um titulo {string}")
    public void selecionarTitulo(String titulo) {
        new CriarConta_Page(navegador)
                .selecionarTitulo(titulo);
    }

    @Dado("informo um nome")
    public void informarNome() {
        new CriarConta_Page(navegador)
                .informarNome();
    }

    @Dado("informo um sobrenome")
    public void informarSobrenome() {
        new CriarConta_Page(navegador)
                .informarSobreNome();
    }

    @Dado("informo uma senha")
    public void informarSenha() {
        new CriarConta_Page(navegador)
                .informarSenha();
    }

    @Dado("informo uma data de nascimento")
    public void informarDataNascimento() {
        new CriarConta_Page(navegador)
                .informarDataNascimento();
    }

    @Dado("informo um endereço")
    public void informarEndereco() {
        new CriarConta_Page(navegador)
                .informarEndereco();
    }

    @Dado("informo uma cidade")
    public void informarCidade() {
        new CriarConta_Page(navegador)
                .informarCidade();
    }

    @Dado("informo um estado")
    public void informarEstado() {
        new CriarConta_Page(navegador)
                .selecionarEstado();
    }

    @Dado("informo um código postal")
    public void informarCodigoPostal() {
        new CriarConta_Page(navegador)
                .informarCodigoPostal();
    }

    @Dado("informo um telefone")
    public void informarTelefone() {
        new CriarConta_Page(navegador)
                .informarTelefone();
    }

    @Quando("submeto o cadastro")
    public void submeterCadastro() {
        new CriarConta_Page(navegador)
                .clicarBotaoRegister();
    }

    @Então("sou cadastrado com sucesso")
    public void validaCadastro(){
        new UsuarioLogado_Page(navegador)
                .validaUsuarioLogado();

    }

    @Dado("que eu informe um email válido")
    public void emailValido() throws InterruptedException {
        new Login_Page(navegador)
                .informarEmailValido();
    }

    @Dado("que eu informe um email inexistente")
    public void emailInexistente() throws InterruptedException {
        new Login_Page(navegador)
                .informarEmailInexistente();
    }

    @Dado("que eu informe um email inválido")
    public void emailInvalido() throws InterruptedException {
        new Login_Page(navegador)
                .informarEmailInvalido();
    }

    @Dado("que eu informe um email em branco")
    public void emailEmBranco() throws InterruptedException {
        new Login_Page(navegador)
                .informarLoginEmBranco();
    }

    @Dado("informe uma senha válida")
    public void senhaValida(){
        new Login_Page(navegador)
                .informarSenhaValida();
    }

    @Dado("informe uma senha inválida")
    public void senhaInvalida(){
        new Login_Page(navegador)
                .informarSenhaInvalida();
    }

    @Quando("faço o login")
    public void logar(){
        new Login_Page(navegador)
                .clicarNoBotãoSignIn();
    }

    @Então("não sou autenticado")
    public void emailInvalidoNaoLogado(){
        new UsuarioLogado_Page(navegador)
                .validaEmailInvalidoNaoLogado();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }

}
