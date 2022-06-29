package main;

import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Main {
    public static void main(String[]args) {
       PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
       UI.printTabuleiro(partidaDeXadrez.getPecas());

    }
    
}
