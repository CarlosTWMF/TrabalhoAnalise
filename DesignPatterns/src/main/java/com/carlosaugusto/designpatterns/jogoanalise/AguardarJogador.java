/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosaugusto.designpatterns.jogoanalise;

/**
 *
 * @author Robson
 */
public class AguardarJogador implements AcaoJogador{
    
    public void aguardarAdversario() {
        System.out.println("Aguarde seu adversario");
    }

    @Override
    public void efetuarJogada() {
        System.out.println("Realize sua Jogada!!");
    }
}
