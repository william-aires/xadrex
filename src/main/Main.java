package main;

import java.util.Scanner;

import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.XadrezPosicao;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
       PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();

       while(true){
            UI.printTabuleiro(partidaDeXadrez.getPecas());
            System.out.println();
            System.out.println("Origem: ");
            XadrezPosicao origem = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Destino: ");
            XadrezPosicao destino = UI.readChessPosition(sc);

            PecaDeXadrez capturaPeca = partidaDeXadrez.executarMovimentoXadrez(origem, destino);

            System.out.println();
       }
       

    }
    
}
