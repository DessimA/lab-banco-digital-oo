# Banco Digital OO 🏦

## Descrição 📝

Este projeto é uma simulação simplificada de um sistema bancário digital em Java, com foco em operações básicas como:

* **Criar clientes:** 🧑 Adicione novos clientes ao banco com seus respectivos nomes.
* **Abrir contas:** 🚪 Crie contas corrente e poupança para os clientes.
* **Depositar:** 💰 Adicione fundos às contas.
* **Sacar:** 💸 Retire dinheiro das contas (respeitando o saldo disponível).
* **Transferir:** ➡️ Transfira fundos entre contas.
* **Imprimir extrato:** 📑 Visualize o histórico de transações e o saldo atual das contas.

## Funcionalidades ✨

* **Gerenciamento de clientes:** Cadastro de novos clientes com nome.
* **Contas correntes e poupança:** Abertura de contas para clientes, cada uma com limite de empréstimo diferenciado:
    * **Conta Corrente:** Limite de R$ 1.000,00
    * **Conta Poupança:** Limite de R$ 500,00
* **Operações bancárias:** Depósito, saque e transferência entre contas.
* **Extrato detalhado:** Histórico de transações completo e saldo da conta.
* **Tratamento de erros:** Mensagens claras para operações inválidas (saldo insuficiente, valores inválidos, etc.).

## Requisitos do Sistema 💻

* **Java Development Kit (JDK):** Versão 17 ou superior.
* **Maven:** Para gerenciar as dependências do projeto.
* **Lombok:** Para reduzir o código boilerplate (obrigatório).

## Como Executar 🚀

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/DessimA/lab-banco-digital-oo.git
   ```

2. **Instale o Lombok:**

   * **Baixe o Lombok:** [https://projectlombok.org/](https://projectlombok.org/)
   * **Execute o instalador:** Siga as instruções do instalador para configurar o Lombok no seu IDE (Eclipse, IntelliJ IDEA, etc.).

3. **Compile e execute o projeto com Maven:**

   ```bash
   mvn clean package
   mvn exec:java -Dexec.mainClass="com.bancodigital.Main"
   ```

## Detalhes do Projeto 

* **Estrutura:** O projeto utiliza o Maven para gerenciar as dependências e a compilação.
* **Lombok:** O projeto usa o Lombok para gerar automaticamente getters, setters e métodos `toString`, reduzindo o código boilerplate. O Lombok é **essencial** para a compilação e execução do projeto.
* **Testes:** O projeto inclui testes unitários para algumas das classes, garantindo a qualidade do código. 

