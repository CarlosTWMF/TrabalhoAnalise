package com.carlosaugusto.designpatterns.Singleton;

/**
 *
 * @author Carlos Augusto
 */
public class Singleton {
    private static Singleton tabuleiro;  

    private Singleton() {}  

    public static Singleton getInstance() {  
        if (tabuleiro == null) {  
            tabuleiro = new Singleton();
            System.out.println("Criando tabuleiro");
        }
        else{
            System.out.println("Tabuleiro criado");
        }
        return tabuleiro;  
    }  
}
