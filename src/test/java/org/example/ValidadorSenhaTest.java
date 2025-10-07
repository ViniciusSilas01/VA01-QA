package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    void deveRetornarTrueParaSenhaValida() {
        assertTrue(validador.validar("Senha@123"));
    }

    @Test
    void deveRetornarFalseParaSenhaCurta() {
        assertFalse(validador.validar("Ab1@"));
    }

    @Test
    void deveRetornarFalseQuandoNaoTemLetraMaiuscula() {
        assertFalse(validador.validar("senha@123"));
    }

    @Test
    void deveRetornarFalseQuandoNaoTemLetraMinuscula() {
        assertFalse(validador.validar("SENHA@123"));
    }

    @Test
    void deveRetornarFalseQuandoNaoTemNumero() {
        assertFalse(validador.validar("Senha@abc"));
    }

    @Test
    void deveRetornarFalseQuandoNaoTemCaractereEspecial() {
        assertFalse(validador.validar("Senha123"));
    }

    @Test
    void deveRetornarFalseQuandoTemEspaco() {
        assertFalse(validador.validar("Senha @123"));
    }

    @Test
    void deveRetornarFalseQuandoSenhaForNula() {
        assertFalse(validador.validar(null));
    }
}