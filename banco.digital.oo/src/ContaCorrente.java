import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

    List<Extrato> extratos = new ArrayList<>();

    public ContaCorrente(Cliente cliente, IGeradorDeNumero geradorDeNumero) {
        super(cliente, geradorDeNumero);
    }

    @Override
    public String imprimirExtrato() { // Retorna String
        StringBuilder sb = new StringBuilder();
        sb.append("=== Extrato Conta Corrente ===\n");
        sb.append(imprimirInformacoesBasicas()); // Use o método existente

        for (Extrato extrato : extratos) {
            sb.append(extrato.toString()).append("\n");
        }
        return sb.toString(); // Retorna a string construída
    }

    public void adicionarExtrato(Extrato extrato) {
        extrato.setTipo("Crédito");
        extrato.setValor(this.saldo);
        extrato.setData("18/11/2023");
        extrato.setDescricao("Depósito Inicial");
        extrato.setSaldo(this.saldo);

        extrato.setTipo("Débito");
        extrato.setValor(this.saldo);
        extrato.setData("19/11/2023");
        extrato.setDescricao("Saque");
        extrato.setSaldo(this.saldo);

        extrato.setTipo("Crédito");
        extrato.setValor(this.saldo);
        extrato.setData("20/11/2023");
        extrato.setDescricao("Transferência");
        extrato.setSaldo(this.saldo);

        extrato.setTipo("Débito");
        extrato.setValor(this.saldo);
        extrato.setData("21/11/2023");
        extrato.setDescricao("Pagamento");
        extrato.setSaldo(this.saldo);

        extrato.setTipo("Crédito");
        extrato.setValor(this.saldo);
        extrato.setData("22/11/2023");
        extrato.setDescricao("Depósito");
        extrato.setSaldo(this.saldo);

        extrato.setTipo("Débito");
        extrato.setValor(this.saldo);
        extrato.setData("23/11/2023");
        extrato.setDescricao("Transferência");
        extrato.setSaldo(this.saldo);

        extratos.add(extrato);
    }
}