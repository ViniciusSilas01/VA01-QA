## VA01 - PDP

Repositório destinado a avaliação 01 da cadeira **Qualidade de Software - P5.**

## Validador de Senhas Seguras

Projeto desenvolvido por [Vinicius Silas](https://www.linkedin.com/in/vinicius-silas-2260162a2/) 

O objetivo é implementar uma **suíte de testes unitários automatizados** que valide as regras de negócio de um **validador de senhas seguras**, garantindo **alta cobertura de código (100%)** conforme exigido pela avaliação.

---

## Regras de Negócio Testadas

1. A senha deve conter **no mínimo 8 caracteres**.  
2. A senha deve conter **pelo menos uma letra maiúscula**.  
3. A senha deve conter **pelo menos uma letra minúscula**.  
4. A senha deve conter **pelo menos um número**.  
5. A senha deve conter **pelo menos um caractere especial**.  
6. A senha **não deve conter espaços**.  
7. Retorna `true` se todas as condições forem atendidas; caso contrário, `false`.

---

## Tecnologias Utilizadas

- **Java 17**
- **JUnit 5** — Testes unitários
- **Maven** — Gerenciamento de dependências
- **JaCoCo** — Relatório de cobertura de testes

---

## Estrutura do Projeto

```
validador-senhas/
│
├── src/
│ ├── main/
│ │ └── java/org/example/
│ │ └── ValidadorSenha.java
│ │
│ └── test/
│ └── java/org/example/
│ └── ValidadorSenhaTest.java
│
├── pom.xml
└── README.md
```

---

## Como Executar os Testes

No terminal, dentro do diretório raiz do projeto, execute:

```bash
mvn clean test
```

Isso executará todos os testes automatizados com o JUnit.

---

## Como Gerar o Relatório de Cobertura

Após executar os testes, gere o relatório do JaCoCo com o comando:

```bash
mvn jacoco:report
```

O relatório será criado no caminho:

**target/site/jacoco/index.html**

Abra esse arquivo no navegador para visualizar a cobertura de código.

---

## Relatório de Cobertura

<img width="1365" height="393" alt="image" src="https://github.com/user-attachments/assets/358075bd-ac40-4e45-97a1-42a42366512b" />

---

## Licença

Este projeto é de uso educacional, desenvolvido para fins de avaliação acadêmica.
