import java.util.ArrayList;
import java.util.List;

// Classe Banco
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    // Construtor da classe Banco
    public Banco(String nome) {
        this.nome = nome;
    }

    // Getter para o nome do banco
    public String getNome() {
        return nome;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para remover uma conta do banco
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    // Método para buscar uma conta por número
    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    // Getter para a lista de contas do banco
    public List<Conta> getContas() {
        return contas;
    }

    // Setter para a lista de contas do banco
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}