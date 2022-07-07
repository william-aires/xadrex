package xadrez.pecas;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString(){
        return "T";
    }
    @Override
    public boolean[][] possiveisMovimentos() {
        // TODO Auto-generated method stub
        boolean [][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return mat;
    }
}