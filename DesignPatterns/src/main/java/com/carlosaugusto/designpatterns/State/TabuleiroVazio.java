package com.carlosaugusto.designpatterns.State;

/**
 *
 * @author Carlos Augusto
 */
public class TabuleiroVazio implements Tabuleiro{

    @Override
    public void maximo3() {
        System.out.println("3");
    }

    @Override
    public void maximo4() {
        System.out.println("4");
    }
    
}
