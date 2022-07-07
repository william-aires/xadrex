package main;

import java.util.Scanner;

import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;
import jogo_de_tabuleiro.TabuleiroException;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.XadrezPosicao;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
       PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();

       while(true){
            try{
                UI.clearScreen();
                UI.printTabuleiro(partidaDeXadrez.getPecas());
                System.out.println();
                System.out.println("Origem: ");
                XadrezPosicao origem = UI.readChessPosition(sc);

                boolean[][] possiveisMovimentos = partidaDeXadrez.possiveisMovimentos(origem);
                UI.clearScreen();
                UI.printTabuleiro(partidaDeXadrez.getPecas(), possiveisMovimentos);

                System.out.println();
                System.out.println("Destino: ");
                XadrezPosicao destino = UI.readChessPosition(sc);

                PecaDeXadrez capturaPeca = partidaDeXadrez.executarMovimentoXadrez(origem, destino);

                System.out.println();
            }catch(TabuleiroException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
       }
       

    }
    
}
