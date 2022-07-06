package jogo_de_tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas < 1){
            throw new TabuleiroException("Erro ao criar tabuleiro: É necessário que haja uma linha e uma coluna!!!");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    /**
     * @return int return the linhas
     */
    public int getLinhas() {
        return linhas;
    }

    /**
     * @return int return the colunas
     */
    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna){
        if(!posicaoExiste(linha, coluna)){
            throw new TabuleiroException("Posição não existe!!!");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Posição não existe!!!");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void colocarPeca(Peca peca, Posicao posicao){
        if(haUmaPeca(posicao)){
            throw new TabuleiroException("Já tem uma peca nessa posição!!! " + posicao);
        }

        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    public Peca removerPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Posição não existe");
        }
        if(peca(posicao) == null){
            return null;
        }
        Peca aux = peca(posicao);
        aux.posicao = null;
        pecas[posicao.getLinha()][posicao.getColuna()] = null;
        return aux;
    }
    private boolean posicaoExiste(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
    }
    public boolean haUmaPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Posição não existe!!!");
        }
        return peca(posicao) != null;
    }
}
