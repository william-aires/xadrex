package xadrez;

import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        configuracaoInicial();;
    }
    public PecaDeXadrez [][] getPecas(){
        PecaDeXadrez[][] matriz = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i= 0; i < tabuleiro.getLinhas(); i++){
            for(int j= 0;j < tabuleiro.getColunas(); j++){
                matriz[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
            }
        }
        return matriz;
    }
    private void configuracaoInicial(){
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
    }
    
}