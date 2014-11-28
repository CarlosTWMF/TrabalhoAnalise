
package com.carlosaugusto.designpatterns.jogoanalise;

public class Jogador2 implements ObserverJogada{
    @Override
    public void receberNotificacao() {
        System.out.println("Vez do jogador 2");
    }


}
