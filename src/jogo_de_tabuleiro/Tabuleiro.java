package jogo_de_tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca([linhas][colunas]);
    }

    
    

    /**
     * @return int return the linhas
     */
    public int getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    /**
     * @return int return the colunas
     */
    public int getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(int colunas) {
        this.colunas = colunas;
    }


}