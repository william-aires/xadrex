package xadrez.pecas;

import jogo_de_tabuleiro.Posicao;
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
        
        Posicao p = new Posicao(0, 0);

        //ACIMA
        p.setValores(posicao.getLinha() - 1, posicao.getColuna());
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() - 1);
        }
        if(getTabuleiro().posicaoExiste(p) && existeUmaPecaAdversaria(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //ESQUERDA
        p.setValores(posicao.getLinha(), posicao.getColuna() - 1);
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() - 1);
        }
        if(getTabuleiro().posicaoExiste(p) && existeUmaPecaAdversaria(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //DIREITA
        p.setValores(posicao.getLinha(), posicao.getColuna() + 1);
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() + 1);
        }
        if(getTabuleiro().posicaoExiste(p) && existeUmaPecaAdversaria(p)){
              mat[p.getLinha()][p.getColuna()] = true;
        }

        //PRA BAIXO
        p.setValores(posicao.getLinha() + 1, posicao.getColuna());
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() + 1);
        }
        if(getTabuleiro().posicaoExiste(p) && existeUmaPecaAdversaria(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }
 
        return mat;
    }
}