package xadrez;

import jogo_de_tabuleiro.Peca;
import jogo_de_tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca {
    private Cor cor;

    public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }
    

    /**
     * @return Cor return the cor
     */
    public Cor getCor() {
        return cor;
    }

}
