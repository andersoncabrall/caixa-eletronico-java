# 🏦 Caixa Eletrônico - Java Core

Sistema de simulação bancária desenvolvido em **Java Core**, focado na aplicação de boas práticas de Orientação a Objetos, manipulação de Coleções, tratamento de exceções customizadas e formatação de datas.

---

## 🎯 Funcionalidades

- **Gerenciamento de Contas:** Cadastro e busca eficiente de contas usando chaves únicas via `Map<Integer, ContaBancaria>`.
- **Operações Bancárias:** Depósitos e saques com validação de saldo em tempo real.
- **Histórico de Extrato:** Registro cronológico de transações com data e hora formatadas (`dd/MM/yyyy HH:mm`).
- **Tratamento de Erros:** Exceções personalizadas para lidar com regras de negócio (ex: saldo insuficiente e conta inexistente).

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Coleções (Collections Framework):**
  - `List` / `ArrayList` para histórico sequencial do extrato.
  - `Map` / `HashMap` para busca de alta performance $O(1)$ de contas bancárias.
- **Datas e Horas:** `java.time.LocalDateTime` e `java.time.format.DateTimeFormatter`.
- **Exceções Personalizadas:** Herança de `Exception` para capturar regras de negócio violadas.
- **Arquitetura em Pacotes:** Separação clara de responsabilidades entre modelo e exceções.

---

## 📂 Estrutura do Projeto

```text
src/main/java/
├── exception/
│   ├── ContaNaoEncontradaException.java
│   └── SaldoInsuficienteException.java
├── model/
│   ├── Banco.java
│   └── ContaBancaria.java
└── Main.java
```

---

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/andersoncabrall/caixa-eletronico-java.git
   ```

2. **Acesse a pasta do projeto:**
   ```bash
   cd caixa-eletronico-java
   ```

3. **Compile e execute a classe `Main.java`** através da sua IDE preferida (VS Code, IntelliJ, Eclipse) ou via terminal.