package com.carlosaugusto.designpatterns.Observer;

/**
 *
 * @author Carlos Augusto
 */
public class Jogador1 implements Jogador{

    @Override
    public void receberNotificacao() {
        System.out.println("Jogada Realizada");
    }
    
}
