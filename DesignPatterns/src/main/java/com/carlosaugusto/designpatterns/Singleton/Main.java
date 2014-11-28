package com.carlosaugusto.designpatterns.Singleton;

/**
 *
 * @author Carlos Augusto
 */
public class Main {
    public static void main(String[] args) {  
        Singleton primeiroJogador = Singleton.getInstance();
        Singleton segundoJogador = Singleton.getInstance();
        primeiroJogador = Singleton.getInstance();
    }
}
