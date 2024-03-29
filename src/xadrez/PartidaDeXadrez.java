package xadrez;

import javax.xml.transform.Source;

import jogo_de_tabuleiro.Peca;
import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;
import jogo_de_tabuleiro.TabuleiroException;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    private int turno;
    private Cor jogadorAtual;
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        turno = 1;
        jogadorAtual = Cor.WHITE;
        configuracaoInicial();;
    }

    public int getTurno(){
        return turno;
    }
    public Cor getJogadorAtual(){
        return jogadorAtual;
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

    public boolean[][] possiveisMovimentos(XadrezPosicao origemPosicao){
        Posicao posicao = origemPosicao.toPosition();
        validarOrigemPosicao(posicao);
        return tabuleiro.peca(posicao).possiveisMovimentos();
    }

    public PecaDeXadrez executarMovimentoXadrez(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino ){
        Posicao origem = posicaoOrigem.toPosition();
        Posicao destino = posicaoDestino.toPosition();
        validarOrigemPosicao(origem);
        validarDestinoPosicao(origem, destino);
        Peca capituraPeca = fazerMover(origem, destino);
        proximoTurno();
        return (PecaDeXadrez) capituraPeca;
    }

    private void validarDestinoPosicao(Posicao origem,Posicao destino){
        if(!tabuleiro.peca(origem).podeSeMover(destino)){
            throw new TabuleiroException("A peca escolhida nao pode se mover para posicao de destino");
        }
    }

    private Peca fazerMover(Posicao origem, Posicao destino) {
        Peca p = tabuleiro.removerPeca(origem);
        Peca capturaPeca = tabuleiro.removerPeca(destino);
        tabuleiro.colocarPeca(p, destino);
        return capturaPeca;
    }
    private void validarOrigemPosicao(Posicao posicao) {
        if(!tabuleiro.haUmaPeca(posicao)){
            throw new XadrezException("Não exite peca na posicao de origem");
        }
        if(jogadorAtual !=((PecaDeXadrez)tabuleiro.peca(posicao)).getCor()){
            throw new XadrezException("A peça de xadrez não é sua");
        }

        if(!tabuleiro.peca(posicao).existeAlgumMovimentoPossivel()){
            throw new XadrezException("Nao existe movimentos possiveis para peça");
        }
    }
    private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca){
        tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosition());

    }
    private void proximoTurno(){
        turno++;
        jogadorAtual = (jogadorAtual == Cor.WHITE) ? Cor.BLACK : Cor.WHITE;
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
