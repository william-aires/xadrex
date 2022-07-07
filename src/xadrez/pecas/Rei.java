package xadrez.pecas;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString(){
        return "R";
    }
    @Override
    public boolean[][] possiveisMovimentos() {
        // TODO Auto-generated method stub
        boolean [][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return mat;
    }
}