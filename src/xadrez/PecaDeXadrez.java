package xadrez;

import jogo_de_tabuleiro.Peca;
import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;

public abstract class PecaDeXadrez extends Peca {
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
    protected boolean existeUmaPecaAdversaria(Posicao posicao){
        PecaDeXadrez p = (PecaDeXadrez) getTabuleiro().peca(posicao);
        return p != null && p.getCor() != cor;
    }

}
