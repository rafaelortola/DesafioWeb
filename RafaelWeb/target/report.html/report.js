$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:///C:/RafaelWeb/src/test/Features/CadastrarUsuario.feature");
formatter.feature({
  "name": "teste",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar novo usuário",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cadastro"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "informe um email válido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.Steps.cadastrarUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um titulo \"Mr.\"",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.selecionarTitulo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um nome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarNome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um sobrenome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarSobrenome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma senha",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma data de nascimento",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarDataNascimento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um endereço",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarEndereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma cidade",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarCidade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um estado",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarEstado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um código postal",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarCodigoPostal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um telefone",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.informarTelefone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto o cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.Steps.submeterCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sou cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.Steps.validaCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:///C:/RafaelWeb/src/test/Features/Login.feature");
formatter.feature({
  "name": "Realizar login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Login Sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email válido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.Steps.emailValido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sou cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.Steps.validaCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login inválido",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email inválido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.Steps.emailInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não sou autenticado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.Steps.emailInvalidoNaoLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login em branco",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email em branco",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.Steps.emailEmBranco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não sou autenticado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.Steps.emailInvalidoNaoLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});