package xadrez;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
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

    private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca){
        tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosition());

    }

    private void configuracaoInicial(){
        colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.WHITE));
        colocarNovaPeca('c', 2, new Torre(tabuleiro, Cor.WHITE));
        colocarNovaPeca('d', 2, new Torre(tabuleiro, Cor.WHITE));
        colocarNovaPeca('e', 2, new Torre(tabuleiro, Cor.WHITE));
        colocarNovaPeca('e', 1, new Torre(tabuleiro, Cor.WHITE));
        colocarNovaPeca('d', 1, new Rei(tabuleiro, Cor.WHITE));

        colocarNovaPeca('c', 7, new Torre(tabuleiro, Cor.BLACK));
        colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.BLACK));
        colocarNovaPeca('d', 7, new Torre(tabuleiro, Cor.BLACK));
        colocarNovaPeca('e', 7, new Torre(tabuleiro, Cor.BLACK));
        colocarNovaPeca('e', 8, new Torre(tabuleiro, Cor.BLACK));
        colocarNovaPeca('d', 8, new Rei(tabuleiro, Cor.BLACK));
    
    }
    
}
