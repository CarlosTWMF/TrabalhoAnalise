
package com.carlosaugusto.designpatterns.jogoanalise;



public class Jogador1 implements ObserverJogada{

    @Override
    public void receberNotificacao() {
        System.out.println("Vez do jogador 1");
    }
    
}
