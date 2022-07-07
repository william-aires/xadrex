package jogo_de_tabuleiro;
public class Posicao {
    private int linha;
    private int coluna;
    
    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    /**
     * @return int return the linha
     */
    public int getLinha() {
        return linha;
    }
    public void setValores(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return int return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return linha + ", " + coluna;
    }
   

}