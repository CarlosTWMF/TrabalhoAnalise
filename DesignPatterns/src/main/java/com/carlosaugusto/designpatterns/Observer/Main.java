package com.carlosaugusto.designpatterns.Observer;

/**
 *
 * @author Carlos Augusto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador observer = new Jogador1();
        Jogador2 observer2 = new Jogador2();
        Tabuleiro observable = new Tabuleiro();
        observable.adicionarObserver(observer);
        observable.adicionarObserver(observer2);
        observable.setJogada(1);
    }
}
