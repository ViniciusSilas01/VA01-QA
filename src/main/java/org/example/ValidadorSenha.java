package org.example;

public class ValidadorSenha {

    /**
     * Valida se uma senha atende aos critérios de segurança.
     * Regras de Negócio:
     * - Deve ter no mínimo 8 caracteres
     * - Deve conter pelo menos uma letra maiúscula
     * - Deve conter pelo menos uma letra minúscula
     * - Deve conter pelo menos um número
     * - Deve conter pelo menos um caractere especial (!@#$%^&*()_+)
     * - Não deve conter espaços
     */
    public boolean validar(String senha) {
        if (senha == null) return false;

        if (senha.length() < 8) return false;
        if (!senha.matches(".*[A-Z].*")) return false;
        if (!senha.matches(".*[a-z].*")) return false;
        if (!senha.matches(".*[0-9].*")) return false;
        if (!senha.matches(".*[!@#$%^&*()_+\\-=`~\\[\\]{};':\"\\\\|,.<>/?].*")) return false;
        if (senha.contains(" ")) return false;

        return true;
    }
}

