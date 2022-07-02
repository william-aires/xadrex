package xadrez;

import jogo_de_tabuleiro.Posicao;

public class XadrezPosicao {
    private char coluna;
    private int linha;

    public XadrezPosicao(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8 ){
            throw new XadrezException("Erro instanciando posição do xadrez. Valido de a1 a h8!!!");
        }
        this.coluna = coluna;
        this.linha = linha;
    }
    
    /**
     * @return char return the coluna
     */
    public char getColuna() {
        return coluna;
    }

    /**
     * @return int return the linha
     */
    public int getLinha() {
        return linha;
    }

    protected Posicao toPosition(){
        return new Posicao(8 - linha, coluna - 'a');
    }
    protected static XadrezPosicao fromPosition(Posicao posicao){
        return new XadrezPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    }
    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
