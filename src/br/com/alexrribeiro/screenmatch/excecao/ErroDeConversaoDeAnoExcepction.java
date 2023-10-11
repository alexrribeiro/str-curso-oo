package br.com.alexrribeiro.screenmatch.excecao;

public class ErroDeConversaoDeAnoExcepction extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcepction(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage() {
        return this.mensagem;
    }
}
