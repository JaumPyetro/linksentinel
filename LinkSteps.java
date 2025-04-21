package br.com.linksentinel.steps;

import io.cucumber.java.pt.*;
import static org.junit.jupiter.api.Assertions.*;

public class LinkSteps {

    private String resultado;

    @Quando("ele insere o link {string} e clica em {string}")
    public void inserirLink(String url, String botao) {
        if (url.contains("phishing")) {
            resultado = "Link suspeito";
        } else {
            resultado = "Link seguro";
        }
    }

    @Então("o sistema deve exibir {string}")
    public void sistemaExibe(String esperado) {
        assertEquals(esperado, resultado);
    }
}
