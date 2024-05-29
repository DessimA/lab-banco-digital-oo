public class GeradorDeNumeroConta implements IGeradorDeNumero {

    private int proximoNumero = 1;

    @Override
    public int gerarNumero() {
        return proximoNumero++;
    }
}