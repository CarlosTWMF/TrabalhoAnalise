package com.carlosaugusto.designpatterns.State;

/**
 *
 * @author Carlos Augusto
 */
public class TabuleiroMetade implements Tabuleiro
{

    @Override
    public void maximo3() {
        System.out.println("2");
    }

    @Override
    public void maximo4() {
        System.out.println("3");
    }
    
}
