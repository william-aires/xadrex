package jogo_de_tabuleiro;

public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    

}
