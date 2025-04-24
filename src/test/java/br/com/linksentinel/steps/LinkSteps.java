package br.com.linksentinel.steps;

import io.cucumber.java.pt.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class LinkSteps {

    private String mensagem;
    private Map<String, String> usuarios = new HashMap<>();
    private String usuarioLogado;
    private List<String> historico = new ArrayList<>();
    private Map<String, String> linksVerificados = new HashMap<>();

    // Cadastro
    @Dado("que o usuário está na página de cadastro")
    public void usuarioNaPaginaDeCadastro() {
        // Simula navegação
    }

    @Quando("ele preenche nome, email e senha válidos e clica em {string}")
    public void preencheCadastro(String botao) {
        String email = "novo@email.com";
        if (usuarios.containsKey(email)) {
            mensagem = "Email já cadastrado";
        } else {
            usuarios.put(email, "senha123");
            mensagem = "Cadastro realizado com sucesso";
        }
    }

    @Então("o sistema deve exibir {string}")
    public void sistemaExibeMensagem(String esperado) {
        assertEquals(esperado, mensagem);
    }

    @Dado("que já existe um usuário cadastrado com o email {string}")
    public void usuarioJaCadastrado(String email) {
        usuarios.put(email, "senha123");
    }

    @Quando("um novo usuário tenta se cadastrar com o mesmo email")
    public void novoUsuarioCadastroMesmoEmail() {
        String email = "joao@email.com";
        if (usuarios.containsKey(email)) {
            mensagem = "Email já cadastrado";
        } else {
            usuarios.put(email, "senha123");
            mensagem = "Cadastro realizado com sucesso";
        }
    }

    // Login
    @Dado("que o usuário está na página de login")
    public void usuarioNaPaginaDeLogin() {
        // Simula navegação
    }

    @Quando("ele preenche email e senha corretos e clica em {string}")
    public void preencheLoginCorreto(String botao) {
        String email = "novo@email.com";
        String senha = "senha123";
        if (usuarios.containsKey(email) && usuarios.get(email).equals(senha)) {
            usuarioLogado = email;
            mensagem = "Login realizado com sucesso";
        } else {
            mensagem = "Senha incorreta";
        }
    }

    @Quando("ele preenche email correto e senha incorreta e clica em {string}")
    public void preencheLoginSenhaIncorreta(String botao) {
        String email = "novo@email.com";
        String senha = "errada";
        if (usuarios.containsKey(email) && usuarios.get(email).equals(senha)) {
            usuarioLogado = email;
            mensagem = "Login realizado com sucesso";
        } else {
            mensagem = "Senha incorreta";
        }
    }

    // Verificação de link
    @Dado("que o usuário está autenticado")
    public void usuarioAutenticado() {
        usuarioLogado = "novo@email.com";
    }

    @Quando("ele insere o link {string} e clica em {string}")
    public void inserirLink(String url, String botao) {
        String status;
        if (url.contains("phishing")) {
            status = "Link suspeito";
        } else {
            status = "Link seguro";
        }
        linksVerificados.put(url, status);
        historico.add(url + " [" + status + "]");
        mensagem = status;
    }

    // Histórico
    @Dado("que o usuário já verificou os links {string} e {string}")
    public void usuarioJaVerificouLinks(String link1, String link2) {
        linksVerificados.put(link1, "Link suspeito");
        linksVerificados.put(link2, "Link seguro");
        historico.add(link1 + " [Link suspeito]");
        historico.add(link2 + " [Link seguro]");
    }

    @Quando("ele acessa a página de histórico")
    public void acessaPaginaHistorico() {
        // Simula navegação
    }

    @Então("o sistema deve exibir ambos os links com seus respectivos status")
    public void sistemaExibeHistorico() {
        assertTrue(historico.contains("http://phishing.com [Link suspeito]"));
        assertTrue(historico.contains("https://www.google.com [Link seguro]"));
    }
}
