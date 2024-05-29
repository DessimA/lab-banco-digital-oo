public class Extrato {
    private String tipo;
    private double valor;
    private String data;
    private String descricao;
    private double saldo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Extrato{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}