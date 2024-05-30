# Banco Digital OO 🏦

## Descrição 📝

Este projeto é uma simulação simplificada de um sistema bancário digital em Java. Ele permite realizar operações básicas, como:

* **Criar clientes:** 🧑 Adicione novos clientes ao banco com seus respectivos nomes.
* **Abrir contas:** 🚪 Crie contas corrente e poupança para os clientes.
* **Depositar:** 💰 Adicione fundos às contas.
* **Sacar:** 💸 Retire dinheiro das contas (respeitando o saldo disponível).
* **Transferir:** ➡️ Transfira fundos entre contas.
* **Imprimir extrato:** 📑 Visualize o histórico de transações e o saldo atual das contas.

## Funcionalidades ✨

* **Gerenciamento de clientes:** Cadastro de novos clientes com nome.
* **Contas correntes e poupança:** Abertura de contas para clientes, cada uma com limite de empréstimo diferenciado.
* **Operações bancárias:** Depósito, saque, transferência entre contas e **empréstimo**.
* **Funcionalidade Pix:** Transferências instantâneas entre contas usando o número da conta e o nome do banco.
* **Extrato detalhado:** Histórico de transações completo e saldo da conta, com informações detalhadas sobre cada operação, incluindo **Pix** e **empréstimos**.
* **Tratamento de erros:** Mensagens claras para operações inválidas (saldo insuficiente, valores inválidos, etc.).

## Requisitos do Sistema 💻

* **Java Development Kit (JDK):** Certifique-se de ter o Java JDK instalado em sua máquina.
* **IDE (opcional):** Uma IDE como Eclipse ou IntelliJ IDEA pode facilitar o desenvolvimento, mas não é obrigatória.

## Como Executar 🚀

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/DessimA/lab-banco-digital-oo.git
   ```
2. **Compile o código:**
   ```bash
   javac *.java
   ```
3. **Execute a aplicação:**
   ```bash
   java Main
   ```


**Mudanças:**

- **Funcionalidades:** Adicionadas as funcionalidades de "empréstimo" e "Funcionalidade Pix".
- **Detalhes:** Incluídos detalhes sobre os limites de empréstimo por tipo de conta, informações detalhadas sobre cada operação no extrato e destaque para as operações de Pix e empréstimo. 
