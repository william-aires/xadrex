package xadrez.pecas;

import jogo_de_tabuleiro.Posicao;
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
        Posicao p = new Posicao(0, 0);

        //acima
        p.setValores(posicao.getLinha() - 1, posicao.getColuna());
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //ABAIXO
        p.setValores(posicao.getLinha() + 1, posicao.getColuna());
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //ESQUERDA
        p.setValores(posicao.getLinha(), posicao.getColuna() - 1);
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //DIREITA
        p.setValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //NOROESTE
        p.setValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //NORDESTE
         p.setValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
         if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
         }
        
        //SUDOESTE
        p.setValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //SUDESTE
        p.setValores(posicao.getLinha() +1, posicao.getColuna() + 1);
        if(getTabuleiro().posicaoExiste(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }
    private boolean podeMover(Posicao posicao){
        PecaDeXadrez p = (PecaDeXadrez)getTabuleiro().peca(posicao);
        return p == null || p.getCor() != getCor();
    }
}