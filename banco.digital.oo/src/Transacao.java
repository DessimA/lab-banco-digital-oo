class Transacao {
    private String tipo;
    private double valor;
    private double saldo;

    // Construtor da classe Transacao
    public Transacao(String tipo, double valor, double saldo) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
    }

    // Sobrescrevendo o método toString para imprimir informações da transação
    @Override
    public String toString() {
        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", saldo=" + saldo +
                '}';
    }
}