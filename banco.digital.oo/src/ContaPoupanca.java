class ContaPoupanca extends Conta {
    // Construtor da classe ContaPoupanca
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.limiteEmprestimo = 500; // Define o limite de empréstimo para Conta Poupança
    }

    // Método para imprimir o extrato da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInformacoesBasicas();
        imprimirTransacoes();
    }
}
